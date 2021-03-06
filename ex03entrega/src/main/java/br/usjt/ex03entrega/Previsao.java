package br.usjt.ex03entrega;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_previ")
public class Previsao {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Double tempmin;

	private Double tempmax;
	
	private int humidadear;
	
	private String descr;
	
	private String diads;
	
	private String dataeH;
	
	private Double lati;
	
	private Double longi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTempmin() {
		return tempmin;
	}

	public void setTempmin(Double tempmin) {
		this.tempmin = tempmin;
	}

	public Double getTempmax() {
		return tempmax;
	}

	public void setTempmax(Double tempmax) {
		this.tempmax = tempmax;
	}

	public int getHumidadear() {
		return humidadear;
	}

	public void setHumidadear(int humidadear) {
		this.humidadear = humidadear;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDiads() {
		return diads;
	}

	public void setDiads(String diads) {
		this.diads = diads;
	}

	public String getDataeH() {
		return dataeH;
	}

	public void setDataeH(String dataeH) {
		this.dataeH = dataeH;
	}

	public Double getLati() {
		return lati;
	}

	public void setLati(Double lati) {
		this.lati = lati;
	}

	public Double getLongi() {
		return longi;
	}

	public void setLongi(Double longi) {
		this.longi = longi;
	}

}
