package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int izquierda = maxDepth(root.getLeft());
        int derecha = maxDepth(root.getRight());

        return 1 + Math.max(izquierda, derecha);
    }
}