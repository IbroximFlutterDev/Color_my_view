package com.example.colormyviews


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.colormyviews.R.id.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<Int> = listOf(
            box_one,
            box_two,
            box_three,
            box_four,
            box_five,
            red_button,
            yellow_button,
            green_button,

            )


        for (item in clickableViews) {
            findViewById<TextView>(item).setOnClickListener { makeColored(item) }
        }
    }

    private fun makeColored(id: Int) {
        findViewById<TextView>(id).setBackgroundColor(
            when (id) {
                box_one -> Color.DKGRAY
                box_two -> Color.GRAY
                box_three -> Color.GREEN
                box_four -> Color.YELLOW
                box_five -> Color.MAGENTA

                red_button-> Color.RED
                yellow_button-> Color.YELLOW
                green_button-> Color.GREEN


                else -> Color.LTGRAY
            }
        )
    }
}