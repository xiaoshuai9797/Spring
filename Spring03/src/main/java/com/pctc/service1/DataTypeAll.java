package com.pctc.service1;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 属性注入，属性是集合，非引用类型
 * 各种集合
 */
public class DataTypeAll {

    private String[] arrayValue;
    private List<String> listValue;
    private Set<String> setValue;
    private Map<String,String> mapValue;
    private Properties proInfo;

    public String[] getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    public Set<String> getSetValue() {
        return setValue;
    }

    public void setSetValue(Set<String> setValue) {
        this.setValue = setValue;
    }

    public Map<String, String> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<String, String> mapValue) {
        this.mapValue = mapValue;
    }

    public Properties getProInfo() {
        return proInfo;
    }

    public void setProInfo(Properties proInfo) {
        this.proInfo = proInfo;
    }
}
