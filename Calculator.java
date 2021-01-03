import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.assertEquals;

public class Calculator {

    @Test
    public void Addition1() {
        Library library = new Library();
        int sum = library.add(10, 30);
        assertEquals(40, sum);
    }

    @Test
    public void Addition2() {
        Library library = new Library();
        int sum = library.add(5, 4);
        assertEquals(30, sum);

    }

    @Test
    public void Addition3() {
        Library library = new Library();
        assertEquals("error in add()", 4, library.add(1, 2));
    }

    @Test
    public void Addition4() {
        Library library = new Library();
        assertEquals("test pass()", 8, library.add(4, 4));

    }

    @Test
    public void Subtraction1() {
        Library library = new Library();
        assertEquals("test pass()", 0, library.subtract(4, 4));

    }
    @Test
    public void Subtraction2() {
        Library library = new Library();
        assertEquals("error on subtraction()", 2, library.subtract(4, 4));

    }
    @Test
    public void Subtraction3() {
        Library library = new Library();
        assertEquals("test pass()", -2, library.subtract(0, 2));

    }
    @Test
    public void Subtraction4() {
        Library library = new Library();
        assertEquals("error on subtraction()", 10, library.subtract(4, 4));

    }
    @Test
    public void Multiplication1() {
        Library library = new Library();
        assertEquals("error on multiplication()", 0, library.multiply(4, 4));

    }
    @Test
    public void Multiplication2() {
        Library library = new Library();
        assertEquals("test pass()", 6, library.multiply(2, 3));

    }
    @Test
    public void Multiplication3() {
        Library library = new Library();
        assertEquals("error on multiplication()", 10, library.multiply(4, 4));

    }
    @Test
    public void Multiplication4() {
        Library library = new Library();
        assertEquals("test pass()", 16, library.multiply(4, 4));

    }
    @Test
    public void Division1() {
        Library library = new Library();
        assertEquals("test pass()", 1, library.divide(4, 4));

    }
    @Test
    public void Division2() {
        Library library = new Library();
        assertEquals("error on division()", 2, library.divide(4, 4));

    }
    @Test
    public void Division3() {
        Library library = new Library();
        assertEquals("error on division()", 0, library.divide(4, 4));

    }
    @Test
    public void Division4() throws Exception {
        Library library = new Library();
        Assert.assertEquals(5, library.add(2,4));
    }
}