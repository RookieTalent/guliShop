package run.lin.app.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:10:42
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

