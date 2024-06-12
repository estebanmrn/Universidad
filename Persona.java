
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
   private String codigo, cedula, nombre;
    private int edad; 
    private Fecha fechaIngreso;
    private Fecha fechaActual;
    public double salario;
    public static double salarioBase = 1300000;
    

    public Persona() {
    }

    public Persona(String codigo, String cedula, String nombre, int edad) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Fecha getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Fecha fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    public void imprimirInfo (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cédula: " + cedula);
        System.out.println("Código: " + codigo);
    }
    
    public int calcularExp (Fecha fechaActual, Fecha fechaIngreso){
        int experiencia;
        return experiencia = fechaActual.getAnio() - fechaIngreso.getAnio();
    }
    
    public void calcularSalario(double salario){
        
    }
    }

