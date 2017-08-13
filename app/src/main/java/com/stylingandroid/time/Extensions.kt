package com.stylingandroid.time

import android.view.ViewPropertyAnimator
import org.threeten.bp.temporal.ChronoUnit

fun ViewPropertyAnimator.setDuration(durationInUnits: Long, unit: ChronoUnit): ViewPropertyAnimator =
        apply {
            duration = unit.duration.toMillis() * durationInUnits
        }
