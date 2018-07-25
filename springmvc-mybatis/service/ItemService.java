package com.lp.service;

import java.util.List;



import com.lp.pojo.Items;
import com.lp.pojo.QueryVo;


public interface ItemService {

	//查询商品列表
	public List<Items> selectItemList();
	//查询一个商品
	public Items selectItemsById(Integer id);
	//修改
	public void updateItemsById(QueryVo vo);
}
