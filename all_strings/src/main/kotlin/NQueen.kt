import kotlin.math.abs

fun main() {
    val result = mutableListOf<List<Int>>()
    bkk(result, 10, listOf())
    result.forEach {
        println(it)
    }
}

fun bkk(result: MutableList<List<Int>>, boardLength: Int, pre: List<Int>) {
    if (pre.size == boardLength) {
        result.add(pre)
        return
    }
    val index = pre.size
    val choices = (0 until boardLength).filter { currentPos ->
        val compatibleNumber =
            pre.mapIndexed { preIndex, it -> isPossible(it, currentPos, preIndex, index) }.count { it }
        compatibleNumber == pre.size
    }
    for (c in choices) {
        bkk(result, boardLength, pre.plus(c))
    }
}

fun isPossible(point1: Int, point2: Int, ix1: Int, ix2: Int): Boolean {
    return point1 != point2 && abs(point1 - point2) != abs(ix1 - ix2)
}
