package com.naver.myhome1.sample4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		// 1. Spring �����̳ʸ� �����մϴ�.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
				"com/naver/myhome1/sample4/applicationContext.xml");

		// 2. Object getBean(String name)
		// argument�� ������ �̸��� bean �ν��Ͻ��� ��ȯ�մϴ�.
		// Spring �����̳ʷκ��� ���� ���̵� "m2"�� bean�� �����ɴϴ�.
		MessageMultiple bean = (MessageMultiple) ctx.getBean("m2");

		// 3. �޼��� �����մϴ�.
		bean.print();

		// 4. Sptring �����̳ʸ� �����մϴ�.
		ctx.close();
	}
}
