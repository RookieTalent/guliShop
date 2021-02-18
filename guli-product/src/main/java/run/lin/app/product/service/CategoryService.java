package run.lin.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 20:05:03
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询所有分类 成树
     *
     * @return
     */
    List<CategoryEntity> listWithTree();

}

