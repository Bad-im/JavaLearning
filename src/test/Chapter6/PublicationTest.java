package test.Chapter6;

import Chapter6.Book;
import Chapter6.Magazine;
import Chapter6.Textbook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PublicationTest {

    private Book book;
    private Magazine magazine;
    private Textbook textbook;

    @BeforeEach
    public void setUp() {
        book = new Book();
        magazine = new Magazine();
        textbook = new Textbook();
    }

    @Test
    public void testBookMethods() {
        book.createContract();
        book.editPublication();
        book.layoutPublication();
        book.sendToPrint();
        book.cancelPublication();
        book.payForPublication();
        book.resumePublication();
        book.closePublication();

        // Здесь можно добавить проверки, например, с использованием моков или других механизмов
        // для проверки вызовов методов, если они взаимодействуют с другими классами.
    }

    @Test
    public void testMagazineMethods() {
        magazine.createContract();
        magazine.editPublication();
        magazine.layoutPublication();
        magazine.sendToPrint();
        magazine.cancelPublication();
        magazine.payForPublication();
        magazine.resumePublication();
        magazine.closePublication();

        // Аналогично, можно добавить проверки.
    }

    @Test
    public void testTextbookMethods() {
        textbook.createContract();
        textbook.editPublication();
        textbook.layoutPublication();
        textbook.sendToPrint();
        textbook.cancelPublication();
        textbook.payForPublication();
        textbook.resumePublication();
        textbook.closePublication();

        // Аналогично, можно добавить проверки.
    }
}
