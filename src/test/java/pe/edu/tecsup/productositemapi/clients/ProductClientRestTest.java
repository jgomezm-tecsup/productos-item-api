package pe.edu.tecsup.productositemapi.clients;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.productositemapi.models.Producto;

@SpringBootTest
public class ProductClientRestTest {
	
	//private static final Logger logger 
	//	= LoggerFactory.getLogger(ProductClientRestTest.class);

	
	@Autowired
	ProductoClienteRest productoClientRest;

	@Test
	public void consulta() {
		List<Producto> productos 
			= productoClientRest.listar();
		//logger.info(productos.toString());
		assertThat(productos.isEmpty(), is(false));
	}
	
}
