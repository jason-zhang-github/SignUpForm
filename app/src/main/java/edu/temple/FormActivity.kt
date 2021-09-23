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
        val user = findViewById<EditText>(R.id.editTextTextEmailAddress2)

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

                val emailEmpty = saveEmail.isEmpty()
                val passEmpty = savePW.isEmpty()
                val confirmEmpty = confirmPW.isEmpty()


                // if any EditText is empty, set an error message for each respective EditText
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

                if (savePW != confirmPW)
                {
                    if (!passEmpty)
                    {
                        firstPass.setError("Passwords do not match")
                    }

                    if (!confirmEmpty)
                    {
                        confirmPass.setError("Passwords do not match")
                    }
                    // Toast.makeText(this@MainActivity, "Passwords do not match", Toast.LENGTH_LONG).show()
                    //Log.d("Message", "Passwords do not match")
                }

                // If everything good


            }
        }

        btn.setOnClickListener(ocl) // assign OCL


    }
}