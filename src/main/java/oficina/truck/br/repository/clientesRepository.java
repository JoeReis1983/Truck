package oficina.truck.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oficina.truck.br.entity.clientes;

public interface clientesRepository extends JpaRepository <clientes, Long>{
  public List<clientes> findByNome(String nome);
  
}
