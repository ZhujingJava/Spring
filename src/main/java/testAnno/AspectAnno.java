/**  
 * All rights Reserved, Designed By zhujing
 * @Title:  EmptyConfig.java  
 * @Package test 
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: zhujing
 * @date:   2018年5月14日 下午11:05:25   
 * @version 1.0
 * @Copyright: 2018 
 * 注意：项目免费下载及阅读，若有转载请注明出处！
 */  
package testAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
//注解式配置AOP切面
@Aspect
//注解为资源，以便  测试主类注解@ComponentScan 扫描到
@Component

public class AspectAnno {
   
	//前置增强点
	@Before("execution(** testAnno.AspectPointcut.pointcut(..))")
	public void beforeAspect(){
	  System.out.println("前置增强切入");
  }
	@After("execution(** testAnno.AspectPointcut.pointcut(..))")
	public void afterAspect(){
		System.out.println("后置增强切入");
	}
}
