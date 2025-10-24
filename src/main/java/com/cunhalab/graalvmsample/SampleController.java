package com.cunhalab.graalvmsample;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getSample() {
        final Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "Hello from GraalVM with Spring Boot!");
        response.put("availableProcessors", Runtime.getRuntime().availableProcessors());
        response.put("freeMemory", Runtime.getRuntime().freeMemory());
        response.put("totalMemory", Runtime.getRuntime().totalMemory());
        response.put("maxMemory", Runtime.getRuntime().maxMemory());
        return ResponseEntity.ok(response);
    }

}
