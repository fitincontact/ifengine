package org.fitin;

import org.fitin.ifengine.api.IFEngine;
import org.fitin.ifengine.config.AppModule;
import org.fitin.ifengine.model.Player;

import static com.google.inject.Guice.createInjector;

public class TestMain {
    static IFEngine IFE = createInjector(new AppModule()).getInstance(IFEngine.class);

    //https://patorjk.com/software/taag/#p=display&v=0&f=RubiFont&t=Across%20Old%20Jungle!
    public static void main(String[] args) {
        String s1 = """
                 ▗▄▖  ▗▄▄▖▗▄▄▖  ▗▄▖  ▗▄▄▖ ▗▄▄▖     ▗▄▖ ▗▖   ▗▄▄▄        ▗▖▗▖ ▗▖▗▖  ▗▖ ▗▄▄▖▗▖   ▗▄▄▄▖
                ▐▌ ▐▌▐▌   ▐▌ ▐▌▐▌ ▐▌▐▌   ▐▌       ▐▌ ▐▌▐▌   ▐▌  █       ▐▌▐▌ ▐▌▐▛▚▖▐▌▐▌   ▐▌   ▐▌  
                ▐▛▀▜▌▐▌   ▐▛▀▚▖▐▌ ▐▌ ▝▀▚▖ ▝▀▚▖    ▐▌ ▐▌▐▌   ▐▌  █       ▐▌▐▌ ▐▌▐▌ ▝▜▌▐▌▝▜▌▐▌   ▐▛▀▀▘
                ▐▌ ▐▌▝▚▄▄▖▐▌ ▐▌▝▚▄▞▘▗▄▄▞▘▗▄▄▞▘    ▝▚▄▞▘▐▙▄▄▖▐▙▄▄▀    ▗▄▄▞▘▝▚▄▞▘▐▌  ▐▌▝▚▄▞▘▐▙▄▄▖▐▙▄▄▖""";
        IFE
                .getInfo()
                .setGameHead("""
                        
                                                            ____  _     _        _                   _      _\s
                             /\\                            / __ \\| |   | |      | |                 | |    | |
                            /  \\   ___ _ __ ___  ___ ___  | |  | | | __| |      | |_   _ _ __   __ _| | ___| |
                           / /\\ \\ / __| '__/ _ \\/ __/ __| | |  | | |/ _` |  _   | | | | | '_ \\ / _` | |/ _ \\ |
                          / ____ \\ (__| | | (_) \\__ \\__ \\ | |__| | | (_| | | |__| | |_| | | | | (_| | |  __/_|
                         /_/    \\_\\___|_|  \\___/|___/___/  \\____/|_|\\__,_|  \\____/ \\__,_|_| |_|\\__, |_|\\___(_)
                                                                                                __/ |        \s
                                                                                               |___/         \s
                        """)
                .setGameName("Across Old Jungle!")
                .setGameDescription("""
                        New Amazing Game! About you about me and about cyborgs in the jungle!!!
                        Take gun, pig, umbrella and let's go to adventure!""")
                .setMenu("press Enter to start");

        Player player = IFE.getPlayer("John Abigail");
        IFE.start();
    }

}
