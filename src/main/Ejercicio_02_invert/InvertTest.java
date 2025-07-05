package main.Ejercicio_02_invert;

import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;

public class InvertTest {
    public static void run() {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int val : valores) {
            arbol.insert(val);
        }

        System.out.println("Árbol original:");
        arbol.printPorNiveles();

        Node nuevaRaiz = invertBinaryTree.invertir(arbol.getRoot());

        System.out.println("\nÁrbol invertido:");
        arbol.printPorNiveles(); // usando la misma instancia pero con raíz invertida
    }
}