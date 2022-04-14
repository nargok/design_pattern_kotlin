package singleton

object Singleton {
    init {
        println("インスタンスを生成しました")
    }

    fun getInstance(): Singleton {
        return this
    }
}