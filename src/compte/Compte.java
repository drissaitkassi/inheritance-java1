package compte;

public abstract class Compte implements Comparable{

    private double sold;

    //constructeur naturel
    Compte(double sold) {
        this.sold = arrondi2(sold);
    }


    public double getSold() {
        return sold;
    }

    private void affect(double sold) {

        this.sold =  arrondi2(sold);
    }

    private static double arrondi2(final double pR) {

        double vR = Math.abs(pR);
        int vI = (int) (vR * 1000);
        if (vI % 10 >= 5) vR = vR + 0.01;
        return Math.copySign(((int) (vR * 100)) / 100.0, pR);
    }

    public void debit(double mntDebit){
        this.affect(this.getSold()-mntDebit);
    }
    public void credit(double mntCredit){
        this.affect(this.getSold()+mntCredit);
    }

    public abstract void capitaliseUnAn();

    public void bilanAnnuel() {
        System.out.println("sold courant : "+this.getSold());
        //this.bilanAnnuel();
        System.out.println("apres capitalisation sold : "+this.getSold());

    }

    @Override
    public int compareTo(Object o) {
        Compte compte=(Compte) o;
        return Double.compare(this.getSold(),compte.getSold());
     /*   if(this.getSold()>((Compte) o).getSold())return 1;
        else if (this.getSold()<((Compte) o).getSold()) {
            return -1;
        }else return 0;*/

    }

    @Override
    public String toString(){
        return "";
    }
}
