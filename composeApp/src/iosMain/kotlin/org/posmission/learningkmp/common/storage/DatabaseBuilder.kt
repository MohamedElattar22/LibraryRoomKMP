package org.posmission.learningkmp.common.storage

import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.cinterop.ExperimentalForeignApi
import org.posmission.learningkmp.libraryapp.common.storage.BookDatabase
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask

fun getDataBase(): RoomDatabase.Builder<BookDatabase> {
    val dpFile = documentDirectory() + "/book.dp"
    return Room.databaseBuilder(
        name = dpFile
    )

}

@OptIn(ExperimentalForeignApi::class)
private fun documentDirectory(): String {
    val documentDirectory = NSFileManager.defaultManager.URLForDirectory(
        directory = NSDocumentDirectory,
        inDomain = NSUserDomainMask,
        appropriateForURL = null,
        error = null,
        create = false,
    )
    return requireNotNull(documentDirectory?.path)


}