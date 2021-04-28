package examenu2poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Profesores {
public static void Ingresar_Datos(int[] Horas, String[] Materias, Scanner teclado, int NumE) {

        for (int i = 0; i < Horas.length; i++) {
             Materias[i] = JOptionPane.showInputDialog("Nombre de la materia " +i);
             Horas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de clase que impartio en esta quincena"));
    
        }
    }

    public static double Horas_totales(int Horas[]) {
        int Suma = 0;
        for (int i = 0; i < Horas.length; i++) {
            Suma += Horas[i];
        }
        return Suma;
    }

    public static void Imprimir(int[] Horas, String[] Materias, int Suma, String Nombre, int NumE, String Tabla) {

       
        for (int i = 0; i < Horas.length; i++) {
             
           Tabla += "\n"+ Nombre+"\n"+"Num de Empleado: "+ NumE+"\n"+"Materia: "+Materias[i]+"\n"+"Horas: "+Horas[i]+" Horas"+"\n";
            Suma += Horas[i];
        }
        JOptionPane.showMessageDialog(null,"Docente: "+Tabla+"\n");
        JOptionPane.showMessageDialog(null, "Suma total de todas las horas clase impartidas: " + Suma +" Horas");
    
        int Sueldo = (Suma*340);
        JOptionPane.showMessageDialog(null,"Su salario aproximado es de: "+ Sueldo +" mxn");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int NA,Horas[],Suma = 0,NumE;
        String Materias[], Tabla="";

        JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        NumE = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese su numero de empleado"));
        NA = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese el numero de materias que imparte"));
        if(NA<=0){
            JOptionPane.showMessageDialog(null, "Numero incorrecto", "", JOptionPane.ERROR_MESSAGE);
           System.exit(0);
        }

        Materias = new String[NA];
        Horas = new int[NA];

        Ingresar_Datos(Horas, Materias, teclado,NumE);
        Horas_totales(Horas);
        Imprimir(Horas, Materias,Suma,Tabla,NumE,Nombre);
    }
}
