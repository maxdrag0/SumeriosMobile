package ar.mad.sumeriosmobile.presentation.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.mad.sumeriosmobile.R
import ar.mad.sumeriosmobile.data.dto.consorciosDePrueba
import ar.mad.sumeriosmobile.ui.components.SumeriosBottomBar
import ar.mad.sumeriosmobile.ui.components.SumeriosTopBarBase

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){

            Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            {
                SumeriosTopBarBase(
                    scrollBehavior = null,
                    onMenuClick = { /* Abrir drawer o menú */ },
                    onProfileClick = { /* Navegar a perfil */ }
                )
            },
            bottomBar = { SumeriosBottomBar() }
        ) { innerPadding ->
            HomeContent(modifier = Modifier.padding(innerPadding)
                .fillMaxSize())
        }
}

@Composable
fun HomeContent(modifier: Modifier) {
    var showMaxText by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sumerios),
                    contentDescription = "logo Sumerios",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .clickable {
                            showMaxText = !showMaxText
                        }
                )
            }
        }

        if (showMaxText) {
            item {
                Text(
                    text = "Maxi es lo mejor de Sumerios",
                    fontSize = 28.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }

            items(consorciosDePrueba) { consorcio ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text("Nombre: ${consorcio.nombre}")
                    Text("Dirección: ${consorcio.direccion}")
                    Text("Ciudad: ${consorcio.ciudad}")
                    Spacer(Modifier.height(10.dp))
                }
            }
        }
    }
}
