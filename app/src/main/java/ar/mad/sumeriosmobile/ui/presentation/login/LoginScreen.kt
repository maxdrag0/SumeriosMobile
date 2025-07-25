package ar.mad.sumeriosmobile.ui.presentation.login

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.mad.sumeriosmobile.R


@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onBackToWelcome: () -> Unit,
    onRegisterRoad: () -> Unit
) {
    CuerpoLogin(onLoginSuccess, onBackToWelcome, onRegisterRoad)
}

@Composable
fun CuerpoLogin(
    onLoginSuccess: () -> Unit,
    onBackToWelcome: () -> Unit,
    onRegisterRoad: () -> Unit
) {
    var usuario by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.outline_account_circle_24),
            contentDescription = "",
            modifier = Modifier
                .height(100.dp)
                .width(100.dp),
            tint = Color.Gray
        )

        Text(
            text = "ACCESO | LOGIN",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(20.dp))

        TextField(
            value = usuario,
            onValueChange = { usuario = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Usuario"
                )
            },
            shape = RoundedCornerShape(25.dp),
            placeholder = { Text(text = "Usuario") },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, shape = RoundedCornerShape(25.dp), color = Color.Gray),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            maxLines = 1,
        )

        Spacer(Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            shape = RoundedCornerShape(25.dp),
            placeholder = { Text(text = "Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, shape = RoundedCornerShape(25.dp), color = Color.Gray),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            maxLines = 1,
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {
                onBackToWelcome()
            },
            modifier = Modifier.width(400.dp)
        ) {
            Text(
                text = "Welcome",
                fontSize = 20.sp
            )
        }

        Button(
            onClick = {
                onRegisterRoad()
            },
            modifier = Modifier.width(400.dp)
        ) {
            Text(
                text = "Registrarse",
                fontSize = 20.sp
            )
        }

        Button(
            onClick = {
                onLoginSuccess()
            },
            modifier = Modifier.width(400.dp)
        ) {
            Text(
                text = "Entrar",
                fontSize = 20.sp
            )
        }


    }
}