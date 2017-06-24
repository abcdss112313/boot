package sample.data.jpa.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by windsorl on 2017/6/24.
 */
@Entity
@Table(name = "synnemail")
public class SynnEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emailId")
    private int id;
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private String sendfrom;
    private String sendto;
    private String subject;
    private String content;
    private Date sendtime;
    private int mailtype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSendfrom() {
        return sendfrom;
    }

    public void setSendfrom(String sendfrom) {
        this.sendfrom = sendfrom;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    public int getMailtype() {
        return mailtype;
    }

    public void setMailtype(int mailtype) {
        this.mailtype = mailtype;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }


}
