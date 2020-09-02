package td1_exo2;

public class Rectangle {
    private double largueur;
    private double longeur;
    //Constricteur
    Rectangle(){

    }
    Rectangle(double longeur ,double largueur ){
        this.largueur = largueur;
        this.longeur = longeur;
    }
    Rectangle(Rectangle R){
        longeur=R.longeur;
        largueur=R.largueur;
    }
    //get
    double getLong(){
        return longeur;
    }
    double getLarg(){
        return largueur;
    }

    //set
    void setLong(double longeur){
        this.longeur = longeur;
    }
    void setLarg(double largueur){
        this.largueur = largueur;
    }

    void Perimetre(){
        System.out.println("Perimetre: "+(2*(longeur+largueur)));
    }

    void Aire(){
        System.out.println("Surface: "+(longeur*largueur));
    }
    void isCarre(){
        if(longeur==largueur){
        System.out.println("C' est un carre ");
        }else{
            System.out.println("Ce n' est pas un carre "); 
        }
    }
    void ToString(){
        System.out.println("Longeur: "+longeur);
        System.out.println("Largueur: "+largueur);
    }
    

}
