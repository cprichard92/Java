package dayFour;

import java.io.Serializable;

public class Hero implements Serializable{ //marker interface - do not have any methods that you implement. Used for polymorphism
	/**
	 * Variable supported in this version: 1,2,3,4,5
	 * Explanation of the version
	 */
	private static final long serialVersionUID = 6704890840065193058L;
	
	private String name;
	private int hp;
	private int mp;
	private int xp;
	private int level;
	private String classification;
	private transient String weapon; // DO NOT SERIALIZE THIS PROPERTY
	

	public Hero(){
		super();
	}
	
	public Hero(String name, int hp, int mp, int xp, int level, String classification, String weapon) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.xp = xp;
		this.level = level;
		this.classification = classification;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", mp=" + mp + ", xp=" + xp + ", level=" + level
				+ ", classification=" + classification + ", weapon=" + weapon + "]";
	}
	
}
