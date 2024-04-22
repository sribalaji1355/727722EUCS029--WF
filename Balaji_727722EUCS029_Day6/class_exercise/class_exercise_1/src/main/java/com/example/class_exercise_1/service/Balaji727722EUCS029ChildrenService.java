package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.Balaji727722EUCS029Children;
import com.example.class_exercise_1.repository.Balaji727722EUCS029ChildrenRepo;

@Service
public class Balaji727722EUCS029ChildrenService {

     @Autowired
     public Balaji727722EUCS029ChildrenRepo childrenRepo;

     public List<Balaji727722EUCS029Children> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public Balaji727722EUCS029Children save(Balaji727722EUCS029Children children) {
          return childrenRepo.save(children);

     }

     public List<Balaji727722EUCS029Children> sortedPage(int offset, int pagesize, String field) {
          Page<Balaji727722EUCS029Children> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<Balaji727722EUCS029Children> pagination(int offset, int pagesize) {
          Page<Balaji727722EUCS029Children> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
