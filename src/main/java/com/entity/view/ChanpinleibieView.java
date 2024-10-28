package com.entity.view;

import com.entity.ChanpinleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
@TableName("chanpinleibie")
public class ChanpinleibieView  extends ChanpinleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpinleibieView(){
	}
 
 	public ChanpinleibieView(ChanpinleibieEntity chanpinleibieEntity){
 	try {
			BeanUtils.copyProperties(this, chanpinleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
