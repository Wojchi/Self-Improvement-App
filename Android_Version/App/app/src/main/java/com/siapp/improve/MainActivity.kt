package com.siapp.improve

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.siapp.improve.ui.theme.SelfImrovemenAppAndroidTheme
import android.graphics.pdf.content.PdfPageGotoLinkContent.Destination
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.saveable.rememberSaveable
import android.R.attr.onClick
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.material3.Icon
import android.R.attr.icon
import android.R.attr.label
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF003002))
    )
    Scaffold(
        bottomBar = {
            NavigationBar() {
                NavigationBarItem(
                    selected = true,
                    onClick = {
                        println("Dashboard geklickt")
                    },
                    icon = {
                        Icon(
                            Icons.Default.Home
                        )
                    },
                    label = {
                        Text("Dashboard")
                    }
                )

            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        )
    }
}



