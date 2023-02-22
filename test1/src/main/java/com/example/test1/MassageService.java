package com.example.test1;
import com.example.test1.entity.Massage;
import com.example.test1.repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MassageService {
    @Autowired
    private MassageRepository massageRepository;

    public List<Massage> work(String text, String tag){
        Massage massage = new Massage().withText(text).withTag(tag);
        massageRepository.save(massage);
       return (List<Massage>) massageRepository.findAll();
    }
}
