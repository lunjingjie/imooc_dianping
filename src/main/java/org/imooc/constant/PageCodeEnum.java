package org.imooc.constant;

/**
 * XX00表示成功
 * XX01表示失败
 *
 * @author Raytine
 */

public enum PageCodeEnum {
    /**
     * 增加成功
     */
    ADD_SUCCES(1000, "新增成功!"),
    /**
     * 新增失败
     */
    ADD_FAIL(1001, "新增失败！"),;

    private Integer code;
    private String msg;
    public static final String KEY = "pageCode";

    PageCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getKEY() {
        return KEY;
    }
}
