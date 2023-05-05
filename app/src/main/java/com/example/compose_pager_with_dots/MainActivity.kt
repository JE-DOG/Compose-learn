package com.example.compose_pager_with_dots

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.ui.screens.alert_dialog.AlertDialogLearn
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.BottomNavigationLear
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model.BottomNavItem
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

            Compose_Pager_With_DotsTheme {

                Scaffold(
                    topBar = {



                    },
                    content = {



                    },
                      bottomBar = {

                        BottomNavigationLear(list = listOf(
                            BottomNavItem("home","Home",R.drawable.ic_home),
                            BottomNavItem("favorite","Favorite",R.drawable.ic_favorite),
                            BottomNavItem("profile","Profile",R.drawable.ic_profile),
                        ))

                    }
                )
            }
        }
    }
}

