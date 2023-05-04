package com.example.compose_pager_with_dots.ui.screens.bottom_sheet

import android.content.Context
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.ui.screens.bottom_sheet.elements.SomeScreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheet(sheetContent: @Composable ColumnScope.() -> Unit, mainContent: @Composable () -> Unit,){


    BottomSheetScaffold(
        modifier = Modifier,
        sheetContent = {
            sheetContent()
        },
        sheetPeekHeight = 80.dp,
        sheetShape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp),

    ){
        mainContent()
    }

}