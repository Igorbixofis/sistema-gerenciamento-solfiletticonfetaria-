package com.example.doces.Controllers;


import com.example.doces.DTOs.DoceDTO;
import com.example.doces.DTOs.DoceResponse;
import com.example.doces.Services.DoceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doce")
public class DoceController {

    private final DoceService doceService;
    public DoceController (DoceService doceService){this.doceService = doceService;}
    @PostMapping
    public ResponseEntity<?> lancarDoce (@RequestBody DoceDTO dto){ return ResponseEntity.ok(doceService.criarDoce(new DoceResponse()) );}

    @GetMapping
    public List<DoceResponse> mostrarDoce(){
        return doceService.mostrarDoce();
    }
    // o Mostrar doce se trata de get que mostraria todo o portfólio de doces e suas informações


    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Long id){
        return ResponseEntity.ok(doceService.buscarID(id));
    }
// o buscar id mostraria o doce e suas informações de forma individual, de forma a diferente do mostrarDoce, aparecer apenas aquilo que o user está procurando

    @DeleteMapping("/{id}")
    public ResponseEntity<?> apagarId(@PathVariable Long id){
        return ResponseEntity.ok(doceService.deletar(id));
    }
    // o apagar ID deleta o doce e  suas informações, utilizando seu ID como base
    @PutMapping("/{id}")
    public ResponseEntity<?> alterarId(@PathVariable Long id, @RequestBody DoceResponse response){
        return ResponseEntity.ok(doceService.alterar(id, response));
    }
    // o alterar ID utiliza do método PUT para alterar qualquer informação dos doces que fosse necessária, porém é necessario saber seu id para encontra-la
}
