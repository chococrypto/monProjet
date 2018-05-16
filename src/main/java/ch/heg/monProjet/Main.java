package ch.heg.monProjet;

import ch.heg.monProjet.domaine.Persone;
import ch.heg.monProjet.manager.PersoneManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args)  {
        PersoneManager manager = new PersoneManager();
        manager.dataLoading();
        List<Persone> lst = manager.getPersones();

        System.out.println(Arrays.toString(lst.toArray()));

    }
}
