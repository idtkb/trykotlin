package com.idtkb.trykotlin

import com.idtkb.trykotlin.model.Book

class BookShelf(private val books: List<Book>) {
    val count: Int = books.count()

    fun bookAt(index: Int): Book {
        return books[index]
    }
}