package net.madvirus.spring4.chap06;

import net.madvirus.spring4.chap06.board.NewArticleRequest;
import net.madvirus.spring4.chap06.board.WriteArticleService;
import net.madvirus.spring4.chap06.member.MemberRegRequest;
import net.madvirus.spring4.chap06.member.MemberService;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainQuickStart {
	
	public static void main(String[] args){
		                                                                             
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:acQuickStart.xml");
		
		WriteArticleService writeArticleService =
				ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer", "title", "content"));
		
		
		MemberService memberService = ctx.getBean(MemberService.class);
		MemberRegRequest memberRegReq =
				new MemberRegRequest("id", "name", "pw");
		memberService.regist(memberRegReq);

	
		ctx.close();
	}
}





