package com.test.platform;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * REST test class to handle Release Enforcer endpoints. 
 * 
 */
@Path("/enforcer")
public class REResource implements BaseResource{
  
  @Path("/test")
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String test(){
    return "hello";
  }
  
  @Path("/jdk_version")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String invokeJDKVersionRule(){
    return RESPONSE_JSON;
  }
  
  @Path("/blacklist")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String invokeBlacklistRule(){
    return RESPONSE_JSON;
  }
  
  @Path("/jdk_compiler_compatibility")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String invokeJdkCompilerCompatibilityRule(){
    return RESPONSE_JSON;
  }

}
