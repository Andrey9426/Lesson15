import java.awt.*;
 enum Colour {
    BLACK("black"), RED("red"), BLUE("blue"),WHITE("while");



    private String name;

    private  Colour(String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
