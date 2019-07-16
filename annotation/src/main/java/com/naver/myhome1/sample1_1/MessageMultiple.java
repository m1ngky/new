package com.naver.myhome1.sample1_1;

public class MessageMultiple {
	private MessageBean messagebean;

	public void setBean(MessageBean messagebean) {
		this.messagebean = messagebean;
	}
	public MessageMultiple() {
		System.out.println("MessageMultiple »ı¼ºÀÚ");
	}
	public void print() {
		messagebean.sayHello("Spring");
	}
}
