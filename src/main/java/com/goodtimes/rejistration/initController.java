package com.goodtimes.rejistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.goodtimes.rejistration.service.RejisterService;




/**
 * @author yuma.imai
 * 初期処理
 */
@Controller
public class initController {

	@Autowired
	RejisterService rejisterService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String init() {
		return "init";
	}
	@RequestMapping(value="/init/",params="rejister",method=RequestMethod.GET)
	public String initRejister(){

		rejisterService.test();
		
		




		return "rejister";
	}

}
