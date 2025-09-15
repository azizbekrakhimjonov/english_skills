package com.example.english_skills

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.english_skills.navigation.NavGraph
import com.example.english_skills.ui.theme.English_skillsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            English_skillsTheme {
                NavGraph()
            }
        }
    }
}
