package com.example.compose_pager_with_dots.ui.navigation.nav_host

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose_pager_with_dots.ui.navigation.Screen1
import com.example.compose_pager_with_dots.ui.navigation.Screen2
import com.example.compose_pager_with_dots.ui.navigation.Screen3
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model.BottomNavItem

@Composable
fun NavHostLearn(screens: List<BottomNavItem>,navController: NavHostController,setScreen:String) {

    NavHost(startDestination = screens.first().route, navController = navController){
        val profile = "profile"
        val home = "home"
        val favorite = "favorite"


        composable(home){ Screen1() }
        composable(favorite){ Screen2() }
        composable(profile){ Screen3() }

    }

}