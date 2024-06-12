
/**
 * Write a description of class Auxiliar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auxiliar extends Persona
{
    // instance variables - replace the example below with your own
   private String cargo;
    private double auxilioTransporte;

    public Auxiliar() {
    }

    public Auxiliar(String cargo, double auxilioTransporte, String codigo, String cedula, String nombre, int edad, double salario) {
        super(codigo, cedula, nombre, edad);
        this.cargo = cargo;
        this.auxilioTransporte = auxilioTransporte;
    }
    
    @Override
    public void calcularSalario (double salario){
        salario = salarioBase + auxilioTransporte;
        
    }
}
