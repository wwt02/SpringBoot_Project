package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        /**
         * 插入字段太长
         */
        Girl girlB=new Girl();
        girlB.setCupSize("BBBB");
        girlB.setAge(18);
        girlRepository.save(girlB);

    }
}
