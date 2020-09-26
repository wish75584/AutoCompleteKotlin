package com.stubborn.autocompletekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val u_city = findViewById<AutoCompleteTextView>(R.id.u_city)
        // Get the array of languages
        val city= resources.getStringArray(R.array.city)
        // Create adapter and add in AutoCompleteTextView
        val adapter =  ArrayAdapter(this,android.R.layout.simple_list_item_1, city)
        u_city.setAdapter(adapter)

        val enteredCity = getString(R.string.submitted_city) + " " + u_city.getText()

        u_city.setText(enteredCity)
    }
}
