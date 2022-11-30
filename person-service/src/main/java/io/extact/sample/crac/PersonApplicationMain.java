package io.extact.sample.crac;

import org.slf4j.bridge.SLF4JBridgeHandler;

public class PersonApplicationMain {
    public static void main(String[] args) throws Exception {
        // java.util.loggingの出力をSLF4Jへdelegate
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        // Helidonの起動
        io.helidon.microprofile.cdi.Main.main(args);
    }
}
