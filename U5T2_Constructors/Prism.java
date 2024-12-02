
public class Prism {
    int length;
    int width;
    int height;
    int volume;
    int surfaceArea;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

    public void setLength(int length) {
        this.length = length;

    }

    public void setWidth(int width) {
        this.width = width;

    }
     
    public void setHeight(int height) {
        this.height = height;

    }

    public String dimensions() {
        return "Length = " + length + "\n" + "Width = " + width + "\n" + "height = " + height;
    }

    public int volume() {
        volume = length * width * height;
        return volume;

    }

    public int surfaceArea() {
        surfaceArea = 2 * length * width + 2 * width * height + 2 * length * height;
        return surfaceArea;
    }

    public void cube(int side) {
        length = side;
        width = side;
        height = side;

    }

    public void random() {
        length = (int) (Math.random() * 91 + 10);
        width = (int) (Math.random() * 91 + 10);
        height = (int) (Math.random() * 91 + 10);

    }

}
