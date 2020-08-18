package td1_exo2;

public class Complexe {
    private double partieReel;
    private double partieImaginnaire;

    Complexe() {

    }

    Complexe(double pReel, double pImag) {
        partieImaginnaire = pImag;
        partieReel = pReel;
    }

    Complexe(Complexe C) {
        partieImaginnaire = C.partieImaginnaire;
        partieReel = C.partieReel;
    }

    double getPReel() {
        return partieReel;
    }

    double getPImaginnaire() {
        return partieImaginnaire;
    }

    void setPReel(double pReel) {
        partieReel = pReel;
    }

    void setImaginnaire(double pImag) {
        partieImaginnaire = pImag;
    }

    void tostring(){
        System.out.println(getPReel()+" + "+getPImaginnaire()+"i");
    }
    static void Ajouter(Complexe c1,Complexe c2){
        double nReel=c1.partieReel+c2.partieReel;
        double nImaginaire=c1.partieImaginnaire+c2.partieImaginnaire;
        System.out.println(nReel+" + "+nImaginaire+"i");
    }
    static void Sustraire(Complexe c1,Complexe c2){
        double nReel=(c1.partieReel*c2.partieReel)-(c1.partieImaginnaire*c2.partieImaginnaire);
        double nImaginaire=(c1.partieReel*c2.partieImaginnaire)+(c2.partieReel*c1.partieImaginnaire);
        System.out.println(nReel+" + "+nImaginaire+"i");
    }
}