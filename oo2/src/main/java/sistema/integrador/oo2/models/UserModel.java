package sistema.integrador.oo2.models;
import java.time.LocalDateTime; 
import java.util.HashSet;
import java.util.Set;

import sistema.integrador.oo2.entities.UserRole;


public class UserModel {

	 
	private Long id;
	private String username;
	private String password;
	private boolean enabled;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private UserRole role;
	
	public UserModel() {
		super();
	}

	public UserModel(Long id, String username, String password, boolean enabled, LocalDateTime createdAt,
			LocalDateTime updatedAt, UserRole role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", role=" + role + "]";
	}
	
}