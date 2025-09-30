/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.time.LocalDate;
import java.util.Random;

/**
 * Clase utilitaria para generar instancias de Alumno con datos aleatorios.
 *
 * Se utilizan arreglos de nombres y apellidos predefinidos para formar
 * el nombre completo. La matrícula es un número aleatorio de 5 dígitos,
 * y la fecha de nacimiento se genera dentro del rango de años 1980 a 1999.
 *
 * Ejemplo de uso:
 *   Alumno alumno = GeneradorAlumno.generarAlumno();
 *   System.out.println(alumno.getNombre());
 * 
 * Autor: 413xi
 */
public class GeneradorAlumno {

    /** Arreglo de nombres posibles para los alumnos. */
    private static String[] nombres = {"Ana", "Juan", "Carlos", "María", "Pedro", "Juliana", "Lucas", "Fernanda"};

    /** Arreglo de apellidos posibles para los alumnos. */
    private static String[] apellidos = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};

    /** Objeto Random para generar valores aleatorios. */
    private static Random aleatorio = new Random();

    /**
     * Genera un nuevo alumno con datos aleatorios:
     * - Nombre completo: compuesto de un nombre y un apellido aleatorio.
     * - Matrícula: número aleatorio de 5 cifras (con ceros a la izquierda si es necesario).
     * - Fecha de nacimiento: año entre 1980 y 1999, mes entre 1 y 12, día entre 1 y 28.
     *
     * @return un objeto Alumno generado aleatoriamente
     */
    public static Alumno generarAlumno() {
        String nombreCompleto = nombres[aleatorio.nextInt(nombres.length)] + " "
                + apellidos[aleatorio.nextInt(apellidos.length)];

        String matricula = String.format("%05d", aleatorio.nextInt(100000));

        LocalDate fechaNacimiento = LocalDate.of(
                1980 + aleatorio.nextInt(20),
                1 + aleatorio.nextInt(12),
                1 + aleatorio.nextInt(28)
        );

        return new Alumno(nombreCompleto, matricula, fechaNacimiento);
    }
}
