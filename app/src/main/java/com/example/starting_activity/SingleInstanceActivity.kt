package com.example.starting_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SingleInstanceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_instance)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.textView).apply {
            text = String.format(context.getString(R.string.single_instance_launch_mode), message)
        }
    }
}
