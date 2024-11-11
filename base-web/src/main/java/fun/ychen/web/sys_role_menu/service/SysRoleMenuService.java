package fun.ychen.web.sys_role_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.ychen.web.sys_role_menu.entity.SysRoleMenu;
import fun.ychen.web.sys_role_menu.entity.SaveMenuParm;

public interface SysRoleMenuService extends IService<SysRoleMenu> {
    void saveRoleMenu(SaveMenuParm parm);
}