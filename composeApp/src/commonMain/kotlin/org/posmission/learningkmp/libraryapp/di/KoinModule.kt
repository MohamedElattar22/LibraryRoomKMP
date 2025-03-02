package org.posmission.learningkmp.libraryapp.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module
import org.posmission.learningkmp.libraryapp.common.storage.getRoomDatabase

expect val targetModule: Module

val sharedModule = module {
    single {
        getRoomDatabase(get())
    }

}

fun initializeKoin(
    config: (KoinApplication.() -> Unit)? = null,
) {
    startKoin {
        config?.invoke(this)
        modules(targetModule, sharedModule)
    }

}