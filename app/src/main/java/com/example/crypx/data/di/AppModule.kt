package com.example.crypx.data.di

import com.example.crypx.data.remote.CrypXApi
import com.example.crypx.data.repository.CrypXRepoImpl
import com.example.crypx.domain.repository.CrypXRepository
import com.example.crypx.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCrypXAPI(): CrypXApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CrypXApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCrypXRepository(api: CrypXApi): CrypXRepository {
        return CrypXRepoImpl(api)
    }


}