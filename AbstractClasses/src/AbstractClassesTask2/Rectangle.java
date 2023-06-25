package AbstractClassesTask2;

class Rectangle extends Figure
{
    private float width;
    private float height;

    Rectangle(float x, float y){

        super(x,y);
        this.width = x;
        this.height = y;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }

    public void display(){

        System.out.printf("Периметр: %.2f \t Площадь: %.2f \n", getPerimeter(), getArea());
    }
}