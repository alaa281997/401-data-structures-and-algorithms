package main.java.graphs;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    public void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    public void removeVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(vertex);
    }

    public void removeEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeVertex1 = adjVertices.get(vertex1);
        List<Vertex> edgeVertex2 = adjVertices.get(vertex2);

        if (edgeVertex1 != null) {
            edgeVertex1.remove(vertex2);
        }

        if (edgeVertex2 != null) {
            edgeVertex2.remove(vertex1);
        }
    }

    public String printGraph() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            stringBuilder.append(vertex);
            stringBuilder.append(adjVertices.get(vertex));
        }

        return stringBuilder.toString();
    }

    public int size() {
        return adjVertices.size();
    }

    Set<String> dft(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);

                for (Vertex v : graph.getNeighbors(vertex)) {
                    stack.push(v.data);
                }
            }
        }

        return visited;
    }
    // 36
    public Set<String> breadthTraverse(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : getNeighbors(vertex)) {
                if (!visited.contains(v.data)) {
                    visited.add(v.data);
                    queue.add(v.data);
                }
            }
        }
        return visited;
    }


    // c37
    public void addEdgeWithWeight(String data1, String data2, int weight) {
        Vertex ver1 = new Vertex(data1, weight);
        Vertex ver2 = new Vertex(data2, weight);
        adjVertices.get(ver1).add(ver2);
        adjVertices.get(ver2).add(ver1);
    }

    int cost;
    public Integer businessTrip(Graph graph, List<String> cities){
        cost = 0;
        int citiesSize = cities.size();

        for (int i = 0; i < citiesSize - 1; i ++){

            path(cities.get(i), cities.get(i + 1), graph);
        }

        return cost;
    }

    private void path(String city1, String city2, Graph graph){

        if (graph.getNeighbors(city1) == null){
            return;
        }
        for (Vertex vertex: graph.getNeighbors(city1)) {
            if (Objects.equals(city2, vertex.data)){
                cost += vertex.weight;
            }
        }
    }

    public List<Vertex> getNeighbors(String data) {
        return adjVertices.get(new Vertex(data));
    }

    public Set<Vertex> getVertices(){
        return adjVertices.keySet();
    }

}
