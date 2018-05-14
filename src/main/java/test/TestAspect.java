/**   
* @Title:文件名生成程序
* @Package read_filename
* @Description: 获取原路径文件名至目的路径文件夹下生成.txt文档
* @author 朱晶
* @date 2017.03.05 
* @version V1.0   
*//**
 * 
 */
package test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author zhujing 
 *
 */
//@Aspect：AOP注解方式,该注解相当于 demoxml/spring-aop.xml  中的配置
@Aspect
@Component
public class TestAspect {

	@Before("execution(** test.TestPlugin.testsql(..))")
	public void beforecon(){
		System.out.println("开始连接数据库处理数据！");
		
	}
	@After("execution(** test.TestPluginImpl.testsql(..))")
	public void aftercon(){
		System.out.println("数据库处理数据完毕！");
		
	}
	
}
