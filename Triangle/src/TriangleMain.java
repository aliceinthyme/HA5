public class TriangleMain {
    public static void main(String[] args) throws Exception {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        int x3 = Integer.parseInt(args[4]);
        int y3 = Integer.parseInt(args[5]);

        Triangle tri = new Triangle(x1,y1,x2,y2,x3,y3);

        tri.printCoords();

        System.out.println(tri.getCirc());

        System.out.println(tri.getSurfArea()); 

        tri.translate(5, 5);
        tri.printCoords();

        tri.stretch(5, 5, 5);
        tri.printCoords();
    }
}
