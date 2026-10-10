package com.kubi.sdk.constant.monitor;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KunlunEventNameEnum.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/constant/monitor/KunlunEventNameEnum;", "", "eventName", "", "desc", "startVersion", "deprecated", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getEventName", "FRONTEND_BUSINESS_EVENT_COUNT", "FRONTEND_TECHNOLOGY_EVENT_COUNT", "FRONTEND_REQUEST_API_COUNT", "FRONTEND_REQUEST_API_COST_MILLISECONDS", "FRONTEND_REQUEST_PATH_COUNT", "FRONTEND_WS_REQUEST", "FRONTEND_WS_REQUEST_COST_MILLISECONDS", "FRONTEND_CONNECT_WS_ACTIVE", "FRONTEND_CONNECT_WS_COUNT", "FRONTEND_CONNECT_WS_COST_MILLISECONDS", "FRONTEND_HTTPDNS_API_COUNT", "FRONTEND_HTTPDNS_API_COST_MILLISECONDS", "FRONTEND_BIZCONTROL_EVENT_COUNT", "FRONTEND_BIZCONTROL_COST_MILLISECONDS", "FRONTEND_H5PAGE_COST_MILLISECONDS", "FRONTEND_H5PAGE_COUNT", "FRONTEND_RNPAGE_COUNT", "FRONTEND_RNPAGE_COUNT_COST_MILLISECONDS", "FRONTEND_FALLBACK_COUNT", "KCConstant_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum KunlunEventNameEnum {
    FRONTEND_BUSINESS_EVENT_COUNT("frontend_business_event_count", "Kunlun业务埋点", "3,99.0", ""),
    FRONTEND_TECHNOLOGY_EVENT_COUNT("frontend_technology_event_count", "Kunlun技术埋点", "3,98.0", ""),
    FRONTEND_REQUEST_API_COUNT("frontend_request_api_count", "短链接请求统计", "3,96.0", ""),
    FRONTEND_REQUEST_API_COST_MILLISECONDS("frontend_request_api_cost_milliseconds", "短链接耗时统计", "3,96.0", ""),
    FRONTEND_REQUEST_PATH_COUNT("frontend_request_path_count", "短链接Path统计", "3.106.0", ""),
    FRONTEND_WS_REQUEST("frontend_ws_request", "长连接请求次数统计", "3,96.0", ""),
    FRONTEND_WS_REQUEST_COST_MILLISECONDS("frontend_ws_request_cost_milliseconds", "长连接耗时统计", "3,96.0", ""),
    FRONTEND_CONNECT_WS_ACTIVE("frontend_connect_ws_active", "长连接活跃统计", "3.141.0", ""),
    FRONTEND_CONNECT_WS_COUNT("frontend_connect_ws_count", "长连接建连统计", "3,96.0", ""),
    FRONTEND_CONNECT_WS_COST_MILLISECONDS("frontend_connect_ws_cost_milliseconds", "长连接建连耗时统计", "3,96.0", ""),
    FRONTEND_HTTPDNS_API_COUNT("frontend_httpdns_api_count", "httpdns统计", "3.103.0", ""),
    FRONTEND_HTTPDNS_API_COST_MILLISECONDS("frontend_httpdns_api_cost_milliseconds", "httpdns耗时统计", "3.103.0", ""),
    FRONTEND_BIZCONTROL_EVENT_COUNT("frontend_bizcontrol_event_count", "展业SDK拉取结果统计", "3.109.0", ""),
    FRONTEND_BIZCONTROL_COST_MILLISECONDS("frontend_bizcontrol_cost_milliseconds", "展业SDK拉取耗时统计", "3.109.0", ""),
    FRONTEND_H5PAGE_COST_MILLISECONDS("frontend_h5page_cost_milliseconds", "H5页面耗时统计", "3.113.0", ""),
    FRONTEND_H5PAGE_COUNT("frontend_h5page_count", "H5页面访问成功率统计", "3.113.0", ""),
    FRONTEND_RNPAGE_COUNT("frontend_rnpage_count", "rn页面相关场景成功率统计", "3.125.0", ""),
    FRONTEND_RNPAGE_COUNT_COST_MILLISECONDS("frontend_rnpage_count_cost_milliseconds", "rn页面相关场景耗时统计", "3.125.0", ""),
    FRONTEND_FALLBACK_COUNT("frontend_fallback_count", "页面功能容灾成功率统计", "3.133.0", "");


    @NotNull
    private final String desc;

    @NotNull
    private final String eventName;

    KunlunEventNameEnum(String str, String str2, String str3, String str4) {
        this.eventName = str;
        this.desc = str2;
    }

    /* synthetic */ KunlunEventNameEnum(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? "" : str4);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }
}
