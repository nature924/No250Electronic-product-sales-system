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


import com.dao.ChanpinleibieDao;
import com.entity.ChanpinleibieEntity;
import com.service.ChanpinleibieService;
import com.entity.vo.ChanpinleibieVO;
import com.entity.view.ChanpinleibieView;

@Service("chanpinleibieService")
public class ChanpinleibieServiceImpl extends ServiceImpl<ChanpinleibieDao, ChanpinleibieEntity> implements ChanpinleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinleibieEntity> page = this.selectPage(
                new Query<ChanpinleibieEntity>(params).getPage(),
                new EntityWrapper<ChanpinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinleibieEntity> wrapper) {
		  Page<ChanpinleibieView> page =new Query<ChanpinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinleibieVO> selectListVO(Wrapper<ChanpinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinleibieVO selectVO(Wrapper<ChanpinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinleibieView> selectListView(Wrapper<ChanpinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinleibieView selectView(Wrapper<ChanpinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
