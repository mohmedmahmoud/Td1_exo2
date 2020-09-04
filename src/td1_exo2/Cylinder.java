package td1_exo2;

public class Cylinder extends Cercle {
    double hauteur;
    Cylinder(double x,double y,double r,double h ){
        super(x, y, r);
        hauteur=h;
    }
    void Volume(){
        System.out.println("Volume: "+getSurface()*hauteur);
    }
    public String Tostring() {
        return super.Tostring() + " hauteur " + hauteur;
    }
    
}
