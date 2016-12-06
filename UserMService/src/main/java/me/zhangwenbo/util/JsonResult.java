package me.zhangwenbo.util;

/**
@author  iver3on 
@date 创建时间：2016年12月5日 上午11:28:20 * 
@version 1.0 * 
 */
public class JsonResult {
    public static final Integer CODE_SUCCESS = 1;
    public static final Integer CODE_FAILURE = 0;
    public static final String MSG_SUCCESS = "操作成功";
    public static final String MSG_FAILURE = "操作失败";
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息说明 单个String:msg 多个{ "fieldName2": "msg2", "fieldName1": "msg1" }]
     */
    private Object msg;
    /**
     * 重定向url
     */
    private String url;
    /**
     * 业务数据
     */
    private Object data;

    public JsonResult() {
        this.code = CODE_SUCCESS;
        this.msg = MSG_SUCCESS;
    }

    public JsonResult(Integer code) {
        this.code = code;
    }

    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(Integer code, String msg, String url) {
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public JsonResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(Integer code, String msg, String url, Object data) {
        this.code = code;
        this.msg = msg;
        this.url = url;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "JsonResult{" + "code=" + code + ", msg=" + msg + ", url='" + url + '\'' + ", data=" + data + '}';
    }
}
