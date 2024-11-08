package fun.ychen.web.sys_role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import fun.ychen.web.sys_role.entity.SysRole;
import fun.ychen.web.sys_role.mapper.SysRoleMapper;
import fun.ychen.web.sys_role.service.SysRoleService;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}