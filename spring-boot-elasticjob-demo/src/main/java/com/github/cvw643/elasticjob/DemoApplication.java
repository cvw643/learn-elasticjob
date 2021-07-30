package com.github.cvw643.elasticjob;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @Component
    public static class MyJob implements SimpleJob {

        @Override
        public void execute(ShardingContext context) {
            System.out.println("do something by sharding item " + context.getShardingItem());
        }
    }
}
