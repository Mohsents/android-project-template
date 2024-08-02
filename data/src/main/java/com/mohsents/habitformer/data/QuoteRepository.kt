package com.mohsents.habitformer.data

import android.util.Log
import com.mohsents.habitformer.data.api.QuoteRemoteDataSource
import com.mohsents.habitformer.data.local.AppDatabase
import com.mohsents.habitformer.data.model.Quote
import com.mohsents.habitformer.data.model.QuoteTag
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val remoteDataSource: QuoteRemoteDataSource,
    appDatabase: AppDatabase
) {
    private val quoteDao = appDatabase.quoteDao()

    suspend fun fetchAllTags(): List<QuoteTag> {
        val tags = quoteDao.loadAllTags()
        if (tags.isNotEmpty()) {
            return tags
        } else {
            Log.i(TAG, "fetchAllTags: Start fetching tags ...")
            remoteDataSource.fetchAllTags().onSuccess { result ->
                // Filter unrelated tags
                quoteDao.insertTags(result.filterNot {
                        quoteTag -> quoteTag.name.contains("Quotes")
                })
                return quoteDao.loadAllTags()
            }.onFailure {
                Log.i(TAG, "fetchAllTags: Failed to get quote tags: ${it.message}")
            }
            return emptyList()
        }
    }

    suspend fun retrieveRandomQuote(tag: String): Quote {
        val quote = quoteDao.loadRandomQuoteWithTag(tag)
        if (quote != null && quote.id.isNotEmpty()) {
            return quote
        } else {
            Log.i(TAG, "retrieveRandomQuote: Start fetching quote")
            remoteDataSource.fetch(tag).onSuccess { quotes ->
                quoteDao.insertQuotes(quotes.results)
                return quoteDao.loadRandomQuoteWithTag(tag)!!
            }.onFailure {
                Log.i(TAG, "retrieveRandomQuote: Failed to get quote: ${it.message}")
            }
        }
        return invalidQuote
    }

    private companion object {
        const val TAG = "QuoteRepository"
    }
}