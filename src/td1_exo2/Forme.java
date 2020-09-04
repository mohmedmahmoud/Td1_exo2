package td1_exo2;

public class Forme {
    double x,y;
    Forme(){
    }
    Forme(double x,double y){
        this.x=x;
        this.y=y;
    }
    public String Tostring(){
        return "Position: ("+x+" + "+y+" )";
    }
}
