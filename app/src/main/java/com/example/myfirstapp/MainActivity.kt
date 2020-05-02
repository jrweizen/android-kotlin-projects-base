package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // Code btnShowToast
            Log.i("MainActivity", "...Button was clicked!")

            //Toast message
            Toast.makeText(this, "Toast Msg Test!", Toast.LENGTH_SHORT).show()

        }
    }
}
