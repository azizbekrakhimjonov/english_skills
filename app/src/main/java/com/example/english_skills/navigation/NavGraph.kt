package com.example.english_skills.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.english_skills.ui.components.BottomNavBar
import com.example.english_skills.ui.components.DrawerMenu
import com.example.english_skills.ui.screens.*
import kotlinx.coroutines.launch

sealed class Screen(val route: String) {
    object Speaking : Screen("speaking")
    object Listening : Screen("listening")
    object Reading : Screen("reading")
    object Writing : Screen("writing")
    object Results : Screen("results")
    object Profile : Screen("profile")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph() {
    val navController: NavHostController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            DrawerMenu { route ->
                navController.navigate(route) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
                scope.launch { drawerState.close() }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            bottomBar = { BottomNavBar(navController) }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = Screen.Speaking.route,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(Screen.Speaking.route) { SpeakingScreen() }
                composable(Screen.Listening.route) { ListeningScreen() }
                composable(Screen.Reading.route) { ReadingScreen() }
                composable(Screen.Writing.route) { WritingScreen() }
                composable(Screen.Results.route) { ResultsScreen() }
                composable(Screen.Profile.route) { ProfileScreen() }
            }
        }
    }
}
