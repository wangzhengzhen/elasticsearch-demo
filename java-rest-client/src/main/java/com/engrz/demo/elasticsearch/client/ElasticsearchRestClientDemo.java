package com.engrz.demo.elasticsearch.client;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.client.*;

import java.io.IOException;

public class ElasticsearchRestClientDemo {

    public static void main(String[] args) throws IOException {

        String es_host = "10.147.20.227";
        int es_port = 9200;

        RestClientBuilder builder = RestClient.builder(new HttpHost(es_host, es_port));
        // 设置每次请求的默认头信息
        Header[] defaultHeaders = new Header[]{new BasicHeader("header", "value")};
        builder.setDefaultHeaders(defaultHeaders);
        //
        builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS);
        // 监听错误节点
        builder.setFailureListener(new RestClient.FailureListener() {
            @Override
            public void onFailure(Node node) {
                System.out.println("结点错误，" + node.toString());
            }
        });
        // 配置超时时间，或者身份验证
        builder.setRequestConfigCallback(requestConfigBuilder -> requestConfigBuilder.setSocketTimeout(10000));
        // 可配置代理或者加密ssl
//        builder.setHttpClientConfigCallback(httpClientBuilder -> httpClientBuilder.setProxy(new HttpHost("proxy", 9000, "http"));
        RestClient restClient = builder.build();

        // 发送elasticsearch命令
        Request request = new Request("GET", "_cluster/health");
        Response response = restClient.performRequest(request);
        response.getEntity().writeTo(System.out);
        System.out.println();
        System.out.println("Finish！");
        restClient.close();

        // 异步请求
//        Cancellable cancellable = restClient.performRequestAsync(request, new ResponseListener() {
//
//            @Override
//            public void onSuccess(Response response) {
//                try {
//                    response.getEntity().writeTo(System.out);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Exception exception) {
//                System.out.println("失败：" + exception.getMessage());
//            }
//        });

        // 撤销请求
//        cancellable.cancel();


    }

}
