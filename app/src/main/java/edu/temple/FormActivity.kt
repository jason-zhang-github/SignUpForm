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
        val user = findViewById<EditText>(R.id.editTextTextPersonName)

        // Create save button
        val btn = findViewById<Button>(R.id.button)

        //define OnClickListener
        val ocl = object : View.OnClickListener
        {
            override fun onClick(v: View?)
            {
                // Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_LONG).show()
                // Log.d("Message", "You clicked the button")

                // Reset all errors

                address.setError(null)
                firstPass.setError(null)
                confirmPass.setError(null)
                user.setError(null)

                // Create strings to hold the user input
                val saveEmail = address.text.toString()
                val savePW = firstPass.text.toString()
                val confirmPW = confirmPass.text.toString()
                val username = user.text.toString()

                // Boolean values for if statements
                val emailEmpty = saveEmail.isEmpty()
                val passEmpty = savePW.isEmpty()
                val confirmEmpty = confirmPW.isEmpty()
                val userEmpty = username.isEmpty()
                val samePass = (savePW == confirmPW)


                // if any EditText is empty, set an error message for each respective EditText
                if (userEmpty)
                {
                    user.setError("No username provided")
                }

                if (emailEmpty)
                {
                    address.setError("No email address provided")
                }

                if (passEmpty)
                {
                    firstPass.setError("No password provided")
                }

                if (confirmEmpty)
                {
                    confirmPass.setError("Please confirm password")
                }

                // If Password and Confirm Password fields do not match, set error for both
                // if (!savePW.equals(confirmPW))

                if (!samePass)
                {
                    if (!passEmpty)
                    {
                        firstPass.setError("Passwords do not match")
                    }

                    if (!confirmEmpty)
                    {
                        confirmPass.setError("Passwords do not match")
                    }

                }

                // If everything good, welcome message

                if (!userEmpty && !emailEmpty && !passEmpty && !confirmEmpty && samePass)
                {
                    val welcome = "Welcome " + username + " to the SignUpFormApp"
                    Toast.makeText(this@MainActivity, welcome, Toast.LENGTH_LONG).show()
                    Log.d("Message", "All good")
                }
            }
        }

        btn.setOnClickListener(ocl) // assign OCL


    }
}