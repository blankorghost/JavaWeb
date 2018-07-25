package com.lp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.dao.ItemsMapper;
import com.lp.pojo.Items;
import com.lp.pojo.QueryVo;

/**
 * 查询商品
 * @author lp
 *
 */
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemsMapper itemsMapper;
	
	//查询商品列表
	public List<Items> selectItemList(){
		return itemsMapper.selectByExampleWithBLOBs(null);
	}
	
	//查询一个商品
	public Items selectItemsById(Integer id){
		return itemsMapper.selectByPrimaryKey(id);
	}
	
	//修改
	public void updateItemsById(QueryVo vo){
		itemsMapper.updateByPrimaryKeyWithBLOBs(vo.getItems());
	}
	
}
