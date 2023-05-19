package com.example.compose_pager_with_dots

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

class App: Application() {



    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        initNotificationChannel()
    }

    private fun initNotificationChannel() {

        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channel = NotificationChannel(MAIN_NOTIFICATION_CHANNEL_ID,"Main channel",NotificationManager.IMPORTANCE_DEFAULT)
        manager.createNotificationChannel(channel)

    }

    companion object{

        lateinit var INSTANCE: App
            private set

        const val MAIN_NOTIFICATION_CHANNEL_ID = "Main_ID"

    }
}