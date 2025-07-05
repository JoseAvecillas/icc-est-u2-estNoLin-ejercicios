package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class invertBinaryTree {

    public static Node invertir(Node root) {
        if (root == null) return null;

        // Intercambia los hijos
        Node temp = root.getLeft();
        root.setLeft(invertir(root.getRight()));
        root.setRight(invertir(temp));

        return root;
    }
}