package com.linwl.cloudDemo.commons.response;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/9 17:46
 * @description：错误码枚举
 */
public enum ERRORCODE {

    Success(0, "操作成功"),
    SystemErr(1, "系统错误"),
    ParamErr(101, "参数错误"),
    InfoErr(102, "信息错误"),
    Error(103, "操作失败"),
    PermissionDenied(104, "没有权限"),
    PassportErr(105, "用户校验失败"),
    LoginError(106, "登入过期"),
    UploadError(107, "上传失败"),
    DataNoCheckPass(108,"数据不完整无法提交提交或审核，需显示问题数据");


    ERRORCODE(int errorcode)
    {
        this.errorcode =errorcode;
    };

    ERRORCODE(int errorcode,String message)
    {
        this.errorcode =errorcode;
        this.message =message;
    };


    public int getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 错误码
     */
    private int errorcode;

    /**
     * 提示信息
     */
    private String message;


}
