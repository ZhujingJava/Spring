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
package testAnno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhujing
 *
 */
//测试  spring-aop.xml格式配置AOP切面
@RunWith(SpringJUnit4ClassRunner.class)
//必要的contextconfiguration注解，加载配置文件
@ContextConfiguration(classes=EmptyConfig.class)

public class TestAop {
	@Autowired
	//@Qualifier("aspect")
	private AspectPointcutI aspect;
	
 @Test
	public void test(){
	 System.out.println("进入测试！");
	 try {
	   System.out.println(aspect.getClass());
	   aspect.pointcut();
		
	 
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
		
		
	}
}
