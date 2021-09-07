package oficina.truck.br;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import oficina.truck.br.service.clientesService;
import oficina.truck.br.repository.clientesRepository;

@SpringBootTest
class BrApplicationTests {

	@Autowired
	private clientesRepository clienteRepo;

	@Autowired
	private clientesService clienteServ;

	@Test
	void testContextLoads() {
		System.out.println("Hello, World!");
	}

	@Test
	void cadastrarClienteTestOk(){
		clienteServ.cadastrarCliente("Celso Reis","190","Fusca");
		// List<clientes> cli = clienteRepo.findByNome("Celso Reis");
		// assertFalse(cli.isEmpty());
	}

}
