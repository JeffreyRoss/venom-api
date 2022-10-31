package io.rosssoftware.venom.api;

import io.rosssoftware.venom.api.model.AtlassianConnectTenant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import java.io.File;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AtlassianConnectTenantController {

    //todo: create environment var holding the mounted aws nfs target

    @GetMapping("/atlassian/getAtlassianConnectTenant")
    public AtlassianConnectTenant getTenant() {
        return null;
    }

    @PostMapping("/atlassian/installed")
    public ResponseEntity<String> setAtlassianTenant(@RequestParam Map<String,String> tenantCallback){
        return null;
    }
}
