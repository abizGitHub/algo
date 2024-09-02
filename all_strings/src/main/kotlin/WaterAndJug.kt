import java.util.Stack
/**
 *  x , y are capacities of jugs and z is desired volume
 *
 */
fun isPossibleDFS(x: Int, y: Int, z: Int): Boolean {

    val stack = Stack<Pair<Int, Int>>()
    stack.add(Pair(0, 0))
    val visited = mutableSetOf<Pair<Int, Int>>()
    var reached: Boolean
    do {
        val current = stack.pop()
        visited.add(current)
        println(current)
        reached = (current.first + current.second == z)
        if (reached)
            break
        neighbors(x, y, current).forEach {
            if (!visited.contains(it))
                stack.add(it)
        }
    } while (stack.isNotEmpty())

    return reached
}

/*
* point is current volumes of jugs
* neighbors give another possibilities of volumes of jugs
* */
fun neighbors(x: Int, y: Int, point: Pair<Int, Int>): Set<Pair<Int, Int>> {
    return listOf(
        Pair(point.first + x, point.second),
        Pair(point.first + y, point.second),
        Pair(point.first - x, point.second),
        Pair(point.first - y, point.second),
        Pair(point.first, point.second + x),
        Pair(point.first, point.second + y),
        Pair(point.first, point.second - x),
        Pair(point.first, point.second - y),
    ).asSequence()
        .filterNot { it.first < 0 }
        .filterNot { it.first > x }
        .filterNot { it.second < 0 }
        .filterNot { it.second > y }
        .toSet()
}


fun isPossibleBFS(x: Int, y: Int, z: Int): Boolean {

    class JugsVolume(a: Int, b: Int) : GraphNode<Pair<Int, Int>>(Pair(a, b)) {
        override fun getAdjacent(): MutableSet<GraphNode<Pair<Int, Int>>> {
            return neighbors(x, y, v).map {
                JugsVolume(it.first, it.second)
            }.toMutableSet()
        }


        override fun equals(other: Any?): Boolean {
            if (other == null)
                return false
            return if (other is JugsVolume) {
                other.v.first == this.v.first &&
                other.v.second == this.v.second
            } else false
        }

        override fun hashCode(): Int {
            return javaClass.hashCode()
        }

    }

    var reached = false

    levelsOfBFS(JugsVolume(0, 0)) {
        println(it)
        reached = (it.v.first + it.v.second == z)
        !reached
    }

    return reached
}

fun main() {
    println("-------------DFS-----------")
    isPossibleDFS(50, 3, 12).also { println(it) }
    println("-------------BFS-----------")
    isPossibleBFS(50, 3, 12).also { println(it) }
    println("===================================================")
    println("-------------DFS-----------")
    isPossibleDFS(3, 50, 12).also { println(it) }
    println("-------------BFS-----------")
    isPossibleBFS(3, 50, 12).also { println(it) }
}