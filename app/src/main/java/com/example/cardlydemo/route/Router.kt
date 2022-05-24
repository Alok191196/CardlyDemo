package com.example.cardlydemo.route

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cardlydemo.screens.splash.SplashScreen

typealias Router = (Route) -> Unit
typealias DismissCallback = () -> Unit


@Composable
fun Router(
    navController: NavHostController,
    startDestination: String
) {

    val context = LocalContext.current

    NavHost(navController = navController, startDestination = startDestination) {

        composable(Route.SplashScreenRoute.key) {
            SplashScreen {
                navController.navigateAndPopBackStack(it.key)
            }
        }
    }
}