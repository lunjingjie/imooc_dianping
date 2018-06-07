package org.imooc.constant;

/**
 * XX00表示成功
 * XX01表示失败
 *
 * @author Raytine
 */

public enum PageCodeEnum {
    ADD_SUCCES(1000, "新增成功!"),
    ADD_FAIL(1001, "新增失败！"),
    DELETE_SUCCESS(1100, "删除成功"),
    DELETE_FAIL(1101, "删除失败"),
    MODIFY_SUCCESS(1200, "修改成功了"),
    MODIFY_FAIL(1201, "修改失败了"),;

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
