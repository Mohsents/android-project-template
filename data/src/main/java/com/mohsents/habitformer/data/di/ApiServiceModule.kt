package com.mohsents.habitformer.data.di

import com.mohsents.habitformer.data.api.QuoteApiService
import com.mohsents.habitformer.data.api.ServiceBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {

    @Provides
    fun provideQuoteApiService(): QuoteApiService {
        return ServiceBuilder.RETROFIT.create(QuoteApiService::class.java)
    }
}