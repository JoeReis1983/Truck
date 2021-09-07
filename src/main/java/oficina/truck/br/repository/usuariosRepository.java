package oficina.truck.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oficina.truck.br.entity.usuarios;

public interface usuariosRepository extends JpaRepository <usuarios, Long>{
  public List<usuarios> findByNome(String email);
  
}
