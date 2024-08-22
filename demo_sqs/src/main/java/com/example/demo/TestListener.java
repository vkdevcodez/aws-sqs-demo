package com.example.demo;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestListener {
	@SqsListener(value = "test_queue.fifo", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	public void test(String message, @Headers MessageHeaders headers) {
		log.error("Hi..!");
	}
}
