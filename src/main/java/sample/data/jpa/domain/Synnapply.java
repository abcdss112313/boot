package sample.data.jpa.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by windsorl on 2017/6/22.
 */
@Entity
@Table(name = "synn_apply")
public class Synnapply implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "apply_id")
    private int applyid;

    @Column(name="user_id")
    private int userid;

    private Date applydate;

    private Date begindate;

    private Date enddate;

    private int hours;

    private int apply_type;

    private int approve_user_id;

    private Date last_update_datetime;

    public int getApplyid() {
        return applyid;
    }

    public void setApplyid(int applyid) {
        this.applyid = applyid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getApply_type() {
        return apply_type;
    }

    public void setApply_type(int apply_type) {
        this.apply_type = apply_type;
    }

    public int getApprove_user_id() {
        return approve_user_id;
    }

    public void setApprove_user_id(int approve_user_id) {
        this.approve_user_id = approve_user_id;
    }

    public Date getLast_update_datetime() {
        return last_update_datetime;
    }

    public void setLast_update_datetime(Date last_update_datetime) {
        this.last_update_datetime = last_update_datetime;
    }
}
