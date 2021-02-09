package run.lin.app.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:04:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

