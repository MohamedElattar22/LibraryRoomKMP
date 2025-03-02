package org.posmission.learningkmp.speachtotext

// commonMain/src/commonMain/kotlin/com/example/ui/VoiceToTextScreen.kt

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VoiceToTextScreen(speechToText: SpeechToText) {
    var recognizedText by remember { mutableStateOf("Your speech will appear here") }
    var isListening by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = recognizedText)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            if (!isListening) {
                speechToText.startListening(
                    onResult = { result ->
                        recognizedText = result
                    },
                    onError = { error ->
                        recognizedText = "Error: ${error.message}"
                    }
                )
            } else {
                speechToText.stopListening()
            }
            isListening = !isListening
        }) {
            Text(if (isListening) "Stop Listening" else "Start Listening")
        }
    }
}
