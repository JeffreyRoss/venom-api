package io.rosssoftware.venom.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rosssoftware.venom.api.model.AtlassianConnectTenant;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public interface AtlassianConnectService {
    public AtlassianConnectTenant getTenant();
    public String setTenant(Map<String,String> allParams);
}

class AtlassianConnectServiceImpl implements AtlassianConnectService {

    @Override
    public AtlassianConnectTenant getTenant() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            AtlassianConnectTenant atlassianConnectTenant =
                    objectMapper.readValue(new URL("file:target/atlassianConnectTenant.json"), AtlassianConnectTenant.class);
            return atlassianConnectTenant;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String setTenant(@RequestParam Map<String,String> allParams) {
        //todo: parse Atlassian's Lifecycle callbacks containing a tenant JSON data payload
        return "Parameters are " + allParams.entrySet();
        /*try {
            ObjectMapper objectMapper = new ObjectMapper();
            AtlassianConnectTenant atlassianConnectTenant = new AtlassianConnectTenant("1234","1234","1234","1234","1234","1234","1234","1234","1234","1234","1234","1234");
            objectMapper.writeValue(new File("target/atlassianConnectTenant.json"), atlassianConnectTenant);
            return new ResponseEntity<>("Successfully Set Atlassian Connect Tenant", HttpStatus.OK);
        } catch (Exception e){
            //todo: log error in a logger
            //todo: return an appropriate ResponseEntity obj
            throw e;
        }*/
    }
}