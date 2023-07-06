package com.example.crypx.data.remote

import com.example.crypx.data.remote.dto.CoinDTO
import com.example.crypx.data.remote.dto.CoinDetailDTO
import com.example.crypx.domain.model.CoinDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface CrypXApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinDetail(@Path("coinId") coinId: String): CoinDetailDTO



}