package run.lin.app.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启服务注册发现
 *
 * @author lingSong
 * @date 2021/2/18 20:56
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GetWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetWayApplication.class, args);
    }

}
