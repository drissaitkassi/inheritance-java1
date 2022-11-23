package compte;

public class CompteMensuel extends CompteRe {

    CompteMensuel(double sold, double aTaux) {
        super(sold, aTaux);
    }
    @Override
    public void capitaliseUnAn(){

        for (int i = 0; i <12 ; i++) {
            this.credit((this.getSold()*this.getaTaux())/100);

        }


    }
    @Override
    public void bilanAnnuel(){
        System.out.println("sold courant : "+this.getSold());
        this.capitaliseUnAn();
        System.out.println("apres capitalisation sold : "+this.getSold());
    }
    @Override
    public String toString(){
        return "Compte rémunerer mensuel est :";
    }
}
