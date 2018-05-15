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
package temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Administrator
 *
 */
/**配合readme.md查阅@configuration注解
 * 标记该类为 bean  
 */
@Configuration
// @component 定义该类的bean id="testpluginimpl"，以便注入JavaTest测试类
@Component("testpluginimpl")
/**@componentscan为核心注解：扫描此类所在的包的所有注解；
 * 若不添加此类注解，整个流程依赖类的注解将失效！
*/
@ComponentScan
/**
 * 从resources资源文件中加载application.xml
 */
@ContextConfiguration(locations={"classpath*:/application.xml"})

public class TestPluginImpl implements TestPlugin {

	/* （非 Javadoc）
	 * @see test.TestPlugin#printsql()
	 */
	/**
	 * 
	 */
	public TestPluginImpl() {
	System.out.println("构造testpluginimpl");
		// TODO 自动生成的构造函数存根
	}
	/*@Autowired
	JdbcTemplate jdbcTemplate;*/
	@Override
	/*public void testsql(){
		System.out.println("AOP测试！");
	}*/
	public void testsql(){
		//将application.xml加载入应用上下文中 ，可以获得bean id为名字的beanname
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		//从应用上下文获取"jdbctemplate"的bean 
		JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean("jdbctemplate");
		
  System.out.println("进入方法！！");
		Map<String,Object> map1=new HashMap<>();
		//System.out.println("---开始连接数据库---");
		String sql="select * from users ";
		int i=0;
		//使用 jdbctemplate.queryForlist获取list集合
		List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
		
		Iterator<Map<String, Object>> iterator=list.iterator();
		//遍历iterator集合
		while(iterator.hasNext()){
			String password=null;
			String username=null;
			/**
			 * map中存储 以数据库列名为key，数据为value的  键值对，例如列名为username，值为 admin，
			 * 那么map获取admin方法为  map.get("username")
			 * 以下为map1存储数据过程
			 */
			Map<String, Object> map2=iterator.next();
			username=(String)map2.get("username");
			password=(String)map2.get("userpassword");
			System.out.println("--"+username);
			System.out.println("--"+password);
			System.out.println("----------------------------");
			map1.put(username, password);


		}
		//System.out.println(list);
		//System.out.println("---连接成功---");


	}
}


