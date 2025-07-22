package ar.mad.sumeriosmobile.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.mad.sumeriosmobile.R

@Composable
fun SumeriosBottomBar() {
    Surface(
        tonalElevation = 3.dp,
        color = colorResource(R.color.sumerio_rojo_oscuro),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp) // acá sí funciona directamente
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio",
                fontSize = 20.sp)
            Text("Consorcios",
                fontSize = 20.sp)
            Text("Perfil",
                fontSize = 20.sp)
        }
    }
}
