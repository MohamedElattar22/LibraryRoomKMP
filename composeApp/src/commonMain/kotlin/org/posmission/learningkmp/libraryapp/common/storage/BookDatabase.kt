package org.posmission.learningkmp.libraryapp.common.storage

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.posmission.learningkmp.libraryapp.data.model.dao.BookDao
import org.posmission.learningkmp.libraryapp.data.model.entities.BookEntity

@Database(
    entities = [BookEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(BookTypeConverter::class)
@ConstructedBy(BookDatabaseConstructor::class)
abstract class BookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}
