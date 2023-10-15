package com.example.cupcake

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cupcake.ui.StartOrderScreen
import com.example.cupcake.ui.SummaryScreen

enum class CupcakeScreen() {
    Start,
    Summary
}

@Composable
fun CupcakeApp(
    navController: NavHostController = rememberNavController()
) {
    Surface() {
        NavHost(
            navController = navController,
            startDestination = CupcakeScreen.Summary.name,
        ) {
            composable(route = CupcakeScreen.Start.name) {
                StartOrderScreen()
            }
            composable(route = CupcakeScreen.Summary.name) {
                SummaryScreen()
            }
        }
    }
}