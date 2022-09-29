import java.io.*;
import java.util.*;
import java.lang.Math;

class Points
{
    public float x;
    public float y;
}

public class Boomerang {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Points[] points = new Points[3];

        points[0] = new Points();
        points[1] = new Points();
        points[2] = new Points();

        for(int i = 0; i < 3; i++)
        {
            points[i].x = scn.nextInt();
            points[i].y = scn.nextInt();
        }
        if(Float.compare(points[0].x, points[1].x) == 0 && Float.compare(points[1].x, points[2].x) == 0 && Float.compare(points[0].y, points[1].y) == 0 && Float.compare(points[1].y, points[2].y) == 0)            
        {
            System.out.println("false");
            return;
        } 

        float m1 = Math.abs((points[0].y - points[1].y)/(points[0].x - points[1].x));
        float m2 = Math.abs((points[0].y - points[2].y)/(points[0].x - points[2].x));

        if (m1 == m2)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
