package sistema.integrador.oo2.models;

import java.time.LocalDateTime;

import sistema.integrador.oo2.entities.User;





public class UserRoleModel {
	private int id;
	private String role;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public UserRoleModel() {
		super();
	}

	public UserRoleModel(int id, String role, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.role = role;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	@Override
	public String toString() {
		return "UserRoleModel [id=" + id + ", role=" + role + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
	

	
	
}