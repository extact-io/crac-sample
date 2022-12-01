package sample;

import org.crac.Context;
import org.crac.Core;
import org.crac.Resource;

public class LoopCounterMain {
    public static void main(String[] args) throws Exception {
        new LoopCounter().start();
    }
    private static class LoopCounter implements Resource {
        private int time;
        private LoopCounter() {
            Core.getGlobalContext().register(this);
        }
        private void start() throws Exception {
            while (true) {
                Thread.sleep(1000L);
                System.out.println("count:" + ++time);
            }
        }
        @Override
        public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
            System.out.println("***** call beforeCheckpoint *****");
        }
        @Override
        public void afterRestore(Context<? extends Resource> context) throws Exception {
            System.out.println("***** call afterRestore *****");
        }
    }
}
