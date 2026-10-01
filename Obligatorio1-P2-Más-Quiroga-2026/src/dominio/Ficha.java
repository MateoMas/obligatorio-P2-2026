package dominio;

public class Ficha {

    private String nombre;
    private char color;
    private String disenioChico;
    private String disenioGrande;

    public Ficha(String nombre, char color, String disenioChico, String disenioGrande) {
        this.setNombre(nombre);
        this.setColor(color);
        this.setDisenioChico(disenioChico);
        this.setDisenioGrande(disenioGrande);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getDisenioChico() {
        return disenioChico;
    }

    public void setDisenioChico(String disenioChico) {
        this.disenioChico = disenioChico;
    }

    public String getDisenioGrande() {
        return disenioGrande;
    }

    public void setDisenioGrande(String disenioGrande) {
        this.disenioGrande = disenioGrande;
    }

    @Override

    public boolean equals(Object obj) {
        Ficha f = (Ficha) obj;
        return this.nombre.equalsIgnoreCase(f.getNombre());
    }

}
