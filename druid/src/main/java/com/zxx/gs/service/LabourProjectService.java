package com.zxx.gs.service;

import com.zxx.gs.entity.LabourProject;
import com.zxx.gs.mapper.LabourProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabourProjectService {

    @Autowired
    private LabourProjectMapper labourProjectMapper;

    public List<LabourProject> queryLabourProject() {
        return labourProjectMapper.queryLabourProject();
    }
}
