package com.example.compose_pager_with_dots.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Screen1() {

    ScreenTestNav(text = "Home")

}

@Composable
fun Screen2() {

    ScreenTestNav(text = "Favorite")

}

@Composable
fun Screen3() {

    ScreenTestNav(text = "Profile")

}

@Composable
fun ScreenTestNav(text: String){

    Box(
        Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(text = text, color = Color.Blue)

    }

}