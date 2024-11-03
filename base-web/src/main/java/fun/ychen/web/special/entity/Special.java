package fun.ychen.web.special.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("special")
public class Special {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String title;
    private String banner;
    private String introduction;
    private Boolean isFollowing;
    private Integer followersCount;
    private Integer viewCount;
    // 自动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    // 自动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
