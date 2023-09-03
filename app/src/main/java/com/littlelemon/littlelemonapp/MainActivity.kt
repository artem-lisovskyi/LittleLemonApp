package com.littlelemon.littlelemonapp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.littlelemon.littlelemonapp.ui.theme.LittleLemonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonAppTheme {
                MyNavigation(context = applicationContext)
            }
        }
    }
}

@Composable
fun MyNavigation(context: Context) {
    val navController = rememberNavController()
    Navigation(navController = navController, context)
}