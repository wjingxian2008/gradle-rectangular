public class Rectangular {

    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public long getArea() {
        return this.length * this.width;
    }

}
