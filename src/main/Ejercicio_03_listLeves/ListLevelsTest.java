package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;

public class ListLevelsTest {

    public static void run() {
        // Crear un árbol binario de ejemplo
        Node root = new Node(10);
        root.setLeft(new Node(5));
        root.setRight(new Node(15));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(7));
        root.getRight().setRight(new Node(20));

        // Llamar al método que imprime los niveles como listas enlazadas
        ListLevels.listarNiveles(root);
    }
}