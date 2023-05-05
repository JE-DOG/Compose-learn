package com.example.compose_pager_with_dots.ui.screens.bottom_navigation

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_pager_with_dots.ui.screens.bottom_navigation.model.BottomNavItem

@Composable
fun BottomNavigationLear(list: List<BottomNavItem>, onClick: () -> Unit = {}) {

    val isSelected = remember {
        mutableStateOf(0)
    }

    BottomNavigation(
        Modifier.height(110.dp)
    ){

        list.forEachIndexed { index, bottomNavItem ->

            BottomNavigationItem(
                modifier = Modifier.height(110.dp),
                selected = isSelected.value == index,
                onClick = {
                    isSelected.value = index
                    onClick()
                },
                icon = {
                    Icon(
                        modifier = Modifier
                            .height(110.dp)
                            .width(40.dp),
                        painter = painterResource(id = bottomNavItem.icon),
                        contentDescription = "")
                       },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray,
                alwaysShowLabel = true,
                label = { Text(text = bottomNavItem.name, fontSize = 18.sp) }
            )

        }

    }

}