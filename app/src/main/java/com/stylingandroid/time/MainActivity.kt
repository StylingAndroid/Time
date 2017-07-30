package com.stylingandroid.time

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.alpha = 0f
        text.animate()
                .alpha(1f)
                .setDuration(1, TimeUnit.SECONDS)
                .start()
    }
}
