package com.stylingandroid.time

import android.view.ViewPropertyAnimator
import java.util.concurrent.TimeUnit

fun ViewPropertyAnimator.setDuration(durationInUnits: Long, unit: TimeUnit): ViewPropertyAnimator =
        apply {
            duration = unit.toMillis(durationInUnits)
        }
