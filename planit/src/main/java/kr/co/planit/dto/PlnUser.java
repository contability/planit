package kr.co.planit.dto;

public class PlnUser {
	
	// 유저 아이디
	private String userId;
	
	// pw
	private String password;
	
	// 유저 이름
	private String userNm;
	
	// 유저 타입
	private String userType;
	
	// 사용 여부
	private String useAt;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
