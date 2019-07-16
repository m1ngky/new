package com.naver.myhome1.sample3;

public class MessageBeanEn implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);

	}

	public MessageBeanEn() {
		System.out.println("MessageBeanEn »ı¼ºÀÚ");
	}
}
