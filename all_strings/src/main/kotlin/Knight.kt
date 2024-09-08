fun main() {
    val result = mutableListOf<List<Pair<Int, Int>>>()
    knight(5, listOf(Pair(4, 4)), result)
    result.forEach {
        println(it)
    }
    println(result.size)
}

fun knight(boardSize: Int, pre: List<Pair<Int, Int>>, result: MutableList<List<Pair<Int, Int>>>) {
    val choices = nextPossibleChoices(boardSize, pre.last())
        .filterNot { pre.contains(it) }

    if (choices.isEmpty()) {
        result.add(pre)
        return
    }

    for (ch in choices) {
        knight(boardSize, pre.plus(ch), result)
    }
}

fun nextPossibleChoices(boardSize: Int, currentPosition: Pair<Int, Int>): List<Pair<Int, Int>> {
    return listOf(
        Pair(currentPosition.first + 1, currentPosition.second + 2),
        Pair(currentPosition.first + 1, currentPosition.second - 2),
        Pair(currentPosition.first - 1, currentPosition.second + 2),
        Pair(currentPosition.first - 1, currentPosition.second - 2),
        Pair(currentPosition.first + 2, currentPosition.second + 1),
        Pair(currentPosition.first + 2, currentPosition.second - 1),
        Pair(currentPosition.first - 2, currentPosition.second + 1),
        Pair(currentPosition.first - 2, currentPosition.second - 1),
    ).asSequence()
        .filterNot { it.first < 0 }
        .filterNot { it.first > boardSize - 1 }
        .filterNot { it.second < 0 }
        .filterNot { it.second > boardSize - 1 }
        .toList()
}
