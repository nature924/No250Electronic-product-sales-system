package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzichanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzichanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzichanpinView;


/**
 * 电子产品
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
public interface DianzichanpinService extends IService<DianzichanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzichanpinVO> selectListVO(Wrapper<DianzichanpinEntity> wrapper);
   	
   	DianzichanpinVO selectVO(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
   	
   	List<DianzichanpinView> selectListView(Wrapper<DianzichanpinEntity> wrapper);
   	
   	DianzichanpinView selectView(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzichanpinEntity> wrapper);
   	

}

