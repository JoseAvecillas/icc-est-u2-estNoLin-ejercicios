package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {

    // Clase interna LinkedListNode que representa un nodo de una lista enlazada
    public static class LinkedListNode {
        public int val;
        public LinkedListNode next;

        public LinkedListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Método para listar los niveles como listas enlazadas
    public static void listarNiveles(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int nivel = 0;

        while (!queue.isEmpty()) {
            int nivelSize = queue.size();
            LinkedListNode dummyHead = new LinkedListNode(0);
            LinkedListNode current = dummyHead;

            for (int i = 0; i < nivelSize; i++) {
                Node actual = queue.poll();
                current.next = new LinkedListNode(actual.getValue());
                current = current.next;

                if (actual.getLeft() != null) queue.add(actual.getLeft());
                if (actual.getRight() != null) queue.add(actual.getRight());
            }

            // Imprimir la lista de este nivel
            System.out.print("Nivel " + nivel + ": ");
            imprimirLista(dummyHead.next);
            nivel++;
        }
    }

    // Método para imprimir la lista enlazada del nivel
    private static void imprimirLista(LinkedListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Clase interna para pruebas
    public static class ListLevelsTest {
        public static void run() {
            // Crear un árbol binario de ejemplo
            Node root = new Node(10);
            root.setLeft(new Node(5));
            root.setRight(new Node(15));
            root.getLeft().setLeft(new Node(3));
            root.getLeft().setRight(new Node(7));
            root.getRight().setRight(new Node(20));

            // Llamar al método que imprime los niveles como listas enlazadas
            listarNiveles(root);
        }
    }
}