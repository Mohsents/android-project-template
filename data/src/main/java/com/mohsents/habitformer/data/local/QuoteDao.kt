package com.mohsents.habitformer.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mohsents.habitformer.data.model.Quote
import com.mohsents.habitformer.data.model.QuoteTag

@Dao
interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTags(tags: List<QuoteTag>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuotes(quotes: List<Quote>)

    @Query("SELECT * FROM quote_tags")
    suspend fun loadAllTags(): List<QuoteTag>

    @Query("SELECT * FROM quotes WHERE tags LIKE '%' || :tag || '%' ORDER BY RANDOM() LIMIT 1")
    suspend fun loadRandomQuoteWithTag(tag: String): Quote?
}