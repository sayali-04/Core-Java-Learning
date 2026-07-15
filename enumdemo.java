public class enumdemo {
    public static void main(String[] args) {
        Direction d=Direction.NORTH;
        System.out.println(d.getDegrees());
    }
}

enum Direction{
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);


    private int degrees;

    Direction(int degrees){
        this.degrees=degrees;
    }

    public int getDegrees(){
        return degrees;
    }
}
