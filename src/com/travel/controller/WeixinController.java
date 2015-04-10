package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.sd4324530.fastweixin.api.JsAPI;
import com.github.sd4324530.fastweixin.api.config.ApiConfig;
import com.github.sd4324530.fastweixin.api.response.GetSignatureResponse;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.LinkReqMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;

@Controller
@RequestMapping("/weixin")
public class WeixinController extends WeixinControllerSupport{

	private static final String APPID = "wxbb5fb5be10f0b3cb";
	private static final String SECRET = "e71019ed6dd18e8329301f71903033ad";
    private static final String TOKEN = "90travel";
    private static long ticketTime = System.currentTimeMillis();
    private static final ApiConfig config = new ApiConfig(APPID, SECRET, true);
	
	@Override
	protected String getAESKey() {
		return "XCmDxaBYs6GljLIAoWmDUgCMBzxtKFZR9x7lrZTBoCv";
	}

	@Override
	protected String getAppId() {
		return APPID;
	}

	@Override
	protected String getToken() {
		return TOKEN;
	}

	@Override
	protected BaseMsg handleLinkMsg(LinkReqMsg msg) {
		// TODO Auto-generated method stub
		return super.handleLinkMsg(msg);
	}

	@Override
	protected BaseMsg handleTextMsg(TextReqMsg msg) {
		if(msg.getContent().equals("help"))
			return new TextMsg("敬请期待");
		if(msg.getContent().equals("5"))
			return new TextMsg("http://123.57.45.111/view/pathDetail");
		return super.handleTextMsg(msg);
	}
	
	@RequestMapping(value = "/getSignature", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getSignature(HttpServletRequest request){
		if(System.currentTimeMillis()-ticketTime>7200){
			config.init();
			ticketTime = System.currentTimeMillis();
		}
		String url = request.getParameter("url");
	    GetSignatureResponse response = new JsAPI(config).getSignature(url);
		return JsonUtil.getJson(response);
	}
	
	

}
