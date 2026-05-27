package com.ec.demo.dto;

import com.ec.demo.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
    /**
     * ユーザーID
     */
    private String userId;

    /**
     * 氏名
     */
    private String name;

    /**
     * 住所
     */
    private String address;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * 電話番号
     */
    private String phoneNumber;

    /**
     * 平文のパスワード
     * （サービス層でハッシュ化して password_hash に保存する）
     */
    private String password;

    /**
     * ステータス
     */
    private String status;
    
    /**
     * Entity → DTO 変換
     *
     * @param user User Entity
     * @return UserDto
     */
    public static UserDto from(User user) {
        if (user == null) {
            return null;
        }
        
        UserDto dto = new UserDto();
        dto.setUserId(user.getUserId());
        dto.setName(user.getName());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setPassword(null);   // 조회 시 평문 비밀번호는 없음
        dto.setStatus(user.getStatus());

        return dto;
    }
   
    /**
     * DTO → Entity 変換
     *
     * @return User Entity
     */
    public User toEntity() {
        User user = new User();
        user.setUserId(this.userId);
        user.setName(this.name);
        user.setAddress(this.address);
        user.setEmail(this.email);
        user.setPhoneNumber(this.phoneNumber);
        user.setStatus(this.status);
        return user;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}