package beans;

import java.util.Scanner;

public class testHotel {
    public static void main(String args[]) { // programme principal
        Scanner sc=new Scanner(System.in);
        hotel ho=new hotel();
        int tabPrix[][]  = new int[4][6] ;
        tabPrix[0][0] = 100; tabPrix[0][1]=120 ; tabPrix[0][2] = 130; tabPrix[0][3]=150; tabPrix[0][4] = 0;  tabPrix[0][5]=0;
        tabPrix[1][0] = 130; tabPrix[1][1]=160 ; tabPrix[1][2] = 170; tabPrix[1][3]=190; tabPrix[1][4] = 0;  tabPrix[1][5]=0;
        tabPrix[2][0] = 170; tabPrix[2][1]=200 ; tabPrix[2][2] = 210; tabPrix[2][3]=230; tabPrix[2][4] = 270;  tabPrix[2][5]=350;
        tabPrix[3][0] = 200; tabPrix[3][1]=230 ; tabPrix[3][2] = 240; tabPrix[3][3]=260; tabPrix[3][4] = 300;  tabPrix[3][5]=400;


        String tabDescrip [ ] = {"Lavabo","WC, television","Cabine douche, television","WC, cabine douche, Television","WC, Salle de bain + douche, Television","2 pièces, WC, Salle de bain + douche, Television" } ;

        chambre chm = new chambre(1,1,4);
//        System.out.println("Categorie : "+chm.DonnerCateg());
//        System.out.println("Capacite : "+chm.DonnerNbPers());
//        System.out.println("Prix : "+chm.DonnerPrix(tabPrix));

        hotel h = new hotel();
       // h.AffichCh(1,tabPrix,tabDescrip);
        h.AffichCh2(tabPrix,tabDescrip);



        int choix;
        lablet:
        while(true){

           //
            System.out.println("****************************************************");
            System.out.println("*                                                  *");
            System.out.println("*           Tapez 1 Pour info des  chambres       *");
            System.out.println("*                                                  *");
            System.out.println("*           Tapez 2 etat de chambre                 *");
            System.out.println("*                                                  *");
            System.out.println("*           Tapez 3 Pour reservé chambre*"           );
            System.out.println("*                                                  *");
            System.out.println("*           Tapez 4 Pour libre chambre   *"          );
            System.out.println("*           Tapez 5 imprime				   *"          );
            System.out.println("*                                                  *");
            System.out.println("*           Tapez 0 Pour quitter                   *");
            System.out.println("*                                                  *");
            System.out.println("*                                                  *");
            System.out.println("****************************************************");

            System.out.println("Entrez votre choix ");
            choix = sc.nextInt();
            switch (choix){

                case 1 :
                    chm.AffichDescript(tabDescrip);
                    break;


                case 2 :
                    //------------------
                    System.out.println("entre num ch" );
                    ho.AffichCh2(tabPrix,tabDescrip);
                    //-----------
                    break;

                case  3 :

                    break;

                case 4 :

                    break;
                case 5 :


                    break;
                case 0:
                    break lablet;

            }
    }
}}
