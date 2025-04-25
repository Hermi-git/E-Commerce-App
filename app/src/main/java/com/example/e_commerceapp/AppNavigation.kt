package com.example.e_commerceapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerceapp.screen.AuthScreen
import com.example.e_commerceapp.screen.LoginScreen
import com.example.e_commerceapp.screen.SignupScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController , startDestination= "auth")  {
        composable("auth"){
            AuthScreen(Modifier, navController)
        }
        composable("login"){
            LoginScreen(Modifier)
        }
        composable("signup"){
            SignupScreen(Modifier)
        }
    }
}