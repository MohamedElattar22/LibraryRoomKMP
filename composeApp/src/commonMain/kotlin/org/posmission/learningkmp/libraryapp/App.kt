package org.posmission.learningkmp.libraryapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.mp.KoinPlatform.getKoin
import org.posmission.learningkmp.speachtotext.VoiceToTextScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        VoiceToTextScreen(
            getKoin().get()
        )
//        SetupNavGraph(navController)

    }
}