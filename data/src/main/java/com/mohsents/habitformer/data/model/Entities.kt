package com.mohsents.habitformer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class QuoteResult(
    val results: List<Quote>
)

@Entity(tableName = "quotes")
data class Quote(
    @PrimaryKey
    @SerializedName("_id")
    val id: String,
    val author: String,
    val content: String,
    val tags: List<String>
)

@Entity(tableName = "quote_tags")
data class QuoteTag(
    @PrimaryKey
    @SerializedName("_id")
    val id: String,
    val name: String,
    val quoteCount: Int
)