package com.digitalruiz.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.digitalruiz.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                MessageCard("Android")
            }
        }
    }
}

@Composable
fun MessageCard(name: String){
    Text(text ="Hello $name!" )
}


@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    TestComposeTheme {
        MessageCard("Android")
    }
}