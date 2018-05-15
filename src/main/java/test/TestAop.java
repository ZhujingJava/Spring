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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhujing
 *
 */
//测试  spring-aop.xml格式配置AOP切面
@RunWith(SpringJUnit4ClassRunner.class)
//必要的contextconfiguration注解，加载配置文件
@ContextConfiguration(locations={"classpath*:demoxml/spring-aop.xml"})
public class TestAop {
 @Test
	public void test(){
	 try {
		   ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:demoxml/spring-aop.xml");
		 // TestAspect testAop1=(TestAspect)context.getBean("testAspect");
		   Aspectxml emptyConfig=(Aspectxml)context.getBean("emptyConfig");
		   emptyConfig.testempty();
	 
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
		
		
	}
}
