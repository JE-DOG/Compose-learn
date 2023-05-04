package com.example.compose_pager_with_dots

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.compose_pager_with_dots.ui.screens.text_field.InputText
import com.example.compose_pager_with_dots.ui.theme.Compose_Pager_With_DotsTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter", "MutableCollectionMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Compose_Pager_With_DotsTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {



                    },
                    content = {
                        InputText()

                    },
                      bottomBar = {



                    }
                )
            }
        }
    }
}

