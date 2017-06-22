package sample.data.jpa.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="synn_role")
public class Synn_role implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int role_id;

  @Column
  private String role_name;


  public int getRole_id() {
    return role_id;
  }

  public void setRole_id(int role_id) {
    this.role_id = role_id;
  }

  public String getRole_name() {
    return role_name;
  }

  public void setRole_name(String role_name) {
    this.role_name = role_name;
  }
}
