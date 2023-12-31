package com.example.navigationtutorial.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun SettingScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red), Alignment.Center
    ) {
        Text(text = "Setting Screen", fontSize = MaterialTheme.typography.labelLarge.fontSize)
    }
}