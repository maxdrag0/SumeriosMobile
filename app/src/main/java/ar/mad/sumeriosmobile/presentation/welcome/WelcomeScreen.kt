package ar.mad.sumeriosmobile.presentation.welcome

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WelcomeScreen(onLoginSelect: () -> Unit,
                  onRegisterSelect: () -> Unit){
    Scaffold {
        Column(modifier = Modifier.fillMaxSize()
            .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {

            Text("Welcome")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp), // separa botones
                verticalAlignment = Alignment.CenterVertically
            ){
                Button (
                    onClick = {
                        onLoginSelect()
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text (
                        text = "LOG IN",
                        fontSize = 20.sp
                    )
                }

                Button (
                    onClick = {
                        onRegisterSelect()
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Text (
                        text = "REGISTRO",
                        fontSize = 20.sp
                    )
                }
            }

        }

    }
}