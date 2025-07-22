package ar.mad.sumeriosmobile.navigation

import androidx.compose.runtime.Composable

@Composable
fun RootNavHost(isLoggedIn: Boolean) {
    if (!isLoggedIn) {
        Navegador()
    } else {
        MainNavHost()
    }
}