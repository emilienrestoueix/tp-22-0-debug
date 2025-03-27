package TP3.exo11;

class Point
{
    public void initialise (int x, int y) {
        this.x = x ;
        this.y = y ;
    }
    public void deplacee(int dx, int dy) {
        x += dx ;
        y += dy ;
    }
    public int getX() {
        return x ;
    }
    public int getY() {
        return y ;
    }
    private int x, y ;

    public static void main(String[] args) {
        Point point = new Point();
        point.initialise(0, 5);
        point.deplacee(5,5);

        PointA pointA = new PointA();
        pointA.afficher(point);
    }
}
