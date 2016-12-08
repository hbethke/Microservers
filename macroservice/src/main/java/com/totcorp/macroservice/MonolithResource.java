package com.totcorp.macroservice;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("monoliths")
public class MonolithResource {

    @GET
    @Produces("application/json")
    // URL: http://localhost:8080/macroservice/resources/monoliths
    public JsonObject hello() {
        return Json.createObjectBuilder().
                add("hello", "world").
                build();
    }
}
