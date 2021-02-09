package run.lin.app.product.dao;

import run.lin.app.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 20:05:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
