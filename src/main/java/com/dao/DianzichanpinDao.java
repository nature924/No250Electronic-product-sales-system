package com.dao;

import com.entity.DianzichanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzichanpinVO;
import com.entity.view.DianzichanpinView;


/**
 * 电子产品
 * 
 * @author 
 * @email 
 * @date 2023-01-05 15:19:32
 */
public interface DianzichanpinDao extends BaseMapper<DianzichanpinEntity> {
	
	List<DianzichanpinVO> selectListVO(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
	
	DianzichanpinVO selectVO(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
	
	List<DianzichanpinView> selectListView(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);

	List<DianzichanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
	
	DianzichanpinView selectView(@Param("ew") Wrapper<DianzichanpinEntity> wrapper);
	

}
