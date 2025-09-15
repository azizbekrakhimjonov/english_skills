package com.example.english_skills.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResultsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Progress & Results", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))
        Text("Speaking: 80%", style = MaterialTheme.typography.bodyLarge)
        Text("Listening: 75%", style = MaterialTheme.typography.bodyLarge)
        Text("Reading: 90%", style = MaterialTheme.typography.bodyLarge)
        Text("Writing: 85%", style = MaterialTheme.typography.bodyLarge)
    }
}
