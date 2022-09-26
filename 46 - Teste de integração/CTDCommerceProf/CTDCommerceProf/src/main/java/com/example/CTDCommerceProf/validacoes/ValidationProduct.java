package com.example.CTDCommerceProf.validacoes;

import com.example.CTDCommerceProf.entity.dto.ProductDTO;
import com.example.CTDCommerceProf.exception.VariableNullException;

import java.util.ArrayList;
import java.util.List;

public class ValidationProduct {

    public Boolean validationProductVariables(ProductDTO productDTO) throws VariableNullException {
        List<String> variables = new ArrayList<>();

        if (productDTO.getTitle() == null || productDTO.getTitle().isEmpty()) {
            variables.add("Title");
        }
        if (productDTO.getPrice() <= 0) {
            variables.add("Price");
        }
        if (productDTO.getDescription() == null || productDTO.getDescription().isEmpty()) {
            variables.add("Description");
        }
        if (productDTO.getImage() == null || productDTO.getImage().isEmpty()) {
            variables.add("Image");
        }
        if (productDTO.getCategory() == null || productDTO.getCategory().getId() <= 0) {
            variables.add("Category");
        }

        if(!variables.isEmpty())
            throw new VariableNullException("Verifique as variáveis listadas", variables);

        return true;
    }
}
