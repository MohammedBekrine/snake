public class main {
    public static void main(String[] args) {
        //creo l'oggetto snake con delle coordinate che aumentano in maniera costante in base alla freccia premuta
        snake s = new snake();
        //creo l'oggetto mela con delle coordinate random
        mela m = new mela(20, 20);
        //creo l'oggetto game

        m.generateNewPosition(20,20);
        System.out.println(m.getPosition());
    }
    
}