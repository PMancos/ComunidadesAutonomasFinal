
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin1
 */
public class Provincia implements Comparator {

    private String nomProv;
    private String capital;
    private int numHabitantes;
    private double superficie;
    private double rentaPerCapita;

    public Provincia(String nomProv, String capital, int numHabitantes, double superficie, double rentaPerCapita) {
        this.nomProv = nomProv;
        this.capital = capital;
        this.numHabitantes = numHabitantes;
        this.superficie = superficie;
        this.rentaPerCapita = rentaPerCapita;
    }

    public Provincia() {
    }

    /**
     * Devuelve la densidad por provinicia
     *
     * @return
     */
    public double obtenerDensidad() {
        return numHabitantes / superficie;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getRentaPerCapita() {
        return rentaPerCapita;
    }

    public void setRentaPerCapita(double rentaPerCapita) {
        this.rentaPerCapita = rentaPerCapita;
    }

    @Override
    public String toString() {
        return "\nNombre de la Provincia: " + nomProv + "\nCapital=" + capital
                + "\nNumero de habitantes: " + numHabitantes + "\nSuperficie: " + superficie + "\nRentaPerCapita: " + rentaPerCapita;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Provincia p1 = (Provincia) o1;
        Provincia p2 = (Provincia) o2;

        if (p1.getNumHabitantes() == p2.getNumHabitantes()) {
            if (p1.getSuperficie() == p2.getSuperficie()) {
                if (p1.obtenerDensidad() == p1.obtenerDensidad()) {
                    return (int) (p1.getRentaPerCapita() - p2.getRentaPerCapita());
                } else {
                    return (int) (p1.obtenerDensidad() - p2.obtenerDensidad());
                }
            } else {
                return (int) (p1.getSuperficie() - p2.getSuperficie());
            }
        } else {
            return p1.getNumHabitantes() - p2.getNumHabitantes();
        }
    }

}
