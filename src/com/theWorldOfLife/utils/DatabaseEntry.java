package com.theWorldOfLife.utils;

public class DatabaseEntry {
	private String speciesName;
	private String aniGen;
	private String aniFam;
	private String aniOrd;
	private String aniClas;
	private String aniPhy;
	private String aniKin;
	private String aniCom;
	private String aveWei;
	private String aveLif;
	private String aniDom;
	private String aniHab;
	private String aniFamEx;

	public DatabaseEntry(String speciesName, String aniGen, String aniFam, String aniOrd, String aniClas, String aniPhy,
			String aniKin, String aniCom, String aveWei, String aveLif, String aniDom, String aniHab, String aniFamEx) {
		super();
		this.speciesName = speciesName;
		this.aniGen = aniGen;
		this.aniFam = aniFam;
		this.aniOrd = aniOrd;
		this.aniClas = aniClas;
		this.aniPhy = aniPhy;
		this.aniKin = aniKin;
		this.aniCom = aniCom;
		this.aveWei = aveWei;
		this.aveLif = aveLif;
		this.aniDom = aniDom;
		this.aniHab = aniHab;
		this.aniFamEx = aniFamEx;
	}

	public DatabaseEntry() {
		// TODO Auto-generated constructor stub
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public String getAniGen() {
		return aniGen;
	}

	public void setAniGen(String aniGen) {
		this.aniGen = aniGen;
	}

	public String getAniFam() {
		return aniFam;
	}

	public void setAniFam(String aniFam) {
		this.aniFam = aniFam;
	}

	public String getAniOrd() {
		return aniOrd;
	}

	public void setAniOrd(String aniOrd) {
		this.aniOrd = aniOrd;
	}

	public String getAniClas() {
		return aniClas;
	}

	public void setAniClas(String aniClas) {
		this.aniClas = aniClas;
	}

	public String getAniPhy() {
		return aniPhy;
	}

	public void setAniPhy(String aniPhy) {
		this.aniPhy = aniPhy;
	}

	public String getAniKin() {
		return aniKin;
	}

	public void setAniKin(String aniKin) {
		this.aniKin = aniKin;
	}

	public String getAniCom() {
		return aniCom;
	}

	public void setAniCom(String aniCom) {
		this.aniCom = aniCom;
	}

	public String getAveWei() {
		return aveWei;
	}

	public void setAveWei(String aveWei) {
		this.aveWei = aveWei;
	}

	public String getAveLif() {
		return aveLif;
	}

	public void setAveLif(String aveLif) {
		this.aveLif = aveLif;
	}

	public String getAniDom() {
		return aniDom;
	}

	public void setAniDom(String aniDom) {
		this.aniDom = aniDom;
	}

	public String getAniHab() {
		return aniHab;
	}

	public void setAniHab(String aniHab) {
		this.aniHab = aniHab;
	}

	public String getAniFamEx() {
		return aniFamEx;
	}

	public void setAniFamEx(String aniFamEx) {
		this.aniFamEx = aniFamEx;
	}

}
