package com.example.compose_pager_with_dots

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.compose_pager_with_dots.ui.navigation.screens.NavGraphs
import com.example.compose_pager_with_dots.ui.navigation.screens.destinations.Screen1Destination
import com.example.compose_pager_with_dots.ui.navigation.screens.destinations.Screen2Destination
import com.example.compose_pager_with_dots.ui.theme.Compose_Pager_With_DotsTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.osmdroid.config.Configuration

class MainActivity : ComponentActivity() {

    @SuppressLint(
        "UnusedMaterialScaffoldPaddingParameter",
        "MutableCollectionMutableState",
        "RestrictedApi"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        Configuration.getInstance().load(this,getSharedPreferences("OSM", Context.MODE_PRIVATE))

        super.onCreate(savedInstanceState)

        setContent {

            val navigator = rememberNavController()

            Compose_Pager_With_DotsTheme {

                Scaffold(
                    topBar = {



                    },
                    content = {

                        DestinationsNavHost(navGraph = NavGraphs.root, navController = navigator)

                    },
                    bottomBar = {

                        BottomNav(navigator = navigator)

                    }

                )
            }
        }

        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.POST_NOTIFICATIONS
            ),
            123
        )

    }
}

@Composable
fun BottomNav(
    navigator: NavController
){

    Row(
        Modifier
            .fillMaxWidth()
            .height(40.dp),
    ) {

        Button(onClick = {
            navigator.navigate(
                Screen1Destination.route
            )
        },
            Modifier
                .weight(1f)) {
            Text(text = "Main")
        }

        Button(onClick = {
            navigator.navigate(
                Screen2Destination.route
            )
        },
            Modifier
                .weight(1f)) {
            Text(text = "Some")
        }

    }

}

