package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
        System.out.println();
	}

	// b)

    public static String tilStreng(int[] tabell) {
        String s = "\"[";
        for (int i = 0; i < tabell.length; i++) {
            s += tabell[i];
            if (i < tabell.length - 1) {
                s += ",";
            }
        }
        s += "]\"";
        return s;
    }


	// c)
	public static int summer(int[] tabell) {

        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }



	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        } return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
            
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
