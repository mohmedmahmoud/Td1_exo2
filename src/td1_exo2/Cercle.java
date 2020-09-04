package td1_exo2;

public class Cercle extends Forme {
    final static double PI = 3.14;
    private double rayon;
    private double Surface;
    Cercle() {
        rayon = 0;
    }
    
    public String Tostring() {
        return super.Tostring() + " rayon: " + rayon;
    }

    // EXO3 Q2
    Cercle(double x, double y, double r) {
        super(x, y);
        rayon = r;
    }

   // EXO3 Q2
    void setRayon(double r) {
        rayon = r;
    }

    double getRayon() {
        return rayon;
    }

    
    double getSurface() {
        return Surface=rayon*rayon*PI;
    }

    void setSurface(double s) {
        Surface = s;
    }
    public  void isBigger(Cercle C1){
        if(rayon>C1.rayon){
            System.out.println("Vrai");
        }
    }
    public static void isBigger(Cercle C1,Cercle C2){
        if(C1.rayon>C2.rayon){
            System.out.println("Vrai");
        }
    }



}

// EXO3 Q1
// les variable d'instance de la classe Forme que la classe Cercle hérite
// sont x ,y et la methode Tostring
