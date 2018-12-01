package furniture;

public class Furniture
{
    private int length = 0;
    private int height = 0;
    private int width = 0;
    private String material;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
