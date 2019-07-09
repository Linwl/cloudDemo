package com.linwl.cloudDemo.commons.response;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/9 17:41
 * @description：响应消息体
 */
public class ResponseMsg {

    /**
     * 错误码
     */
    private int errorCode;
    /**
     * 提示信息
     */
    private String message;


    /**
     * 返回结果
     */
    private Object items;
    /**
     * 结果总数
     */
    private int total;

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                ", items=" + items +
                ", total=" + total +
                '}';
    }



    public ResponseMsg(Builder builder)
    {
        this.errorCode = builder.errorCode;
        this.items = builder.items;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static class Builder {
        private int errorCode;

        @Override
        public String toString() {
            return "Builder{" +
                    "errorCode=" + errorCode +
                    ", message='" + message + '\'' +
                    ", items=" + items +
                    ", total=" + total +
                    '}';
        }

        private String message;
        private Object items;
        private int total;

        public Builder setErrorCode(ERRORCODE errorCode)
        {
            this.errorCode = errorCode.getErrorcode();
            return this;
        }

        public Builder setMessage(String message)
        {
            this.message = message;
            return this;
        }

        public Builder setItems(Object items)
        {
            this.items = items;
            return this;
        }

        public Builder setTotal(int total)
        {
            this.total = total;
            return this;
        }

        public ResponseMsg build() {
            return new ResponseMsg(this);
        }
    }

}
