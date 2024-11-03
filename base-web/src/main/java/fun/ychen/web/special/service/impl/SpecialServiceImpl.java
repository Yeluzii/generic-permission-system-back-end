package fun.ychen.web.special.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.ychen.web.special.entity.Special;
import fun.ychen.web.special.mapper.SpecialMapper;
import fun.ychen.web.special.service.SpecialService;
import org.springframework.stereotype.Service;

@Service
public class SpecialServiceImpl extends ServiceImpl<SpecialMapper, Special> implements SpecialService {
}
