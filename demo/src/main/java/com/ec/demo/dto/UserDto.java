package com.ec.demo.dto;

import com.ec.demo.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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
    
    public UserDto(String userId,
            String name,
            String address,
            String email,
            String phoneNumber,
            String password,
            String status) {
			 this.userId = userId;
			 this.name = name;
			 this.address = address;
			 this.email = email;
			 this.phoneNumber = phoneNumber;
			 this.password = password;
			 this.status = status;
			}
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
        return new UserDto(
        	    user.getUserId(),
        	    user.getName(),
        	    user.getAddress(),
        	    user.getEmail(),
        	    user.getPhoneNumber(),    
        	    null,   
        	    user.getStatus()
    	);
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
}