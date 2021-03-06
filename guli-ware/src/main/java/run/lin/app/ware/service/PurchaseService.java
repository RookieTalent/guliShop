package run.lin.app.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:01:37
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

