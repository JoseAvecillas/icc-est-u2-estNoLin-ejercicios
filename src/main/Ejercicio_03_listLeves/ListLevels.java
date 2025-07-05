package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import main.Materia.Models.LinkedListNode;
import java.util.*;

public class ListLevels {

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

            // Imprimir lista de este nivel
            System.out.print("Nivel " + nivel + ": ");
            imprimirLista(dummyHead.next);
            nivel++;
        }
    }

    private static void imprimirLista(LinkedListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
