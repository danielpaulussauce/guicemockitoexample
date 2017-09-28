package main.guice;


import com.google.inject.AbstractModule;
import main.services.*;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {

     /*
      * This tells Guice that whenever it sees a dependency on a IDatabase,
      * it should satisfy the dependency using a Database.
      */
        bind(IDatabase.class).to(Database.class);
        bind(IHttpConnectionFactory.class
        ).to(HttpConnectionFactory.class);
        bind(IHttpMessageFactory.class).to(HttpMessageFactory.class);
        bind(ILoggingService.class).to(LogginService.class);
        bind(IUserAccountManagement.class).to(UserAccountManagement.class);

    }
}

