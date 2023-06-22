package br.com.kalil.object;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cpu")
public class CPU {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private Byte cores;
	private Byte threads;
	private String socket;
	private Byte tdp;
	private Integer consumo;
	private Float price;
	private Float benefitCostByBench;
	private Float minFrequencia;
	private Float maxFrequencia;
	private Integer benchPoints;
	private LocalDate launchDate;
	private Byte utilLanes;
	private Byte PCMasterLevel;
	private String urlImage;
	@ManyToOne
	@JoinColumn(name = "cpusupport_id")
	private CPUSupport cpuSupport;
	
	public CPU() {
		super();
	}

	public CPU(Integer id, String name, String brand, Byte cores, Byte threads, String socket, Byte tdp,
			Integer consumo, Float price, Float benefitCostByBench, Float minFrequencia, Float maxFrequencia,
			Integer benchPoints, LocalDate launchDate, Byte utilLanes, Byte pCMasterLevel, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.cores = cores;
		this.threads = threads;
		this.socket = socket;
		this.tdp = tdp;
		this.consumo = consumo;
		this.price = price;
		this.benefitCostByBench = benefitCostByBench;
		this.minFrequencia = minFrequencia;
		this.maxFrequencia = maxFrequencia;
		this.benchPoints = benchPoints;
		this.launchDate = launchDate;
		this.utilLanes = utilLanes;
		PCMasterLevel = pCMasterLevel;
		this.urlImage = urlImage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Byte getCores() {
		return cores;
	}

	public void setCores(Byte cores) {
		this.cores = cores;
	}

	public Byte getThreads() {
		return threads;
	}

	public void setThreads(Byte threads) {
		this.threads = threads;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public Byte getTdp() {
		return tdp;
	}

	public void setTdp(Byte tdp) {
		this.tdp = tdp;
	}

	public Integer getConsumo() {
		return consumo;
	}

	public void setConsumo(Integer consumo) {
		this.consumo = consumo;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getBenefitCostByBench() {
		return benefitCostByBench;
	}

	public void setBenefitCostByBench(Float benefitCostByBench) {
		this.benefitCostByBench = benefitCostByBench;
	}

	public Float getMinFrequencia() {
		return minFrequencia;
	}

	public void setMinFrequencia(Float minFrequencia) {
		this.minFrequencia = minFrequencia;
	}

	public Float getMaxFrequencia() {
		return maxFrequencia;
	}

	public void setMaxFrequencia(Float maxFrequencia) {
		this.maxFrequencia = maxFrequencia;
	}

	public Integer getBenchPoints() {
		return benchPoints;
	}

	public void setBenchPoints(Integer benchPoints) {
		this.benchPoints = benchPoints;
	}

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public Byte getUtilLanes() {
		return utilLanes;
	}

	public void setUtilLanes(Byte utilLanes) {
		this.utilLanes = utilLanes;
	}

	public Byte getPCMasterLevel() {
		return PCMasterLevel;
	}

	public void setPCMasterLevel(Byte pCMasterLevel) {
		PCMasterLevel = pCMasterLevel;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
}
