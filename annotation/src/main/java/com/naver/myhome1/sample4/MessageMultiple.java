package com.naver.myhome1.sample4;
/*
 *  @Autowired사용해 보기
 *  -@Autowired은 생성자나 메서드, 멤버변수 위에 모두 사용할 수 있습니다.
 *  -자동 주입 기능을 사용하면 스프링 컨테이너는 알아서 의존 객체를 찾아서 주입해 줍니다.
 *  -즉, 해당 타입에 할당할 수 있는 빈 객체를 찾아서 주입합니다.
 *  -@Autowired 에노테이션을 적용하면 반드시 주입할 의존 객체가 존재해야 합니다.
 *  -만약 @Autowired가 붙은 객체가 메모리에 없다면 스프링 컨테이너가
 *  NoSuchBeanDefinitionException을 발생시킵니다.
 *  
 *  자동 주입 기능을 위한 두 가지 사용
 *  1) 자동 주입 대상에 @Autowired 에노테이션 사용
 *  2) XML 설정에 <context:annotation-config/> 사용
 *  
 *  
 *  @Qualifier("m1") 생략한 경우 오류 발생
 *  
 *  Error creating bean with name "m2" : Unsatisfied dependency expressed ...
 *  available: expected single matching bean but found 2: m,m1
 *  
 *  MessageBean 타입의 빈이 "m"과 "m1" 두 개 가 존재해서 어떤 객체를 주입할지
 *  모르기 때문에 발생하는 에러입니다.
 *  
 *  @Qualifier annotation을 이용해서 주입될 객체의 아이디나 이름을 지정할 수 있습니다.
 *  
 *  @Autowired의 @Qualified을 한 번에 처리할 수 있는 것이 @Resource입니다.
 *  
 */

import javax.annotation.Resource;

/*
 * 1. MessageBeanImpl.java에서 @Resource 사용해보기
 * -@Autowired는 변수의 타입을 기준으로 검색하여 의존성 주입을 처리하지만
 * @Resource는 객체의 이름을 이용하여 의존성 주입을 처리합니다.
 * -생성자에는 적용할 수 없고 필드나 메서드에만 적용할 수 있습니다.
 * 
 *  자동 주입 기능을 위한 두 가지 사용
 *  1) 자동 주입 대상에 @Resource 에노테이션 사용
 *  2) XML 설정에 <context:annotation-config/> 사용
 */


import org.springframework.stereotype.Component;


@Component("m2")
public class MessageMultiple {
	
	@Resource(name="m")
	//해당 타입에 할당할 수 있는 빈 객체를 찾아서 자동 주입됩니다.
	//반드시 주입할 의존 객체가 존재해야 합니다.
	//기존에 의존성 주입에 사용했던 Setter메소드나 생성자는 필요없습니다.
	private MessageBean messagebean;

	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자");
	}
	public void print() {
		messagebean.sayHello("Spring");
	}
}
