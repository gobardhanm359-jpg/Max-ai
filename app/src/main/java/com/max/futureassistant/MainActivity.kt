package com.max.futureassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaxScreen() }
    }
}

@Composable
fun MaxScreen() {
    var status by remember { mutableStateOf("Hello! I am MAX ❤️") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color(0xFF080D24), Color(0xFF24145B), Color(0xFF080D24))
                )
            )
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("MAX AI", color = Color.Cyan, fontSize = 32.sp)

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .size(220.dp)
                    .background(
                        Brush.radialGradient(
                            listOf(Color.Cyan, Color(0xFF392A91), Color.Transparent)
                        ),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("MAX", color = Color.White, fontSize = 42.sp)
            }

            Spacer(Modifier.height(20.dp))
            Text("3D HOLOGRAM GIRL", color = Color.Cyan, fontSize = 19.sp)
            Spacer(Modifier.height(12.dp))
            Text(status, color = Color.White)
        }

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(
                onClick = { status = "MAX Voice Assistant is coming soon!" },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("🎙 TALK TO MAX")
            }

            OutlinedButton(
                onClick = { status = "Camera module coming soon!" },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("📷 LIVE CAMERA")
            }

            OutlinedButton(
                onClick = { status = "Phone Control module coming soon!" },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("📱 PHONE CONTROL")
            }
        }
    }
}
