package br.com.kalil.object;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobo")
public class Mobo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private String chipset;
	private String socket;
	private String memoryFactor;
	private Byte memoryQuantity;
	private String formFactor;
	private String busInterface;
	private Boolean m2Support;
	private Byte m2Ports;
	private String sataFactor;
	private Byte sataPorts;
	private String ethernetInterface;
	private Boolean isWifi;
	private Byte usbPorts;
	private Byte quantUsb3_0;
	private Byte quantUsb2_0;
	@OneToMany
	@JoinColumn(name = "cpusupport_id")
	private List<CPUSupport> CPU_support_specs;
	private Byte cpuVrm;
	private Float price;
	private Boolean isAMD;
	private Boolean isIntel;
	private Byte PCMasterLevel;
	private String urlImage;
	
	public Mobo() {
		super();
	}

	public Mobo(Integer id, String name, String brand, String chipset, String socket, String memoryFactor,
			Byte memoryQuantity, String formFactor, String busInterface, Boolean m2Support, Byte m2Ports,
			String sataFactor, Byte sataPorts, String ethernetInterface, Boolean isWifi, Byte usbPorts,
			Byte quantUsb3_0, Byte quantUsb2_0, List<CPUSupport> cPU_support_specs, Byte cpuVrm, Float price,
			Boolean isAMD, Boolean isIntel, Byte pCMasterLevel, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.chipset = chipset;
		this.socket = socket;
		this.memoryFactor = memoryFactor;
		this.memoryQuantity = memoryQuantity;
		this.formFactor = formFactor;
		this.busInterface = busInterface;
		this.m2Support = m2Support;
		this.m2Ports = m2Ports;
		this.sataFactor = sataFactor;
		this.sataPorts = sataPorts;
		this.ethernetInterface = ethernetInterface;
		this.isWifi = isWifi;
		this.usbPorts = usbPorts;
		this.quantUsb3_0 = quantUsb3_0;
		this.quantUsb2_0 = quantUsb2_0;
		CPU_support_specs = cPU_support_specs;
		this.cpuVrm = cpuVrm;
		this.price = price;
		this.isAMD = isAMD;
		this.isIntel = isIntel;
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

	public String getChipset() {
		return chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public String getMemoryFactor() {
		return memoryFactor;
	}

	public void setMemoryFactor(String memoryFactor) {
		this.memoryFactor = memoryFactor;
	}

	public Byte getMemoryQuantity() {
		return memoryQuantity;
	}

	public void setMemoryQuantity(Byte memoryQuantity) {
		this.memoryQuantity = memoryQuantity;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public String getBusInterface() {
		return busInterface;
	}

	public void setBusInterface(String busInterface) {
		this.busInterface = busInterface;
	}

	public Boolean getM2Support() {
		return m2Support;
	}

	public void setM2Support(Boolean m2Support) {
		this.m2Support = m2Support;
	}

	public Byte getM2Ports() {
		return m2Ports;
	}

	public void setM2Ports(Byte m2Ports) {
		this.m2Ports = m2Ports;
	}

	public String getSataFactor() {
		return sataFactor;
	}

	public void setSataFactor(String sataFactor) {
		this.sataFactor = sataFactor;
	}

	public Byte getSataPorts() {
		return sataPorts;
	}

	public void setSataPorts(Byte sataPorts) {
		this.sataPorts = sataPorts;
	}

	public String getEthernetInterface() {
		return ethernetInterface;
	}

	public void setEthernetInterface(String ethernetInterface) {
		this.ethernetInterface = ethernetInterface;
	}

	public Boolean getIsWifi() {
		return isWifi;
	}

	public void setIsWifi(Boolean isWifi) {
		this.isWifi = isWifi;
	}

	public Byte getUsbPorts() {
		return usbPorts;
	}

	public void setUsbPorts(Byte usbPorts) {
		this.usbPorts = usbPorts;
	}

	public Byte getQuantUsb3_0() {
		return quantUsb3_0;
	}

	public void setQuantUsb3_0(Byte quantUsb3_0) {
		this.quantUsb3_0 = quantUsb3_0;
	}

	public Byte getQuantUsb2_0() {
		return quantUsb2_0;
	}

	public void setQuantUsb2_0(Byte quantUsb2_0) {
		this.quantUsb2_0 = quantUsb2_0;
	}

	public List<CPUSupport> getCPU_support_specs() {
		return CPU_support_specs;
	}

	public void setCPU_support_specs(List<CPUSupport> cPU_support_specs) {
		CPU_support_specs = cPU_support_specs;
	}

	public Byte getCpuVrm() {
		return cpuVrm;
	}

	public void setCpuVrm(Byte cpuVrm) {
		this.cpuVrm = cpuVrm;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getIsAMD() {
		return isAMD;
	}

	public void setIsAMD(Boolean isAMD) {
		this.isAMD = isAMD;
	}

	public Boolean getIsIntel() {
		return isIntel;
	}

	public void setIsIntel(Boolean isIntel) {
		this.isIntel = isIntel;
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
