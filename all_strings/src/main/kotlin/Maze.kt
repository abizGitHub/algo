const val `#` = 1
const val ` ` = 0
val grid = arrayOf(
    //////// 0    1    2    3    4    5    6    7    8    9   10   11
    arrayOf(` `, `#`, `#`, `#`, `#`, ` `, ` `, ` `, `#`, ` `, ` `, ` `),// 0
    arrayOf(` `, `#`, ` `, ` `, `#`, ` `, ` `, ` `, ` `, ` `, `#`, ` `),// 1
    arrayOf(` `, `#`, ` `, ` `, `#`, ` `, `#`, `#`, `#`, `#`, `#`, ` `),// 2
    arrayOf(` `, `#`, `#`, ` `, ` `, ` `, ` `, ` `, ` `, ` `, `#`, ` `),// 3
    arrayOf(` `, ` `, `#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, ` `, ` `),// 4
    arrayOf(`#`, ` `, ` `, ` `, ` `, ` `, ` `, ` `, ` `, ` `, ` `, `#`),// 5
    arrayOf(`#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, ` `, `#`, ` `, ` `),// 6
    arrayOf(`#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`),// 7
    arrayOf(`#`, `#`, `#`, `#`, `#`, `#`, `#`, `#`, ` `, ` `, ` `, ` `),// 8
)

fun main() {
    val result = mutableListOf<List<Pair<Int, Int>>>()
    findAllPathBackTracking(listOf(Pair(0, 0)), Pair(10, 8), result)
    println("possible path count between (0,0) and (10,8): ${result.size}")
    findAllPathBackTracking(listOf(Pair(8, 1)), Pair(5, 3), result)
    println("possible path count between (0,0) and (2,1): ${result.size}")
    println("==================================")
    result.forEach {
        println(it)
    }

}

fun findAllPathBackTracking(
    pathTillNow: List<Pair<Int, Int>>,
    target: Pair<Int, Int>,
    result: MutableList<List<Pair<Int, Int>>>
) {
    if (pathTillNow.last() == target) {
        result.add(pathTillNow)
        return
    }

    val choices = nextPossiblePoints(pathTillNow.last())
        .filterNot { pathTillNow.contains(it) }

    for (ch in choices) {
        findAllPathBackTracking(pathTillNow.plus(ch), target, result)
    }
}

fun nextPossiblePoints(p: Pair<Int, Int>): List<Pair<Int, Int>> {
    return listOf(
        Pair(p.first + 1, p.second),
        Pair(p.first - 1, p.second),
        Pair(p.first, p.second + 1),
        Pair(p.first, p.second - 1),
    ).asSequence()
        .filterNot { it.first < 0 }
        .filterNot { it.second < 0 }
        .filterNot { it.first > grid.first().size - 1 }
        .filterNot { it.second > grid.size - 1 }
        .filterNot { grid[it.second][it.first] == `#` }
        .toList()
}

