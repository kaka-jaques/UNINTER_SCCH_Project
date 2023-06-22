package br.com.kalil.object;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cpusupport")
public class CPUSupport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(mappedBy = "cpuSupport")
	private List<CPU> cpu;
	
	public CPUSupport() {
		super();
		
	}
	public CPUSupport(Integer id, String name, String brand, Byte cores, Byte threads, String socket, Byte tdp,
			Integer consumo, Float price, Float benefitCostByBench, Float minFrequencia, Float maxFrequencia,
			Integer benchPoints, LocalDate launchDate, Byte utilLanes, Byte pCMasterLevel, String urlImage) {
		super();
	}
	
	public CPUSupport(Integer id, List<CPU> cpu) {
		super();
		this.id = id;
		this.cpu = cpu;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<CPU> getCpu() {
		return cpu;
	}
	
	public void setCpu(List<CPU> cpu) {
		this.cpu = cpu;
	}
	
}
