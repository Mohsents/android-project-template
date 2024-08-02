package com.mohsents.habitformer.data

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mohsents.habitformer.data.local.AppDatabase
import com.mohsents.habitformer.data.local.QuoteDao
import com.mohsents.habitformer.data.model.QuoteTag
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class DatabaseTest {
    private lateinit var quoteDao: QuoteDao
    private lateinit var db: AppDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).build()
        quoteDao = db.quoteDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun readWriteQuoteTagTest() = runTest {
        val tags = listOf(
            QuoteTag("40340", "Work", 1),
            QuoteTag("54545", "Health", 23)
        )

        quoteDao.insertTags(tags)
        val inDBTags = quoteDao.loadAllTags()

        tags.mapIndexed { index, quoteTag ->
            assertEquals(quoteTag.id, inDBTags[index].id)
        }
    }
}