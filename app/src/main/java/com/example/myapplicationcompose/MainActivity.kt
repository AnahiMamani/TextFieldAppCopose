package com.example.myapplicationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import com.example.myapplicationcompose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationComposeTheme ()
        }
    }
}

@Composable
fun MyApplicationComposeTheme() {
    var txtFildValue by remember {
        mutableStateOf("Senha")
    }

    var txtFildLogin by remember {
        mutableStateOf("Login")
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column( modifier = Modifier.background( Brush.verticalGradient(
            colors = listOf(
                Purple200,
                Purple500,
                Purple700,
                Teal200
            )
        )),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            )
        {
            Text(color = Color.White,
                fontSize = 80.sp,
                fontStyle = FontStyle(value = Int.MAX_VALUE),
                text = "Login"
            )
            TextField(
                    modifier = Modifier.background(Color.White),
            value = txtFildLogin, onValueChange = {txtFildLogin = it}
            )
            TextField(
                modifier = Modifier.background(Color.White),
                value = txtFildValue, onValueChange = {txtFildValue = it}
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationComposeTheme {}
}