/**  
 * All rights Reserved, Designed By zhujing
 * @Title:  JavaTest.java  
 * @Package test   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: zhujing
 * @date:   2018年5月14日 下午11:05:25   
 * @version 1.0
 * @Copyright: 2018 
 * 注意：项目免费下载及阅读，若有转载请注明出处！
 */  

package temp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhujing
 */
/**
 * @@主测试类 @Runwith用于在spring环境中测试，相当于加载了spring容器,除了不用启动tomcat等服务器，需要如下方式提供bean信息，aop信息等；
 * 1.以xml形式提供； 2.以注解方式提供。
 */
@RunWith(SpringJUnit4ClassRunner.class)

// 加载Testpluginimpl类的相关信息；
@ContextConfiguration(classes = TestPluginImpl.class)
public class JavaTest {

	// 定义实现类 testpluginimpl，接口为TestPlugin 实现类为TestPluginImpl.java
	@Autowired
	private TestPlugin testpluginimpl;

	/*
	 * @Test public void testdemo1(){ demo1.testDemo1(); }
	 */
	/*
	 * private class MyList extends ArrayList {
	 * 
	 * @Override public String get(int index) { return ""; } }
	 * 
	 * public static void main(String[] args) { for (Method method :
	 * MyList.class.getDeclaredMethods()) { System.out.println("name: " +
	 * method.getName() + ", return: " + method.getReturnType()); } }
	 * 
	 * @Test public void classpath() {
	 * System.out.println(System.getProperty("java.class.path")); }
	 * 
	 * @Test public void findClass() throws IOException { Enumeration<URL> base
	 * = JavaTest.class.getClassLoader().getResources("base/*"); while
	 * (base.hasMoreElements()) {
	 * System.out.println(base.nextElement().toString()); } }
	 * 
	 * @Test public void intro() throws IntrospectionException { BeanInfo info =
	 * Introspector.getBeanInfo(Student.class); for (PropertyDescriptor pd :
	 * info.getPropertyDescriptors()) { System.out.println(pd.getReadMethod());
	 * System.out.println(pd.getWriteMethod()); } }
	 * 
	 * @Test public void split() { String str =
	 * "1\t2\taug\tfri\t14.7\t66\t2.7\t0\t0"; String[] arr = str.split("\t");
	 * System.out.println(Arrays.toString(arr)); System.out.println(arr);
	 * System.out.println("月份: " + arr[2]); System.out.println("天气: " + arr[4]);
	 * }
	 */
	@Test
	public void testaop() {
		// System.out.println(testpluginimpl);
		try {
			testpluginimpl.testsql();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	/* @Test
	  public void testsql(){
	  
	  Map<String,Object> map1=new HashMap<>();
	 //System.out.println("---开始连接数据库---"); String sql="select * from users ";
	  int i=0; List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
	  Iterator<Map<String, Object>> iterator=list.iterator();
	  while(iterator.hasNext()){ String password=null; String username=null;
	  Map<String, Object> map2=iterator.next();
	  username=(String)map2.get("username");
	  password=(String)map2.get("userpassword");
	 System.out.println("--"+username); System.out.println("--"+password);
	  System.out.println("----------------------------"); map1.put(username,
	  password);
	  
	  
	  } //System.out.println(list); //System.out.println("---连接成功---");
	  
	  
	  }*/
	 

}
