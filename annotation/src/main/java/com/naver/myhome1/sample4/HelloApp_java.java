package com.naver.myhome1.sample4;
/*
 * �� ���α׷��� �ڹٿ��� �Ϲ������� �� �� �ִ� �ڵ��Դϴ�.
 * HelloAppŬ�������� MessageBeanEnŬ������ ���� �ν��Ͻ��� �����Ͽ�
 * say�޼��带 ȣ���ϰ� �ֽ��ϴ�.
 * �̷� ��츦 HelloAppŬ������ MessageBeanEn Ŭ������ ���ϰ� �����ϰ� �ִٰ� �մϴ�.
 * ==>�� Ŭ������ �ٸ� Ŭ������ �޼��带 ������ ���� �����Ѵٶ�� �մϴ�.
 * ��, Ŭ�������� ��������, ���ջ��°� ���ϴٰ� �� �� �ֽ��ϴ�.
 */

/*
 * ���� HelloAppŬ�������� MessageBeanEnŬ���� ���
 * �ٸ� Ŭ����(MessageBeanKo)�� ����� ��쿡
 * (MessageBeanKoŬ������ MessageBeanEnŬ������ ���� ����� �����ϴ�
 * �޼��尡 �����մϴ�.)
 * �� Ŭ������ �޼���� MessageBeanEnŬ������ �޼���� �ٸ� �̸����� ���ǰ� �ֽ��ϴ�.
 * �׷��� MessageBeanKoŬ������ �����ϱ� ���ؼ��� �Ʒ��� 27-28���� ó�� �ڵ带 �����ؾ� 
 * �մϴ�.
 */
public class HelloApp_java {
	public static void main(String[] args) {
		MessageBeanEn mb = new MessageBeanEn();
		MessageMultiple mm = new MessageMultiple(); 
	
		mm.print();
	}
}
