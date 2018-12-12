import java.awt.*;

abstract class ElcaToy implements Comparable<ElcaToy> {
    private String name;
    private Colour colour;
    private Shape shape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Shape getShape() {
        return shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElcaToy elcaToy = (ElcaToy) o;

        if (name != null ? !name.equals(elcaToy.name) : elcaToy.name != null) return false;
        if (colour != elcaToy.colour) return false;
        return shape == elcaToy.shape;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElcaToy{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", shape=" + shape +
                '}';
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public ElcaToy(String name, Colour colour, Shape shape) {

        this.name = name;
        this.colour = colour;
        this.shape = shape;
    }
    @Override
    public int compareTo(ElcaToy toy){
        return this.name.compareTo(toy.name);
    }
}

