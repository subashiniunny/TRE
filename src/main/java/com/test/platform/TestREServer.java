package com.test.platform;

import io.airlift.http.server.WebServer;
import io.airlift.http.server.WebServerBuilder;

import java.util.logging.Logger;

/*
 * Web server that serves JAX-RS resources
 */
public class TestREServer {
  
    private static final Logger logger = Logger.getLogger(TestREServer.class.getName());
    
    public static WebServer server=null;
    
    public static void main(String ... args){
        server = new WebServerBuilder()
                            .port(8080)
                            .serve("/api/*")
                            .withJaxRs()
                            .build();
        server.start();
        logger.info("Server started...");
        
    }
    
    public void shutdown(){
      server.stop(); 
      logger.info("Server stopped...");
    }

}
