package org.fitin.ifengine.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import static org.fitin.ifengine.util.Print.p;

@Singleton
public class StartConsoleService {
    private final BlockService blockService;

    @Inject
    public StartConsoleService(BlockService blockService) {
        this.blockService = blockService;
    }

    protected void exec() {
        p(blockService.getStartConsole());
    }
}
