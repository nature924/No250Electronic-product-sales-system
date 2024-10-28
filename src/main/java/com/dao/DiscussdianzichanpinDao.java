package com.dao;

import com.entity.DiscussdianzichanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianzichanpinVO;
import com.entity.view.DiscussdianzichanpinView;


/**
 * 电子产品评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
public interface DiscussdianzichanpinDao extends BaseMapper<DiscussdianzichanpinEntity> {
	
	List<DiscussdianzichanpinVO> selectListVO(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
	
	DiscussdianzichanpinVO selectVO(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
	
	List<DiscussdianzichanpinView> selectListView(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);

	List<DiscussdianzichanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
	
	DiscussdianzichanpinView selectView(@Param("ew") Wrapper<DiscussdianzichanpinEntity> wrapper);
	

}