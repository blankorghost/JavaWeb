package com.lp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lp.pojo.Items;
import com.lp.pojo.QueryVo;
import com.lp.service.ItemService;



/**
 * 商品列表
 * @author lp
 *
 */
@Controller
public class ItemController {
	
	
	
	@Autowired
	private ItemService itemsService;
	
	@RequestMapping(value="/item/itemlist.action")
	public ModelAndView itemList(){
		
		// 从数据库取商品列表
		List<Items> list = itemsService.selectItemList();

		ModelAndView mav = new ModelAndView();
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}
	
	//去修改页面入参为id
	@RequestMapping(value="/itemEdit.action")
	public ModelAndView toEdit(Integer id,HttpServletRequest request,HttpServletResponse response,
			HttpSession session,Model model){
		
		//servlet时代开发
		//String id = request.getParameter("id");
		
		//查询一个商品
		Items item = itemsService.selectItemsById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("item", item);
		mav.setViewName("editItem");
		return mav;
	}
	
	//提交修改页面 入参为Items对象
	@RequestMapping(value="/updateitem.action")
	//public ModelAndView toEdit(Items pojo,Model model){
	public ModelAndView toEdit(QueryVo vo){	 //包装pojo类
		
		
		//查询一个商品
		itemsService.updateItemsById(vo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
	}

}
