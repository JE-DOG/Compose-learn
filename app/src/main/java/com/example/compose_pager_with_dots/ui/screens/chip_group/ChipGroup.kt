package com.example.compose_pager_with_dots.ui.screens.chip_group

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.R
import kotlin.math.sign

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChipGroupSingleSelect(
    chipList: List<String>,
    selectListener: (String) -> Unit
){

    val selected = remember {
        mutableStateOf(-1)
    }

    LazyRow(
        Modifier
            .fillMaxWidth()
    ){
        items(chipList.size){
            val text = chipList[it]

            if (it == selected.value){

                Chip(
                    modifier = Modifier
                        .padding(end = 5.dp),
                    colors = ChipDefaults.chipColors(backgroundColor = Color.Blue),
                    onClick = {

                    }
                ) {

                    Image(
                        contentScale = ContentScale.FillHeight,
                        painter = painterResource(id = R.drawable.ic_check),
                        contentDescription = "",

                        )
                    Text(text = text, color = Color.White)

                }

            }else{

                Chip(
                    modifier = Modifier
                        .padding(end = 5.dp),
                    colors = ChipDefaults.chipColors(backgroundColor = Color.DarkGray),
                    onClick = {
                        selected.value = it
                        selectListener(text)
                    }) {

                        Text(text = text, color = Color.Black)

                }

            }



        }
    }

}