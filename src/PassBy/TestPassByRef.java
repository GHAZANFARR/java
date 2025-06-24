package PassBy;

public class TestPassByRef {

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Point point  = new Point(4,8);
        System.out.println("first" + point);
        move(point); //reference passing changes the values
        System.out.println("first" + point);
    }

    public static void move(Point p){
        p.y++;
        p.x++;
    }


}

