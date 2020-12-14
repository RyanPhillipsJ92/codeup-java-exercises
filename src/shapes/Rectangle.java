package shapes;

public class Rectangle {

    protected long length;
    protected long width;
    protected long area;


    public Rectangle (long length, long width){
    this.length = length;
    this.width = width;
    }

    public long  getArea(long length, long width){
        return length * width;
    }

    public long  getPerimeter(long length, long width){
        return length * 2 + width * 2;
    }

}
