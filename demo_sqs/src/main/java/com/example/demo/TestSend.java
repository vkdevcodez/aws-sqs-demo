//package com.example.demo;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.amazonaws.services.sqs.model.SendMessageRequest;
//
//@Component
//public class TestSend implements CommandLineRunner {
//
//	@Autowired
//	private AwsConfig awsSqsConfig;
//	
//	@Autowired
//	private AmazonSQSAsync amazonSqs;
//	
//
//
//	@Override
//	public void run(String... args) throws Exception {
//		for (int i = 1; i <= 1000; i++) {
//			try {
//				String jsonString = "{\"name\":\"vinod\",\"age\":25}";
////
////				Gson gson = new Gson();
////				QueueMessagingTemplate msgs = awsSqsConfig.queueMessagingTemplate();
////				msgs.send("test_queue.fifo", MessageBuilder.withPayload(gson.fromJson(jsonString, Object.class)).build());
////				System.out.println(i);
//				
//
//				String fullQueueURL = "https://sqs.ap-southeast-1.amazonaws.com/110345434904/test_queue.fifo";
//				String messageGroupId =  "SDMS-default";
//				if (jsonString != null) {
//					SendMessageRequest sendMessageRequest = new SendMessageRequest();
//					sendMessageRequest.setMessageBody(jsonString);
//					sendMessageRequest.setQueueUrl(fullQueueURL);
//					sendMessageRequest.setMessageGroupId(messageGroupId);
//	 
//					// Generate a unique MessageDeduplicationId
//					String messageDeduplicationId = "dedup-" + UUID.randomUUID().toString();
//					sendMessageRequest.setMessageDeduplicationId(messageDeduplicationId);
//	      
//					amazonSqs.sendMessage(sendMessageRequest);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
