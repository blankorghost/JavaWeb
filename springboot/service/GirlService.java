package com.lp.girl.service;

import com.lp.girl.enums.ResultEnum;
import com.lp.girl.exception.GirlException;
import com.lp.girl.entity.Girl;
import com.lp.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTow(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("DDDDD");
        girlB.setAge(20);
        girlRepository.save(girlB);
    }

    public void getAge(int id) throws Exception{
        Girl girl = girlRepository.findById(id).get();
        int age = girl.getAge();
        if (age < 10){
            //返回“你在上小学吧” code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age <16) {
            //返回“你可能在上初中” code=101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 通过id查询信息
     * @param id
     * @return
     */
    public Girl findOne(int id){
        return girlRepository.findById(id).get();

    }
}
