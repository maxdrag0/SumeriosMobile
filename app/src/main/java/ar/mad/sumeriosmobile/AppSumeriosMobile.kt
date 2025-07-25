package ar.mad.sumeriosmobile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ar.mad.sumeriosmobile.navigation.Navegador

@Preview(showBackground = true)
@Composable
fun AppSumeriosMobilePreview() {
    AppSumeriosMobile()
}

@Composable
fun AppSumeriosMobile() {
    Navegador()
}
