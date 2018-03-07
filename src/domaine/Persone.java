package domaine;

/**
 * Created by diegoruiz on 04.03.18.
 */
public class Persone {

	private int no;
    private String nom;
    
    public Persone(int no, String nom) { this.no=no; this.nom=nom; }
    public Persone(int no) { this(no, ""); }
    
    public int getNo() { return no; }
    public String getNom() { return nom; }
    
    public boolean equals(Object obj) { return this.no == ((Persone)obj).no; }
    public String toString() { return nom; }
}
