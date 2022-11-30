package sample;

import org.crac.Context;
import org.crac.Core;
import org.crac.Resource;

public class SleepTimerMain {
    public static void main(String[] args) throws Exception {
        new SleepTimer().start();
    }
    private static class SleepTimer implements Resource {
        private int time;
        private SleepTimer() {
            Core.getGlobalContext().register(this);
        }
        private void start() throws Exception {
            while (true) {
                Thread.sleep(1000L);
                System.out.println(++time + "sec");
            }
        }
        @Override
        public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
            System.out.println("call beforeCheckpoint");
        }
        @Override
        public void afterRestore(Context<? extends Resource> context) throws Exception {
            System.out.println("call afterRestore");
        }
    }
}
