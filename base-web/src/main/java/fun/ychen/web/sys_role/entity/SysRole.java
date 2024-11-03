package fun.ychen.web.sys_role.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_role")
public class SysRole {
    @TableId(type = IdType.AUTO)
    private Long roleId;
    private String roleName;
    private String remark;
    private String type;
    private Date createTime;
    private Date updateTime;
}
