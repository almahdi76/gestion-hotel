package beans;

public class chambre {
    private int numeroChambre;
    private int categorie;
    private int nbPersonnes;

    // methodes de la classe
    public chambre(int numCh, int catg, int np) {
        this.numeroChambre =numCh;
        this.categorie=catg;
        this.nbPersonnes=np;
    }

    public int DonnerNumero(){
        return this.numeroChambre;
    } ;

    public int DonnerCateg(){
        return this.categorie;
    } ;

    public int DonnerNbPers(){
        return this.nbPersonnes;
    } ;

    public int DonnerPrix(int tabPrix[][]){
        return ( tabPrix[nbPersonnes-1][categorie-1] );
    } ;

    public void AffichDescript(String tabDescript[]){
        System.out.println("Description : "+tabDescript[categorie-1] ) ;
    } ;

}
