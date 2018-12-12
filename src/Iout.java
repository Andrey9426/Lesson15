interface Iout {
    void justPrint();
}
class Printer implements Iout{
    public void justPrint(){
        System.out.println("Printer print");
    }
}
class Runnet {
    public static void main(String[] args) {
        Printer printer =new Printer();
        printer.justPrint();
        PaperPrinter pp = new PaperPrinter();
        pp.justPrint();


        Iout paperPrinter =new Iout() {
            @Override
            public void justPrint() {

                System.out.println("paper print");
                }
            };
            paperPrinter.justPrint();
        }
    }

class PaperPrinter implements Iout{
   public void justPrint(){
        System.out.println("paper printer");
    }
}
