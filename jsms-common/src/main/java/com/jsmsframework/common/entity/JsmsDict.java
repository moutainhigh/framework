package com.jsmsframework.common.entity;


/**
 * @description 数据字典表
 * @author huangwenjie
 * @date 2017-08-16
 */
public class JsmsDict {
    
    // 参数ID
    private Integer paramId;
    // 参数类型
    private String paramType;
    // 类型中文名称
    private String paramTypeName;
    // 参数键值
    private String paramKey;
    // 参数值
    private String paramValue;
    // 排序
    private Integer paramOrder;
    
    public Integer getParamId() {
        return paramId;
    }
    
    public void setParamId(Integer paramId) {
        this.paramId = paramId ;
    }
    
    public String getParamType() {
        return paramType;
    }
    
    public void setParamType(String paramType) {
        this.paramType = paramType ;
    }
    
    public String getParamTypeName() {
        return paramTypeName;
    }
    
    public void setParamTypeName(String paramTypeName) {
        this.paramTypeName = paramTypeName ;
    }
    
    public String getParamKey() {
        return paramKey;
    }
    
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey ;
    }
    
    public String getParamValue() {
        return paramValue;
    }
    
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue ;
    }
    
    public Integer getParamOrder() {
        return paramOrder;
    }
    
    public void setParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder ;
    }
    
}