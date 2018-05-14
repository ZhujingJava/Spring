/**  
 * All rights Reserved, Designed By zhujing
 * @Title:  testsetse.java   
 * @Package test  
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: zhujing
 * @date:   2018年5月14日 下午11:05:25   
 * @version 1.0
 * @Copyright: 2018 
 * 注意：项目免费下载及阅读，若有转载请注明出处！
 */  
package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 *
 */
@Configuration
@ComponentScan

public class Demo1 {

	public void testDemo1(){
		System.out.println("Demo1被创建");
	}
}
