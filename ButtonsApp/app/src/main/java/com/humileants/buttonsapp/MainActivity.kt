package com.humileants.buttonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.humileants.buttonsapp.ui.theme.ButtonsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}


@Preview
@Composable
fun Content() {
    /*Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally) {
        CommonButton()
        Space()
        CommonButton2()
        Space()
        MyTextButton()
    }*/
}

@Composable
fun CommonButton() {
    Button(onClick = {}, enabled = false) {
        //Text(text = "My Button", fontSize = 30.sp)
    }
}

@Composable
fun CommonButton2() {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
        containerColor = Color.Red
    )) {
        //Text(text = "My Button", fontSize = 30.sp)
    }
}

@Composable
fun MyTextButton() {
    TextButton(onClick = {}) {
        //Text(text = "My Button", fontSize = 30.sp)
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}