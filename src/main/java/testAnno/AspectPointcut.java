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

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhujing
 *
 */

@Configuration
@Qualifier("aspect")
public class AspectPointcut implements AspectPointcutI {

	/* （非 Javadoc）
	 * @see testAnno.AspectPointcutI#pointcut()
	 */
	@Override
	public void pointcut() {
		// TODO 自动生成的方法存根
		
			System.out.println("Aop增强切入点pointcut");
			
		
	}

	
	
	
}
