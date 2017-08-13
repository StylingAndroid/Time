package com.stylingandroid.time

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.threeten.bp.*
import org.threeten.bp.temporal.ChronoUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.alpha = 0f
        text.animate()
                .alpha(1f)
                .setDuration(1, ChronoUnit.SECONDS)
                .start()

        LocalTime.now().also { now ->
            println("Now: $now")
            now.plusHours(23).also { laterTime ->
                println("Later time: $laterTime")
                println("Duration between $now and $laterTime: ${Duration.between(now, laterTime)}")
                println("Duration between $laterTime and $now: ${Duration.between(laterTime, now)}")
            }
        }

        LocalDate.now().also { today ->
            println("Today: $today")
            today.plusDays(1).also { tomorrow ->
                println("Tomorrow: $tomorrow")
                println("Period between $today and $tomorrow: ${Period.between(today, tomorrow)}")
                println("Period between $tomorrow and $today: ${Period.between(tomorrow, today)}")

            }
        }

        LocalDateTime.now().also { now ->
            println("Now: $now")
            now.plusHours(23).also { laterTime ->
                println("Later time: $laterTime")
                println("Duration between $now and $laterTime: ${Duration.between(now, laterTime)}")
                println("Duration between $laterTime and $now: ${Duration.between(laterTime, now)}")
            }
            now.plusDays(1).also { laterTime ->
                println("Later time: $laterTime")
                println("Duration between $now and $laterTime: ${Duration.between(now, laterTime)}")
                println("Duration between $laterTime and $now: ${Duration.between(laterTime, now)}")
            }
        }

        listOf(2016, 2107, 2000, 1900, 2100, 2400).forEach { year ->
            println("$year is a leap year: ${Year.of(year).isLeap}")
        }

        ChronoUnit.values()
                .filter { it.duration < ChronoUnit.MILLENNIA.duration }
                .forEach { unit ->
                    println("$unit is ${unit.duration.toNanos()} ns")
                }
    }
}
