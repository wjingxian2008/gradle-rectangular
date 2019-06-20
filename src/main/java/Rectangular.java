public class Rectangular {

    private long length;
    private long width;

    public Rectangular(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public long getArea() {
        return this.length * this.width;
    }

}
