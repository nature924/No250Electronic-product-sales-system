package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinleibieView;


/**
 * 产品类别
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
public interface ChanpinleibieService extends IService<ChanpinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinleibieVO> selectListVO(Wrapper<ChanpinleibieEntity> wrapper);
   	
   	ChanpinleibieVO selectVO(@Param("ew") Wrapper<ChanpinleibieEntity> wrapper);
   	
   	List<ChanpinleibieView> selectListView(Wrapper<ChanpinleibieEntity> wrapper);
   	
   	ChanpinleibieView selectView(@Param("ew") Wrapper<ChanpinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinleibieEntity> wrapper);
   	

}

