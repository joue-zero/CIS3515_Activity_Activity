package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            // Extract transferred value
            val textSize = intent.getIntExtra("textSize", 22)
            // Set text size
            setTextSize(textSize.toFloat())
        }

        // when click the back button, go back to the previous activity
        findViewById<TextView>(R.id.button).setOnClickListener {
            finish()
        }

    }
}