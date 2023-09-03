package com.littlelemon.littlelemonapp

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController, context: Context) {
    val x = 2
    NavHost(
        navController = navController,
        startDestination = if (true) {
            Onboarding.route
        } else {
            Home.route
        }
    ) {
        composable(Onboarding.route) {
            OnboardingScreen(navController, context)
        }
        composable(Home.route) {
            HomeScreen(navController)
        }
        composable(Profile.route) {
            ProfileScreen(context, navController)
        }
    }
}