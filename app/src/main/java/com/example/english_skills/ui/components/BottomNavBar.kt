package com.example.english_skills.ui.components


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.english_skills.R
import com.example.english_skills.navigation.Screen

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(
        Screen.Speaking,
        Screen.Listening,
        Screen.Reading,
        Screen.Writing
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { screen ->
            NavigationBarItem(
                icon = {
                    when (screen) {
                        Screen.Speaking -> Icon(painterResource(R.drawable.mic), contentDescription = "Speaking")
                        Screen.Listening -> Icon(painterResource(R.drawable.mic), contentDescription = "Listening")
                        Screen.Reading -> Icon(painterResource(R.drawable.mic), contentDescription = "Reading")
                        Screen.Writing -> Icon(painterResource(R.drawable.mic), contentDescription = "Writing")
                        Screen.Profile -> TODO()
                        Screen.Results -> TODO()
                    }
                },
                label = { Text(screen.route.replaceFirstChar { it.uppercase() }) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
