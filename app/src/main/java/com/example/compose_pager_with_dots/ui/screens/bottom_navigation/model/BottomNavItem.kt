package com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes

data class BottomNavItem(
    val route:String,
    val name:String,
    @DrawableRes val icon:Int
)
