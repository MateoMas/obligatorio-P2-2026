package dominio;

import java.util.ArrayList;

public class GestorMurales {

    private String nombre;
    private ArrayList<Diseniador> listaDiseniadores;
    private ArrayList<Ficha> listaFichas;
    private ArrayList<Mural> listaMurales;

    public GestorMurales(String elNombre) {
        this.setNombre(elNombre);
        listaDiseniadores = new ArrayList();
        listaFichas = new ArrayList();
        listaMurales = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Diseniador> getDiseniadoresOrdenados() {
        ArrayList<Diseniador> listaOrdenada = new ArrayList<>(listaDiseniadores);

        listaOrdenada.sort((d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));

        return listaOrdenada;
    }

    public ArrayList<Ficha> getListaFichas() {
        return listaFichas;
    }

    public ArrayList<Mural> getListaMurales() {
        return listaMurales;
    }

    public void registrarDiseniador(Diseniador d) {
        listaDiseniadores.add(d);
    }

    public void registrarFicha(Ficha f) {
        listaFichas.add(f);
    }

    public void registrarMural(Mural m) {
        listaMurales.add(m);
    }

    public Diseniador buscarDiseniador(String nombre) {
        Diseniador diseniador = null;
        for (Diseniador d : listaDiseniadores) {
            if (d.getNombre().equals(nombre)) {
                diseniador = d;
            }
        }
        return diseniador;
    }

    public Ficha buscarFicha(String nombre) {
        Ficha ficha = null;

        for (Ficha f : listaFichas) {
            if (f.getNombre().equals(nombre)) {
                ficha = f;
            }
        }

        return ficha;
    }

    public Mural buscarMural(String nombre) {
        Mural mural = null;

        for (Mural m : listaMurales) {
            if (m.getNombre().equals(nombre)) {
                mural = m;
            }
        }

        return mural;
    }

}
