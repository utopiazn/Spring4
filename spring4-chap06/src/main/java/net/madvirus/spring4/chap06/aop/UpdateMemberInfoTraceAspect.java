package net.madvirus.spring4.chap06.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import net.madvirus.spring4.chap06.member.UpdateInfo;


@Aspect
public class UpdateMemberInfoTraceAspect {
/*
	@afterReturning(pointcut ="args(memberId,info)",returning="result" argNames="joinPoint,info,result")
	public void traceReturn(JoinPoint joinPoint, String memberId)*/
}
