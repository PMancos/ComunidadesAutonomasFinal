
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin1
 */
public class ComunidadAutonoma {

    private String nomComunidad;
    private String capital;
    private ArrayList<Provincia> provincias = new ArrayList<>();

    public ComunidadAutonoma(String nomComunidad, String capital) {
        this.nomComunidad = nomComunidad;
        this.capital = capital;
    }

    public ComunidadAutonoma() {
    }

    
    /**
     * Añade provincias a la lista
     *
     * @param p
     */
    public void aniadirProvincia(Provincia p) {
        provincias.add(p);
    }

    /**
     * Devuelve el numero de provincias
     *
     * @return
     */
    public int numeroProvincias() {
        return provincias.size();
    }

    /**
     * Devuelve la densidad por provincia
     *
     * @return
     */
    public double obtenerDensidad() {
        double den = 0;
        double habitantes = 0;
        double superficie = 0;
        for (int i = 0; i < provincias.size(); i++) {
            habitantes += provincias.get(i).getNumHabitantes();
            superficie += provincias.get(i).getSuperficie();
        }
        den = habitantes / superficie;
        return den / provincias.size();
    }

    /**
     * Devuelve la renta per capita por provincia
     *
     * @return
     */
    public double obtenerRentaperCapita() {
        double renta = 0;
        for (int i = 0; i < provincias.size(); i++) {
            renta += provincias.get(i).getRentaPerCapita();
        }
        return renta / provincias.size();
    }

    /**
     * Devuelve el numero de habitantes por provincia
     *
     * @return
     */
    public int numHabitantes() {
        int habitantes = 0;
        for (int i = 0; i < provincias.size(); i++) {
            habitantes += provincias.get(i).getNumHabitantes();
        }
        return habitantes / provincias.size();
    }

    @Override
    public String toString() {
        return "\nNombre de la comunidad: " + nomComunidad + "\nCapital: " + capital;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

}
