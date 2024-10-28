package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianzichanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianzichanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianzichanpinView;


/**
 * 电子产品评论表
 *
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
public interface DiscussdianzichanpinService extends IService<DiscussdianzichanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianzichanpinVO> selectListVO(Wrapper<DiscussdianzichanpinEntity> wrapper);
   	
   	DiscussdianzichanpinVO selectVO(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
   	
   	List<DiscussdianzichanpinView> selectListView(Wrapper<DiscussdianzichanpinEntity> wrapper);
   	
   	DiscussdianzichanpinView selectView(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianzichanpinEntity> wrapper);
   	

}

