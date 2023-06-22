package br.com.kalil.object;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "psu")
public class PSU {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String brand;
	private Integer power;
	private Boolean is80plus;
	private Boolean is80PlusWhite;
	private Boolean is80PlusBronze;
	private Boolean is80PlusSilver;
	private Boolean is80PlusGold;
	private Boolean is80PlusPlatinum;
	private Boolean is80PlusTitanium;
	private Float price;
	private Byte PCMasterLevel;
	private String urlImage;
	
	public PSU() {
		super();
	}

	public PSU(Integer id, String name, String brand, Integer power, Boolean is80plus, Boolean is80PlusWhite,
			Boolean is80PlusBronze, Boolean is80PlusSilver, Boolean is80PlusGold, Boolean is80PlusPlatinum,
			Boolean is80PlusTitanium, Float price, Byte pCMasterLevel, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.power = power;
		this.is80plus = is80plus;
		this.is80PlusWhite = is80PlusWhite;
		this.is80PlusBronze = is80PlusBronze;
		this.is80PlusSilver = is80PlusSilver;
		this.is80PlusGold = is80PlusGold;
		this.is80PlusPlatinum = is80PlusPlatinum;
		this.is80PlusTitanium = is80PlusTitanium;
		this.price = price;
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

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Boolean getIs80plus() {
		return is80plus;
	}

	public void setIs80plus(Boolean is80plus) {
		this.is80plus = is80plus;
	}

	public Boolean getIs80PlusWhite() {
		return is80PlusWhite;
	}

	public void setIs80PlusWhite(Boolean is80PlusWhite) {
		this.is80PlusWhite = is80PlusWhite;
	}

	public Boolean getIs80PlusBronze() {
		return is80PlusBronze;
	}

	public void setIs80PlusBronze(Boolean is80PlusBronze) {
		this.is80PlusBronze = is80PlusBronze;
	}

	public Boolean getIs80PlusSilver() {
		return is80PlusSilver;
	}

	public void setIs80PlusSilver(Boolean is80PlusSilver) {
		this.is80PlusSilver = is80PlusSilver;
	}

	public Boolean getIs80PlusGold() {
		return is80PlusGold;
	}

	public void setIs80PlusGold(Boolean is80PlusGold) {
		this.is80PlusGold = is80PlusGold;
	}

	public Boolean getIs80PlusPlatinum() {
		return is80PlusPlatinum;
	}

	public void setIs80PlusPlatinum(Boolean is80PlusPlatinum) {
		this.is80PlusPlatinum = is80PlusPlatinum;
	}

	public Boolean getIs80PlusTitanium() {
		return is80PlusTitanium;
	}

	public void setIs80PlusTitanium(Boolean is80PlusTitanium) {
		this.is80PlusTitanium = is80PlusTitanium;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
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
