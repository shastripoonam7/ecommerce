package com.ecommerce.user.listener;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AuditEntityListener {
	
	private String getCurrentUser() {
		return "system_user";
	}
	
	@PrePersist
	public void setCreatedBy(AuditableEntity entity) {
		entity.setCreatedBy(getCurrentUser());
		entity.setUpdatedBy(getCurrentUser());
		entity.setCreatedAt(LocalDateTime.now());
		entity.setUpdatedAt(LocalDateTime.now());
		
	}
	
	@PreUpdate
	public void setUpdatedBy(AuditableEntity entity) {
		entity.setUpdatedBy(getCurrentUser());
		entity.setUpdatedAt(LocalDateTime.now());
		
	}

}
