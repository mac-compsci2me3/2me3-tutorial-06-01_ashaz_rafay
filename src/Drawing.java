public final class Drawing 
{
    private static Drawing instance;
    // public Shape shape;

    private Drawing()
    {
        
    }

    public static Drawing getInstance()
    {
        if (instance == null) 
        {
            instance = new Drawing();
        }
        return instance;
    }

    public void drawShape(Shape shape)
    {
        if (shape instanceof Square) 
        {
            System.out.println("Drawing a Square with color: " + shape.getColor() + " and area: " + shape.calculateArea());
        }
        else
        {
            System.out.println("Drawing a Circle with color: " + shape.getColor() + " and area: " + shape.calculateArea());
        }
    }
}
