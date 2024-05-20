package com.erainfotechbd.external_api_fetch;

import com.erainfotechbd.external_api_fetch.service.BinimoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExternalApiFetchApplication {


	private final BinimoyService binimoyService;

	@Autowired
	public ExternalApiFetchApplication(BinimoyService binimoyService) {
		this.binimoyService = binimoyService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExternalApiFetchApplication.class, args).getBean(ExternalApiFetchApplication.class).execute();
	}

	public void execute() {
		binimoyService.callProjectAApi();
	}
}
