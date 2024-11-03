package fun.ychen.web.special.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.ychen.utils.ResultUtils;
import fun.ychen.utils.ResultVo;
import fun.ychen.web.special.entity.Special;
import fun.ychen.web.special.service.SpecialService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import fun.ychen.web.special.entity.SpecialParm;

@RequestMapping("/api/special")
@RestController
@AllArgsConstructor
public class SpecialController {
    private final SpecialService specialService;

    // 新增
    @PostMapping
    @Operation(summary = "新增专题")
    public ResultVo<?> add(@RequestBody Special special) {
        if (specialService.save(special)) {
            return ResultUtils.success("新增成功！");
        }
        return ResultUtils.error("新增失败！");
    }

    // 编辑
    @PutMapping
    @Operation(summary = "编辑专题")
    public ResultVo<?> edit(@RequestBody Special special) {
        if (specialService.updateById(special)) {
            return ResultUtils.success("编辑成功！");
        }
        return ResultUtils.error("编辑失败！");
    }

    // 删除
    @DeleteMapping("/{id}")
    @Operation(summary = "删除专题")
    public ResultVo<?> delete(@PathVariable("id") Long id) {
        if (specialService.removeById(id)) {
            return ResultUtils.success("删除成功！");
        }
        return ResultUtils.error("删除失败！");
    }

    // 列表
    @PostMapping("/getList")
    @Operation(summary = "专题列表")
    public ResultVo<?> getList(@RequestBody SpecialParm specialParm) {
        // 构造分页对象
        IPage<Special> page = new Page<>(specialParm.getCurrentPage(), specialParm.getPageSize());
        // 构造查询条件
        QueryWrapper<Special> query = new QueryWrapper<>();
        // 根据创建时间 create_time 降序排序
        query.orderByDesc("create_time");
        if (StringUtils.isNotEmpty(specialParm.getTitle())) {
            query.lambda().like(Special::getTitle, specialParm.getTitle());
        }
        IPage<Special> list = specialService.page(page, query);
        return ResultUtils.success(" 查询成功 ", list);
    }


}
