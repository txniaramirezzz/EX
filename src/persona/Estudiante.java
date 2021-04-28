
package persona;

//CLASE_HIJA- DE LA CLASE PERSONA
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
            
    

