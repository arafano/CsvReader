package fr.epsi.b3.recensement.infos;

import java.util.List;

public class Region implements Comparable<Region> {
    public int codeRegion;
    public String nomRegion;
    public int populationMunicipale;
    public int populationTotale;


    public Region(){}

    public Region(int codeRegion, String nomRegion){
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;


    }
    public void calculpopulationtotale(List<Ville> ListeVilles ){
        for (Ville v : ListeVilles){
            if(v.nomRegion == this.nomRegion){
                this.populationTotale += v.populationTotale;
            }

        }

    }

    public int getCodeRegion() {return this.codeRegion;}
    public void setCodeRegion(int codeRegion){this.codeRegion = codeRegion;}

    public String getNomRegion() {return  this.nomRegion;}
    public void setNomRegion(String nomRegion) {this.nomRegion = nomRegion;}

    public int getPopulationMunicipale(){return this.populationMunicipale;}
    public void setPopulationMunicipale(int populationMunicipale){this.populationMunicipale = populationMunicipale;}

    public int getPopulationTotale() {return this.populationTotale;}
    public void setPopulationTotale(int populationTotale){this.populationTotale = populationTotale;}

    @Override
    public int compareTo(Region o) {
        return o.populationTotale - this.populationTotale;
    }
}
