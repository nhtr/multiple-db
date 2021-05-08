package com.htcnp.multipledb.orcldb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SAPP_QA", schema = "SALES_APP_CNSP")
public class QuestionAndAnswerOracle implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ID_SAN_PHAM")
    private Integer idSP;

    @Column(name = "CHU_DE_CAP_1")
    private Integer chuDeCap1;

    @Column(name = "CHU_DE_CAP_2")
    private Integer chuDeCap2;

    @Column(name = "ND_CAU_HOI")
    private String ndCauHoi;

    @Column(name = "ND_CAU_TRA_LOI")
    private String ndCauTraLoi;

    @Column(name = "TRANG_THAI")
    private Integer trangThai;

    @Column(name = "NGAY_TAO")
    private Date ngayTao;

    @Column(name = "NGUOI_TAO")
    private String nguoiTao;

    @Column(name = "NGAY_SUA")
    private Date ngaySua;

    @Column(name = "NGUOI_SUA")
    private String nguoiSua;

    @Column(name = "IS_DUYET")
    private Integer isDuyet;

    @Column(name = "NGAY_DUYET")
    private Date ngayDuyet;

    @Column(name = "NGUOI_DUYET")
    private String nguoiDuyet;

    @Column(name = "LY_DO_TU_CHOI")
    private String lyDoTuChoi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSP() {
        return idSP;
    }

    public void setIdSP(Integer idSP) {
        this.idSP = idSP;
    }

    public Integer getChuDeCap1() {
        return chuDeCap1;
    }

    public void setChuDeCap1(Integer chuDeCap1) {
        this.chuDeCap1 = chuDeCap1;
    }

    public Integer getChuDeCap2() {
        return chuDeCap2;
    }

    public void setChuDeCap2(Integer chuDeCap2) {
        this.chuDeCap2 = chuDeCap2;
    }

    public String getNdCauHoi() {
        return ndCauHoi;
    }

    public void setNdCauHoi(String ndCauHoi) {
        this.ndCauHoi = ndCauHoi;
    }

    public String getNdCauTraLoi() {
        return ndCauTraLoi;
    }

    public void setNdCauTraLoi(String ndCauTraLoi) {
        this.ndCauTraLoi = ndCauTraLoi;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Integer getIsDuyet() {
        return isDuyet;
    }

    public void setIsDuyet(Integer isDuyet) {
        this.isDuyet = isDuyet;
    }

    public Date getNgayDuyet() {
        return ngayDuyet;
    }

    public void setNgayDuyet(Date ngayDuyet) {
        this.ngayDuyet = ngayDuyet;
    }

    public String getNguoiDuyet() {
        return nguoiDuyet;
    }

    public void setNguoiDuyet(String nguoiDuyet) {
        this.nguoiDuyet = nguoiDuyet;
    }

    public String getLyDoTuChoi() {
        return lyDoTuChoi;
    }

    public void setLyDoTuChoi(String lyDoTuChoi) {
        this.lyDoTuChoi = lyDoTuChoi;
    }
}
