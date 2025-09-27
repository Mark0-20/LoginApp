package com.example.loginapp.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.model.LoginScreen
import com.example.loginapp.model.RegisterScreen
import com.example.loginapp.Screens.LoginScreen
import com.example.loginapp.Screens.RegisterScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = LoginScreen) {
        composable<LoginScreen> {
            LoginScreen(
                onSignUpClick = { navController.navigate(RegisterScreen) }
            )
        }
        composable<RegisterScreen> {
            RegisterScreen(
                onSignInClick = { navController.navigate(LoginScreen) }
            )
        }
    }
}