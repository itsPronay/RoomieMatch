package com.pronaycoding.roomiematch.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pronaycoding.roomiematch.ui.login.LoginScreen
import com.pronaycoding.roomiematch.ui.signup.SignupScreen

@Composable
fun Navigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoutes.Login.name) {
        composable(NavRoutes.Login.name) {
            LoginScreen(
                gotoSignUpScreen = {
                    navController.navigate(NavRoutes.SignUp.name)
                }
            )
        }
        composable(NavRoutes.SignUp.name) {
            SignupScreen(
                gotoLoginScreen = {
                    navController.navigateUp()
                }
            )
        }
    }
}