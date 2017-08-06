package com.stylingandroid.time

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

class TimeApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        AndroidThreeTen.init(this)
    }
}
