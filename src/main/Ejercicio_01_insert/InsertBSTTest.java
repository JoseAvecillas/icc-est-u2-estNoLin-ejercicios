package main.Ejercicio_01_insert;

import main.Materia.Controllers.ArbolBinario;

public class InsertBSTTest {
    public static void run() {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int val : valores) {
            arbol.insert(val);
        }

        System.out.println("Árbol Binario de Búsqueda (BST):");
        arbol.printTree();
    }
}