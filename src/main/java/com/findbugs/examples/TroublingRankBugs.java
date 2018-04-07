package com.findbugs.examples;

public class TroublingRankBugs {
	public TroublingRankBugs(){

	}
	private void emptySynchronized() {
		synchronized (this) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	private void sleepInSynchronized() throws InterruptedException {
//		synchronized (this) {
//			Thread.sleep(5000);
//		}
//	}
}
