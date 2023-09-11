package com.example.navigationtutorial

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun setUpNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                }
            )
        ) {
            Log.d("NavTag", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            DetailScreen(navController)
        }
    }
}

data class test(val name: String)