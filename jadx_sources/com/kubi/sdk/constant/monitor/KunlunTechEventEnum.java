package com.kubi.sdk.constant.monitor;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KunlunTechEventEnum.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, m90084d2 = {"Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;", "", "category", "", "desc", "startVersion", "deprecated", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getDesc", "CATE_ROUTER", "CATE_SYMBOL_ENTITY_QUERY", "CATE_COIN_ENTITY_QUERY", "CATE_ETF_ENTITY_QUERY", "CATE_TRADE_ENTITY_QUERY", "CATE_ORDER_ENTITY_QUERY", "CATE_HOST", "CATE_GET_HOST_CONFIG", "CATE_STARTUP", "CATE_DOWNGRADE", "CATE_GSON", "CATE_OFFLINE_PKG", "CATE_RN_BUNDLE", "CATE_OPEN_WEBVIEW", "CATE_KNB_HYBRID", "CATE_DNS", "CATE_STARTUP_CRASH", "CATE_NUMERIC_DOT", "CATE_SYMBOLS_PUSH_DELAY", "CONTRACT_ENTITY_QUERY", "CATE_HTTP_ILLEGAL", "CATE_KEYCHAIN_PUT", "CATE_KEYCHAIN_GET", "CATE_KEYCHAIN_MIGRATE", "CATE_REMOTE_CONFIG_FETCH_ALL", "BIZ_CONTROL_TYPE_ERROR", "CATE_CREDENTIAL_CREATE", "CATE_CREDENTIAL_GET", "CATE_CREDENTIAL_CLEAR_STATE", "CATE_JSON_PROTOCOL", "CATE_SHUMEI_INIT", "CATE_SEARCH_TIMEOUT", "CATE_NETWORK_ENCRYPT_DATA", "CATE_NETWORK_ENCRYPT_INTERCEPT", "CATE_NETWORK_ENCRYPT_INTERPRET", "CATE_SITE_DUPLICATE_SWITCH", "CATE_SITE_INFO_UNKNOWN", "CATE_SITE_CONFIG_REMOTE_ILLEGAL", "CATE_SITE_CONFIG_LOCAL_ILLEGAL", "CATE_NETWORK_HTTP_BODY_ILLEGAL", "CATE_NETWORK_WS_BODY_ILLEGAL", "CATE_ALPHA_ENTITY_QUERY", "CATE_PROTOBUF_PARSE_ERROR", "CATE_FLUTTER_LOAD", "KCConstant_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum KunlunTechEventEnum {
    CATE_ROUTER("router", "路由埋点", "3.98.0", ""),
    CATE_SYMBOL_ENTITY_QUERY("SymbolEntityQuery", "币种对查询", "3.99.0", ""),
    CATE_COIN_ENTITY_QUERY("CoinEntityQuery", "币种对查询", "3.99.0", ""),
    CATE_ETF_ENTITY_QUERY("EtfEntityQuery", "etf信息查询", "3.99.0", ""),
    CATE_TRADE_ENTITY_QUERY("TradeItemQuery", "分区行情信息查询", "3.99.5", ""),
    CATE_ORDER_ENTITY_QUERY("OrderLimitQuery", "下单限制信息查询", "3.99.5", ""),
    CATE_HOST("host", "host库埋点", "3.99.0", ""),
    CATE_GET_HOST_CONFIG("getHostConfig", "host库配置读取埋点", "3.133.0", ""),
    CATE_STARTUP("startup", "启动库埋点", "3.99.0", ""),
    CATE_DOWNGRADE("downgrade", "类型转换降级埋点", "3.99.0", ""),
    CATE_GSON("gson", "gson解析埋点", "3.99.0", ""),
    CATE_OFFLINE_PKG("offlinePkg", "离线包单个下载成功率", "3.99.0", ""),
    CATE_RN_BUNDLE("rnBundle", "rnBundle单个下载成功率", "3.99.0", ""),
    CATE_OPEN_WEBVIEW("openWebView", "H5打开成功率", "3.99.0", ""),
    CATE_KNB_HYBRID("knbHybrid", "knb的H5桥成功率", "3.99.0", ""),
    CATE_DNS("httpdns", "dns解析成功率", "3.100.0", ""),
    CATE_STARTUP_CRASH("startupCrash", "启动连续crash", "3.100.0", ""),
    CATE_NUMERIC_DOT("numericDot", "数字工具无法处理", "3.100.0", ""),
    CATE_SYMBOLS_PUSH_DELAY("SYMBOLS_PUSH_DELAY", "交易对推送延迟", "3.100.0", ""),
    CONTRACT_ENTITY_QUERY("ContractEntityQuery", "查询合约配置成功率", "3.100.0", ""),
    CATE_HTTP_ILLEGAL("httpIllegal", "network的首屏前网络请求", "3.103.0", ""),
    CATE_KEYCHAIN_PUT("keychainPut", "keychain的保存请求", "3.105.0", ""),
    CATE_KEYCHAIN_GET("keychainGet", "keychain的读取请求", "3.105.0", ""),
    CATE_KEYCHAIN_MIGRATE("keychainMigrate", "keychain的迁移请求", "3.105.0", ""),
    CATE_REMOTE_CONFIG_FETCH_ALL("remoteConfigFetchAll", "云配获取全量数据", "3.106.0", ""),
    BIZ_CONTROL_TYPE_ERROR("bizControlTypeError", "展业中台SDK数据类型错误", "3.109.0", ""),
    CATE_CREDENTIAL_CREATE("credentialCreate", "credential库凭据创建", "3.118.0", ""),
    CATE_CREDENTIAL_GET("credentialGet", "credential库凭据获取", "3.118.0", ""),
    CATE_CREDENTIAL_CLEAR_STATE("credentialClearState", "credential库凭据清理状态", "3.118.0", ""),
    CATE_JSON_PROTOCOL("jsonProtocol", "后端接口协议异常", "3.125.0", ""),
    CATE_SHUMEI_INIT("shuMeiInit", "数美初始化监控", "3.127.0", ""),
    CATE_SEARCH_TIMEOUT("searchTimeout", "搜索超时", "3.127.0", ""),
    CATE_NETWORK_ENCRYPT_DATA("network_encrypt_data", "网络加密数据成功率", "3.133.0", ""),
    CATE_NETWORK_ENCRYPT_INTERCEPT("network_encrypt_intercept", "网络加密拦截成功率", "3.133.0", ""),
    CATE_NETWORK_ENCRYPT_INTERPRET("network_encrypt_interpret", "网络加密解析成功率", "3.133.0", ""),
    CATE_SITE_DUPLICATE_SWITCH("site_duplicate_switch", "站点切换-重复切换", "3.138.0", ""),
    CATE_SITE_INFO_UNKNOWN("site_info_unknown", "站点信息-未识别的站点", "3.138.0", ""),
    CATE_SITE_CONFIG_REMOTE_ILLEGAL("site_config_remote_illegal", "站点配置-server端下发数据非法", "3.138.0", ""),
    CATE_SITE_CONFIG_LOCAL_ILLEGAL("site_config_local_illegal", "站点配置-本地读取数据非法", "3.138.0", ""),
    CATE_NETWORK_HTTP_BODY_ILLEGAL("network_http_body_illegal", "HTTP请求body非法", "3.139.0", ""),
    CATE_NETWORK_WS_BODY_ILLEGAL("network_ws_body_illegal", "WS请求body非法", "3.139.0", ""),
    CATE_ALPHA_ENTITY_QUERY("AlphaEntityQuery", "alpha币种信息查询", "4.0.0", ""),
    CATE_PROTOBUF_PARSE_ERROR("protobuf_parse_error", "pb解析异常", "4.27.0", ""),
    CATE_FLUTTER_LOAD("flutter_load", "flutter容器初始化", "3.141.0", "");


    @NotNull
    private final String category;

    @NotNull
    private final String desc;

    KunlunTechEventEnum(String str, String str2, String str3, String str4) {
        this.category = str;
        this.desc = str2;
    }

    /* synthetic */ KunlunTechEventEnum(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? "" : str4);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
