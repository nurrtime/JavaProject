package sdu.store.online.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Nurs Tech
 * @project online-store;
 */

@Controller
public class CustomerController {

  @GetMapping("/")
  public String index() {
    return "index.html";
  }
}
