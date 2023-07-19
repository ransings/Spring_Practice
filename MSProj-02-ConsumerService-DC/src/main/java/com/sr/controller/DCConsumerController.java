package com.sr.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class DCConsumerController {
	@Autowired
	private DiscoveryClient comp;
	
	@GetMapping("/consume")
	public ResponseEntity<String> consume() throws URISyntaxException{
		List<ServiceInstance> insts= comp.getInstances("provider-service");
		URI uri=new URI((insts.get(0).getUri().toString())+"/provider/info");
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> result=template.getForEntity(uri, String.class);
		System.out.println("DCConsumerController.consume()");
		return new ResponseEntity<String>("From Consumer app::"+result.getBody(),HttpStatus.OK);
	}
	
	@GetMapping("/info")
	public String test() {
		return "This is Test";
	}

}
