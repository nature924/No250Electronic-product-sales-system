package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianzichanpinDao;
import com.entity.DianzichanpinEntity;
import com.service.DianzichanpinService;
import com.entity.vo.DianzichanpinVO;
import com.entity.view.DianzichanpinView;

@Service("dianzichanpinService")
public class DianzichanpinServiceImpl extends ServiceImpl<DianzichanpinDao, DianzichanpinEntity> implements DianzichanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzichanpinEntity> page = this.selectPage(
                new Query<DianzichanpinEntity>(params).getPage(),
                new EntityWrapper<DianzichanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzichanpinEntity> wrapper) {
		  Page<DianzichanpinView> page =new Query<DianzichanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzichanpinVO> selectListVO(Wrapper<DianzichanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzichanpinVO selectVO(Wrapper<DianzichanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzichanpinView> selectListView(Wrapper<DianzichanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzichanpinView selectView(Wrapper<DianzichanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
