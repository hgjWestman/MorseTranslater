package MorseTranslater.Test;

import org.junit.Test;
import MorseTranslater.TranslateMorse;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;



public class MorseTest {

    @Test
    public void fromPlainTextToMorse() {
        // See if translation plain text to morse works

        //Arrange
        TranslateMorse translation = new TranslateMorse();


        String expected = "- **** * / --*- **- ** -*-* -*- / -*** *-* --- *-- -* / **-* --- -**- / *--- **- -- *--* *** / --- ***- * *-* / - **** * / *-** *- --** -*-- / -** --- --* ";

        //Act
        String actual = translation.input("The quick brown fox jumps over the lazy dog");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void fromMorseToPlainText() {
        // See if translation morse to plain text works

        //Arrange
        TranslateMorse translation = new TranslateMorse();

        String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        //Act
        String actual = translation.input("- **** * / --*- **- ** -*-* -*- / -*** *-* --- *-- -* / **-* --- -**- / *--- **- -- *--* *** / --- ***- * *-* / - **** * / *-** *- --** -*-- / -** --- --* ");

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void invaildCharacter() {
        // See if unknown character triggers an error

        //Arrange
        TranslateMorse translation = new TranslateMorse();

        String expected = "\"Ö\" is not a supported character";

        //Act
        String actual = translation.input("KALL ÖL");

        //Assert
        assertEquals(expected, actual);
    }
    @Test

    public void invaildMorseCode() {
        // See if unknown morse code triggers an error

        //Arrange
        TranslateMorse translation = new TranslateMorse();

        String expected = "\"***----\" is not a supported morse code";

        //Act
        String actual = translation.input("***----");

        //Assert
        assertEquals(expected, actual);
    }
}
