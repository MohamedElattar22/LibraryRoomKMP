package org.posmission.learningkmp.libraryapp.common.storage

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getDataBaseBuilder(context: Context): RoomDatabase.Builder<BookDatabase> {
    val dbFile = context.getDatabasePath("book_db")
    return Room.databaseBuilder(
        context,
        BookDatabase::class.java,
        dbFile.path
    )

}