fun <T> minLeaf(root: GraphNode<T>): Int {
    return levelsOfBFS(root) {
        println(it)
        it.adjacent.size > 1
    }.size
}

fun main() {

    val root =
        GraphNode(1)
            .edgeTo(
                GraphNode(2)
                    .edgeTo(GraphNode(5))
                    .edgeTo(GraphNode(6))
                    .edgeTo(GraphNode(7))
            )
            .edgeTo(
                GraphNode(3)
                    .edgeTo(
                        GraphNode(8)
                            .edgeTo(
                                GraphNode(12)
                                    .edgeTo(GraphNode(13))
                                    .edgeTo(GraphNode(14))
                            )
                    )
                    .edgeTo(GraphNode(9))
            )
            .edgeTo(
                GraphNode(4)
                    .edgeTo(GraphNode(10))
                    .edgeTo(GraphNode(11))
            )


    minLeaf(root).also {
        println("min depth of leaf:$it")
    }
    println("-------------------levels---------------")
    levelsOfBFS(root).also {
        println(it)
    }

}
