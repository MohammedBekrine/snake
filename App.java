public class App {

    static int Width = 10;
    static int Height = 10;

    public static void main(String[] args) {
        //creo l'oggetto snake con delle coordinate che aumentano in maniera costante in base alla freccia premuta
        snake s = new snake();
        //creo l'oggetto mela con delle coordinate random
        mela m = new mela(Width, Height);
        //creo l'oggetto game

        m.generateNewPosition(Width, Height);
        System.out.println(m.getPosition());

        for (int i = 0; i < Width; i++) {
            for (int j = 0; j < Height; j++) {
                if(i == m.getPosition().x && j == m.getPosition().y)
                {
                    System.out.print("x");}
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}