package com.example.compose_pager_with_dots.ui.screens.bottom_sheet_dialog

import android.content.Context
import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.compose_pager_with_dots.ui.screens.bottom_sheet.elements.SomeScreen
import com.example.compose_pager_with_dots.ui.screens.lazy_columns.LazyColumnsLearn
import com.example.compose_pager_with_dots.ui.screens.lazy_columns.model.Profile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetDialog(context:Context,scope: CoroutineScope,bottomSheetState: ModalBottomSheetState){

    ModalBottomSheetLayout(
        sheetContent = {
            LazyColumnsLearn(list = mutableListOf(Profile("SUUIII","fda")))
        },
        sheetState = bottomSheetState
    ) {
        SomeScreen(
            onClick = {
                scope.launch {
                    bottomSheetState.show()
                }
            Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
        })
    }

}