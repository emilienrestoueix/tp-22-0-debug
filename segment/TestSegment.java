package segment;

public class TestSegment {

    public static void main(String[] args) {

        Segment segment = new Segment(Integer.parseInt(args[1]), Integer.parseInt(args[0]));
        System.out.println(segment.appartient(Integer.parseInt(args[2])));
    }
}
