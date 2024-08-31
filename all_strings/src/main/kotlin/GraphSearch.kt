import java.util.LinkedList
import java.util.Stack

data class TreeNode(val v: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
    override fun toString() = "-$v-"
}

fun traverseBFS(root: TreeNode, onVisit: (TreeNode) -> Unit) {
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    do {
        val current = queue.poll()
        onVisit(current)
        current.left?.let {
            queue.add(it)
        }
        current.right?.let {
            queue.add(it)
        }

    } while (queue.isNotEmpty())
}

fun traverseDFS(root: TreeNode, onVisit: (TreeNode) -> Unit) {
    val stack = Stack<TreeNode>()
    stack.add(root)
    do {
        val current = stack.pop()
        onVisit(current)
        current.left?.let {
            stack.add(it)
        }
        current.right?.let {
            stack.add(it)
        }

    } while (stack.isNotEmpty())
}

fun minLeaf(root: TreeNode, onVisit: (TreeNode) -> Boolean) {
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    val levels = mutableMapOf<Int, MutableSet<TreeNode>>()
    levels[0] = mutableSetOf(root)
    do {
        val current = queue.poll()
        var currentLevel = levels.size - 1
        if (!levels[currentLevel]!!.contains(current))
            currentLevel--
        if (!onVisit(current))
            break
        current.left?.let {
            queue.add(it)
            levels.getOrPut(currentLevel + 1) { mutableSetOf() }.add(it)
        }
        current.right?.let {
            queue.add(it)
            levels.getOrPut(currentLevel + 1) { mutableSetOf() }.add(it)
        }

    } while (queue.isNotEmpty())
    println(levels)
}

fun main() {
    val root = TreeNode(1)
            .apply {
                left = TreeNode(2)
                        .apply {
                            right = TreeNode(21)
                        }
                right = TreeNode(3)
                        .apply {
                            left = TreeNode(4)
                                    .apply {
                                        left = TreeNode(6)
                                        right = TreeNode(7)
                                                .apply {
                                                    left = TreeNode(71)
                                                    right = TreeNode(72)
                                                }
                                    }
                            right = TreeNode(5)
                                    .apply {
                                        right = TreeNode(51)
                                    }
                        }
            }


    println("----------BFS--------")
    traverseBFS(root) {
        print(it)
    }
    println()
    println("----------DFS--------")
    traverseDFS(root) {
        print(it)
    }
    println()
    minLeaf(root){
        println(it)
        true
    }
}

