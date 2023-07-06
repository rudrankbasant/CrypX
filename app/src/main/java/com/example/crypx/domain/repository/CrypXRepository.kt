package com.example.crypx.domain.repository

import com.example.crypx.data.remote.dto.CoinDTO
import com.example.crypx.data.remote.dto.CoinDetailDTO
import com.example.crypx.domain.model.CoinDetail

interface CrypXRepository {

    suspend fun getCoins() : List<CoinDTO>

    suspend fun getCoinDetail(coinId: String) : CoinDetailDTO
}