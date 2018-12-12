import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ElcaToy toy = new Round("Кружок", Colour.RED);
        Figuare dedMoroz = new Figuare("дед мороз", Colour.RED, true);
        Star star1 = new Star("Звезда", Colour.WHITE);
        ElcaToy star2 = new Star(" звезда 2", Colour.BLACK);
        Elca elca = new Elca("елка");
        elca.addToy(toy);
        elca.addToy(dedMoroz);
        elca.addToy(star1);
        elca.addToy(star2);
        System.out.println(elca.countToysOfColour(Colour.BLACK));
        Collections.sort(elca.getToys());


        Comparator<ElcaToy> coloursComparator = new Comparator<ElcaToy>() {
            @Override
            public int compare(ElcaToy o1, ElcaToy o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null && o2 != null) {
                    return -1;
                }
                return o1.getColour().compareTo(o2.getColour());
            }
        };
        Collections.sort(elca.getToys(), coloursComparator);
    }
}
