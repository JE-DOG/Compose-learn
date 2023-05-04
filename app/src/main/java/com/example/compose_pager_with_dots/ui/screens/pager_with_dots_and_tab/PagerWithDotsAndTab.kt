package com.example.compose_pager_with_dots.ui.screens.pager_with_dots_and_tab

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.compose_pager_with_dots.model.PagerItemClass
import com.example.compose_pager_with_dots.model.TabPageResources
import com.example.compose_pager_with_dots.ui.screens.pager_with_dots_and_tab.elements.PagerItem
import com.example.compose_pager_with_dots.ui.screens.pager_with_dots_and_tab.elements.TabMain
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalPagerApi::class)
@Composable
fun PagerWithDotsAndTab() {

    val list = listOf(
        PagerItemClass("Home"),
        PagerItemClass("Favorite"),
        PagerItemClass("Profile"),
    )

    val pagerSelected = rememberPagerState(pageCount = TabPageResources.values().size)
    val coroutine = rememberCoroutineScope()

    Scaffold(
        Modifier,
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            TabMain(selectedIndex = pagerSelected.currentPage, onSelect = {
                coroutine.launch {
                    pagerSelected.animateScrollToPage(it.ordinal)
                }
            })
        },
        content = {
            Box(
                Modifier
                    .fillMaxSize()
            ) {
                Column(
                    Modifier
                        .matchParentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    HorizontalPager(state = pagerSelected) {
                        PagerItem(text = list[it].text)
                    }
                }
            }

        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentAlignment = Alignment.Center
            ) {
                HorizontalPagerIndicator(
                    pagerState = pagerSelected,
                    activeColor = Color.Blue,
                    inactiveColor = Color.Transparent,
                )
            }

        }
    )
}

