package com.example.english_skills.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("User Profile", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Name: John Doe", style = MaterialTheme.typography.bodyLarge)
        Text("Level: Intermediate", style = MaterialTheme.typography.bodyLarge)
        Text("Joined: Sep 2025", style = MaterialTheme.typography.bodyLarge)
    }
}
