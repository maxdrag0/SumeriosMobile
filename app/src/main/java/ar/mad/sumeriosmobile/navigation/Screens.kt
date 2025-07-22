package ar.mad.sumeriosmobile.navigation

sealed class Screens(val route: String) {
    // NAV BASE
    object Welcome : Screens("welcome")
    object Login : Screens("login")
    object Register : Screens("register")
    object Home : Screens("home")

    // NAV AUTHENTICATED
    object Profile : Screens("profile/{userId}") {
        fun createRoute(userId: String) = "profile/$userId"
    }
}