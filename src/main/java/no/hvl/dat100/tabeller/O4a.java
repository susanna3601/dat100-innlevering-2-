package no.hvl.dat100.tabeller;

public class O4a {


    public static void skrivUt (int[] tabell){

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] tabell = new int[] {1,2,3,4,5,6,7,8,9,10};
        skrivUt(tabell);
    }
}
