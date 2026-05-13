package com.itu.MarinDemo.controllers;

import com.itu.MarinDemo.entities.Persona;
import com.itu.MarinDemo.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
