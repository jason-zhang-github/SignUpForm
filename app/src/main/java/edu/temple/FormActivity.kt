package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create objects to represent the EditTexts
        val address = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val firstPass = findViewById<EditText>(R.id.editTextTextPassword)
        val confirmPass = findViewById<EditText>(R.id.editTextTextPassword2)

        // Create save button
        val btn = findViewById<Button>(R.id.button)

        //define OnClickListener
        val ocl = object : View.OnClickListener
        {
            override fun onClick(v: View?)
            {
                // Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_LONG).show()
                // Log.d("Message", "You clicked the button")

                // Create strings to hold the user input
                val saveEmail = address.text.toString()
                val savePW = firstPass.text.toString()
                val confirmPW = confirmPass.text.toString()

                // if any EditText is empty, set an error message for each respective EditText
                if (saveEmail.isEmpty())
                {
                    address.setError("No email address provided")
                }

                if (savePW.isEmpty())
                {
                    firstPass.setError("No password provided")
                }

                if (confirmPW.isEmpty())
                {
                    confirmPass.setError("Please confirm password")
                }

                // If Password and Confirm Password fields do not match, set error for both
                // if (!savePW.equals(confirmPW))

                if (savePW != confirmPW)
                {

                }
            }
        }

        btn.setOnClickListener(ocl) // assign OCL


    }
}