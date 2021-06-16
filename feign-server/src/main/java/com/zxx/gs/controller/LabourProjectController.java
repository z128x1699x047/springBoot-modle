package com.zxx.gs.controller;

import com.zxx.gs.entity.LabourProject;
import com.zxx.gs.service.LabourProjectService;
import com.zxx.gs.service.LabourProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("labourProject")
public class LabourProjectController implements LabourProjectService {

    @Autowired
    private LabourProjectServiceImpl labourProjectServiceImpl;

    @GetMapping("queryLabourProject")
    @Override
    public List<LabourProject> queryLabourProject(){
        return labourProjectServiceImpl.queryLabourProject();
    }

}
