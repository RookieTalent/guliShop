package run.lin.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 20:05:03
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

