package run.lin.app.coupon.dao;

import run.lin.app.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:10:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
