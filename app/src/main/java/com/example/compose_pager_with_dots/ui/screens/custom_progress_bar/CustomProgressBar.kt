package com.example.compose_pager_with_dots.ui.screens.custom_progress_bar

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun CustomProgressBar(
    @DrawableRes id:Int,
    contentDescription:String = ""
){

    var currentRotation by remember { mutableStateOf(0f) }
    val rotation = remember { Animatable(currentRotation) }
    val scope = rememberCoroutineScope()
    scope.launch {
        rotation.animateTo(
            targetValue = currentRotation + 360,
            animationSpec = infiniteRepeatable(
                animation = tween(
                    1500,
                    easing = LinearEasing
                )
            )
        ){
            currentRotation = value
        }
    }


    Box(
        Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Icon(
            painter = painterResource(id = id),
            contentDescription = contentDescription,
            modifier = Modifier
                .rotate(rotation.value)
        )


    }

}