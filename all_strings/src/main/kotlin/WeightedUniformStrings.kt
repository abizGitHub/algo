fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
    val set = mutableSetOf<Int>()
    var lastCh = '-'
    var lastInt = 0
    val out = Array(queries.size) { "" }
    for (c in s) {
        val value = c.code - 96
        if (lastCh == c) {
            set.add(lastInt + value)
            lastInt += value
        } else {
            set.add(value)
            lastInt = value
            lastCh = c
        }
    }
    queries.forEachIndexed { ix, it ->
        out[ix] = if (set.contains(it)) "Yes" else "No"
    }
    return out
}


fun main() {
    weightedUniformStrings(
        "abccddde", arrayOf(
            1,
            3,
            12,
            5,
            9,
            10
        )
    ).forEach {
        println(it)
    }
}