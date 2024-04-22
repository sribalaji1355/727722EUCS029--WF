package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.Balaji727722EUCS029Product;
import com.examly.springapp.service.Balaji727722EUCS029ProductService;

@RestController
public class Balaji727722EUCS029ProductController {
    @Autowired
    Balaji727722EUCS029ProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<Balaji727722EUCS029Product> postMethod(@RequestBody Balaji727722EUCS029Product s) {
        if (service.post(s)) {
            return new ResponseEntity<Balaji727722EUCS029Product>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<Balaji727722EUCS029Product>> dndcjk() {
        List<Balaji727722EUCS029Product> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<Balaji727722EUCS029Product>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<Balaji727722EUCS029Product>> getbyid(@PathVariable String productCategory) {
        List<Balaji727722EUCS029Product> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<Balaji727722EUCS029Product>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<Balaji727722EUCS029Product>> getbdyid(@PathVariable String priceCategory) {
        List<Balaji727722EUCS029Product> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<Balaji727722EUCS029Product>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
