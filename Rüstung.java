
public class Rüstung {
	
	private int id;
	private String name = "";
	private int atk = 0;
	private int def = 0;
	private int spd = 0;
	private int crt = 0;
	private int intl = 0;
	private int lck = 0;
	private int brkrate = 0;
	private int brkflg = 0;
	


	public Rüstung(int id, String name, int atk, int def, int spd,int crt, int intl, int lck,int brkrate, int brkflg) {

		this.id= id;
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.spd = spd;
		this.crt = crt;
		this.intl = intl;
		this.lck = lck;
		this.brkrate = brkrate;
		this.brkflg = brkflg;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}



	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}



	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}



	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}



	/**
	 * @return the spd
	 */
	public int getSpd() {
		return spd;
	}



	/**
	 * @param spd the spd to set
	 */
	public void setSpd(int spd) {
		this.spd = spd;
	}



	/**
	 * @return the intl
	 */
	public int getIntl() {
		return intl;
	}



	/**
	 * @param intl the intl to set
	 */
	public void setIntl(int intl) {
		this.intl = intl;
	}



	/**
	 * @return the lck
	 */
	public int getLck() {
		return lck;
	}



	/**
	 * @param lck the lck to set
	 */
	public void setLck(int lck) {
		this.lck = lck;
	}



	/**
	 * @return the brkrate
	 */
	public int getBrkrate() {
		return brkrate;
	}



	/**
	 * @param brkrate the brkrate to set
	 */
	public void setBrkrate(int brkrate) {
		this.brkrate = brkrate;
	}



	/**
	 * @return the brkflg
	 */
	public int getBrkflg() {
		return brkflg;
	}



	/**
	 * @param brkflg the brkflg to set
	 */
	public void setBrkflg(int brkflg) {
		this.brkflg = brkflg;
	}



	/**
	 * @return the crt
	 */
	public int getCrt() {
		return crt;
	}



	/**
	 * @param crt the crt to set
	 */
	public void setCrt(int crt) {
		this.crt = crt;
	}

}
