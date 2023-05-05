package com.example.compose_pager_with_dots.ui.screens.bottom_navigation

import android.util.Log
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model.BottomNavItem

@Composable
fun BottomNavigationLear(
    list: List<BottomNavItem>,
    selectedBottomNavItem: String,
    onClick: (String) -> Unit = {}) {


    BottomNavigation{

        list.forEachIndexed { _, bottomNavItem ->
            val index = bottomNavItem.route

            Log.d("NavTest","$selectedBottomNavItem == $index")

            BottomNavigationItem(
                selected = selectedBottomNavItem == index,
                onClick = {
                    onClick(bottomNavItem.route)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = bottomNavItem.icon),
                        contentDescription = "")
                       },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray,
                alwaysShowLabel = true,
                label = { Text(text = bottomNavItem.route) },
                enabled = selectedBottomNavItem != index
            )

        }

    }

}