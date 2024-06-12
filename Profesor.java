
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
    // instance variables - replace the example below with your own
    private String especialidad;
    private int horasSemanales; 
    private  int valorHora = 6915;

    public Profesor() {
    }

    public Profesor(String especialidad, int horasSemanales, String codigo, String cedula, String nombre, int edad, double salario) {
        super(codigo, cedula, nombre, edad);
        this.especialidad = especialidad;
        this.horasSemanales = horasSemanales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    @Override
    public void calcularSalario(double salario){
        salario = horasSemanales * valorHora;
    }
}
