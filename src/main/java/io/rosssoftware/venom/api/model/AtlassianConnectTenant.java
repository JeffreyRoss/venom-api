package io.rosssoftware.venom.api.model;

public class AtlassianConnectTenant {
    private String key;
    private String clientKey;
    private String sharedSecret;
    private String serverVersion;
    private String pluginsVersion;
    private String baseUrl;
    private String displayUrl;
    private String displayUrlServicedeskHelpCenter;
    private String productType;
    private String description;
    private String serviceEntitlementNumber;
    private String eventType;

    public AtlassianConnectTenant(String key, String clientKey, String sharedSecret, String serverVersion, String pluginsVersion, String baseUrl, String displayUrl, String displayUrlServicedeskHelpCenter, String productType, String description, String serviceEntitlementNumber, String eventType){
        this.key = key;
        this.clientKey = clientKey;
        this.sharedSecret = sharedSecret;
        this.serverVersion = serverVersion;
        this.pluginsVersion = pluginsVersion;
        this.baseUrl = baseUrl;
        this.displayUrl = displayUrl;
        this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
        this.productType = productType;
        this.description = description;
        this.eventType = eventType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getSharedSecret() {
        return sharedSecret;
    }

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getPluginsVersion() {
        return pluginsVersion;
    }

    public void setPluginsVersion(String pluginsVersion) {
        this.pluginsVersion = pluginsVersion;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public String getDisplayUrlServicedeskHelpCenter() {
        return displayUrlServicedeskHelpCenter;
    }

    public void setDisplayUrlServicedeskHelpCenter(String displayUrlServicedeskHelpCenter) {
        this.displayUrlServicedeskHelpCenter = displayUrlServicedeskHelpCenter;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceEntitlementNumber() {
        return serviceEntitlementNumber;
    }

    public void setServiceEntitlementNumber(String serviceEntitlementNumber) {
        this.serviceEntitlementNumber = serviceEntitlementNumber;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}

