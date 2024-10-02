package org.fitin.ifengine.service;

import org.fitin.ifengine.model.Game;
import org.fitin.ifengine.model.Info;
import org.fitin.ifengine.service.config.SymbolBind;
import org.fitin.ifengine.service.config.SymbolBindUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static org.fitin.ifengine.service.config.Symbol.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BlockServiceTest {
    private BlockService blockService;
    private Game game;
    private SymbolBind symbolBind;
    private SymbolBindUser symbolBindUser;

    public static Stream<Arguments> startConsoleSource() {


        return Stream.of(
                Arguments.of("""
                                """,
                        """
                                """,
                        """
                                """,
                        """
                                """,
                        """
                                $Press Press Press$$$$$"""),
                Arguments.of("""
                                1""",
                        """
                                """,
                        """
                                """,
                        """
                                """,
                        """
                                *1*****$Press Press Press$$$$$"""),
                Arguments.of("""
                                """,
                        """
                                2""",
                        """
                                """,
                        """
                                """,
                        """
                                !2!!!!!$Press Press Press$$$$$"""),
                Arguments.of("""
                                """,
                        """
                                """,
                        """
                                3""",
                        """
                                """,
                        """
                                #3#####$Press Press Press$$$$$"""),
                Arguments.of("""
                                """,
                        """
                                """,
                        """
                                """,
                        """
                                4""",
                        """
                                $4$$$$$"""),
                Arguments.of("""
                                1------------------
                                2""",
                        """
                                3------------------
                                4""",
                        """
                                5------------------
                                6""",
                        """
                                7------------------
                                8""",
                        """
                                *1------------------
                                2*****!3------------------
                                4!!!!!#5------------------
                                6#####$7------------------
                                8$$$$$"""),
                Arguments.of("""
                                
                                                                    ____  _     _        _                   _      _\s
                                     /\\                            / __ \\| |   | |      | |                 | |    | |
                                    /  \\   ___ _ __ ___  ___ ___  | |  | | | __| |      | |_   _ _ __   __ _| | ___| |
                                   / /\\ \\ / __| '__/ _ \\/ __/ __| | |  | | |/ _` |  _   | | | | | '_ \\ / _` | |/ _ \\ |
                                  / ____ \\ (__| | | (_) \\__ \\__ \\ | |__| | | (_| | | |__| | |_| | | | | (_| | |  __/_|
                                 /_/    \\_\\___|_|  \\___/|___/___/  \\____/|_|\\__,_|  \\____/ \\__,_|_| |_|\\__, |_|\\___(_)
                                                                                                        __/ |        \s
                                                                                                       |___/         \s
                                """,
                        """
                                Across Old Jungle!""",
                        """
                                New Amazing Game! About you about me and about cyborgs in the jungle!!!
                                Take gun, pig, umbrella and let's go to adventure!""",
                        """
                                Press Enter and joy""",
                        """
                                *
                                                                    ____  _     _        _                   _      _\s
                                     /\\                            / __ \\| |   | |      | |                 | |    | |
                                    /  \\   ___ _ __ ___  ___ ___  | |  | | | __| |      | |_   _ _ __   __ _| | ___| |
                                   / /\\ \\ / __| '__/ _ \\/ __/ __| | |  | | |/ _` |  _   | | | | | '_ \\ / _` | |/ _ \\ |
                                  / ____ \\ (__| | | (_) \\__ \\__ \\ | |__| | | (_| | | |__| | |_| | | | | (_| | |  __/_|
                                 /_/    \\_\\___|_|  \\___/|___/___/  \\____/|_|\\__,_|  \\____/ \\__,_|_| |_|\\__, |_|\\___(_)
                                                                                                        __/ |        \s
                                                                                                       |___/         \s
                                *****!Across Old Jungle!!!!!!#New Amazing Game! About you about me and about cyborgs in the jungle!!!
                                Take gun, pig, umbrella and let's go to adventure!#####$Press Enter and joy$$$$$""")
        );
    }

    @BeforeEach
    void beforeEach() {
        game = mock(Game.class);
        symbolBind = new SymbolBind();
        symbolBindUser = new SymbolBindUser();

        var map = Map.ofEntries(
                entry(SC_G_HEAD_SS, "*"),
                entry(SC_G_HEAD_FS, "**"),
                entry(SC_G_HEAD_SE, "***"),

                entry(SC_G_NAME_SS, "!"),
                entry(SC_G_NAME_FS, "!!"),
                entry(SC_G_NAME_SE, "!!!"),

                entry(SC_G_DESC_SS, "#"),
                entry(SC_G_DESC_FS, "##"),
                entry(SC_G_DESC_SE, "###"),

                entry(SC_MENU_SS, "$"),
                entry(SC_MENU_FS, "$$"),
                entry(SC_MENU_SE, "$$$"),
                entry(SC_MENU_DE, "Press Press Press"));

        symbolBindUser.getMap().putAll(map);
        blockService = new BlockService(game, symbolBind, symbolBindUser);
    }

    @ParameterizedTest
    @MethodSource("startConsoleSource")
    void startConsole(String gameHead, String gameName, String gameDescription, String menu, String expected) {
        var info = new Info();
        info.setGameHead(gameHead);
        info.setGameName(gameName);
        info.setGameDescription(gameDescription);
        info.setMenu(menu);
        when(game.getInfo()).thenReturn(info);

        var actual = blockService.getStartConsole();

        assertEquals(expected, actual);
    }
}
