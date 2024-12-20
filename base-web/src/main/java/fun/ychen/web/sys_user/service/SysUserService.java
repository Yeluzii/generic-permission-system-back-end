package fun.ychen.web.sys_user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.ychen.web.sys_menu.entity.AssignTreeParm;
import fun.ychen.web.sys_menu.entity.AssignTreeVo;
import fun.ychen.web.sys_user.entity.SysUser;

public interface SysUserService extends IService<SysUser> {
    // 新增
    void saveUser(SysUser sysUser);

    // 编辑
    void editUser(SysUser sysUser);

    // 删除用户
    void deleteUser(Long sysUser);

    // 查询菜单树
    AssignTreeVo getAssignTree(AssignTreeParm parm);
}
