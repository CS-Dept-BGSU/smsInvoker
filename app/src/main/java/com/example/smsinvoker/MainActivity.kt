package com.example.smsinvoker

// TODO: Import necessary libraries
// HINT: You'll need these imports:
// import android.Manifest
// import android.content.Intent
// import android.content.pm.PackageManager
// import android.net.Uri
// import android.widget.Button
// import android.widget.EditText
// import android.widget.Toast
// import androidx.activity.result.contract.ActivityResultContracts
// import androidx.core.content.ContextCompat
import androidx.activity.ComponentActivity
import android.os.Bundle

class MainActivity : ComponentActivity() {

    // TODO: Declare EditText variables to hold references to our input fields
    // HINT: You need to declare these at the class level so they can be accessed from other methods
    // private lateinit var phoneNumberEditText: EditText
    // private lateinit var messageEditText: EditText

    // TODO: Set up the permission launcher for READ_SMS
    // HINT: Create a launcher that handles permission requests
    // private val requestSmsPermissionLauncher = registerForActivityResult(
    //     ActivityResultContracts.RequestPermission()
    // ) { isGranted: Boolean ->
    //     if (isGranted) {
    //         // Permission was granted - call openSmsApp() here to proceed
    //         // Don't forget to show a Toast to inform the user
    //     } else {
    //         // Permission was denied - inform the user with a Toast message
    //     }
    // }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Initialize the EditText fields
        // HINT: Find the EditText views using their IDs
        // phoneNumberEditText = findViewById(R.id.phoneNumberEditText)
        // messageEditText = findViewById(R.id.messageEditText)

        // TODO: Find the SMS button and set its click listener
        // HINT: You'll need to find the button and set up a click handler
        // findViewById<Button>(R.id.button).setOnClickListener {
        //     // Call checkSmsPermission() when button is clicked
        // }
    }

    // TODO: Create a function to open the SMS app with pre-filled data
    // HINT: Check if the user entered a phone number and/or message and include them in the intent
    /*
    private fun openSmsApp() {
        // Get text from EditText fields and trim any whitespace
        val phoneNumber = phoneNumberEditText.text.toString().trim()
        val message = messageEditText.text.toString().trim()

        // Create the intent
        val intent = Intent(Intent.ACTION_VIEW)

        // Now handle 4 different scenarios:
        // 1. Both phone number and message provided
        // 2. Only phone number provided
        // 3. Only message provided
        // 4. Neither provided

        if (phoneNumber.isNotEmpty()) {
            // We have a phone number - set it as the recipient in our SMS URI
            intent.data = Uri.parse("sms:$phoneNumber")

            // If we also have a message, add it as an extra
            if (message.isNotEmpty()) {
                intent.putExtra("sms_body", message)
            }
        } else {
            // No phone number - just open the general SMS app
            intent.data = Uri.parse("sms:")

            // But if we have a message, still include it as an extra
            if (message.isNotEmpty()) {
                intent.putExtra("sms_body", message)
            }
        }

        // Launch the SMS app with our intent
        startActivity(intent)
    }
    */

    // TODO: Create a function to check for SMS read permission
    // HINT: Check if permission is granted, and if not, request it
    /*
    private fun checkSmsPermission() {
        when {
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_SMS
            ) == PackageManager.PERMISSION_GRANTED -> {
                // Permission is already granted, show a Toast
                Toast.makeText(this, "SMS read permission already granted", Toast.LENGTH_SHORT).show()
                // And call openSmsApp() to proceed
                openSmsApp()
            }
            else -> {
                // Permission is not granted, request it using the launcher
                requestSmsPermissionLauncher.launch(Manifest.permission.READ_SMS)
            }
        }
    }
    */
}