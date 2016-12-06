package me.zhangwenbo.util;

import com.alibaba.fastjson.JSONObject;

public class MarkResult {

	// 常规返回结果JSON字符串
	public static String getResult(int code, Object obj) {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("data", obj);
		return json.toJSONString();
	}
}
