package org.blazekill.springreact.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/api")
public class DummyController {

    @GetMapping("/booty")
    public void giveBooty() {

    }

}
