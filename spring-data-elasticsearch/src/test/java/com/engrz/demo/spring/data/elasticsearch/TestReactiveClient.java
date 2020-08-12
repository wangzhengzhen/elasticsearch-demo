package com.engrz.demo.spring.data.elasticsearch;

import com.engrz.demo.spring.data.elasticsearch.config.ReactiveClient;
import org.elasticsearch.action.index.IndexResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class TestReactiveClient {

    @Autowired
    private ReactiveElasticsearchClient client;

    @Test
    public void test() {
//        Mono<IndexResponse> response = client.index(request ->
//            request.index("spring-data")
//                    .type("elasticsearch")
//                    .id(randomID())
//                    .source(singletonMap("feature", "reactive-client"))
//                    .setRefreshPolicy(IMMEDIATE);
//        );
    }

}
