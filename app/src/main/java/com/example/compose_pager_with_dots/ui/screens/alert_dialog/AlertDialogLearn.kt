package com.example.compose_pager_with_dots.ui.screens.alert_dialog

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AlertDialogLearn() {

    AlertDialog(
        onDismissRequest = {},
        buttons = {
            Row{
               Button(onClick = { Log.d("AlertButTest","Row but")}) {
                   Text(text = "Row but")
               }
                Text(text = "Simple text")
            }
        },
        title = { Text(text = "Hi this is title") },
        text = { Text(text = "Hi this is text") },
        contentColor = Color.Gray,
        shape = RoundedCornerShape(12.dp),
    )

}