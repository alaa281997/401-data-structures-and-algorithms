package main.java.trees.kAryTree;

import java.util.ArrayList;
import java.util.List;

public class KAryNode<T> {

    T value;
    public List<KAryNode> children = new ArrayList<>();

    public KAryNode(T value) {
        this.value = value;
    }


    public List<KAryNode> getChildren() {
        return children;
    }

    public void addChild(KAryNode child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        result.append(value);
        result.append(" ");
        for (KAryNode Children : children) {
            result.append(" ");
            result.append(Children);
        }
        result.append(" ");

        return result.toString();
    }
}
