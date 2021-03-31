package com.company;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
public class LibraryTest {
   @Test
    public void testcases() {
        Library searchBook = new Library();
        int actual_result = searchBook.searchForBook("Merry Poppins");
        assertEquals(LibraryTestData.expectedResult, actual_result);

    }


}

