package inheritance;

public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public Personne(){
        this("indefinieN","indenieP");

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String  format(){
      return""+ getNom().toUpperCase() +" "+getPrenom().toUpperCase().substring(0,1)+getPrenom().substring(1);
    }

    public String toString(){
        return  this.format();
    }
    public void affiche(){
        System.out.println(this.toString());
    }
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o==null || this.getClass()!=o.getClass())return false;
        Personne personne=(Personne)o;
        if (this.getNom().equals(((Personne) o).getNom()))return true;
        return false;

    }
}
