/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ihtsdo.json.model.versioned;

import java.util.UUID;

/**
 *
 * @author Alejandro Rodriguez
 */
public class Component {

    private UUID uuid;
    private Boolean active;
    private String effectiveTime;
    private String scTime;
    private Long module;
    
    public Component() {
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getModule() {
		return module;
	}

	public void setModule(Long module) {
		this.module = module;
	}

	public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

	public String getScTime() {
		return scTime;
	}

	public void setScTime(String scTime) {
		this.scTime = scTime;
	}


}
