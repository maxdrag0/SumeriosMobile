package ar.mad.sumeriosmobile.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ar.mad.sumeriosmobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SumeriosTopBarBase(
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onMenuClick: () -> Unit,
    onProfileClick: () -> Unit
) {
    CenterAlignedTopAppBar(
        title = { Text(stringResource(R.string.top_bar_base)) },
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(Icons.Filled.Menu, contentDescription = "Menú")
            }
        },
        actions = {
            IconButton(onClick = onProfileClick) {
                Image(
                    painter = painterResource(id = R.drawable.sumerios),
                    contentDescription = "Perfil",
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                )
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = colorResource(R.color.sumerio_rojo_oscuro),
            titleContentColor = colorResource(R.color.sumerio_crema)
        ),
        scrollBehavior = scrollBehavior
    )
}