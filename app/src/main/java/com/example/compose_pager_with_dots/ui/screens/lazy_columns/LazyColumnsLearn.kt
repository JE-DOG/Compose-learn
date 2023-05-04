package com.example.compose_pager_with_dots.ui.screens.lazy_columns

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.ui.screens.lazy_columns.elements.ListItem
import com.example.compose_pager_with_dots.ui.screens.lazy_columns.model.Profile


@SuppressLint("UnrememberedMutableState", "MutableCollectionMutableState")
@Composable
fun LazyColumnsLearn(list: MutableList<Profile>){


    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 15.dp)
    ){
        items(list.size){

            ListItem(
                profile = list[it]
            )
        }
    }
}