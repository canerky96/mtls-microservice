package com.kaya.productservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class ProductService {

  private final RestTemplate restTemplate;

  public ProductService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @PostConstruct
  public void hello() {
    String response = restTemplate.getForObject("https://localhost:8444", String.class);
    System.out.println(response);
  }
}
