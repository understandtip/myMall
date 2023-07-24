package com.jackqiu.mymall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import com.jackqiu.mymall.product.entity.BrandEntity;
import com.jackqiu.mymall.product.service.BrandService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MymallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("qwe");
        brandService.save(brandEntity);
        System.out.println("成功！！");*/

        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("666");
        brandService.updateById(brandEntity);*/

        /*List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brand_id.forEach(System.out::println);*/
    }

}
