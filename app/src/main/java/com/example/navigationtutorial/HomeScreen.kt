package com.example.navigationtutorial

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        Text(
            text = "HomeScreen",
            color = MaterialTheme.colorScheme.background,
            modifier = Modifier.clickable {
                navController.navigate("detail_screen")
            })
    }
}