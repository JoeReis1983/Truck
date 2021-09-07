package oficina.truck.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oficina.truck.br.entity.manutencoes;

public interface manutencoesRepository extends JpaRepository <manutencoes, Long>{
  public List<manutencoes> findByNome(String servico);
  
}
