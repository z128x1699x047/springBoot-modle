package com.zxx.gs.mapper;

import com.zxx.gs.entity.LabourProject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("labourProjectMapper")
public interface LabourProjectMapper {

    List<LabourProject> queryLabourProject();

}
