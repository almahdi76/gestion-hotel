package beans;

import java.util.Scanner;

public class hotel {
    chambre tabChmbre[];

    public hotel() {
        tabChmbre = new chambre[31];
        // affectation de valeurs dans le tableau
        tabChmbre[0] = new chambre(1, 1, 1);
        tabChmbre[1] = new chambre(2, 2, 1);
        tabChmbre[2] = new chambre(3, 3, 1);
        tabChmbre[3] = new chambre(4, 4, 1);
        tabChmbre[4] = new chambre(5, 1, 2);
        tabChmbre[5] = new chambre(6, 2, 2);
        tabChmbre[6] = new chambre(7, 3, 2);
        tabChmbre[7] = new chambre(8, 4, 2);
        tabChmbre[8] = new chambre(9, 1, 3);
        tabChmbre[9] = new chambre(10, 2, 3);
        tabChmbre[10] = new chambre(11, 3, 3);
        tabChmbre[11] = new chambre(12, 4, 3);
        tabChmbre[12] = new chambre(13, 5, 3);
        tabChmbre[13] = new chambre(14, 6, 3);
        tabChmbre[14] = new chambre(15, 1, 4);
        tabChmbre[15] = new chambre(16, 2, 4);
        tabChmbre[16] = new chambre(17, 3, 4);
        tabChmbre[17] = new chambre(18, 4, 4);
        tabChmbre[18] = new chambre(19, 5, 4);
        tabChmbre[19] = new chambre(20, 6, 4);
        tabChmbre[20] = new chambre(21, 1, 1);
        tabChmbre[21] = new chambre(22, 2, 2);
        tabChmbre[22] = new chambre(23, 1, 2);
        tabChmbre[23] = new chambre(24, 3, 1);
        tabChmbre[24] = new chambre(25, 3, 2);
        tabChmbre[25] = new chambre(26, 4, 4);
        tabChmbre[26] = new chambre(27, 5, 4);
        tabChmbre[27] = new chambre(28, 2, 2);
        tabChmbre[28] = new chambre(29, 4, 3);
        tabChmbre[29] = new chambre(30, 3, 2);
        tabChmbre[30] = new chambre(31, 4, 2);
    }
    Scanner sc=new Scanner(System.in);
    // methode qui affiche les chambres correspondant à une certaine capacité
    public void AffichCh(int nbPers, int tp[][], String td[]) {
        int nbCh = 0;
        for (int i = 0; i < 31; i++) {
            if (tabChmbre[i].DonnerNbPers() == nbPers) {
                System.out.println("Chambre : " + tabChmbre[i].DonnerNumero());
                System.out.println("Cat : " + tabChmbre[i].DonnerCateg() + " prix : " + tabChmbre[i].DonnerPrix(tp) + "  ");
                tabChmbre[i].AffichDescript(td);
                nbCh++;
            }
        }
        //System.out.println("Nombre de chambres : " + nbCh);
    }

    public void AffichCh2( int tp[][], String td[]) {
        System.out.println("Nombre ch ?");
        int nbCh = sc.nextInt();
        for (int i = 0; i < 31; i++) {
          //  if (tabChmbre[i].DonnerNbPers() == nbCh) {
                System.out.println("Chambre : " + tabChmbre[i].DonnerNumero());
                System.out.println("Cat : " + tabChmbre[i].DonnerCateg() + " prix : " + tabChmbre[i].DonnerPrix(tp) + "  ");
                tabChmbre[i].AffichDescript(td);

           // }
        }

    }
}