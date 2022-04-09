package iterator

class BookShelf(
    private val books: MutableList<Book>,
    private val last: Int = 0
) : Iterable<Book> {

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        books.add(book)
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }
}