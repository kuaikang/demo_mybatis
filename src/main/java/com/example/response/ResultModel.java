package com.example.response;

import java.io.Serializable;

/**
 * App 返回参数体
 * @author Administrator
 *
 */
public class ResultModel implements Serializable{

	private static final long serialVersionUID = -2461017938431758852L;

	/**
     * 状态码：200 成功，其他为失败
     */
    public int status;

   /**
    * 成功为success，其他为失败原因
    */
    public String errorMsg;

    /**
     * 数据结果集
     */
    public Object content;  
  
    /**
     * 当前系统时间戳
     */
    private Long timeStamp;

    
	public ResultModel() {
		super();
	}

	/**
	 * app响应使用
	 */
	public ResultModel(int status, String errorMsg, Object content, Long timeStamp) {
		super();
		this.status = status;
		this.errorMsg = errorMsg;
		this.content = content;
		this.timeStamp = timeStamp;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
    
}