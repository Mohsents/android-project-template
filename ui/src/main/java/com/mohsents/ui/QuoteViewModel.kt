package com.mohsents.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mohsents.habitformer.data.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel
@Inject constructor(
    private val quoteRepository: QuoteRepository
): ViewModel() {

    suspend fun fetchRandomQuote() {
        val tags = quoteRepository.fetchAllTags()
        Log.i(TAG, "fetchRandomQuote: tag size: ${tags.size}")

        val quote = quoteRepository.retrieveRandomQuote("Work")
        Log.i(TAG, "Quotes: ${quote.content} \n")
    }

    companion object {
        const val TAG = "QuoteViewModel"
    }
}