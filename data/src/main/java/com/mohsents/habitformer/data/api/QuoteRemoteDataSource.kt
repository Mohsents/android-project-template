package com.mohsents.habitformer.data.api

import com.mohsents.habitformer.data.di.IoDispatcher
import com.mohsents.habitformer.data.model.QuoteTag
import com.mohsents.habitformer.data.model.QuoteResult
import com.mohsents.habitformer.data.sendResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteRemoteDataSource @Inject constructor(
    @IoDispatcher
    private val dispatcher: CoroutineDispatcher,
    private val service: QuoteApiService
) {

    suspend fun fetch(tag: String): Result<QuoteResult> = withContext(dispatcher) {
       return@withContext sendResult {
            service.getQuotes(tag)
        }
    }

    suspend fun fetchAllTags(): Result<List<QuoteTag>> = withContext(dispatcher) {
        return@withContext sendResult {
            service.getAllTags()
        }
    }
}