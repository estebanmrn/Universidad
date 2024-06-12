
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Persona
{
    // instance variables - replace the example below with your own
     private String cargo; 
    private int añosExp;
    private String numeroExtTlf; 
    private double comision; 

    public Administrativo() {
    }

    public Administrativo(String cargo, int añosExp, String numeroExtTlf, double comision, String codigo, String cedula, String nombre, int edad) {
        super(codigo, cedula, nombre, edad);
        this.cargo = cargo;
        this.añosExp = añosExp;
        this.numeroExtTlf = numeroExtTlf;
        this.comision = comision;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public String getNumeroExtTlf() {
        return numeroExtTlf;
    }

    public void setNumeroExtTlf(String numeroExtTlf) {
        this.numeroExtTlf = numeroExtTlf;
    }
    public double getComision(){
        return comision;
    }
    public void setComision (double comision){
        this.comision = comision;
    }
    
    @Override 
    public void imprimirInfo (){
        super.imprimirInfo();
        System.out.println("Cargo: " + cargo);
        System.out.println("Años de experiencia: " + añosExp);
        System.out.println("Número de Extensión Telefónica: " + numeroExtTlf);
    }
    
    @Override 
    public void calcularSalario (double salario){
        salario = salarioBase + comision; 
    }
}
