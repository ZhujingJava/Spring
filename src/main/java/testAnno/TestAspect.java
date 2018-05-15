/**  
 * All rights Reserved, Designed By zhujing
 * @Title:  TestPluginImpl.java   
 * @Package test   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: zhujing
 * @date:   2018年5月14日 下午11:05:25   
 * @version 1.0
 * @Copyright: 2018 
 * 注意：项目免费下载及阅读，若有转载请注明出处！
 */  
/**
 * 
 */
package testAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 
 * @author zhujing 
 *
 */
//@Aspect：AOP注解方式,该注解相当于 demoxml/spring-aop.xml  中的配置
/*@Aspect
@Component*/

public class TestAspect {

	//@Before("execution(** test.TestPlugin.testsql(..))")
	public void beforecon(){
		System.out.println("AOP前置增强！");
		
	}
	//@After("execution(** test.TestPluginImpl.testsql(..))")
	public void aftercon(){
		System.out.println("AOP后置增强！");
		
	}
	
}
