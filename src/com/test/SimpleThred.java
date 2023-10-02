package com.test;

//class Hi extends Thread{
//	public void run() {
//		
//		for(int i=1;i<6;i++) {
//			System.out.println();
//			System.out.print("Pattabhi ");
//			try {Thread.sleep(1000);}
//			catch(Exception e) {}
//		}
//		
//	}
//}
//class Hello extends Thread{
//	public void run() {
//		
//		for(int i=1;i<6;i++) {
//			System.out.print("Venkanna");
//			try {Thread.sleep(1000);}
//			catch(Exception e) {}
//		}
//		
//	}
//}

public class SimpleThred {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("");
				System.out.print("Pattabhi ");
				try {Thread.sleep(1000);}
				catch(Exception e) {}
			}
		});
		Thread t2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.print("Venkanna");
				try {Thread.sleep(1000);}
				catch(Exception e) {}
			}
		});
		t1.start();
		try {Thread.sleep(100);}catch(Exception e) {}
		t2.start();

	}

}
