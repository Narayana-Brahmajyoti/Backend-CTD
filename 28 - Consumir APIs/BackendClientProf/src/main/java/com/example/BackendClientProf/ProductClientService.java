package com.example.BackendClientProf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.springframework.stereotype.Service;


@Service
public class ProductClientService {

    public ProductDTO salvar(ProductDTO productDTO) {
        HttpResponse<String> response = null;
        ProductDTO product = null;

        try {
            response = Unirest.post("http://localhost:8080/product")
                    .header("Content-Type", "application/json")
                    .body(JsonUtil.asJsonString(productDTO)).asString();

            product = JsonUtil.objectFromString(ProductDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }

    public ProductDTO buscarPorId(int id) {
        HttpResponse<String> response = null;
        ProductDTO product = null;

        try {
            response = Unirest.get("http://localhost:8080/product/" + id).asString();

            product = JsonUtil.objectFromString(ProductDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }
}
