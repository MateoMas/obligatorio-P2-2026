package dominio;

public class Mural {

    private String nombre;
    private Diseniador diseniador;
    private char formato;
    private char tamanio;
    private char formatoOriginal;
    private Ficha[][] disenio;

    public Mural(String nombre, Diseniador diseniador, char formato, char tamanio, char formatoOriginal, Ficha[][] disenio) {
        this.setNombre(nombre);
        this.setDiseniador(diseniador);
        this.setFormato(formato);
        this.setTamanio(tamanio);
        this.setFormatoOriginal(formatoOriginal);
        this.setDisenio(disenio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Diseniador getDiseniador() {
        return diseniador;
    }

    public void setDiseniador(Diseniador diseniador) {
        this.diseniador = diseniador;
    }

    public char getFormato() {
        return formato;
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) {
        this.tamanio = tamanio;
    }

    public char getFormatoOriginal() {
        return formatoOriginal;
    }

    public void setFormatoOriginal(char formatoOriginal) {
        this.formatoOriginal = formatoOriginal;
    }

    public Ficha[][] getDisenio() {
        return disenio;
    }

    public void setDisenio(Ficha[][] disenio) {
        this.disenio = disenio;
    }

    public void modificarPosicion(int i, int j, Ficha f) {
        disenio[i][j] = f;
    }

    public void restaurar() {
        // Método en desarrollo.
    }

    public void modificarFicha(Ficha f1, Ficha f2) {
        // Método en desarrollo.
    }

    public boolean areaCoincide(Mural m) {
        // Método en desarrollo.
        return false;
    }

    @Override

    public boolean equals(Object obj) {
        Mural m = (Mural) obj;
        return this.nombre.equalsIgnoreCase(m.getNombre());
    }

}
