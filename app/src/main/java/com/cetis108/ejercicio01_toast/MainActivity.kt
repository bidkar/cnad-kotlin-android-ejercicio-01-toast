package com.cetis108.ejercicio01_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun saludar(mensaje:String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saludar("Soy un onCreate")
        //Toast.makeText(this, "Soy un onCreate", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        saludar("Soy un onStart")
        //Toast.makeText(this, "Soy un onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        saludar("Soy un onResume")
        //Toast.makeText(this, "Soy un onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        saludar("Soy un onPause")
        //Toast.makeText(this, "Soy un onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        saludar("Soy un onStop")
        //Toast.makeText(this, "Soy un onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        saludar("Soy un onRestart")
        //Toast.makeText(this, "Soy un onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        saludar("Soy un onDestroy")
        //Toast.makeText(this, "Soy un onDestroy", Toast.LENGTH_LONG).show()
    }
}