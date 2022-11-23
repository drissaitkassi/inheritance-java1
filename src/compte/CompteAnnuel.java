package compte;

public class CompteAnnuel extends CompteRe{
    CompteAnnuel(double sold, double aTaux) {
        super(sold, aTaux);
    }

    @Override
    public void capitaliseUnAn(){

        this.credit((this.getSold()*this.getaTaux())/100);
        System.out.println( this.getSold());
    }

    @Override
    public void bilanAnnuel(){

        System.out.println("sold courant : "+this.getSold());
        this.capitaliseUnAn();
        System.out.println("apres capitalisation sold : "+this.getSold());


    }
    @Override
    public String toString(){
        return "Compte rémunerer annuel est :";
    }

}
