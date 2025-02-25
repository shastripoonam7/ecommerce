package com.ecommerce.user.model;

import java.util.Date;
import java.util.UUID;

import com.ecommerce.user.listener.AuditEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User  extends AuditEntityListener{
	 @Id
	 private String userid;
	 private String username;
	 private String email;
	 private String password_hash;
	 private String role;
	// private Date created_at;
	// private Date updated_at;
	 
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password_hash="
				+ password_hash + ", role=" + role + "]";
	}
	 
	 

}
