package com.entity.view;

import com.entity.ShangpinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 


@TableName("shangpinfenlei")
public class ShangpinfenleiView  extends ShangpinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinfenleiView(){
	}
 
 	public ShangpinfenleiView(ShangpinfenleiEntity shangpinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
