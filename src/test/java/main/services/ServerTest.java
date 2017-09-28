package main.services;

import com.flextrade.jfixture.JFixture;
import com.google.inject.Inject;
import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static com.sun.javaws.JnlpxArgs.verify;


@RunWith(JukitoRunner.class)
public class ServerTest {


    /**
     * Using and automocking container is awesome because your tests
     * will become more stable. imagine someone changing a dependency you mocked
     * manually but do not acutally need to your method under test.
     *
     */
   @Before
    public void setUp(){
        JFixture fixture = new JFixture();
        request = fixture.create(ConnectionRequest.class);
    }
    ConnectionRequest request;
    @Inject
    Server server;

    @InjectMocks
    IUserAccountManagement userAccountManagement;

    @Test
    public void run() {

        //The problem we're facing is that Connectionrequest is really complicated and
        //needs a lot of initialization. But for testing the acceptConnection method, we dont
        //actually need a lot of it.

        server.acceptConnection(request);



    }



}