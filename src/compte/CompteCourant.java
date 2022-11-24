package compte;

public class CompteCourant extends Compte{
    CompteCourant(double sold) {
        super(sold);
    }

    @Override
    public void capitaliseUnAn(){

    }
    @Override
    public String toString(){
        return "Compte Courant est :";
    }

/*    public int compareTo(Double o) {

        if(this.getSold()>o)return 1;
        else if (this.getSold()<o) {
            return -1;
        }else return 0;

    }*/
}
