package com.example.compose_pager_with_dots.ui.screens.lazy_columns.elements

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.R
import com.example.compose_pager_with_dots.ui.screens.lazy_columns.model.Profile

@SuppressLint("InvalidColorHexValue")
@Composable
fun ListItem(profile: Profile) {

    Log.d("ListItemTest","i'm here")

    val isShow = remember { mutableStateOf(false) }

    AnimatedVisibility(visible = true) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .height(100.dp),
            shape = RoundedCornerShape(12.dp),
        ) {

            Row(
                modifier = Modifier
                    .background(Color(0xF727272))
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight()
                        .clickable {
                            isShow.value = !isShow.value
                        },
                    contentScale = ContentScale.FillHeight
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()

                        .padding(start = 5.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Name: ${profile.name}")
                    AnimatedVisibility(visible = isShow.value) {
                        Text(
                            modifier = Modifier
                                .padding(top = 0.dp),
                            text = "Email: ${profile.email}",
                            color = Color.DarkGray,

                            )
                    }

                }

            }

        }
    }




}