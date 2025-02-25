package com.ecommerce.user.listener;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditableEntity {
	
	@Column(name = "created_by",updatable =false)
	private String createdBy;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name="created_at",updatable=false)
	private LocalDateTime createdAt;
	
	@Column(name="updated_at")
	private LocalDateTime updatedAt;
	

}
