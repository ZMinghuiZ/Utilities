package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {

    //3 part format
    //methodBeingTested_conditionToTest_expectedOutcome
    @Test
    void splitString_onrSeparator_expectTwoParts() throws InvalidStringInputException {
        //setup
        StringParser sp = new StringParser();
        String str = "Hello|World";
        String separator = "\\|";
        ArrayList<String> stringParts = sp.splitString(str, separator);

        //actual test
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullString_expectException() {
        //setup
        StringParser sp = new StringParser();
        String str = null;
        String separator = "\\|";

        //assertEquals(3, stringParts.size());
        //actual test
        assertThrows(InvalidStringInputException.class, () -> sp.splitString(str, separator));
    }
}
