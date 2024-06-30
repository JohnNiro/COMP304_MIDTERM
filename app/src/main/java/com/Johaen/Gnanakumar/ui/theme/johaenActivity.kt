//studeint id: 300880309
package com.Johaen.Gnanakumar.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class johaenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_johaen)

        val navigateButton: ImageButton = findViewById(R.id.navigateButton)
        navigateButton.setOnClickListener {
            val intent = Intent(this, gnanakumarActivity::class.java)
            startActivity(intent)
        }
    }
}