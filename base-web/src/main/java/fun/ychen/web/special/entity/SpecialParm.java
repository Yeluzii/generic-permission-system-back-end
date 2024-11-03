package fun.ychen.web.special.entity;

import lombok.Data;

@Data
public class SpecialParm {
    private Long currentPage;
    private Long pageSize;
    private String title;
}
