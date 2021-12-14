package reto4;
import java.util.TreeSet;

class Usuario {
    TreeSet<String> telefonos = new TreeSet<String>();
    private String telefono;

    public Usuario() {
        telefonos = new TreeSet<>();
    }
    void addTelefono(String telefono) {
        telefonos.add(telefono);
    }
    void mostrarTelefonos() {
        System.out.println(telefonos);
    } 
}
