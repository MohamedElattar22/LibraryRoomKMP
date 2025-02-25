package org.posmission.learningkmp.libraryapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform