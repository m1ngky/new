package com.naver.myhome1.sample4;

import org.springframework.stereotype.Component;

@Component("m")
public class MessageBeanEn implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);

	}

	public MessageBeanEn() {
		System.out.println("MessageBeanEn »ý¼ºÀÚ");
	}
}
