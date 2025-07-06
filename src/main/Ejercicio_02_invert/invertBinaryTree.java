package main.Ejercicio_02_invert;

import main.Materia.Models.Node;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    // Clase que representa el árbol binario con la raíz incluida
    public static class ArbolBinario {
        private Node root;

        // Constructor vacío, que no inicializa nada
        public ArbolBinario() {
            this.root = null;
        }

        // Método para insertar un valor en el árbol binario
        public void insert(int value) {
            root = insertRec(root, value);
        }

        private Node insertRec(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }

            if (value < root.getValue()) {
                root.setLeft(insertRec(root.getLeft(), value));
            } else if (value > root.getValue()) {
                root.setRight(insertRec(root.getRight(), value));
            }

            return root;
        }

        // Método para obtener la raíz del árbol
        public Node getRoot() {
            return root;
        }
    }

    // Método para invertir el árbol binario
    public static Node invertir(Node root) {
        if (root == null) return null;

        // Intercambia los hijos
        Node temp = root.getLeft();
        root.setLeft(invertir(root.getRight()));
        root.setRight(invertir(temp));

        return root;
    }

    // Clase interna para realizar las pruebas de inversión
    public static class InvertTest {
        public static void run() {
            ArbolBinario arbol = new ArbolBinario();

            // Insertamos los valores en el árbol
            int[] valores = {4, 2, 7, 1, 3, 6, 9};
            for (int val : valores) {
                arbol.insert(val);
            }

            System.out.println("Árbol original:");
            printPorNiveles(arbol);  // Usamos el método de impresión por niveles

            // Invertir el árbol
            Node nuevaRaiz = invertir(arbol.getRoot());

            System.out.println("\nÁrbol invertido:");
            printPorNiveles(arbol);  // Imprimir árbol invertido
        }
    }

    // Método para imprimir el árbol por niveles
    public static void printPorNiveles(ArbolBinario arbol) {
        if (arbol.getRoot() == null) return;

        Queue<Node> cola = new LinkedList<>();
        cola.add(arbol.getRoot());

        while (!cola.isEmpty()) {
            int nivelSize = cola.size();  // Cuántos nodos hay en este nivel

            for (int i = 0; i < nivelSize; i++) {
                Node actual = cola.poll();
                System.out.print(actual.getValue() + " ");

                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }
            System.out.println();  // Salto de línea al finalizar el nivel
        }
    }
}