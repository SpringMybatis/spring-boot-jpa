package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Demo;
import com.example.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	 
	/**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo/{id}")
    public Demo getDemo(@PathVariable Long id){
       return demoService.getDemo(id);
    }
    
    @RequestMapping("/exception")
    public void exceptionTest() throws Exception{
       throw new Exception("test");
    }
    
    @RequestMapping("/list")
    public List<Demo> listDemo(){
       
    	return demoService.listDemo();
    }
    
    @RequestMapping("/save")
    public void saveDemo(){
    	Demo demo = new Demo();
        demo.setName("Angel");
        demoService.save(demo);
    }
    
    @RequestMapping("/delete")
    public void deleteDemo(){
       long id = 200l;
       demoService.delte(id);
    }
	
}
