package oficina.truck.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oficina.truck.br.entity.usuarios;
import oficina.truck.br.repository.usuariosRepository;

@Service
public class usuariosService {
  @Autowired
  private usuariosRepository usuariosRepo;

  @Transactional
  public usuarios cadastrarUsuario(String email,String senha){
    usuarios usuario = new usuarios();
    usuario.setEmail(email);
    usuario.setSenha(senha);
    usuariosRepo.save(usuario);
    return usuario;
  }
}