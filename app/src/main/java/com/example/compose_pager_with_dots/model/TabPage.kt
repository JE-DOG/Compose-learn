package com.example.compose_pager_with_dots.model

import android.content.res.Resources
import androidx.compose.ui.graphics.Color
import com.example.compose_pager_with_dots.R
import com.example.compose_pager_with_dots.ui.theme.Purple200

enum class TabPageResources(val resource: Int, val tabName: String,val color: Color) {

    Home(R.drawable.ic_home,"Home", Color(0xFF9C000F)),
    Favorite(R.drawable.ic_favorite,"Favorite",Color(0xFFFF0019)),
    Profile(R.drawable.ic_profile,"Profile",Color(0xFF0073FF))

}