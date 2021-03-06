package com.kingston.game.database.config.bean;

import com.kingston.orm.annotation.Column;
import com.kingston.orm.annotation.Entity;

/**
 * 玩家等级配置表
 * @author kingston
 */
@Entity(readOnly = true)
public class ConfigPlayerLevel {

	/**
	 * 等级
	 */
	@Column
	private int level;
	
	/**
	 * 升到下一级别需要的经验
	 */
	@Column
	private long needExp;
	
	/**
	 * 最大体力
	 */
	@Column
	private int vitality;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public long getNeedExp() {
		return needExp;
	}

	public void setNeedExp(long needExp) {
		this.needExp = needExp;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	
}
