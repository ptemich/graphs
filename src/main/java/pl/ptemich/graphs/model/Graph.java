package pl.ptemich.graphs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

}
