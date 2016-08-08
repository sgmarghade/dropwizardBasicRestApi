package com.sgmarghade.dropwizard.models;

/**
 * Created by swapnil on 08/08/16.
 */
public class ApiModel {
    private String key ;
    private String value;

    public ApiModel(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
