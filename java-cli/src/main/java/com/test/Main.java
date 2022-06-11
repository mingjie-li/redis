package com.test;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(Main.class);
		log.info("start");
		
		Config config = new Config();
		config.useSentinelServers().setMasterName("mymaster")
				.addSentinelAddress("redis://test-redis:26379")
				.setCheckSentinelsList(false)
				.setFailedSlaveReconnectionInterval(90)
				.setFailedSlaveCheckInterval(60)
				.setConnectTimeout(10000)
				.setMasterConnectionMinimumIdleSize(24)
				.setMasterConnectionPoolSize(64)
				.setUsername("test").setPassword("test")
				.setSentinelUsername("test").setSentinelPassword("test");

		Redisson.create(config);

	}

}
