/*
 * 
 */

package examenu2poo;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static examenu2poo.Profesores.Imprimir;
import static examenu2poo.Profesores.Ingresar_Datos;
import static examenu2poo.Profesores.Horas_totales;

/**
 *
 * @Equipo 4, POO
 */
public class ExamenU2POO {


    public static void main(String[] args) {

        int seleccion = JOptionPane.showOptionDialog(null,
                "Seleccione una opción",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Profesor", "Estudiante"}, "");
        if(seleccion == 0){
            
            Scanner teclado = new Scanner(System.in);

            int NA, Horas[], Suma = 0, NumE;
            String Materias[], Tabla = "";

            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
            String NombreP = JOptionPane.showInputDialog("Ingrese su nombre");
            NumE = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese su numero de empleado"));
            NA = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el numero de materias que imparte"));
            if (NA <= 0) {
                JOptionPane.showMessageDialog(null, "Numero incorrecto", "", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            Materias = new String[NA];
            Horas = new int[NA];

            Ingresar_Datos(Horas, Materias, teclado, NumE, Nombre);
            Horas_totales(Horas);
            Imprimir(Horas, Materias, Suma, Tabla, NumE, NombreP);
            System.exit(0);
        }
        else{
public class Estudiante extends ExamenU2POO {


    
    protected float calificacion;
    protected int NumeroControl;
    
    
    public Estudiante(String Nombre, String Sexo, int Edad) {
        super(Nombre,Sexo,Edad); //Atributos que ya estaban en la super clase
        this.calificacion = calificacion;
        this.NumeroControl = NumeroControl;
    }
    
    
    public void Calif (String Nombre, String Sexo, int Edad) {
        JOptionPane.showMessageDialog(null, "El estudiante se llama " + Nombre + " quien es del sexo " + Sexo + " con edad de " + Edad);
    }
    public void Calif (String Nombre, float calificacion, int NumeroControl) {
        calificacion = Float.parseFloat(JOptionPane.showInputDialog("Inserte su calificacion del semestre: "));
        NumeroControl = Integer.parseInt(JOptionPane.showInputDialog("Inserte su numero de control del plantel: "));
        JOptionPane.showMessageDialog(null, "El estudiante " + Nombre + " tiene una calificacion de: " + calificacion + ", con un Numero de Control: " + NumeroControl);
    }
    
   
        
    public class Estudiante extends Persona {
    int CodigodeEstudiante;
    int Notafinal;
//constructor
    public Estudiante(int CodigodeEstudiante, int Notafinal, int edad, String Nombre, String Sexo) {
        super(edad, Nombre,Sexo);
       
        this.CodigodeEstudiante = CodigodeEstudiante;
        this.Notafinal = Notafinal;
    }
  
   //MÉTODO
     public void mostrarDatos(){
       System.out.println("Nombre: "+getNombre()+
               "\nEdad:"+getEdad()+
               "\nCodigo Estudiante: "+CodigodeEstudiante+
               "\nNotaFinal: "+Notafinal +
                "\nSexo: "+getSexo());
   }
    }
    
        }}
    


