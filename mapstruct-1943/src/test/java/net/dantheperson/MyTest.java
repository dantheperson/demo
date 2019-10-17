package net.dantheperson;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class MyTest {


	ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

	@Test
	void test() {


		ProductEntity entity = ProductEntity.builder().isActive(true).build();
		ProductDao dao = mapper.map(entity);

		assertThat(dao.isActive()).isTrue();

	}
}