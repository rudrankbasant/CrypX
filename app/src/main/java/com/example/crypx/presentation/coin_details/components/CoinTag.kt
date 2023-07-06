package com.example.crypx.presentation.coin_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.crypx.presentation.ui.theme.PurpleGrey40

@Composable
fun CoinTag(
    tag: String
) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .background(
                color = PurpleGrey40,
                shape = RoundedCornerShape(100.dp)
            )
    ){
        Text(text = tag, modifier = Modifier.padding(8.dp), style = MaterialTheme.typography.bodySmall)
    }
}