package org.posmission.learningkmp.libraryapp

import androidx.compose.ui.window.ComposeUIViewController
import org.posmission.learningkmp.libraryapp.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initializeKoin()
    }
) {
    App()
}