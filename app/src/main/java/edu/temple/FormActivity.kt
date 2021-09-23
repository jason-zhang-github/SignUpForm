package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val address = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val saveEmail = address.text.toString()

        val firstPass = findViewById<EditText>(R.id.editTextTextPassword)
        val savePW = firstPass.text.toString()

        val confirmPass = findViewById<EditText>(R.id.editTextTextPassword2)
        val confirmPW = confirmPass.text.toString()





    }
}