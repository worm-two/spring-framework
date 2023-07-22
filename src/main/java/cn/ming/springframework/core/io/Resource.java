package cn.ming.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: xuming
 * @Date: 2023-07-22 10:42
 * @Version: 1.0
 * @Description: 资源处理接口
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}
