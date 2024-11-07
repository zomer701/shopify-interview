package temp;

public class Moving {
    private final Memory memory;

    public Moving(Memory memory) {
        this.memory = memory;
    }


    public void execute() {
        // validation
        String cardinate = memory.getCardinate();

        if (cardinate.equals("North")) {
            int move = memory.getY()+1;
            memory.setY(move);
            return;
        }

        if (cardinate.equals("South")) {
            int move = memory.getY()-1;
            memory.setY(move);
            return;
        }

        if (cardinate.equals("West")) {
            int move = memory.getX()-1;
            memory.setX(move);
            return;
        }

        if (cardinate.equals("East")) {
            int move = memory.getX()+1;
            memory.setX(move);
        }
    }

    public void print() {
        System.out.printf("Robot at (%s, %s) facing %s", memory.getX(), memory.getY(), memory.getCardinate());
    }
}
