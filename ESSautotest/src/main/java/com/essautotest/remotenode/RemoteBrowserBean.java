package com.essautotest.remotenode;

public class RemoteBrowserBean {
	
	private String browserName;
	private String version;
	private String hubUrl;
	
	public void setbrowserName(String browserName){
		this.browserName = browserName;
	}
	
	public String getbrowserName(){
		return browserName;
	}
	
	public void setversion(String version){
		this.version = version;
	}
	
	public String getversion(){
		return version;
	}
	
	public void sethubUrl(String hubUrl){
		this.hubUrl = hubUrl;
	}
	
	public String gethubUrl(){
		return hubUrl;
	}
	
	public RemoteBrowserBean(){
		this.browserName = "firefox";
		this.version = "33";
		/*
		 * Lanlan node
		 */
		this.hubUrl = "http://9.112.129.41:5555/wd/hub";
//		this.hubUrl = "http://127.0.0.1:5555/wd/hub";
		
	}
	
	public RemoteBrowserBean(String browser){
		this.browserName = browser;
		this.version = "33";
		this.hubUrl = "http://9.112.129.41:5555/wd/hub";
		
	}

}