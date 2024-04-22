package com.example.day6pah.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6pah.model.Balaji727722EUCS029Language;
import com.example.day6pah.repository.Balaji727722EUCS029LanguageRepo;

@Service
public class Balaji727722EUCS029LangaugeService {
    public Balaji727722EUCS029LanguageRepo languageRepo;
    public Balaji727722EUCS029LangaugeService(Balaji727722EUCS029LanguageRepo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(Balaji727722EUCS029Language language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Balaji727722EUCS029Language> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<Balaji727722EUCS029Language> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<Balaji727722EUCS029Language> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}
