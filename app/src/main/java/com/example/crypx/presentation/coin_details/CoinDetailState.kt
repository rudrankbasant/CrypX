package com.example.crypx.presentation.coin_details

import com.example.crypx.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coinDetail: CoinDetail? = null,
    val error: String = ""

)
