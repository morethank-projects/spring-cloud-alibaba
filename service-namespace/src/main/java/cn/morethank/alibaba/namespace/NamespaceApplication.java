package cn.morethank.alibaba.namespace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NamespaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamespaceApplication.class, args);
    }
}
