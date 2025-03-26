class Point {
    private int x, y;

    // Constructeur avec 'this'
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("Coordonnées: " + x + " " + y);
    }

    public static Point normeMax(Point p1, Point p2) {
        return (p1.norme() > p2.norme()) ? p1 : p2;
    }

    public Point normeMax(Point autre) {
        return (this.norme() > autre.norme()) ? this : autre;
    }

    private double norme() {
        return Math.max(Math.abs(x), Math.abs(y));
    }

    public void homothetie(double facteur) {
        this.x *= facteur;
        this.y *= facteur;
    }

    public void rotation(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = (int) Math.round(newX);
        this.y = (int) Math.round(newY);
    }

    public double rho() {
        return Math.sqrt(x * x + y * y);
    }

    public double theta() {
        return Math.atan2(y, x);
    }

    public void afficherCartesien() {
        System.out.println("Coordonnées cartésiennes: (" + x + ", " + y + ")");
    }

    public void afficherPolaire() {
        System.out.println("Coordonnées polaires: (rho = " + rho() + ", theta = " + theta() + ")");
    }

}