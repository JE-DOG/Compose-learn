package com.example.compose_pager_with_dots.ui.screens.map

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import org.osmdroid.tileprovider.tilesource.ITileSource
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.TilesOverlay

@Composable
fun Map() {

    AndroidView(
        factory = {

            MapView(it).apply {

                this.setTileSource(TileSourceFactory.MAPNIK)
                this.invalidate()

            }

        }
    )



}