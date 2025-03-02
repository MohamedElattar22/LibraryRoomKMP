package org.posmission.learningkmp.libraryapp.di

import org.koin.dsl.module
import org.posmission.learningkmp.common.storage.getDataBase
import org.posmission.learningkmp.speachtotext.SpeechToText
import org.posmission.speachtotext.SpeechToTextManagerIos

actual val targetModule = module {
    single { getDataBase() }
    single<SpeechToText> { SpeechToTextManagerIos() }

}
