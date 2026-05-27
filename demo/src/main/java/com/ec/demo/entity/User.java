package com.ec.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    /**
     * ユーザーID（主キー）
     */
    @Id
    @Column(name = "user_id", length = 20, nullable = false)
    private String userId;

    /**
     * 氏名
     */
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    /**
     * 住所
     */
    @Column(name = "address", length = 100, nullable = false)
    private String address;

    /**
     * メールアドレス
     */
    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    /**
     * 電話番号（任意入力）
     */
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    /**
     * 作成日
     */
    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    /**
     * 更新日
     */
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    /**
     * ステータス
     * A : Active（有効）
     * I : Inactive（無効）
     * S : Suspended（停止）
     */
    @Column(name = "status", length = 1, nullable = false)
    private String status;

    /**
     * ハッシュ化されたパスワード
     */
    @Column(name = "password_hash", length = 255, nullable = false)
    private String passwordHash;

    /**
     * INSERT 実行前に自動的に呼び出される
     */
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDate.now();

        // ステータスが未設定の場合は「A（有効）」を設定
        if (this.status == null) {
            this.status = "A";
        }
    }

    /**
     * UPDATE 実行前に自動的に呼び出される
     */
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDate.now();
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
    
    
    
    
}