class Rectangle extends MyRectangleClassProgram
{
	// Length of this rectangle.
    // Width of this rectangle.
    private double length; // Length of this rectangle
    private double width; // Width of this rectangle

    // Write set methods here.
    public void setLength(double len)
    {
        length = len;
    }
    public void setWidth(double wid)
    {
        width = wid;
    }

    // Write get methods here.
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }

    // Write the calculatePerimeter() and
    // calculateArea() methods here.
    public double calculatePerimeter()
    {
        return (2 * (width + length));
    }
    public double calculateArea()
    {
        return(length * width);
    }
	
}
