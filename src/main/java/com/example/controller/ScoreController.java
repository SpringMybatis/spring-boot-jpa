package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Score;
import com.example.service.ScoreService;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/scoreList")
    public List<Score> getScoreList(){
        // 测试更新数据库
    	scoreService.delete(23);
        return scoreService.getList();
    }
}