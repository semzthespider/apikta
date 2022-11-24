package com.kta.asosiasi.apikta.entities;

import java.util.Date;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;


import javax.persistence.*;

import com.kta.asosiasi.apikta.audit.AuditTableBase;


@Entity
@Table(name="kta_bu")
public class KtaEntity extends AuditTableBase{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private int id;
	private String user_id;
	private String id_asosiasi;
	private String npwp;
	private String no_kta;
	private Integer nib;
	private String nama_bu;
	private String alamat;
	private Integer kabupaten;
	private Integer provinsi;
	private Integer no_telp;
	private String email;
	private Integer status_kta;
	private Date tgl_terbit;
	private Date tgl_berakhir;
	private String status_proses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getId_asosiasi() {
		return id_asosiasi;
	}
	public void setId_asosiasi(String id_asosiasi) {
		this.id_asosiasi = id_asosiasi;
	}
	public String getNpwp() {
		return npwp;
	}
	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}
	public String getNo_kta() {
		return no_kta;
	}
	public void setNo_kta(String no_kta) {
		this.no_kta = no_kta;
	}
	public Integer getNib() {
		return nib;
	}
	public void setNib(Integer nib) {
		this.nib = nib;
	}
	public String getNama_bu() {
		return nama_bu;
	}
	public void setNama_bu(String nama_bu) {
		this.nama_bu = nama_bu;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public Integer getKabupaten() {
		return kabupaten;
	}
	public void setKabupaten(Integer kabupaten) {
		this.kabupaten = kabupaten;
	}
	public Integer getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(Integer provinsi) {
		this.provinsi = provinsi;
	}
	public Integer getNo_telp() {
		return no_telp;
	}
	public void setNo_telp(Integer no_telp) {
		this.no_telp = no_telp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getStatus_kta() {
		return status_kta;
	}
	public void setStatus_kta(Integer status_kta) {
		this.status_kta = status_kta;
	}
	public Date getTgl_terbit() {
		return tgl_terbit;
	}
	public void setTgl_terbit(Date tgl_terbit) {
		this.tgl_terbit = tgl_terbit;
	}
	public Date getTgl_berakhir() {
		return tgl_berakhir;
	}
	public void setTgl_berakhir(Date tgl_berakhir) {
		this.tgl_berakhir = tgl_berakhir;
	}
	public String getStatus_proses() {
		return status_proses;
	}
	public void setStatus_proses(String status_proses) {
		this.status_proses = status_proses;
	}
	
	
	
	
	
	
}
