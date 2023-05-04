package com.example.compose_pager_with_dots

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.compose_pager_with_dots.ui.screens.bottom_sheet.BottomSheet
import com.example.compose_pager_with_dots.ui.screens.bottom_sheet.elements.SomeScreen
import com.example.compose_pager_with_dots.ui.screens.bottom_sheet_dialog.BottomSheetDialog
import com.example.compose_pager_with_dots.ui.screens.text_field.InputText
import com.example.compose_pager_with_dots.ui.theme.Compose_Pager_With_DotsTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter", "MutableCollectionMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scope = rememberCoroutineScope()
            val sheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)

            Compose_Pager_With_DotsTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {



                    },
                    content = {

                        BottomSheetDialog(
                            context = this,
                            scope,
                            sheetState
                            )

                    },
                      bottomBar = {



                    }
                )
            }
        }
    }
}

