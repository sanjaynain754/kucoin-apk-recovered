package com.sensorsdata.abtest.entity;

/* JADX INFO: loaded from: classes59.dex */
public enum SABErrorEnum {
    SDK_NULL_CONTEXT("0001", "Context must be not empty!"),
    SDK_NULL_SENSORS_AB_TEST_CONFIG_OPTIONS("0002", "SensorsABTestConfigOptions can not be null"),
    SDK_NULL_BASE_URL_OF_SENSORS_AB_TEST_CONFIG_OPTIONS("0003", "A/B Testing SDK 初始化失败，请使用正确的 URL"),
    SDK_NULL_KEY_OF_SENSORS_AB_TEST_CONFIG_OPTIONS("0004", "A/B Testing SDK 初始化失败，请使用正确的 URL（必须包含 project-key)"),
    ASYNC_REQUEST_NULL_EXPERIMENT_PARAMETER_NAME("1001", "The experiment param name of async request is empty and return default value: %s"),
    ASYNC_REQUEST_NETWORK_UNAVAILABLE("1002", "Network is unavailable and return default value: %s"),
    ASYNC_REQUEST_TIMEOUT("1003", "AsyncRequest is timeout and return default value: %s"),
    ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID("1004", "试验结果类型与代码期望类型不一致，试验参数名：%s，当前返回类型为：%s，代码期望类型为：%s"),
    ASYNC_REQUEST_PROPERTIES_NOT_VALID("1005", "请求试验的自定义参数校验不通过: %s"),
    ASYNC_REQUEST_EXPERIMENT_NOT_IN_FUZZY("1006", "请求的试验没有在 fuzzy experiments list 中");

    public String code;
    public String message;

    SABErrorEnum(String str, String str2) {
        this.code = str;
        this.message = str2;
    }
}
