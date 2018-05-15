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

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhujing
 *
 */
@Configuration
@ComponentScan(basePackages={"testAnno"})
@EnableAspectJAutoProxy
public class EmptyConfig {

}
