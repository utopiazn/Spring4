package net.madvirus.spring4.chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class mainByXML {
	
	public static void main(String[] args){
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:config.xml");
		AuthenticationService authSvc = ctx.getBean("authenticationService", AuthenticationService.class);
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "1111");
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "11111");
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "111111");
		
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "11111ddd");
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "111111ssss");

		
		try{
			
			authSvc.authenticate("bkchoi2", "1111");
			
		}catch(UserNotFoundException ex){}
		
		
		authSvc.authenticate("bkchoi", "1234");
		
		
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
		pwChgSvc.changePassword("bkchoi", "1234", "5678");
		runAuthAndCatchAuthEx(authSvc, "bkchoi", "1234");
		authSvc.authenticate("bkchoi", "5678");
		ctx.close();
		
	}
	

	private static void runAuthAndCatchAuthEx(
			AuthenticationService authSvc,
			String userId, String password) {
		
		try {
			authSvc.authenticate(userId, password);
		} catch (AuthException ex) {
		}
	}
	
}
