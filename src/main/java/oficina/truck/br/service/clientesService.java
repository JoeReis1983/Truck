package oficina.truck.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oficina.truck.br.entity.clientes;
import oficina.truck.br.repository.clientesRepository;

@Service
public class clientesService {
  @Autowired
  private clientesRepository clienteRepo;
  // @Autowired
  // private veiculosRepository veiculoRepo;
  // @Autowired
  // private manutencoesRepository mantencaoRepo;
  // @Autowired
  // private usuariosRepository usuarioRepo;

  @Transactional
  public clientes cadastrarCliente(String nome,String telefone, String  veiculos){
    clientes cliente = new clientes();
    cliente.setNome(nome);
    cliente.setTelefone(telefone);
    cliente.setVeiculos(veiculos);
    clienteRepo.save(cliente);
    return cliente;   
  }






}
