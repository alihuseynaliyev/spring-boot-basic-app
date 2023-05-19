package controller;

import org.springframework.web.bind.annotation.RestController;
import service.SampleService;

@RestController
public class SampleController {
    private final SampleService sampleService;


    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }
}
