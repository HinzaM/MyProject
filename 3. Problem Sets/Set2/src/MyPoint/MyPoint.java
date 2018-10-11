package MyPoint;

public class MyPoint {

    //1. private variables
    private double xVal,yVal;

    //2. no-argument/ default value
    public MyPoint()
    {
        this.xVal = 0;
        this.yVal = 0;
    }

    //3. argument constructor
    public MyPoint(double xVal, double yVal)
    {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    //4. accessor
    public void setX(double xVal) { this.xVal = xVal; }
    public void setY(double yVal) {this.yVal = yVal; }

    //5. mutator
    public double getX() {return this.xVal;}
    public double getY() {return this.yVal;}

    //6. toString method
    public String toString()
    {
        return "(" + getX() + " , " + getY() + ")" ;
    }


    //7. moveHorizontally method
    public void moveHorizontally(double xVal)
    {
        this.xVal += xVal;
    }
    //8. moveVertically method
    public void moveVertically(double yVal)
    {
        this.yVal += yVal;
    }

    //9. translate method
    public void translate(double xVal, double yVal)
    {
        moveHorizontally(xVal);
        moveVertically(yVal);
    }


    //10. distance ab where a(_xVal,_yVal) b(xVal,yVal)
    public double distanceFromOrigin ()
    {
        double xDiff = xVal;
        double yDiff = yVal;
        return Math.sqrt( (xDiff * xDiff) + (yDiff * yDiff) );
    }

}
