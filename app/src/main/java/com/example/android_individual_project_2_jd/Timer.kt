package com.example.android_individual_project_2_jd

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

@Composable
fun Timer() {
    var time by remember { mutableStateOf(60) }

    LaunchedEffect(Unit) {
        while (time > 0) {
            delay(1000L)
            time--
        }
    }

    Text(
        text = if (time > 0) "$time s" else "Time's up!",
        style = MaterialTheme.typography.headlineMedium,
        color = Color.White
    )
}