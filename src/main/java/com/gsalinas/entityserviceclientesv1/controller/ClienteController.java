package com.gsalinas.entityserviceclientesv1.controller;

import com.gsalinas.entityserviceclientesv1.persistence.entity.Datajson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public ResponseEntity<Datajson> getJson(){
         Datajson jsonCliente = new Datajson();
         jsonCliente.setId(1L);
        jsonCliente.setNombre("juan Perez");
        jsonCliente.setCorreo("jp@mail.com");
        return ResponseEntity.ok(jsonCliente);
    }
}
