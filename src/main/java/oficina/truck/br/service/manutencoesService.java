package oficina.truck.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oficina.truck.br.entity.manutencoes;
import oficina.truck.br.repository.manutencoesRepository;

@Service
public class manutencoesService {
  @Autowired
  private manutencoesRepository manutencaoRepo;
  
  @Transactional
  public manutencoes cadastrarManutencoes(String servico,String valor, String  dia, Long id_cliente, Long id_veiculo){

    manutencoes manutencao = new manutencoes();
    manutencao.setServico(servico);
    manutencao.setValor(valor);
    manutencao.setDia(dia);
    manutencao.setId_cliente(id_cliente);
    manutencao.setId_veiculo(id_veiculo);
    manutencaoRepo.save(manutencao);
    return manutencao;   
  }
}
