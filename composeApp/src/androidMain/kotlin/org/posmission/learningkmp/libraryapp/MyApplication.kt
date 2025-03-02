package org.posmission.learningkmp.libraryapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.posmission.learningkmp.libraryapp.di.initializeKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidLogger()
            androidContext(this@MyApplication)
        }
    }
}