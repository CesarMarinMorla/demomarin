package com.itu.MarinDemo.services;

import com.itu.MarinDemo.entities.Autor;
import com.itu.MarinDemo.repositories.AutorRepository;
import com.itu.MarinDemo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
