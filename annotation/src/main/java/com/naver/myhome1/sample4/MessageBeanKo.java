package com.naver.myhome1.sample4;

import org.springframework.stereotype.Component;

@Component("m1")
public class MessageBeanKo implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);

	}

	public MessageBeanKo() {
		System.out.println("MessageBeanEn »ý¼ºÀÚ");
	}
}
