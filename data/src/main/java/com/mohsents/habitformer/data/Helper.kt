package com.mohsents.habitformer.data

import com.mohsents.habitformer.data.model.Quote

inline fun <T> sendResult(block: () -> T): Result<T> {
    return try {
        Result.success(block())
    } catch (e: Exception) {
        Result.failure(e)
    }
}

val invalidQuote = Quote("","","", listOf())