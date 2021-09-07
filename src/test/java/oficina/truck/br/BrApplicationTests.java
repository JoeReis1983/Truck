package oficina.truck.br;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import oficina.truck.br.service.*;
import oficina.truck.br.repository.*;

import oficina.truck.br.entity.*;

@SpringBootTest
class BrApplicationTests {

	@Autowired
	private clientesRepository clienteRepo;

	@Autowired
	private clientesService clienteServ;

	@Autowired
	private veiculosService  veiculoServ;

	@Autowired
	private veiculosRepository veiculoRepo;

	@Autowired
	private usuariosService  usuarioServ;

	@Autowired
	private usuariosRepository usuarioRepo;

	@Autowired
	private manutencoesService manutServ;

	@Autowired
	private manutencoesRepository manutRepo;




	@Test
	void testContextLoads() {
		System.out.println("Hello, World!");
	}

	@Test
	void cadastrarClienteTestOk(){
		clienteServ.cadastrarCliente("Celso Reis","190","Fusca");
		List<clientes> cli = clienteRepo.findByNome("Celso Reis");
		assertFalse(cli.isEmpty());
	}

	@Test
	void cadastrarVeiculoTestOk(){
		veiculoServ.cadastrarVeiculos("Volvo", "JOE-2021", "1983", "1");
		List<veiculos> veic = veiculoRepo.findByPlaca("JOE-2021");
		assertNotNull(veic);
	}

	@Test
	void cadastrarUsuarioTestOk(){
		usuarioServ.cadastrarUsuario("adriano@gmail.com", "pass123");
		List<usuarios> users = usuarioRepo.findByEmail("adriano@gmail.com");
		assertFalse(users.size()==0);
	}

	// @Test
	// void cadastrarManutençõesTestOk(){
	// 	manutServ.cadastrarManutencoes("Alinhamento", "120,00", "23/08/2021",  1,  1);
	// 	List<manutencoes> manuts = manutRepo.findByServico("Alinhamento");
	// 	assertNotNull(manuts);

	// }


}
