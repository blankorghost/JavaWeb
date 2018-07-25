package com.lp.girl.controller;

import com.lp.girl.entity.Girl;
import com.lp.girl.entity.Result;
import com.lp.girl.repository.GirlRepository;
import com.lp.girl.service.GirlService;
import com.lp.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);


    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;
    /*
    查询所有女生列表
     */
    @GetMapping("/girl")
    public List<Girl> girlList(){
        logger.info("girlList");
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @return
     */
    @PostMapping("/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return null;
            //return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCupSize(girl.getCupSize());   //这样写是为了在post man里测试
        girl.setAge(girl.getAge());

        return ResultUtil.success(girlRepository.save(girl));
    }

    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") int id){
        //System.out.println(girlRepository.findById(id).get());
        return girlRepository.findById(id).get();
    }
    //更新一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdata(@PathVariable("id") int id,
                           @RequestParam("cupSize") String cupSize,@RequestParam("age") int age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }
    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelte(@PathVariable("id") int id){
        girlRepository.deleteById(id);
    }

    //通过年龄查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") int age){
        return girlRepository.findByAge(age);
    }

    //插入两个对象
    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTow();
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") int id) throws Exception{
        girlService.getAge(id);
    }
}
