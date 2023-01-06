package com.example.Proje.controller;

import com.example.Proje.dto.ProductDto;
import com.example.Proje.entity.Product;
import com.example.Proje.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/createProduct")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return productService.getProduct();
    }
    @DeleteMapping("/deleteProduct/{id}")
    public void delete(@PathVariable("id") Long id){
        productService.delete(id);
    }
    @PatchMapping("/patchProduct/{id}")
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto productDto, @PathVariable("id") Long id){
        if (id == productDto.getId()){
            return ResponseEntity.ok(productService.update(productDto));
        }
        else {
            throw new IllegalArgumentException(("ID'LER EŞLEŞMİYOR"));
        }
    }
}
