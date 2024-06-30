//student id 300880309//
package com.Johaen.Gnanakumar.ui.theme

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class gnanakumarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gnanakumar)

        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {

            val selectedExercises = mutableListOf<String>()
            val checkBox1: CheckBox = findViewById(R.id.checkBox1)
            val checkBox2: CheckBox = findViewById(R.id.checkBox2)
            val checkBox3: CheckBox = findViewById(R.id.checkBox3)
            val checkBox4: CheckBox = findViewById(R.id.checkBox4)
            // Add more CheckBox references as needed
            if (checkBox1.isChecked) selectedExercises.add(checkBox1.text.toString())
            if (checkBox2.isChecked) selectedExercises.add(checkBox2.text.toString())
            if (checkBox3.isChecked) selectedExercises.add(checkBox2.text.toString())
            if (checkBox4.isChecked) selectedExercises.add(checkBox2.text.toString())
            // Add checks for other CheckBoxes

            // Display a Toast message with selected exercises
            Toast.makeText(this, "Selected exercises: ${selectedExercises.joinToString(", ")}", Toast.LENGTH_SHORT).show()
        }

        val imageView: ImageView = findViewById(R.id.zigzagImageView)
        imageView.setImageBitmap(drawZigzagLine())
    }

    private fun drawZigzagLine(): Bitmap {
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint().apply {
            color = Color.BLACK
            strokeWidth = 5f
        }

        val yCoordinates = resources.getStringArray(R.array.y_coordinates).map { it.toInt() }
        var x = 0
        for (y in yCoordinates) {
            canvas.drawLine(x.toFloat(), y.toFloat(), (x + 100).toFloat(), y.toFloat(), paint)
            x += 100
        }
        return bitmap
    }
}

