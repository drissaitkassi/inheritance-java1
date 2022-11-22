package inheritance;

public class PersonneDiplome extends Personne{

    private String diplom;

    public PersonneDiplome(String nom,String prenom,String diplom){
        super(nom,prenom);
        this.diplom=diplom;
    }
    public PersonneDiplome(){
        this("indefineNC","indefiniePC","indifineD");

    }
    public PersonneDiplome(String nom, String prenom){
        this(nom,prenom,"ingenieur");

    }

    @Override
    public String toString(){
        return super.toString()+" "+getDiplom().toUpperCase().substring(0,1)+getDiplom().substring(1);
    }

    public String getDiplom() {
        return diplom;
    }

    public void setDiplom(String diplom) {
        this.diplom = diplom;
    }
}
