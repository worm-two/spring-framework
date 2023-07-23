package cn.ming.springframework.jdbc.datasource;

/**
 * @Author: xuming
 * @Date: 2023-07-23 10:23
 * @Version: 1.0
 * @Description:
 **/
public abstract class JdbcTransactionObjectSupport {

    private ConnectionHolder connectionHolder;

    public void setConnectionHolder(ConnectionHolder connectionHolder) {
        this.connectionHolder = connectionHolder;
    }

    public ConnectionHolder getConnectionHolder() {
        return connectionHolder;
    }

    public boolean hasConnectionHolder() {
        return null != this.connectionHolder;
    }

}
