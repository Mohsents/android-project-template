package com.mohsents.habitformer.data.di

import android.content.Context
import androidx.room.Room
import com.mohsents.habitformer.data.DB_NAME
import com.mohsents.habitformer.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, DB_NAME
    ).build()
}