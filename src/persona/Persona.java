
package persona;

//CLASE PADRE
public class Persona{
 //ATRIBUTOS   //ENCAPSULAMIENTO
     private int edad;
     private String Nombre;
     private String Sexo;
//CONSTRUCTOR

    public Persona(int edad, String Nombre, String Sexo) {
        this.edad = edad;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
    }
   //SETTER
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    
//GETTER
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return Sexo;
    }
    

    
    
    
    

    
}
