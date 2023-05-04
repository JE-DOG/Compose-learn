package com.example.compose_pager_with_dots.ui.screens.bottom_sheet.elements

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SomeScreen(context:Context){

    Box(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth()

            .background(Color.Green),
        contentAlignment = Alignment.Center
    ){

            Button(onClick = {
                Toast.makeText(context, "You are been manipulated.\nHAHAHHAHAH", Toast.LENGTH_SHORT).show()
            }) {
                Text(text = "Click me!")
            }

    }

}