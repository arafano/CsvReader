package fr.epsi.b3.recensement.infos;

import java.util.Scanner;

public abstract class MenuService {
    public abstract void traiter(Recensement recensement, Scanner scanner);
    public abstract void traiter(Recensement recensement);

}
