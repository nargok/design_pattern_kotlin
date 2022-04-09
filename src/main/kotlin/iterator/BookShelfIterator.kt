package iterator

class BookShelfIterator(
    private val bookShelf: BookShelf,
    private var index: Int = 0
): Iterator<Book> {
    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}