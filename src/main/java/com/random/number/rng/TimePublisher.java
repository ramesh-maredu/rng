package com.random.number.rng;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * Thread which publishes the time as per schedule;
 * @author user
 *
 */
@Component
public class TimePublisher implements DisposableBean, Runnable{
	
	private String currentTime;
	
	private boolean stopThread = false;
	
	public TimePublisher() {
		this.currentTime = getTimeFromDate();
	}

	@Override
	public void run() {
		while(!stopThread) {
			String currentTime = getTimeFromDate();
			this.currentTime = currentTime;
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	private String getTimeFromDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String currentTime = sdf.format(date);
		return currentTime;
	}

	@Override
	public void destroy() throws Exception {
		stopThread = true;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

}
