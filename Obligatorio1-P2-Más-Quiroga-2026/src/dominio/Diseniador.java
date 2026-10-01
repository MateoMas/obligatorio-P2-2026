package dominio;

import java.util.ArrayList;
import java.util.Objects;

public class Diseniador {

    private String nombre;
    private String direccion;
    private String mail;
    private ArrayList<Mural> murales;

    public Diseniador(String nombre, String direccion, String mail) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setMail(mail);
        this.murales = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Mural> getMurales() {
        return murales;
    }

    public void agregarMural(Mural m) {
        murales.add(m);
    }

    public int cantidadFichasDiferentes() {
        // Método en desarrollo.
        return 0;
    }

    public int cantidadColoresDiferentes() {
        //Método en desarrollo.
        return 0;
    }

    @Override
    public String toString() {
        return "Diseñador: \nNombre: " + nombre + "\nDirección: " + direccion + "\nMail: " + mail;
    }

    public boolean equals(Object obj) {
        Diseniador d = (Diseniador) obj;
        return this.nombre.equalsIgnoreCase(d.getNombre());
    }

}
