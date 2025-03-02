package org.posmission.learningkmp.speachtotext

import org.koin.java.KoinJavaComponent.getKoin

actual fun createSpeechToTextManager(): SpeechToText {
    return getKoin().get()
}