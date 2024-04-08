package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

// Define the LoginFragment class which extends Fragment and uses the layout fragment_login
class LoginFragment : Fragment(R.layout.fragment_login) {

        // Retrieve arguments passed to this fragment using safe args
        private val args: LoginFragmentArgs by navArgs()

        // Override the onViewCreated() method to perform actions when the view is created
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)

                // Extract username from the arguments passed to the fragment
                val usernameDeepLink = args.username

                // Set the extracted username to the EditText field for username
                view.findViewById<EditText>(R.id.edit_text_username).setText(usernameDeepLink)

                // Set a click listener to the Confirm button
                view.findViewById<Button>(R.id.button_confirm).setOnClickListener {
                        // Retrieve the username and password entered by the user
                        val username = view.findViewById<EditText>(R.id.edit_text_username).text.toString()
                        val password = view.findViewById<EditText>(R.id.edit_text_password).text.toString()

                        // Create an action to navigate from LoginFragment to WelcomeFragment, passing username and password as arguments
                        val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)

                        // Use the NavController to navigate to the WelcomeFragment with the specified action
                        findNavController().navigate(action)
                }
        }
}
