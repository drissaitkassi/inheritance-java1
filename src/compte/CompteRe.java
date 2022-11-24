package compte;

public class CompteRe extends Compte {
    private double aTaux;
    CompteRe(double sold,double aTaux) {
        super(sold);
        this.aTaux=aTaux;

    }

    public double getaTaux() {
        return aTaux;
    }

    public void setaTaux(double aTaux) {
        this.aTaux = aTaux;
    }

    @Override
    public void capitaliseUnAn(){
        System.out.println(this.getSold()*this.getaTaux());
    }
    @Override
    public String toString(){
        return "Compte Remunérer";
    };
    }


