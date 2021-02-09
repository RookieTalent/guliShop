package run.lin.app.ware.dao;

import run.lin.app.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:01:37
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
