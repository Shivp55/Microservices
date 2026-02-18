package com.eazybytes.gatewayserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@RequestMapping("/contactSupport")
	public Mono<String> contactSupport() {
		return Mono.just("An error occured. Please contact the support team or try after some time");
	}

}
