package main.java.graphs;

import java.util.Objects;

public class Vertex {
    String data;
    public int weight ;

    public Vertex(String data) {

        this.data = data;
    }
    public Vertex(String data, int weight) {
        this.data = data;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex vertex)) return false;
        return data.equals(vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}
