/*
Generar una clase llamada Usuario que contenga los siguientes atributos: nombre del usuario, su identificación, su email, su edad, el área a la que pertenece y un identificador 
que indique si se trata de un jefe de área o no (atributo tipo booleano). Crear el constructor de la clase, que reciba como datos de entrada la información de 
cada uno de los atributos mencionados, en el mismo orden en el que aparecen. Este constructor debe inicializar estos datos. Adicionalmente, puede crear un atributo para el valor 
de la nomina la cual puede ser calculada, de acuerdo a los datos del trabajador, allí mismo dentro del constructor.Dentro de la clase Usuario, cree un método llamado info() que no 
reciba parámetros de entrada, simplemente que imprima la información del usuario de la siguiente manera:
[Usuario]:
Nombre: Lucia Gomez
Identificacion: 1097000000
Email: lucia.gomez@correo.com
Edad: 25
Área: desarrollo
Salario: 4095000.0
 */
package reto2;
public class Reto2 {
    public class Usuario{
        public String nombre_usuario;
        public int identificacion;
        public String correo;
        public int edad;
        public String area;
        public double salario;
        public boolean jefe;
        public Usuario(String nombre_usuario, int identificacion, String correo,  int edad, String area, boolean jefe){
            this.nombre_usuario = nombre_usuario;
            this.identificacion = identificacion;
            this.correo = correo;
            this.edad = edad;
            this.area = area;
            if (area == "desarrollo" && jefe == true){
                salario = 6370000;
            }else if (area == "desarrollo" && jefe == false){
                salario = 4095000;
            }else if (area == "administrativa"&& jefe == false){
                salario = 3220000;
            }else{
                salario = 5915000;
            }
            this.jefe = jefe;
        }    
    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+ this.nombre_usuario);
        System.out.println("Identificacion: "+ this.identificacion);
        System.out.println("Email: "+this.correo);
        System.out.println("Edad: "+this.edad);
        System.out.println("Area: "+this.area);
        System.out.println("Salario: "+this.salario);
    
    }
    }
    public static void main(String[] args) {
    
    }
    
}
