import java.util.*;

public class MyRectangle2D {
    private double x, y, width, height;
    
    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }
    
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    // Getters and setters
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    
    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }
    
    public boolean contains(double x, double y) {
        return x >= this.x - width/2 && x <= this.x + width/2 &&
               y >= this.y - height/2 && y <= this.y + height/2;
    }
    
    public boolean contains(MyRectangle2D r) {
        double left1 = x - width/2, right1 = x + width/2;
        double top1 = y + height/2, bottom1 = y - height/2;
        double left2 = r.x - r.width/2, right2 = r.x + r.width/2;
        double top2 = r.y + r.height/2, bottom2 = r.y - r.height/2;
        
        return left2 >= left1 && right2 <= right1 && 
               bottom2 >= bottom1 && top2 <= top1;
    }
    
    public boolean overlaps(MyRectangle2D r) {
        double left1 = x - width/2, right1 = x + width/2;
        double top1 = y + height/2, bottom1 = y - height/2;
        double left2 = r.x - r.width/2, right2 = r.x + r.width/2;
        double top2 = r.y + r.height/2, bottom2 = r.y - r.height/2;
        
        return left1 < right2 && right1 > left2 && 
               bottom1 < top2 && top1 > bottom2;
    }
    
    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0], maxX = points[0][0];
        double minY = points[0][1], maxY = points[0][1];
        
        for (int i = 1; i < points.length; i++) {
            minX = Math.min(minX, points[i][0]);
            maxX = Math.max(maxX, points[i][0]);
            minY = Math.min(minY, points[i][1]);
            maxY = Math.max(maxY, points[i][1]);
        }
        
        double width = maxX - minX;
        double height = maxY - minY;
        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        
        return new MyRectangle2D(centerX, centerY, width, height);
    }
    
    public static void main(String[] args) {
        // Test 1
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Contains (3,3): " + r1.contains(3, 3));
        System.out.println("Contains rectangle: " + 
            r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("Overlaps rectangle: " + 
            r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
            
        // Test 2
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points:");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        input.close();
        
        MyRectangle2D bounds = getRectangle(points);
        System.out.printf("The bounding rectangle's center (%.1f, %.2f), width %.1f, height %.2f%n",
            bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
    }
}
