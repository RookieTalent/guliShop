package run.lin.app.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import run.lin.common.utils.PageUtils;
import run.lin.app.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xiaolin
 * @email 2544472820@qq.com
 * @date 2021-02-09 21:07:44
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

