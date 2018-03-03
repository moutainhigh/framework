package com.jsmsframework.common.enums;

/**
 * Created by lpjLiu on 2017/7/10. WEBid
 */
public enum WebIdNew {
	短信调度系统(1, "短信调度系统"),
	代理商平台(2, "代理商平台"),
	运营平台(3, "运营平台"),
	OEM代理商平台(4, "OEM代理商平台"),
	品牌客户端(5, "品牌客户端"),
	OEM客户端(6, "OEM客户端");

	private Integer value;
	private String desc;

	WebIdNew(Integer value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public static String getDescByValue(Integer value) {
		if(value == null){ return null;}
		String result = null;
		for (WebIdNew s : WebIdNew.values()) {
			if (value == s.getValue()) {
				result = s.getDesc();
				break;
			}
		}
		return result;
	}

	public static WebIdNew getInstanceByValue(Integer value) {
		for (WebIdNew webIdNew : WebIdNew.values()) {
			if (webIdNew.getValue().equals(value)) {
				return webIdNew;
			}
		}
		return null;
	}
}
