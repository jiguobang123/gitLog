package com.shangma.cn.common.http;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {

    private int status;
    private String message;
    private T data;


    private AxiosResult() {
    }


    /**
     * 返回成功不携带数据
     */

    public static <T> AxiosResult<T> success() {
        return setData(AxiosStatus.OK, null);
    }

    /**
     * 返回成功携带数据
     */
    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.OK, data);
    }

    /**
     * 返回成功 自定义状态码不携带数据
     */

    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 返回成功 自定义状态码携带数据
     */

    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }

    /**
     * 返回失败不携带数据
     */

    public static <T> AxiosResult<T> error() {
        return setData(AxiosStatus.ERROR, null);
    }

    /**
     * 返回数百携带数据
     */

    public static <T> AxiosResult<T> error(T data) {
        return setData(AxiosStatus.ERROR, data);
    }


    /**
     * 返回失败 自定义状态码不携带数据
     */


    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }


    /**
     * 返回失败 自定义状态码携带数据
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    /**
     * 封装数据公共方法
     *
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult axiosResult = new AxiosResult();
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        axiosResult.setData(data);
        return axiosResult;
    }

}
