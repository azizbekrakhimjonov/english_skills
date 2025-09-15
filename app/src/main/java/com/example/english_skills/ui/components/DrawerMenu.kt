package com.example.english_skills.ui.components


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.english_skills.navigation.Screen

@Composable
fun DrawerMenu(
    onDestinationClicked: (String) -> Unit
) {
    ModalDrawerSheet {
        Text(
            text = "English App",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )

        NavigationDrawerItem(
            label = { Text("Progress / Results") },
            selected = false,
            onClick = { onDestinationClicked(Screen.Results.route) }
        )

        NavigationDrawerItem(
            label = { Text("Profile") },
            selected = false,
            onClick = { onDestinationClicked(Screen.Profile.route) }
        )
    }
}
