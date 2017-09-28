package main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import main.guice.ServerModule;
import main.services.Server;

public class Runner {

    public static void main(String[] args) {
    /*
     * Guice.createInjector() takes your Modules, and returns a new Injector
     * instance. Most applications will call this method exactly once, in their
     * main() method.
     */
        Injector injector = Guice.createInjector(new ServerModule());

    /*
     * Now that we've got the injector, we can build objects.
     */
        Server server = injector.getInstance(Server.class);
        server.run();

    }


}
