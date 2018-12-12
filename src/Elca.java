import java.util.ArrayList;
import java.util.List;

public class Elca {
    @Override
    public String toString() {
        return "Elca{" +
                "name='" + name + '\'' +
                ", toys=" + toys +
                '}';
    }

    private String name;
    private List<ElcaToy> toys= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElcaToy> getToys() {
        return toys;
    }

    public void setToys(List<ElcaToy> toys) {
        this.toys = toys;
    }

    public Elca(String name, List<ElcaToy> toys) {

        this.name = name;
        this.toys = toys;
    }

    public Elca(String name) {
        this.name = name;
    }
    public void addToy(ElcaToy toy){
        toys.add(toy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elca elca = (Elca) o;

        if (name != null ? !name.equals(elca.name) : elca.name != null) return false;
        return toys != null ? toys.equals(elca.toys) : elca.toys == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (toys != null ? toys.hashCode() : 0);
        return result;
    }

    public int countToysOfColour(Colour colour){
        int counter =0 ;
        for(ElcaToy toy: toys){
            if(colour ==toy.getColour()){
                counter++;
            }
        }return counter;
    }
}
