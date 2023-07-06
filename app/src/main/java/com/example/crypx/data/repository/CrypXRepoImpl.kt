package com.example.crypx.data.repository

import com.example.crypx.data.remote.CrypXApi
import com.example.crypx.data.remote.dto.CoinDTO
import com.example.crypx.data.remote.dto.CoinDetailDTO
import com.example.crypx.domain.repository.CrypXRepository
import javax.inject.Inject

class CrypXRepoImpl @Inject constructor(
    private val api: CrypXApi
) : CrypXRepository {

    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinDetail(coinId: String): CoinDetailDTO {
        return api.getCoinDetail(coinId)
    }



}