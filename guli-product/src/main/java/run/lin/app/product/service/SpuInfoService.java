package run.lin.app.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 20:05:03
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

