package com.example.compose_pager_with_dots.ui.screens.text_field

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun InputText(

) {

    val text = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
            .padding(horizontal = 20.dp)
            .border(1.dp, Color.DarkGray, RoundedCornerShape(12.dp))
            .background(Color.LightGray, RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center,

    ){
        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            value = text.value,
            onValueChange = {
                text.value = it
            },
            keyboardActions = KeyboardActions(
                onSend = {
                    Log.d("keyboardActionTest","Send")
                }
            ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone,
                imeAction = ImeAction.Send
            ),
            textStyle = TextStyle(fontSize = 18.sp)
            )
    }

    
}