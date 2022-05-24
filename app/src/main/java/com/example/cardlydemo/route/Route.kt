package com.example.cardlydemo.route

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.cardlydemo.R

sealed class Route(
    var key: String,
    @StringRes val title: Int = R.string.no_ab_title,
    @DrawableRes val icon: Int? = null,
    val argsKey: String = "",
    val clearBackStack: Boolean = false
) {

    object SplashScreenRoute : Route("splash_screen", title = R.string.no_ab_title)

}
