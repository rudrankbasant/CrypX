package com.example.crypx.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.crypx.domain.model.Coin


@Composable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(coin) }
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Text(text = "${coin.rank}. ${coin.name} (${coin.symbol})", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodyMedium)
        Text(text = if (coin.is_active) "Active" else "Inactive", color = if (coin.is_active) Color.Green else Color.Red)

    }

}