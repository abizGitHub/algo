import java.util.*

data class GraphNode<T>(val v: T) {
    val adjacent = mutableSetOf<GraphNode<T>>()
    fun edgeTo(n: GraphNode<T>): GraphNode<T> {
        adjacent.add(n)
        n.adjacent.add(this)
        return this
    }

    fun removeEdge(n: GraphNode<T>) {
        adjacent.remove(n)
        n.adjacent.remove(this)
    }

    override fun toString() = "n($v)"
}

fun <T> levelsOfBFS(
    root: GraphNode<T>,
    continueOnVisit: ((GraphNode<T>) -> Boolean) = { true }
): MutableMap<Int, MutableSet<GraphNode<T>>> {
    val queue = LinkedList<GraphNode<T>>()
    queue.add(root)
    val visited = mutableSetOf<GraphNode<T>>()
    val levels = mutableMapOf<Int, MutableSet<GraphNode<T>>>()
    levels[0] = mutableSetOf(root)
    do {

        val current = queue.poll()
        visited.add(current)
        val currentLevel = (levels.size - 1 downTo 0).first { levels[it]!!.contains(current) }
        if (!continueOnVisit(current))
            break

        val unvisitedAdjacent = current.adjacent.filterNot { visited.contains(it) }

        if (unvisitedAdjacent.isNotEmpty()) {
            val nextLevel = levels.getOrPut(currentLevel + 1) { mutableSetOf() }
            unvisitedAdjacent.forEach {
                queue.add(it)
                nextLevel.add(it)
            }
        }

    } while (queue.isNotEmpty())

    return levels
}