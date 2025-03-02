package org.posmission.learningkmp.libraryapp.di

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import org.posmission.learningkmp.libraryapp.common.storage.getDataBaseBuilder
import org.posmission.learningkmp.speachtotext.SpeechToText
import org.posmission.learningkmp.speachtotext.SpeechToTextManagerAndroid

actual val targetModule = module {
    single { getDataBaseBuilder(context = get()) }
    single<SpeechToText> { SpeechToTextManagerAndroid(androidContext()) }
}