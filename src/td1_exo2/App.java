
package td1_exo2;

import java.util.Scanner;
public class App {

    public static void afficher(int[] t) {
        System.out.print("table : ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws Exception {
      //EXO 2
        // Complexe c1 = new Complexe(3, 2);
        // Complexe c2 = new Complexe(1, 5);
        // c1.tostring();
        // c2.tostring();
        // Complexe.Ajouter(c1, c2);
        // Complexe.Sustraire(c1, c2);

        // //EXO 3
        // Scanner input =new Scanner(System.in);
        // Rectangle R=new Rectangle();
        // System.out.println("longuer ?");
        // R.setLong(input.nextDouble());
        // System.out.println("largueur ?");
        // R.setLarg(input.nextDouble());
        // R.Aire();
        // R.Perimetre();
       

        //EXO6 
       //Q7
       //la methode main()  affichera : Position (1,1,rayon=3)

       //Pour TESTer
     Forme f=new Forme();
     System.out.println(f.Tostring());
     Cercle c1=new Cercle();
     Cercle c2=new Cercle(1,1,3);
     System.out.println(c1.Tostring());
     System.out.println(c2.Tostring());
     c1.isBigger(c2);
     c2.isBigger(c1);
     c2.isBigger(c2,c1);
     Cercle.isBigger(c1, c2);
     System.out.println(c2.getSurface());
     


    }
}


    // public int [] opposer (int [] t ) {
    // if( t.length>0){
    // int[] v;
    // v[0]=t[t.length-1];
    // opposer(t)
    // }
    // return v;
    // }

    // }

// Point p1 = new Point () ;
// p1 . x = 1;
// p1 . y = 2;
// Point p2 = new Point () ;
// p2 . x = 1;
// p2 . y = 2;
// if ( p1 == p2 ) {
// System . out . println ("p1␣==␣p2") ;
// } else {
// System . out . println ("p1␣!=␣p2") ;
// }
// p1 = p2 ;
// if ( p1 == p2 ) {
// System . out . println ("p1␣==␣p2") ;
// } else {
// System . out . println ("p1␣!=␣p2") ;
// }
// p2 . x = 5;
// p2 . y = 10;
// System . out . println ( p1 . x + "␣" + p1 . y ) ;

// int[] mytable={1,2,9,1};
// afficher(mytable);
// int[] tab=opposer(mytable);

// class Point {
// public int x ;
// public int y ;

// }
