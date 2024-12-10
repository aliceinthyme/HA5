public class Triangle {
    private Point a = null;
    private Point b = null;
    private Point c = null;
    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {  //it doesnt specifiy if I need to do any tests on these values?
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
    }
    public void translate(int x, int y) {      //translate triangle by x and y, negative values allowed
        a.setX(a.getX()+x);
        a.setY(a.getY()+y);
        b.setX(b.getX()+x);
        b.setY(b.getY()+y);
        c.setX(c.getX()+x);
        c.setY(c.getY()+y);
    }
    public void printCoords() {
        System.out.println("Point A: ("+a.getX()+","+a.getY()+")");
        System.out.println("Point B: ("+b.getX()+","+b.getY()+")");
        System.out.println("Point C: ("+c.getX()+","+c.getY()+")");
    }
    public double getSurfArea() {   //(1/2) |x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)| (overall formula)
        double area = a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY());   //x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)
        if(area < 0) {  //Betrag feststellen
            area = -area;
        }
        area /= 2;  // * 1/2
        return(area);
    }
    public double getCirc() {   //√ ( (x 2 - x 1 ) 2 + (y 2 - y 1 ) 2 ) (Distance between two points)
        double ab = ((a.getX()-b.getX()) * (a.getX()-b.getX())) + ((a.getY()-b.getY())*(a.getY()-b.getY()));
        ab = Math.sqrt(ab);
        double ac = ((a.getX()-c.getX()) * (a.getX()-c.getX())) + ((a.getY()-c.getY())*(a.getY()-c.getY()));
        ac = Math.sqrt(ac);
        double bc = ((b.getX()-c.getX()) * (b.getX()-c.getX())) + ((b.getY()-c.getY())*(b.getY()-c.getY()));
        bc = Math.sqrt(bc);
        double sum = ab + ac + bc;
        return(sum);

    }
    public void stretch(int x, int y, int k) { //get diff x and x1, mult diff by k, add diff to x1
        int diffa = (a.getX()-x)*k;
        a.setX(a.getX()+diffa);
        int diffay = (a.getY()-y)*k;
        a.setY(a.getY()+diffay);
        int diffb = (b.getX()-x)*k;
        b.setX(b.getX()+diffb);
        int diffby = (b.getY()-y)*k;
        b.setY(b.getY()+diffby);
        int diffc = (c.getX()-x)*k;
        c.setX(c.getX()+diffc);
        int diffcy = (c.getY()-y)*k;
        c.setY(c.getY()+diffcy);
    }   //idk I think this is correct? My brain doesnt do spacial stuff well, so there is genuinely no way for me to process this properly
}
