package com.kaya.basketservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class BasketController {

  @GetMapping
  public String hello() {
    return "hello";
  }
}
