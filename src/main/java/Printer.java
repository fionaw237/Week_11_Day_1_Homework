public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }

    public boolean isAbleToPrint(int pages, int copies){
        return pages * copies <= this.sheets;
    }

    public void print(int pages, int copies){
        if (isAbleToPrint(pages, copies)){
            useSheets(pages, copies);
            useToner(pages, copies);
        }
    }

    public void useSheets(int pages, int copies){
        this.sheets -= pages * copies;
    }

    public void useToner(int pages, int copies){
        this.toner -= pages * copies;
    }

    public void refill(int newSheets){
        this.sheets += newSheets;
    }
}
