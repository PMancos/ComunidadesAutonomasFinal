
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin1
 */
public class Estadisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<ComunidadAutonoma> comunidades = new ArrayList<>();
//        ArrayList<Provincia> pro = new ArrayList<>();
        ComunidadAutonoma p1=new ComunidadAutonoma();

        ComunidadAutonoma Euskadi = new ComunidadAutonoma("Euskadi", "Gazteiz");
        comunidades.add(Euskadi);

        Provincia Bizkaia = new Provincia("Bizkaia", "Bilbao", 1158439, 2217, 28859);
        Provincia Araba = new Provincia("Araba", "Gazteiz", 322557, 2963, 33726);
        Provincia Guipozkoa = new Provincia("Guipuzkoa", "San Sebastian", 712097, 1909, 30147);

//        pro.add(Bizkaia);
//        pro.add(Araba);
//        pro.add(Guipozkoa);

        ComunidadAutonoma Navarra = new ComunidadAutonoma("Navarra", "Pamplona");
        comunidades.add(Navarra);

        Provincia Nafarroa = new Provincia("Navarra", "Navarra", 640790, 10391, 28682);

//        pro.add(Nafarroa);

        ComunidadAutonoma Catalunya = new ComunidadAutonoma("Catalunya", "Barcelona");
        comunidades.add(Catalunya);

        Provincia Lerida = new Provincia("Lerida", "Lerida", 139176, 7728, 26943);
        Provincia Barcelona = new Provincia("Barcelona", "Barcelona", 139176, 7728, 26531);
        Provincia Gerona = new Provincia("Gerona", "Gerona", 756156, 5905, 26722);
        Provincia Tarragona = new Provincia("Tarragona", "Tarragona", 132199, 6303, 26792);

//        pro.add(Lerida);
//        pro.add(Barcelona);
//        pro.add(Gerona);
//        pro.add(Tarragona);
        
        Euskadi.aniadirProvincia(Bizkaia);
        Euskadi.aniadirProvincia(Araba);
        Euskadi.aniadirProvincia(Guipozkoa);

        Navarra.aniadirProvincia(Araba);

        Catalunya.aniadirProvincia(Lerida);
        Catalunya.aniadirProvincia(Barcelona);
        Catalunya.aniadirProvincia(Gerona);
        Catalunya.aniadirProvincia(Tarragona);

        System.out.println("Mostrar antes de ordenar");
        System.out.println("--------------------------");
        
        for (int i = 0; i < comunidades.size(); i++) {
            System.out.println(comunidades.get(i).toString());
            System.out.println("--------------------");
        
        for(int j = 0;j<comunidades.get(i).getProvincias().size();j++){
                System.out.println(comunidades.get(i).getProvincias().get(j).toString());
                System.out.println("Densidad: "+comunidades.get(i).getProvincias().get(j).obtenerDensidad());
                
            }
        }
           
       
        for(int i=0;i<comunidades.size();i++){
        Collections.sort(comunidades.get(i).getProvincias(), new Provincia());
        }

        System.out.println("");
        System.out.println("Despues de ordenar por numero de habitantes, superficie, densidad y renta per capita");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < comunidades.size(); i++) {
            System.out.println(comunidades.get(i).toString());
            System.out.println("--------------------");
        
        for(int j = 0;j<comunidades.get(i).getProvincias().size();j++){
                System.out.println(comunidades.get(i).getProvincias().get(j).toString());
                System.out.println("Densidad: "+comunidades.get(i).getProvincias().get(j).obtenerDensidad());
            }
        }

    }
}


