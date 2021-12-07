package com.avd.example.myhomeworkcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton




class MainActivity : AppCompatActivity() {

    lateinit var floatingActionButton: FloatingActionButton

    lateinit var textViewColor: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewColor = findViewById(R.id.work)


        floatingActionButton = findViewById(R.id.floating_action_button)

        floatingActionButton.setOnClickListener {

            // Надо подумать(https://stackoverflow.com/questions/47001467/how-to-use-settextcolorhexavalue-on-kotlin-for-android)
            fun TextView.setTextColor(color: Long) = this.setTextColor(color.toInt())
            textViewColor.setTextColor(0xff444444)



        }
    }
}

