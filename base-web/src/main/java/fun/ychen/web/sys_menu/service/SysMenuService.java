package fun.ychen.web.sys_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.ychen.web.sys_menu.entity.SysMenu;

import java.util.List;

public interface SysMenuService extends IService<SysMenu> {
    List<SysMenu> getParent();
    // 根据用户 id 查询菜单
    List<SysMenu> getMenuByUserId(Long userId);

    // 根据角色 id 查询菜单
    List<SysMenu> getMenuByRoleId(Long roleId);
}
