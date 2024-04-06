package com.humileants.buttonsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.humileants.buttonsapp2.ui.theme.ButtonsApp2Theme
import com.humileants.buttonsapp2.components.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(true) }
            ButtonsApp2Theme(darkTheme = darkMode.value) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloWorldComposable(darkMode = darkMode)
                }
            }
        }
    }
}

@Composable
fun HelloWorldComposable(darkMode: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CommonButton()
        Space()
        CommonButton2()
        Space()
        MyTextButton()
        Space()
        MyOutlinedButton()
        Space()
        MyIconButton()
        Space()
        MySwitchButton()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}
