package com.dao;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NewsVO;
import com.entity.view.NewsView;


/**
 * 医药资讯
 * 
 * @author 
 * @email 
 * @date 2022-03-12 12:07:43
 */
public interface NewsDao extends BaseMapper<NewsEntity> {
	
	List<NewsVO> selectListVO(@Param("ew") Wrapper<NewsEntity> wrapper);
	
	NewsVO selectVO(@Param("ew") Wrapper<NewsEntity> wrapper);
	
	List<NewsView> selectListView(@Param("ew") Wrapper<NewsEntity> wrapper);

	List<NewsView> selectListView(Pagination page,@Param("ew") Wrapper<NewsEntity> wrapper);
	
	NewsView selectView(@Param("ew") Wrapper<NewsEntity> wrapper);
	

}