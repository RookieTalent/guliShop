package run.lin.app.ware.dao;

import run.lin.app.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:01:37
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
