package org.posmission.learningkmp.speachtotext

import org.koin.mp.KoinPlatform.getKoin

actual fun createSpeechToTextManager(): SpeechToText {
    return getKoin().get()
}