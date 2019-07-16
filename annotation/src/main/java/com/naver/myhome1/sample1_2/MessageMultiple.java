package com.naver.myhome1.sample1_2;
/*
 *  @Autowired����� ����
 *  -@Autowired�� �����ڳ� �޼���, ������� ���� ��� ����� �� �ֽ��ϴ�.
 *  -�ڵ� ���� ����� ����ϸ� ������ �����̳ʴ� �˾Ƽ� ���� ��ü�� ã�Ƽ� ������ �ݴϴ�.
 *  -��, �ش� Ÿ�Կ� �Ҵ��� �� �ִ� �� ��ü�� ã�Ƽ� �����մϴ�.
 *  -@Autowired �������̼��� �����ϸ� �ݵ�� ������ ���� ��ü�� �����ؾ� �մϴ�.
 *  -���� @Autowired�� ���� ��ü�� �޸𸮿� ���ٸ� ������ �����̳ʰ�
 *  NoSuchBeanDefinitionException�� �߻���ŵ�ϴ�.
 *  
 *  �ڵ� ���� ����� ���� �� ���� ���
 *  1) �ڵ� ���� ��� @Autowired �������̼� ���
 *  2) XML ������ <context:annotation-config/> ���
 */

import org.springframework.beans.factory.annotation.Autowired;

public class MessageMultiple {
	
	
	@Autowired
	//�ش� Ÿ�Կ� �Ҵ��� �� �ִ� �� ��ü�� ã�Ƽ� �ڵ� ���Ե˴ϴ�.
	//�ݵ�� ������ ���� ��ü�� �����ؾ� �մϴ�.
	//������ ������ ���Կ� ����ߴ� Setter�޼ҵ峪 �����ڴ� �ʿ�����ϴ�.
	private MessageBean messagebean;

	
	public MessageMultiple() {
		System.out.println("MessageMultiple ������");
	}
	public void print() {
		messagebean.sayHello("Spring");
	}
}
