package com.example.compose_pager_with_dots.ui.screens.pager_with_dots_and_tab.elements

import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.compose_pager_with_dots.model.TabPageResources

@Composable
fun TabMain(selectedIndex:Int, onSelect: (TabPageResources) -> Unit){

    TabRow(selectedTabIndex = selectedIndex) {

        TabPageResources.values().forEachIndexed { index, tabPageResources ->
            Tab(
                selected = selectedIndex == index,
                onClick = {
                    onSelect(tabPageResources)
                },
                text = { Text(text = tabPageResources.tabName) },
                icon = { Icon(painter = painterResource(id = tabPageResources.resource),
                    contentDescription = tabPageResources.tabName) },
                selectedContentColor = tabPageResources.color,
                unselectedContentColor = Color.Gray
                )
        }

    }

}