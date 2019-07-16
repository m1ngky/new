package com.naver.myhome1.sample4;
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
 *  
 *  
 *  @Qualifier("m1") ������ ��� ���� �߻�
 *  
 *  Error creating bean with name "m2" : Unsatisfied dependency expressed ...
 *  available: expected single matching bean but found 2: m,m1
 *  
 *  MessageBean Ÿ���� ���� "m"�� "m1" �� �� �� �����ؼ� � ��ü�� ��������
 *  �𸣱� ������ �߻��ϴ� �����Դϴ�.
 *  
 *  @Qualifier annotation�� �̿��ؼ� ���Ե� ��ü�� ���̵� �̸��� ������ �� �ֽ��ϴ�.
 *  
 *  @Autowired�� @Qualified�� �� ���� ó���� �� �ִ� ���� @Resource�Դϴ�.
 *  
 */

import javax.annotation.Resource;

/*
 * 1. MessageBeanImpl.java���� @Resource ����غ���
 * -@Autowired�� ������ Ÿ���� �������� �˻��Ͽ� ������ ������ ó��������
 * @Resource�� ��ü�� �̸��� �̿��Ͽ� ������ ������ ó���մϴ�.
 * -�����ڿ��� ������ �� ���� �ʵ峪 �޼��忡�� ������ �� �ֽ��ϴ�.
 * 
 *  �ڵ� ���� ����� ���� �� ���� ���
 *  1) �ڵ� ���� ��� @Resource �������̼� ���
 *  2) XML ������ <context:annotation-config/> ���
 */


import org.springframework.stereotype.Component;


@Component("m2")
public class MessageMultiple {
	
	@Resource(name="m")
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
