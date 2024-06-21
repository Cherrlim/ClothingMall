package com.entity.vo;

import com.entity.AddressEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 地址
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）

 */
public class AddressVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地址
	 */
	
	private String address;
		
	/**
	 * 收货人
	 */
	
	private String name;
		
	/**
	 * 电话
	 */
	
	private String phone;
		
	/**
	 * 是否默认地址[是/否]
	 */
	
	private String isdefault;

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
	 
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getIsdefault() {
		return isdefault;
	}
			
}
