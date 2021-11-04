package com.tiemvacxin.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class TiepXuc {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer iduser;

    private Integer iddiadiem;

    private Date thoigian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIddiadiem() {
        return iddiadiem;
    }

    public void setIddiadiem(Integer iddiadiem) {
        this.iddiadiem = iddiadiem;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }
}
