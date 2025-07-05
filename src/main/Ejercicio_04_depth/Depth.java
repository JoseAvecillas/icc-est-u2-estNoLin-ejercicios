package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int izquierda = maxDepth(root.getLeft());
        int derecha = maxDepth(root.getRight());

        return 1 + Math.max(izquierda, derecha);
    }

    // Clase interna para pruebas
    public static class DepthTest {
        public static void run() {
            Node root = new Node(4);
            Node n2 = new Node(2);
            Node n7 = new Node(7);
            Node n1 = new Node(1);
            Node n3 = new Node(3);
            Node n8 = new Node(8);

            root.setLeft(n2);
            root.setRight(n7);
            n2.setLeft(n1);
            n2.setRight(n3);
            n1.setLeft(n8);

            int profundidad = maxDepth(root);
            System.out.println("Profundidad máxima del árbol: " + profundidad);
        }
    }
}