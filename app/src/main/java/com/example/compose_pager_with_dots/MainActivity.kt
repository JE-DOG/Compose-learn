package com.example.compose_pager_with_dots

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_pager_with_dots.ui.navigation.Screen1
import com.example.compose_pager_with_dots.ui.navigation.Screen2
import com.example.compose_pager_with_dots.ui.navigation.Screen3
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.BottomNavigationLear
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model.BottomNavItem
import com.example.compose_pager_with_dots.ui.screens.map.Map
import com.example.compose_pager_with_dots.ui.theme.Compose_Pager_With_DotsTheme
import org.osmdroid.config.Configuration

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter", "MutableCollectionMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        Configuration.getInstance().load(this,getSharedPreferences("OSM", Context.MODE_PRIVATE))

        super.onCreate(savedInstanceState)
        setContent {

            val scope = rememberCoroutineScope()


            Compose_Pager_With_DotsTheme {

                Scaffold(
                    topBar = {



                    },
                    content = {
                        Box(modifier = Modifier
                            .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ){
                            Map()
                        }

                    },
                      bottomBar = {



                      },
                )
            }
        }
    }
}

