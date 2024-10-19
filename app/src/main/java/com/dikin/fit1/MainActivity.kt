package com.dikin.fit1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dikin.fit1.screens.home.HomeScreen
import com.dikin.fit1.ui.theme.Fit1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Fit1Theme {
                HomeScreen()
            }
        }
    }
}
