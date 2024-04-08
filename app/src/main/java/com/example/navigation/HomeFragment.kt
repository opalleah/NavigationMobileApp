package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

// Define the HomeFragment class which extends Fragment and uses the layout fragment_home
class HomeFragment : Fragment(R.layout.fragment_home) {

        // Declare a lateinit variable for the login button
        private lateinit var button_login: Button

        // Override the onViewCreated() method to perform actions when the view is created
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)

                // Find the login button by its ID in the fragment view
                button_login = view.findViewById(R.id.button_login)

                // Set a click listener to the login button
                button_login.setOnClickListener {
                        // Create an action to navigate from the HomeFragment to the LoginFragment
                        val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()

                        // Use the NavController to navigate to the LoginFragment
                        findNavController().navigate(action)
                }
        }
}
