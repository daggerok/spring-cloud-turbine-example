package daggerok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
