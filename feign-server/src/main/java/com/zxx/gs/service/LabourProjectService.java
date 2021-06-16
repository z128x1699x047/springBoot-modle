package com.zxx.gs.service;

import com.zxx.gs.entity.LabourProject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface LabourProjectService {
    List<LabourProject> queryLabourProject();
}
