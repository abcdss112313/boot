package sample.data.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Synn_users implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int user_id;
  @Column
  private String user_name;
  @Column
  private int role_id;
  @Column
  private String passwd;
  @Column
  private String account;
  @Column
  private String emails;

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public int getRole_id() {
    return role_id;
  }

  public void setRole_id(int role_id) {
    this.role_id = role_id;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getEmails() {
    return emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }
}
