package com.test.platform;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * REST test class to handle Release Enforcer endpoints. 
 * 
 */
@Path("/v2/enforcer")
public class REV2Resource implements BaseResource {
  
  @Path("/ppp_version")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String invokePPPVersionRule(){
    return RESPONSE_JSON;
  }

}
