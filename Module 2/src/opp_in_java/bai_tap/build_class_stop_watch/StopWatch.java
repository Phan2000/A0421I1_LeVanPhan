package opp_in_java.bai_tap.build_class_stop_watch;

import java.util.*;

public class StopWatch {
	private long startTime,stopTime;

	public StopWatch(){
		this.startTime = System.currentTimeMillis();
	}

	public void setStartTime(long startTime){
		this.startTime = startTime;
	}

	public long getStartTime(){
		return startTime;
	}

	public long getStopTime(){
		return stopTime;
	}
	
	public void setStopTime(long stopTime){
		this.stopTime = stopTime;
	}

	public void start () {
		this.startTime = System.currentTimeMillis();
	}

	public void stop () {
		this.stopTime = System.currentTimeMillis();
	}

	public long getElapsedTime(){
		return stopTime - startTime;
	}
}