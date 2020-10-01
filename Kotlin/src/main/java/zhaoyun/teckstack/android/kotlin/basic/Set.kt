package zhaoyun.teckstack.android.kotlin.basic

fun main() {
    SetPlayground.play()
}

private object SetPlayground {

    fun play() {
        playWithSet()
    }

    private fun playWithSet() {
        println("SetPlayground.playWithSet()")

        // 使用的是LinkedHashSet
        val set = setOf(1, 2, 3)
        println(set)
        println(set.javaClass)
    }
}
