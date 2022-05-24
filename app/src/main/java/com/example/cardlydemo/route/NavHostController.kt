package com.example.cardlydemo.route

import android.net.Uri
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions

fun NavHostController.navigateAndPopBackStack(destination: String) {
    val currentRoute = this.currentDestination?.route
    this.navigate(destination) {
        currentRoute?.let {
            popUpTo(it) {
                inclusive = true
            }
        }
    }
}

fun NavHostController.navigateAndPopBackStack(destination: String, popUpToId: String) {
    this.navigate(destination) {
        popUpTo(popUpToId) {
            inclusive = true
        }
    }
}

fun NavHostController.navigateAndPopUpToRoot(destination: String) {
    this.navigate(destination) {
        popUpTo(0) {
            inclusive = true
        }
    }
}

fun NavHostController.navigateAndPopUpToRoot(destination: Uri) {
    this.navigate(destination, navOptions = NavOptions.Builder().setPopUpTo(0, inclusive = true).build())
}