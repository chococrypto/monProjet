package ch.heg.monProjet.manager;

import ch.heg.monProjet.dao.FilePath;
import ch.heg.monProjet.dao.PersoneDao;
import ch.heg.monProjet.dao.Reader;
import ch.heg.monProjet.domaine.Persone;

import java.util.List;

/**
 * Created by diegoruiz on 04.03.18.
 */
public class PersoneManager {

    private List<Persone> persones;
    private PersoneDao personeDao = null;
    public PersoneManager(){
        personeDao = new PersoneDao(new Reader(new FilePath()));
    }
    public void dataLoading(){
         persones = personeDao.datas();
     }
    public List<Persone> getPersones() {
        return persones;
    }

}
