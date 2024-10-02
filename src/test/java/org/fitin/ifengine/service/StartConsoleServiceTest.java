package org.fitin.ifengine.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class StartConsoleServiceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private BlockService blockService;
    private StartConsoleService startConsoleService;

    @BeforeEach
    void beforeEach() {
        System.setOut(new PrintStream(outContent));
        blockService = mock(BlockService.class);
        startConsoleService = new StartConsoleService(blockService);
    }

    @AfterEach
    void afterEach() {
        System.setOut(originalOut);
    }

    @Test
    public void testExec() {
        String expectedOutput = "Mocked Console Start";
        when(blockService.getStartConsole()).thenReturn(expectedOutput);

        startConsoleService.exec();

        verify(blockService).getStartConsole();

        String output = outContent.toString();
        assertTrue(output.contains(expectedOutput));
    }

}
