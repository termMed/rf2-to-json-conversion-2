/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ihtsdo.json.model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Alejandro Rodriguez
 */
public class Component implements Serializable {

    private UUID uuid;
    private Boolean active;
    private String effectiveTime;
    private LightConceptDescriptor module;
    
    public Component() {
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

	public LightConceptDescriptor getModule() {
		return module;
	}

	public void setModule(LightConceptDescriptor module) {
		this.module = module;
	}

	public Boolean getActive() {
		return active;
	}

}
