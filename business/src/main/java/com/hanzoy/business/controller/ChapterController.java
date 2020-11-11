package com.hanzoy.business.controller;

import com.hanzoy.server.domain.Chapter;
import com.hanzoy.server.service.ChapterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @GetMapping("/chapter")
    public List<Chapter> chapter(){
        log.info("chapter");
        return chapterService.list();
    }

    @GetMapping("/chapterShow")
    public String show(){
        return "lslsls";
    }
}
