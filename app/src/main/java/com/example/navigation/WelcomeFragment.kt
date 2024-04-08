package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
        // Retrieve the arguments passed to the fragment
        private val args: WelcomeFragmentArgs by navArgs()

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)

                // Extract the username and password from the arguments
                val username = args.username
                val password = args.password

                // Set the username and password to TextViews in the layout
                view.findViewById<TextView>(R.id.text_view_username).text = "Username: $username"
                view.findViewById<TextView>(R.id.text_view_password).text = "Password: $password"

                // Set up a click listener for the OK button
                view.findViewById<Button>(R.id.button_ok).setOnClickListener {
                        // Navigate back to the home screen
                        findNavController().navigateUp()
                }
        }
}
