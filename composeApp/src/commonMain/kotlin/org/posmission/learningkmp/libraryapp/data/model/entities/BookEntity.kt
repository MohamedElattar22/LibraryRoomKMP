package org.posmission.learningkmp.libraryapp.data.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class BookEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val image: String,
    val title: String,
    val summary: String,
    val author: String,
    val isFavorite: Boolean,
    val publicationYear: Int,
    val category: String,
    val tags: List<String>,

    )
