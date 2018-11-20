package com.code;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	int noOfVertex;
	LinkedList<Integer> adjacencyList[];

	public Graph(int v) {
		this.noOfVertex = v;
		adjacencyList = new LinkedList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adjacencyList[i] = new LinkedList<>();
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);

		addEdge(graph, 2, 0);
		addEdge(graph, 2, 3);
		addEdge(graph, 0, 2);
		addEdge(graph, 0, 1);
		addEdge(graph, 1, 2);
		addEdge(graph, 3, 3);
		addEdge(graph, 3, 4);
		addEdge(graph, 1, 4);

		graph.printEdge(graph);
		System.out.println("BFS travel will be :");
		graph.bfs(2);
		graph.dfs(2);
		
	}

	private void dfs(int startIndex) {
				
	}

	private void bfs(int startIndex) {
		int length = adjacencyList.length;
		boolean visited[] = new boolean[length];

		visited[startIndex] = true;
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(startIndex);

		while (!queue.isEmpty()) {
			Integer i = queue.poll();
			System.out.print(i + " > ");
			Iterator<Integer> itr = adjacencyList[i].listIterator();
			while (itr.hasNext()) {
				int value = itr.next();
				if (!visited[value]) {
					visited[value] = true;
					queue.add(value);
				}
			}

		}

	}

	private static void addEdge(Graph graph, int src, int desc) {
		graph.adjacencyList[src].addFirst(desc);
	}

	public void printEdge(Graph graph) {
		LinkedList<Integer>[] list = graph.adjacencyList;
		for (int i = 0; i < list.length; i++) {
			System.out.println("Printing the edge linked  of vertex " + i);
			System.out.print("head >> ");
			for (Integer e : list[i]) {
				System.out.print(e + " > ");

			}
			System.out.println();
		}
	}
}
