package com.edu.controller;

import com.edu.common.AjaxResult;

/**
 * 
 * @author yindawei 
 * @date 2018年2月10日上午11:04:41
 * @description 
 * @version
 */
public abstract class BaseController {

	public AjaxResult success(Object data) {
		return new AjaxResult().setData(data).setSuccess(true).setStatus(0);
	}

	public AjaxResult error(String message) {
		return new AjaxResult().setMessage(message).setSuccess(false).setStatus(1);
	}
}
