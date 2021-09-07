package oficina.truck.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oficina.truck.br.entity.veiculos;

public interface veiculosRepository extends JpaRepository <veiculos, Long>{
  public List<veiculos> findByNome(String placa);
  
}
