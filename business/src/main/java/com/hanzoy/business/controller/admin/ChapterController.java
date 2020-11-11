package com.hanzoy.business.controller.admin;

import com.hanzoy.server.domain.Chapter;
import com.hanzoy.server.dto.ChapterDto;
import com.hanzoy.server.service.ChapterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @GetMapping("/list")
    public List<ChapterDto> chapter(){
        log.info("chapter");
        return chapterService.list();
    }
}
