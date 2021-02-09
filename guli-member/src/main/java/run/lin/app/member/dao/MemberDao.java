package run.lin.app.member.dao;

import run.lin.app.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:07:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
