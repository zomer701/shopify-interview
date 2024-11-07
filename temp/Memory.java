package temp;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private int x;

    private int y;

    private String turn;

    private String cardinate;

    private static Map<String, String> cardinatesMemo = new HashMap<>();

    static {
        cardinatesMemo.put("North-L", "West");
        cardinatesMemo.put("North-R", "East");

        cardinatesMemo.put("West-L", "South");
        cardinatesMemo.put("West-R", "North");

        cardinatesMemo.put("South-L", "East");
        cardinatesMemo.put("South-R", "West");

        cardinatesMemo.put("East-L", "North");
        cardinatesMemo.put("East-R", "South");

    }
    public Memory() {
        this.x = 0;
        this.y = 0;
        this.turn = "R";
        this.cardinate = "North";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getCardinate() {
        return cardinate;
    }

    public void setCardinate(String cardinate) {
        this.cardinate = cardinate;
    }

    public void changeTurn(String turn) {
        String car = getCardinate();
        setCardinate(cardinatesMemo.get(car + "-" + turn));
    }
}
