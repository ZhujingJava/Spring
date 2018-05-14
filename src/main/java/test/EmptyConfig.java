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
package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 *
 */
@Configuration //表明是配置类
@EnableAspectJAutoProxy//启用AspectJ自动代理
@ComponentScan//扫描当前类所在的基础包
public class EmptyConfig {

}
