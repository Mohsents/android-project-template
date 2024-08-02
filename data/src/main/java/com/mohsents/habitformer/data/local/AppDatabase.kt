package com.mohsents.habitformer.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mohsents.habitformer.data.DB_VERSION
import com.mohsents.habitformer.data.model.Quote
import com.mohsents.habitformer.data.model.QuoteTag

@Database(entities = [QuoteTag::class, Quote::class], version = DB_VERSION)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun quoteDao(): QuoteDao
}