package org.posmission.learningkmp.libraryapp.domain.model

data class Book(
    val id: Int,
    val image: String,
    val title: String,
    val summary: String,
    val author: String,
    val isFavorite: Boolean,
    val publicationYear: Int,
    val category: String,
    val tags: List<String>,

    )
