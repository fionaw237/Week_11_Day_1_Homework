import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 1000);
    }

    @Test
    public void hasSheets(){
        int sheets = printer.getSheets();
        assertEquals(100, sheets);
    }

    @Test
    public void ableToPrintIfEnoughPaper(){
        boolean ableToPrint = printer.isAbleToPrint(10, 2);
        assertEquals(true, ableToPrint);
    }

    @Test
    public void notAbleToPrintIfNotEnoughPaper(){
        boolean ableToPrint = printer.isAbleToPrint(51, 2);
        assertEquals(false, ableToPrint);
    }

    @Test
    public void printReducesSheetsByCopiesTimesPages(){
        printer.print(10, 3);
        assertEquals(70, printer.getSheets());
    }

    @Test
    public void doesntPrintIfNotAbleTo(){
        printer.print(10, 11);
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canRefillPrinter(){
        printer.print(10, 3);
        printer.refill();
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner(){
        int toner = printer.getToner();
        assertEquals(1000, toner);
    }

    @Test
    public void printReducesTonerBy1PerPage(){
        printer.print(10, 3);
        int newToner = printer.getToner();
        assertEquals(970, newToner);
    }
}
