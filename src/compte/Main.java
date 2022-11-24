package compte;

public class Main {
    public static void main(String[] args) {


        //compte mensuel
       // compte.debit(100.9877);
        //System.out.println(compte.getSold());
       //compte.credit(400);
        //System.out.println(compte.getSold());

        CompteCourant compteCourant =new CompteCourant(1000);
        CompteCourant compteCourant2 =new CompteCourant(1060);
        CompteAnnuel compteAnnuel = new CompteAnnuel(1000,6);
        CompteMensuel compteMensuel=new CompteMensuel(1000,0.5);

       /* System.out.println("compte courant :");
        compte.bilanAnnuel();
        System.out.println("=======================");
        System.out.println("compte remunérer menseuel : ");
        compteMensuel.bilanAnnuel();
        System.out.println("========================");
        System.out.println("compte remunirer annuel :");
        compteAnnuel.bilanAnnuel();*/

        Compte[] comptes={compteCourant,compteMensuel,compteAnnuel};
        for (int i = 0; i <comptes.length ; i++) {
            System.out.println(comptes[i].toString());
            comptes[i].bilanAnnuel();
        }




        System.out.println(compteCourant2.compareTo(compteCourant));
        System.out.println(compteCourant2.compareTo(compteAnnuel));
        System.out.println(compteCourant2.compareTo(compteMensuel));

        //use casted type on array type definition
    }
}

