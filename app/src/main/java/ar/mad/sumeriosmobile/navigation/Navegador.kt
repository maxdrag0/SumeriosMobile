package ar.mad.sumeriosmobile.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ar.mad.sumeriosmobile.ui.presentation.home.HomeScreen
import ar.mad.sumeriosmobile.ui.presentation.login.LoginScreen
import ar.mad.sumeriosmobile.ui.presentation.register.RegisterScreen
import ar.mad.sumeriosmobile.ui.presentation.welcome.WelcomeScreen

@Composable
fun Navegador() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.Welcome.route) {
        composable(Screens.Welcome.route) {
            WelcomeScreen(
                onLoginSelect = {
                    navController.navigate(Screens.Login.route)
                },
                onRegisterSelect = {
                    navController.navigate(Screens.Register.route)
                }
            )
        }
        composable(Screens.Login.route) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Screens.Home.route)
                },
                onBackToWelcome = {
                    navController.navigate(Screens.Welcome.route) {
                        popUpTo(Screens.Login.route) { inclusive = true }
                    }
                },
                onRegisterRoad = {
                    navController.navigate(Screens.Register.route)
                }
            )
        }
        composable(Screens.Register.route) {
            RegisterScreen(
                onLoginSelect = {
                    navController.navigate(Screens.Login.route)
                },
                onWelcomeSelect = {
                    navController.navigate(Screens.Welcome.route)
                }
            )
        }
        composable(Screens.Home.route) {
            HomeScreen()
        }
    }
}