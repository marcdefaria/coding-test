package com.ooyala.jloc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileCounterAppTest {

    @Test
    public void simpleFolder() {

        assertEquals(2, FileCounterApp.countFiles("src/test/resources/filecount-simple"));
    }

}
