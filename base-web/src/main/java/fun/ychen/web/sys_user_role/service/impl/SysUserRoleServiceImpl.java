package fun.ychen.web.sys_user_role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.ychen.web.sys_user_role.entity.SysUserRole;
import fun.ychen.web.sys_user_role.mapper.SysUserRoleMapper;
import fun.ychen.web.sys_user_role.service.SysUserRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {
}
