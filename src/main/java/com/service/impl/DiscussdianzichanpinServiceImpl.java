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


import com.dao.DiscussdianzichanpinDao;
import com.entity.DiscussdianzichanpinEntity;
import com.service.DiscussdianzichanpinService;
import com.entity.vo.DiscussdianzichanpinVO;
import com.entity.view.DiscussdianzichanpinView;

@Service("discussdianzichanpinService")
public class DiscussdianzichanpinServiceImpl extends ServiceImpl<DiscussdianzichanpinDao, DiscussdianzichanpinEntity> implements DiscussdianzichanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianzichanpinEntity> page = this.selectPage(
                new Query<DiscussdianzichanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussdianzichanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianzichanpinEntity> wrapper) {
		  Page<DiscussdianzichanpinView> page =new Query<DiscussdianzichanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianzichanpinVO> selectListVO(Wrapper<DiscussdianzichanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianzichanpinVO selectVO(Wrapper<DiscussdianzichanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianzichanpinView> selectListView(Wrapper<DiscussdianzichanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianzichanpinView selectView(Wrapper<DiscussdianzichanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
