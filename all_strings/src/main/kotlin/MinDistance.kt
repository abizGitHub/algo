fun <T> shortestDistance(from: GraphNode<T>): List<Pair<GraphNode<T>, Int>> {
    return levelsOfBFS(from).flatMap { level ->
        level.value.map {
            Pair(it, level.key)
        }
    }
}

fun main() {
    val node15 = GraphNode(15)
    val node16 = GraphNode(16)
    val node17 = GraphNode(17)
    val root =
        GraphNode(1)
            .edgeTo(
                GraphNode(2)
                    .edgeTo(GraphNode(5))
                    .edgeTo(GraphNode(6))
                    .edgeTo(GraphNode(7).edgeTo(node16))
            )
            .edgeTo(
                GraphNode(3)
                    .edgeTo(
                        GraphNode(8)
                            .edgeTo(
                                GraphNode(12)
                                    .edgeTo(GraphNode(13))
                                    .edgeTo(GraphNode(14).edgeTo(node15))
                            )
                    )
                    .edgeTo(GraphNode(9))
            )
            .edgeTo(
                GraphNode(4)
                    .edgeTo(GraphNode(10))
                    .edgeTo(GraphNode(11).edgeTo(node17.edgeTo(node16)))
            )

    shortestDistance(root).also { println(it) }

    node15.edgeTo(root)

    shortestDistance(root).also { println(it) }

    shortestDistance(node16).also { println(it) }

    node16.removeEdge(node17)

    shortestDistance(node16).also { println(it) }
}




