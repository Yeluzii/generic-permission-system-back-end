package fun.ychen.web.sys_user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("sys_user")
public class SysUser {
    @TableId(type = IdType.AUTO)
    private Long userId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String gender;
    private String isAdmin;
    // 账户是否过期(1 未过期， 0 已过期)
    private boolean isAccountNonExpired = true;
    // 账户是否被锁定(1 未锁定， 0 已锁定)
    private boolean isAccountNonLocked = true;
    //  密码是否过期(1 未过期， 0 已过期)
    private boolean isCredentialsNonExpired = true;
    //  账户是否可用(1 可用， 0 不可用)
    private boolean isEnabled = true;
    private String nickName;
    @TableLogic
    private Integer deleted;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
