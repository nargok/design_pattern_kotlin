package iterator

fun main() {
    val books = mutableListOf<Book>()
    val bookShelf = BookShelf(books)
    bookShelf.appendBook(Book("kotlin 1"))
    bookShelf.appendBook(Book("kotlin 2"))
    bookShelf.appendBook(Book("kotlin 3"))

    val it = bookShelf.iterator()
    while (it.hasNext()) {
        val book = it.next()
        println(book)
    }
}