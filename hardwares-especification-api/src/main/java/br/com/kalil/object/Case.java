package br.com.kalil.object;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "case")
public class Case {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private String formFactor;
	private String maxMoboFormFactor;
	private Byte hdCapacity;
	private Byte ssdCapacity;
	private Byte fansCapacity;
	private Byte pciDevicesCapacity;
	private Byte PCMasterLevel;
	private String urlImage;
	
	public Case() {
		super();
	}

	public Case(Integer id, String name, String brand, String formFactor, String maxMoboFormFactor, Byte hdCapacity,
			Byte ssdCapacity, Byte fansCapacity, Byte pciDevicesCapacity, Byte pCMasterLevel, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.formFactor = formFactor;
		this.maxMoboFormFactor = maxMoboFormFactor;
		this.hdCapacity = hdCapacity;
		this.ssdCapacity = ssdCapacity;
		this.fansCapacity = fansCapacity;
		this.pciDevicesCapacity = pciDevicesCapacity;
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

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getMaxMoboFormFactor() {
		return maxMoboFormFactor;
	}

	public void setMaxMoboFormFactor(String maxMoboFormFactor) {
		this.maxMoboFormFactor = maxMoboFormFactor;
	}

	public Byte getHdCapacity() {
		return hdCapacity;
	}

	public void setHdCapacity(Byte hdCapacity) {
		this.hdCapacity = hdCapacity;
	}

	public Byte getSsdCapacity() {
		return ssdCapacity;
	}

	public void setSsdCapacity(Byte ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}

	public Byte getFansCapacity() {
		return fansCapacity;
	}

	public void setFansCapacity(Byte fansCapacity) {
		this.fansCapacity = fansCapacity;
	}

	public Byte getPciDevicesCapacity() {
		return pciDevicesCapacity;
	}

	public void setPciDevicesCapacity(Byte pciDevicesCapacity) {
		this.pciDevicesCapacity = pciDevicesCapacity;
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
