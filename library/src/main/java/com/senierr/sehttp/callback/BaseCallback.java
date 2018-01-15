package com.senierr.sehttp.callback;

import com.senierr.sehttp.convert.Converter;
import com.senierr.sehttp.internal.RequestBuilder;

/**
 * 请求回调基类
 *
 * Created by zhouchunjie on 2017/3/28.
 */

public abstract class BaseCallback<T> implements Converter<T> {

    /**
     * 上传进度回调
     *
     * @param totalSize 上传文件总大小
     * @param currentSize 当前已上传大小
     * @param progress 进度0~100
     */
    public void onUploadProgress(long totalSize, long currentSize, int progress) {}

    /**
     * 下载进度回调
     *
     * @param totalSize 下载文件总大小
     * @param currentSize 当前已下载大小
     * @param progress 进度0~100
     */
    public void onDownloadProgress(long totalSize, long currentSize, int progress) {}

    /**
     * 请求成功回调
     *
     * @param t 泛型
     */
    public abstract void onSuccess(T t);

    /**
     * 请求异常回调
     *
     * @param e 捕获的异常
     */
    public void onError(Exception e) {}
}