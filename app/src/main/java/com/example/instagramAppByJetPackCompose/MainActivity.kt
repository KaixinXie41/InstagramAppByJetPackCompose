package com.example.instagramAppByJetPackCompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.instagramAppByJetPackCompose.ui.MainScreen
import com.example.instagramAppByJetPackCompose.ui.theme.InstagramAppByJePackComposeTheme

class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            InstagramAppByJePackComposeTheme{
                Surface(
                    color = MaterialTheme.colors.background){
                    MainScreen()
                }
            }
        }
    }
}
