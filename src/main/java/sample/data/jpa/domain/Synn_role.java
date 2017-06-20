package sample.data.jpa.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Synn_role {
  @Id
  @GeneratedValue
  private Long role_id;

  @Column
  private String role_name;

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public String getRole_name() {
    return role_name;
  }

  public void setRole_name(String role_name) {
    this.role_name = role_name;
  }
}
