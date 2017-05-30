package net.madvirus.spring4.chap02;


import net.madvirus.spring4.chap02.AuthenticationService;
import net.madvirus.spring4.chap02.PasswordChangeService;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MainByXmlNamespace {
	
	public static void main(String[] args){
		
		//classpath:config-with-*.xml"  config-with 시작하는 xml 가져오기
		GenericXmlApplicationContext ctx =	new GenericXmlApplicationContext("classpath:config-with-*.xml");
		
		AuthenticationService authSvc = ctx.getBean("authenticationService", AuthenticationService.class);
		
		authSvc.authenticate("bkchoi", "1234");
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");
		authSvc.authenticate("bkchoi", "5678");
		
		ctx.close();
		
		
	}
}
