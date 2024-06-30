package com.Johaen.Gnanakumar.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Johaen.Gnanakumar.R
import com.Johaen.Gnanakumar.ui.theme.ui.theme.JohaenNiroshenGnanakumar_COMP304_001_HandsOn_Test1_S24Theme

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