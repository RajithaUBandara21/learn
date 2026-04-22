    package com.rajitha.keyclock.controller;

    import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
    import org.springframework.security.access.prepost.PreAuthorize;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/v1/demo")
    public class DemoController {

        @GetMapping("/hello-1")
        @PreAuthorize("hasRole('admin')")
        public String hello() {
            return "Hello from spring boot and keycloak user";
        }

        @GetMapping("/hello-2")
        @PreAuthorize("hasRole('user')")
        public String hello2() {
            return "Hello2 from spring boot and keycloak admin";
        }
    }
