package br.com.kalil.object;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gpu")
public class GPU {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private Integer shadersUnit;
	private Long transistors;
	private Float lithograph;
	private String busInterface;
	private Integer busWidth;
	private Float bandwidth;
	private Float pixelRate;
	private Float textureRate;
	private String memoryType;
	private Integer memorySize;
	private Float gpuClockDefault;
	private Float gpuClockBoost;
	private Float memoryClockEffective;
	private Byte tdp;
	private Integer coonsume;
	private Float price;
	private String directXVersion;
	private Boolean AMDCrossfireOrNvidiaSLI;
	private Boolean OpenCL;
	private Boolean CUDA;
	private Boolean DirectCompute;
	private Boolean DirectML;
	private Boolean Vulkan;
	private Boolean RayTracing;
	private Boolean PhysX;
	private Boolean OpenGL4_6;
	private Byte PCMasterLevel;
	private String urlImage;
	
	public GPU() {
		super();
	}

	public GPU(Integer id, String name, String brand, Integer shadersUnit, Long transistors, Float lithograph,
			String busInterface, Integer busWidth, Float bandwidth, Float pixelRate, Float textureRate,
			String memoryType, Integer memorySize, Float gpuClockDefault, Float gpuClockBoost,
			Float memoryClockEffective, Byte tdp, Integer coonsume, Float price, String directXVersion,
			Boolean aMDCrossfireOrNvidiaSLI, Boolean openCL, Boolean cUDA, Boolean directCompute, Boolean directML,
			Boolean vulkan, Boolean rayTracing, Boolean physX, Boolean openGL4_6, Byte pCMasterLevel, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.shadersUnit = shadersUnit;
		this.transistors = transistors;
		this.lithograph = lithograph;
		this.busInterface = busInterface;
		this.busWidth = busWidth;
		this.bandwidth = bandwidth;
		this.pixelRate = pixelRate;
		this.textureRate = textureRate;
		this.memoryType = memoryType;
		this.memorySize = memorySize;
		this.gpuClockDefault = gpuClockDefault;
		this.gpuClockBoost = gpuClockBoost;
		this.memoryClockEffective = memoryClockEffective;
		this.tdp = tdp;
		this.coonsume = coonsume;
		this.price = price;
		this.directXVersion = directXVersion;
		AMDCrossfireOrNvidiaSLI = aMDCrossfireOrNvidiaSLI;
		OpenCL = openCL;
		CUDA = cUDA;
		DirectCompute = directCompute;
		DirectML = directML;
		Vulkan = vulkan;
		RayTracing = rayTracing;
		PhysX = physX;
		OpenGL4_6 = openGL4_6;
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

	public Integer getShadersUnit() {
		return shadersUnit;
	}

	public void setShadersUnit(Integer shadersUnit) {
		this.shadersUnit = shadersUnit;
	}

	public Long getTransistors() {
		return transistors;
	}

	public void setTransistors(Long transistors) {
		this.transistors = transistors;
	}

	public Float getLithograph() {
		return lithograph;
	}

	public void setLithograph(Float lithograph) {
		this.lithograph = lithograph;
	}

	public String getBusInterface() {
		return busInterface;
	}

	public void setBusInterface(String busInterface) {
		this.busInterface = busInterface;
	}

	public Integer getBusWidth() {
		return busWidth;
	}

	public void setBusWidth(Integer busWidth) {
		this.busWidth = busWidth;
	}

	public Float getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Float bandwidth) {
		this.bandwidth = bandwidth;
	}

	public Float getPixelRate() {
		return pixelRate;
	}

	public void setPixelRate(Float pixelRate) {
		this.pixelRate = pixelRate;
	}

	public Float getTextureRate() {
		return textureRate;
	}

	public void setTextureRate(Float textureRate) {
		this.textureRate = textureRate;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public Integer getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
	}

	public Float getGpuClockDefault() {
		return gpuClockDefault;
	}

	public void setGpuClockDefault(Float gpuClockDefault) {
		this.gpuClockDefault = gpuClockDefault;
	}

	public Float getGpuClockBoost() {
		return gpuClockBoost;
	}

	public void setGpuClockBoost(Float gpuClockBoost) {
		this.gpuClockBoost = gpuClockBoost;
	}

	public Float getMemoryClockEffective() {
		return memoryClockEffective;
	}

	public void setMemoryClockEffective(Float memoryClockEffective) {
		this.memoryClockEffective = memoryClockEffective;
	}

	public Byte getTdp() {
		return tdp;
	}

	public void setTdp(Byte tdp) {
		this.tdp = tdp;
	}

	public Integer getCoonsume() {
		return coonsume;
	}

	public void setCoonsume(Integer coonsume) {
		this.coonsume = coonsume;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDirectXVersion() {
		return directXVersion;
	}

	public void setDirectXVersion(String directXVersion) {
		this.directXVersion = directXVersion;
	}

	public Boolean getAMDCrossfireOrNvidiaSLI() {
		return AMDCrossfireOrNvidiaSLI;
	}

	public void setAMDCrossfireOrNvidiaSLI(Boolean aMDCrossfireOrNvidiaSLI) {
		AMDCrossfireOrNvidiaSLI = aMDCrossfireOrNvidiaSLI;
	}

	public Boolean getOpenCL() {
		return OpenCL;
	}

	public void setOpenCL(Boolean openCL) {
		OpenCL = openCL;
	}

	public Boolean getCUDA() {
		return CUDA;
	}

	public void setCUDA(Boolean cUDA) {
		CUDA = cUDA;
	}

	public Boolean getDirectCompute() {
		return DirectCompute;
	}

	public void setDirectCompute(Boolean directCompute) {
		DirectCompute = directCompute;
	}

	public Boolean getDirectML() {
		return DirectML;
	}

	public void setDirectML(Boolean directML) {
		DirectML = directML;
	}

	public Boolean getVulkan() {
		return Vulkan;
	}

	public void setVulkan(Boolean vulkan) {
		Vulkan = vulkan;
	}

	public Boolean getRayTracing() {
		return RayTracing;
	}

	public void setRayTracing(Boolean rayTracing) {
		RayTracing = rayTracing;
	}

	public Boolean getPhysX() {
		return PhysX;
	}

	public void setPhysX(Boolean physX) {
		PhysX = physX;
	}

	public Boolean getOpenGL4_6() {
		return OpenGL4_6;
	}

	public void setOpenGL4_6(Boolean openGL4_6) {
		OpenGL4_6 = openGL4_6;
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
