package com.example.BackendClientProf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productClient")
public class ProductClientController {

    @Autowired
    private ProductClientService productClientService;

    @PostMapping("/salvar")
    public ProductDTO salvar(@RequestBody ProductDTO productDTO) {
        return productClientService.salvar(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO buscarPorId(@PathVariable int id) {
        return productClientService.buscarPorId(id);
    }
}
