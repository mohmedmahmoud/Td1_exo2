
package td1_exo2;

public class App {
    public static void main(String[] args) throws Exception {
        
        Complexe c1 = new Complexe(3, 2);
        Complexe c2 = new Complexe(1, 5);
        c1.tostring();
        c2.tostring();
        Complexe.Ajouter(c1, c2);
        Complexe.Sustraire(c1, c2);
    }
}
