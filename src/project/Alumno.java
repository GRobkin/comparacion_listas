/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa a un alumno con nombre, matrícula y fecha de nacimiento.
 * 
 * La clase implementa la interfaz Comparable para permitir ordenar
 * alumnos alfabéticamente por nombre.
 * 
 * Autor: 413xi
 */
public class Alumno implements Comparable<Alumno> {
    /** Nombre completo del alumno. */
    private String nombre;
    /** Matrícula única del alumno (5 dígitos). */
    private String matricula;
    /** Fecha de nacimiento del alumno. */
    private LocalDate fechaNacimiento;

    /**
     * Constructor de la clase Alumno.
     * 
     * @param nombre nombre completo del alumno
     * @param matricula matrícula del alumno (cadena de 5 números)
     * @param fechaNacimiento fecha de nacimiento del alumno
     */
    public Alumno(String nombre, String matricula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la matrícula del alumno.
     * 
     * @return matrícula de 5 dígitos
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Obtiene la fecha de nacimiento del alumno.
     * 
     * @return fecha de nacimiento como LocalDate
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Convierte los datos del alumno a una cadena en formato CSV.
     * 
     * @return cadena con los atributos separados por comas
     */
    public String aCSV() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return nombre + "," + matricula + "," + fechaNacimiento.format(formato);
    }
    
    /**
     * Compara este alumno con otro por nombre (orden alfabético, sin distinguir mayúsculas).
     * 
     * @param otro otro alumno a comparar
     * @return valor negativo si este alumno es menor, positivo si es mayor, 0 si son iguales
     */
    @Override
    public int compareTo(Alumno otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
}
