package io.extact.sample.crac;

import org.crac.Context;
import org.crac.Core;
import org.crac.Resource;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class PersonApplicationMain {
    private static Thread preventExitThread;
    public static void main(String[] args) throws Exception {
        // java.util.loggingの出力をSLF4Jへdelegate
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        // Helidonの起動
        io.helidon.microprofile.cdi.Main.main(args);

        Core.getGlobalContext().register(new CracEventHandler());
        preventExitThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1_000_000);
                } catch (InterruptedException e) {
                }
            }
        });
        preventExitThread.start();
    }

    static class CracEventHandler implements Resource {
        @Override
        public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
            io.helidon.microprofile.cdi.Main.shutdown();
        }

        @Override
        public void afterRestore(Context<? extends Resource> context) throws Exception {
            io.helidon.microprofile.cdi.Main.main(null);
        }
    }
}
