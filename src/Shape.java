enum  Shape {
    ROUND,
    SQUARE,
    STAR,
    FIGUARE,
    OTHER;
}
class Star extends ElcaToy{
    Star(String name,Colour colour) {
        super(name, colour, Shape.STAR);
    }
}

class Round extends ElcaToy{
    public Round(String name, Colour colour){
        super(name,colour,Shape.ROUND);
    }
}

class Figuare extends ElcaToy{
    @Override
    public String toString() {
        return "Figuare{" +
                "isFiguareOfMen=" + isFiguareOfMen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Figuare figuare = (Figuare) o;

        return isFiguareOfMen == figuare.isFiguareOfMen;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isFiguareOfMen ? 1 : 0);
        return result;
    }

    private  boolean isFiguareOfMen;

    public Figuare(String name, Colour colour, boolean isFiguareOfMen){
        super(name,colour,Shape.FIGUARE);
    }
}
