package run.lin.app.order.dao;

import run.lin.app.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:04:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
