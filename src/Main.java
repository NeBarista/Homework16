public class Main {
    public static void main(String[] args) {
        triangleTypeCheck(40, 60, 100);
        triangleTypeCheck(47, 27, 37);
        triangleTypeCheck(62, 18, 100);
        triangleTypeCheck(34, 50, 96);
        triangleTypeCheck(23, 27, 37);
        triangleTypeCheck(56, 27, 97);
        triangleTypeCheck(90, 90, 90);
        triangleTypeCheck(98, 2, 80);
        triangleTypeCheck(23, 27, 37);
    }
    public static void triangleTypeCheck(int corner1, int corner2, int corner3) {
        if (corner1 > 0 && corner1 < 180 && corner2 > 0 && corner2 < 180 && corner3 > 0 &&
                corner3 < 180 && corner1 + corner2 + corner3 == 180) {
            if (corner1 > 90 || corner2 > 90 || corner3 > 90) {
                println("obtuse angle");
            }
         else if (corner1 == corner2 && corner2 == corner3) {
            println("equilateral");
        } else if (corner1 == corner2 || corner1 == corner3 || corner2 == corner3) {
            println("rectangular");
        } else if (corner1 == corner2 || corner1 == corner3 || corner2 == corner3) {
            println("isosceles");
        } else
            println("acute - angled");
    }else
                println("not defined");

    }
    public static void println(String text) {
        System.out.println(text);
    }
}