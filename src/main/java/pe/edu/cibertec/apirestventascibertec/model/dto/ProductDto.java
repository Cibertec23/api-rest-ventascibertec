package pe.edu.cibertec.apirestventascibertec.model.dto;

import lombok.Data;

@Data
public class ProductDto implements DtoEntity {
    private Integer productid;
    private String productname;
    private Integer quantityperunit;
    private Double unitprice;
    private CategoryDto category;
    private SupplierDto supplier;
}
