package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.bean.Activity;
import com.bjpowernode.crm.workbench.bean.ActivityQueryVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ActivityMapper extends Mapper<Activity> {

    List<Map<String, String>> queryAllActivity(ActivityQueryVo queryVo);
}
