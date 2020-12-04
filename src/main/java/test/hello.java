package test;

import redis.clients.jedis.*;

import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * 文件名称：hello
 *
 * @author huang
 * @Description: [功能描述]
 * @CreateDate: 2020/12/3 0003 17:04
 */
public class hello {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println("连接成功");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
}
