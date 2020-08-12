package com.engrz.demo.spring.data.elasticsearch;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class TestRestClientConfig {

    @Autowired
    private RestHighLevelClient highLevelClient;

    @Test
    public void test() {
//        RestClient lowLevelClient = highLevelClient.getLowLevelClient();
//        IndexRequest request = new IndexRequest("spring-data", "elasticsearch", randomID())
//                .source(singletonMap("feature", "high-level-rest-client"))
//                .setRefreshPolicy(IMMEDIATE);
//
//        IndexResponse response = highLevelClient.index(request);
    }
}
