package com.example.crypx.data.remote.dto

import com.example.crypx.domain.model.Coin

data class CoinDTO(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDTO.toCoin(): Coin{

    return Coin(
        id = id,
        is_active = is_active,
        is_new = is_new,
        name = name,
        rank = rank,
        symbol = symbol,
        type = type
    )

}
