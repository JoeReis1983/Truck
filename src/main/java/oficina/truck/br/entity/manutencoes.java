package oficina.truck.br.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manutencoes")
public class manutencoes {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "servico")
  private String servico;
  
  @Column(name = "valor")
  private String valor;

  @Column(name = "dia")
  private String dia;

  @Column(name = "id_cliente")
  private Long id_cliente;
 
  @Column(name = "id_veiculos")
  private Long id_veiculos;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getServico() {
    return servico;
  }

  public void setServico(String servico) {
    this.servico = servico;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public Long getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(Long id_cliente) {
    this.id_cliente = id_cliente;
  }

  public Long getId_veiculos() {
    return id_veiculos;
  }

  public void setId_veiculos(Long id_veiculos) {
    this.id_veiculos = id_veiculos;
  }

  
  
}