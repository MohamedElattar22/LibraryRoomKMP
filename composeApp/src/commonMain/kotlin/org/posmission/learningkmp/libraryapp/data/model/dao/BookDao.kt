package org.posmission.learningkmp.libraryapp.data.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import org.posmission.learningkmp.libraryapp.data.model.entities.BookEntity

@Dao
interface BookDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: BookEntity)

    @Transaction
    @Query("SELECT * FROM books")
    suspend fun getAllBooks(): List<BookEntity>

    @Transaction
    @Query("SELECT * FROM books WHERE id = :id")
    suspend fun getBookById(id: Long): BookEntity?

    @Update
    suspend fun updateBook(book: BookEntity)

    @Query("UPDATE books SET isFavorite = :isFavorite WHERE id = :bookId")
    suspend fun setFavouriteBook(bookId: Int, isFavorite: Boolean)

    @Transaction
    @Query("SELECT * FROM books WHERE id = :id")
    suspend fun getBookByIdFlow(id: Long): BookEntity?

    @Transaction
    @Query("SELECT * FROM books ORDER BY isFavorite DESC")
    suspend fun readAllBooksSortedByFavorite(): List<BookEntity>

    @Transaction
    @Query("Delete from books Where id = :bookId")
    suspend fun deleteBook(bookId: Int)

}