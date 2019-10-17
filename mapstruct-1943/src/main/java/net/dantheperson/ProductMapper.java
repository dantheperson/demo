package net.dantheperson;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

	ProductDao map(ProductEntity one);

}