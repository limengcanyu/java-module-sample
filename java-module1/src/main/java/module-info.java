/**
 * <p>Description: </p>
 *
 * @author Rock Jiang
 * @date 2019/2/27 0027
 * @version 1.0
 */
module java.module1 {
     // 引入包
     requires java.logging;

     // 导出模块中的对外接口
     exports com.java.module1.service;
     exports com.java.module1.service.impl;
}