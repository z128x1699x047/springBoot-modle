package com.zxx.gs.service;

import com.zxx.gs.entity.LabourProject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="FEIGN-SERVER",path = "/labourProject")
public interface LabourProjectService {
    @GetMapping("/queryLabourProject")
    List<LabourProject> queryLabourProject();
}
