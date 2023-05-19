package com.example.compose_pager_with_dots.ui.navigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.ui.model.Test
import com.example.compose_pager_with_dots.ui.navigation.screens.destinations.DetailNameScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination(start = true)
fun Screen1(
    navigator: DestinationsNavigator
) {
    
    MainTudaSuda(navigator = navigator)

}

@Composable
@Destination
fun Screen2(
    navigator: DestinationsNavigator
) {

    ScreenTestNav(text = "Some")

}

@Composable
fun Screen3() {

    ScreenTestNav(text = "Profile")

}

@Composable
fun ScreenTestNav(text: String){

    Box(
        Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(text = text, color = Color.Blue)

    }

}

@Composable
@Destination
fun MainTudaSuda(
    navigator: DestinationsNavigator
){

    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        val text = remember {
            mutableStateOf("")
        }

        TextField(modifier = Modifier.fillMaxWidth(),value = text.value, onValueChange = {
            text.value = it
        })

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {

                navigator.navigate(
                    DetailNameScreenDestination(
                        full = Test(
                            text.value
                        )
                    )
                )

            }
        ) {
            Text(text = "To deatil screen")
        }

    }

}

@Composable
@Destination
fun DetailNameScreen(
    navigator: DestinationsNavigator,
    full: Test
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()) {

        Text(text = full.name)

    }
}
@Destination
@Composable
fun FuckMe(
    navigator: DestinationsNavigator,
    full: Test
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()) {

        Text(text = full.name)

    }
}