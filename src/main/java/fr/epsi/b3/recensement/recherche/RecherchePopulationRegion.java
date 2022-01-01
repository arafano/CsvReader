package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Region;
import fr.epsi.b3.recensement.infos.Ville;

import java.util.List;
import java.util.Scanner;



public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {


        String Region = scanner.nextLine();
        List<Region> ListeRegion = recensement.getListeRegions();
        int popTotRegion = 0;
        for(int i=0;i<ListeRegion.size();i++){
            if(ListeRegion.get(i).nomRegion.equals(Region)){
                popTotRegion += ListeRegion.get(i).populationTotale;

            }
            //break;
        }
        System.out.println("La population de cette région est : "+popTotRegion+"habitants");




    }

    @Override
    public void traiter(Recensement recensement) {

    }
}
