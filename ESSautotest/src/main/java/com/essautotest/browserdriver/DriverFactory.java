package com.essautotest.browserdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.essautotest.remotenode.RemoteBrowserBean;

public class DriverFactory {
	public static WebDriver getRemoteDriver(){
		
		RemoteBrowserBean remoteBrowserBean = new RemoteBrowserBean();

		
		DesiredCapabilities capability = null;
		if (remoteBrowserBean.getbrowserName().contains("firefox")) {
			capability = DesiredCapabilities.firefox();
		}
		else if (remoteBrowserBean.getbrowserName().contains("chrome")) {
			capability = DesiredCapabilities.chrome();
		}
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(remoteBrowserBean.gethubUrl()), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return driver;
		
	}
}
