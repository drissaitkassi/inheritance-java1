import inheritance.Personne;
import inheritance.PersonneDiplome;

public class Main {
    public static void main(String[] args) {
        Personne p1=new Personne("ait kassi","driss");
        Personne p2=new Personne("ait kasi","driss");
        PersonneDiplome pd1=new PersonneDiplome(p1.getNom(), p1.getPrenom(), "softwar engenieer");
        PersonneDiplome pd2= new PersonneDiplome(p1.getNom(), p1.getPrenom(),"softwar engenieer");

        System.out.println(p1.equals(p2));

    }
}