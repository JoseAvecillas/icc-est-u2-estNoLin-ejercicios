package main;

import utils.StudentValidator;
import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;


public class App {
    public static void main(String[] args) throws Exception {
        // // NO MODIFICAR ESTE CÓDIGO
        // var estudiante = StudentValidator.validarDatos();
        // System.out.println("👤 Estudiante: " + estudiante.nombre());
        // System.out.println("✉️  Correo: " + estudiante.correo());
        // // NO MODIFICAR HASTA AQUÍ

        System.out.println("===== Ejercicio 01: Insertar en BST =====");
        InsertBST.run();

        System.out.println("\n===== Ejercicio 02: Invertir Árbol Binario =====");
        InvertBinaryTree.InvertTest.run();

        System.out.println("\n===== Ejercicio 03: Listar Niveles del Árbol =====");
        ListLevels.ListLevelsTest.run();

        System.out.println("\n===== Ejercicio 04: Calcular Profundidad Máxima =====");
        Depth.DepthTest.run();
    }
}
 