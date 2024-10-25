package com.example.navapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navapps.ui.theme.NavAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavAppsTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
                        // Navegar a AppDescuento
                        val intent = Intent(this@MainActivity, AppDescuentoActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Abrir AppDescuento")
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(onClick = {
                        // Navegar a Loto
                        val intent = Intent(this@MainActivity, LotoActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Abrir Loto")
                    }
                }
            }
        }
    }
}


