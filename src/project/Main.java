/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * Clase principal que ejecuta el programa de comparación entre diferentes
 * implementaciones de listas en Java: ArrayList, LinkedList y Vector.
 *
 * El programa genera 350000 alumnos, los ordena por nombre y exporta los datos
 * a archivos CSV. Además mide el tiempo de cada operación (registro,
 * ordenación y exportación) y lo muestra en formato de tabla.
 *
 * Autor: 413xi
 */
public class Main {

    /** Número total de alumnos a generar en cada lista. */
    public static int total_alumnos = 350000;

    /**
     * Método principal que controla el flujo del programa.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     * @throws IOException si ocurre un error al exportar los archivos CSV
     */
    public static void main(String[] args) throws IOException {
        Map<String, List<Alumno>> listas = new LinkedHashMap<>();
        listas.put("ArrayList", new ArrayList<>());
        listas.put("LinkedList", new LinkedList<>());
        listas.put("Vector", new Vector<>());
        Map<String, long[]> tiempos = new LinkedHashMap<>();
        
        for (Map.Entry<String, List<Alumno>> entry : listas.entrySet()) {
            String tipo = entry.getKey();
            List<Alumno> lista = entry.getValue();
            long inicio, fin;

            // Registro de alumnos
            inicio = System.currentTimeMillis();
            for (int i = 0; i < total_alumnos; i++) {
                lista.add(GeneradorAlumno.generarAlumno());
            }
            fin = System.currentTimeMillis();
            long tiempoRegistro = fin - inicio;

            // Ordenación de la lista
            inicio = System.currentTimeMillis();
            Collections.sort(lista);
            fin = System.currentTimeMillis();
            long tiempoOrdenacion = fin - inicio;

            // Exportación a CSV
            inicio = System.currentTimeMillis();
            exportarCSV(lista, "alumnos_" + tipo.toLowerCase() + ".csv");
            fin = System.currentTimeMillis();
            long tiempoExportacion = fin - inicio;

            tiempos.put(tipo, new long[]{tiempoRegistro, tiempoOrdenacion, tiempoExportacion});
        }

        // Mostrar tabla comparativa de tiempos
        System.out.printf("%-12s %-15s %-15s %-15s%n", "Operación", "ArrayList (ms)", "LinkedList (ms)", "Vector (ms)");
        String[] operaciones = {"Registro", "Ordenación", "Exportación"};
        for (int i = 0; i < operaciones.length; i++) {
            System.out.printf("%-12s", operaciones[i]);
            for (String tipo : listas.keySet()) {
                System.out.printf(" %-15d", tiempos.get(tipo)[i]);
            }
            System.out.println();
        }
    }

    /**
     * Exporta una lista de alumnos a un archivo CSV.
     *
     * @param lista lista de alumnos ya ordenada
     * @param nombreArchivo nombre del archivo CSV a generar
     * @throws IOException si ocurre un error de escritura
     */
    private static void exportarCSV(List<Alumno> lista, String nombreArchivo) throws IOException {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Nombre,Matrícula,Fecha de Nacimiento\n");
            for (Alumno alumno : lista) {
                writer.write(alumno.aCSV() + "\n");
            }
        }
    }
}
