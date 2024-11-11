package fun.ychen.web.sys_menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.ychen.web.sys_menu.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper extends BaseMapper<SysMenu> {
    // 根据用户 id 查询菜单
    List<SysMenu> getMenuByUserId(@Param("userId") Long userId);
    List<SysMenu> getMenuByRoleId(@Param("roleId") Long roleId);
}
