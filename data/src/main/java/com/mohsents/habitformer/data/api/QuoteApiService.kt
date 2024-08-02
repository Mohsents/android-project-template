package com.mohsents.habitformer.data.api

import com.mohsents.habitformer.data.model.QuoteTag
import com.mohsents.habitformer.data.model.QuoteResult
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApiService {
    @GET("quotes")
    suspend fun getQuotes(
        @Query("tags") tag: String
    ): QuoteResult

    @GET("tags")
    suspend fun getAllTags(): List<QuoteTag>
}