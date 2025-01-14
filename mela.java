import java.awt.Point;
import java.util.Random;

public class mela {
    private Point position;  // Posizione della mela sulla griglia

    public mela(int boardWidth, int boardHeight) {
        generateNewPosition(boardWidth, boardHeight);
    }

    public Point getPosition() {
        return position;
    }

    public void generateNewPosition(int Width, int Height) {
        Random random = new Random();
        int x = random.nextInt(Width);
        int y = random.nextInt(Height);
        position = new Point(x, y);
    }
}
