package oficina.truck.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oficina.truck.br.entity.veiculos;
import oficina.truck.br.repository.veiculosRepository;

@Service
public class veiculosService {
  @Autowired
  private veiculosRepository veiculoRepo;
  
  @Transactional
  public veiculos cadastrarVeiculos(String modelo,String placa, String  ano, String proprietario){
    veiculos veiculo = new veiculos();
    veiculo.setModelo(modelo);;
    veiculo.setPlaca(placa);;
    veiculo.setProprietario(proprietario);
    veiculo.setAno(ano);
    veiculoRepo.save(veiculo);
    return veiculo;   
  }






}
