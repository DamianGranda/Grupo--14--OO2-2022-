package sistema.integrador.oo2.models;

import java.time.LocalDateTime;

import sistema.integrador.oo2.entities.User;





public class UserRoleModel {
	private int id;
	private User user;
	private String role;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public UserRoleModel() {
		super();
	}
	public UserRoleModel(int id, User user, String role, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.user = user;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
		return "UserRoleModel [id=" + id + ", user=" + user + ", role=" + role + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	
	

	
	
}