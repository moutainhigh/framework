package com.jsmsframework.sms.send.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(Include.NON_NULL)
/**
 * @Desc 推荐使用JsmsSendJson 和 JsmsSendForm
 */
public class JsmsAccessSms implements Cloneable{

	private static final long serialVersionUID = 8884923026714807330L;

	/**
	 * 帐号，最长6位
	 */
	private String clientid;

	/**
	 * 密码，8－12位，MD5加密后32位，小写
	 */
	private String password;
	
	/**
	 * 发送手机号码（国内短信不要加前缀，国际短信号码前须带相应的国家区号，如日本：0081），支持多号码，号码之间用英文逗号隔开，最多100个
	 */
	private String mobile;
	
	/**
	 * 短信类型，0：通知短信，4：验证码短信，5：营销短信
	 */
	private String smstype;
	
	/**
	 * 签名 + 短信内容，UTF-8编码（短信内容最长500个字，签名最长10个字）
	 */
	private String content;


	/**
	 * (可选) 自扩展端口，1－4位，可以为空(注：此功能需要通道支持)
	 */
	private String extend;
	
	/**
	 * (可选) 用户透传ID，随状态报告返回，最长60位
	 */
	private String uid;

	/**
	 * (可选) 短信模版ID
	 */
	private String templateid;


	/**
	 * (可选) 短信模版内容
	 */
	private String[] contents;

	private String param;

	private String sendTime;
	private String sendTotal;

    @Override
    public JsmsAccessSms clone(){
        JsmsAccessSms newObj = new JsmsAccessSms();
        newObj.setPassword(this.getPassword());
        newObj.setClientid(this.getClientid());
        newObj.setPassword(this.getPassword());
        newObj.setSmstype(this.getSmstype());
        newObj.setContent(this.getContent());
        return newObj;
    }

    public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSendTotal() {
		return sendTotal;
	}

	public void setSendTotal(String sendTotal) {
		this.sendTotal = sendTotal;
	}

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSmstype() {
		return smstype;
	}

	public void setSmstype(String smstype) {
		this.smstype = smstype;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTemplateid() {
		return templateid;
	}

	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

	public String[] getContents() {
		return contents;
	}

	public void setContents(String[] contents) {
		this.contents = contents;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
