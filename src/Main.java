import inheritance.Personne;
import inheritance.PersonneDiplome;

public class Main {
    public static void main(String[] args) {
        Personne p1=new Personne("ait kassi","driss");
        PersonneDiplome pd1=new PersonneDiplome(p1.getNom(), p1.getPrenom(), "softwar engenieer");

        p1.affiche();
    }
}