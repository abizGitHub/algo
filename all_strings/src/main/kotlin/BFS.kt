import java.util.*

open class GraphNode<T>(val v: T) {
    private val adjacent = mutableSetOf<GraphNode<T>>()
    open fun getAdjacent() = adjacent
    fun edgeTo(n: GraphNode<T>): GraphNode<T> {
        getAdjacent().add(n)
        n.getAdjacent().add(this)
        return this
    }

    fun removeEdge(n: GraphNode<T>) {
        getAdjacent().remove(n)
        n.getAdjacent().remove(this)
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

        val unvisitedAdjacent = current.getAdjacent().filterNot { visited.contains(it) }

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