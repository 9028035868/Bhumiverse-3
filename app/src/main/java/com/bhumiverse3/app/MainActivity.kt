package com.bhumiverse3.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Bhumiverse 3D\nआपली जमीन, आपला डिजिटल अधिकार"
            textSize = 20f
            setPadding(40, 100, 40, 40)
        }

        setContentView(textView)
    }
}
