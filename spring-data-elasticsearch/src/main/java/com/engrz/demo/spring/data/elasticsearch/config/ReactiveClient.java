package com.engrz.demo.spring.data.elasticsearch.config;

import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class ReactiveClient {
/*
    @Bean
    ReactiveElasticsearchClient client() {

        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9291")
                .withWebClientConfigurer(webClient -> {
                    ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
                            .codecs(configurer -> configurer.defaultCodecs()
                                    .maxInMemorySize(-1))
                            .build();
                    return webClient.mutate().exchangeStrategies(exchangeStrategies).build();
                })
                .build();

        return ReactiveRestClients.create(clientConfiguration);
    }

    public static void main(String[] args) {
        Mono<IndexResponse> response = client.index(request ->

        request.index("spring-data")
                .type("elasticsearch")
                .id(randomID())
                .source(singletonMap("feature", "reactive-client"))
                .setRefreshPolicy(IMMEDIATE);
        ));
    }
*/

}
