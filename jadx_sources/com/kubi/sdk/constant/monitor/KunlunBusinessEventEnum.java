package com.kubi.sdk.constant.monitor;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KunlunBusinessEventEnum.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;", "", "category", "", "desc", "startVersion", "deprecated", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getDesc", "LOGIN_EVENT", "REGISTER_RESULT", "REGISTER_RESULT_SYNC", "ROBOT_CHECKER_RESULT", "REFRESH_TOKEN_RESULT", "MARGIN_TRADE_PRECHECK_RESULT", "SPOT_TRADE_PRECHECK_RESULT", "UNIFY_TRADE_PRECHECK_RESULT", "MARGIN_TRADE_API_RESULT", "SPOT_TRADE_API_RESULT", "UNIFY_TRADE_API_RESULT", "PAYMENT_THIRD_BUY_RESULT", "KC_MARKET_RESULT", "KUMEX_TRADE_PRECHECK_RESULT", "KUMEX_TRADE_API_RESULT", "SAFE_VALIDATION_V2", "SAFE_VERIFY_START", "TRADE_RISK_VERIFY_CHECK", "ASSET_DEPOSIT_API_RESULT", "ASSET_WITHDRAW_CHAIN_API_RESULT", "ASSET_WITHDRAW_INNER_API_RESULT", "ASSET_TRANSFER_API_RESULT", "KYC_VERIFY_RESULT", "KCConstant_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum KunlunBusinessEventEnum {
    LOGIN_EVENT("login_event", "登录成功率", "3.99.0", ""),
    REGISTER_RESULT("register_result", "注册成功率", "3.99.0", ""),
    REGISTER_RESULT_SYNC("register_result_sync", "注册成功上报", "4.37.0", ""),
    ROBOT_CHECKER_RESULT("robot_checker_result", "人机验证成功率", "3.99.0", ""),
    REFRESH_TOKEN_RESULT("refresh_token_result", "token续期成功率", "3.99.0", ""),
    MARGIN_TRADE_PRECHECK_RESULT("margin_trade_precheck_result", "杠杆前置校验下单拦截率", "3.107.0", ""),
    SPOT_TRADE_PRECHECK_RESULT("spot_trade_precheck_result", "现货前置校验下单拦截率", "3.107.0", ""),
    UNIFY_TRADE_PRECHECK_RESULT("unify_trade_precheck_result", "统一账户前置校验下单拦截率", "4.0.0", ""),
    MARGIN_TRADE_API_RESULT("margin_trade_api_result", "杠杆API下单成功率", "3.107.0", ""),
    SPOT_TRADE_API_RESULT("spot_trade_api_result", "现货API下单成功率", "3.107.0", ""),
    UNIFY_TRADE_API_RESULT("unify_trade_api_result", "统一账户API下单成功率", "4.0.0", ""),
    PAYMENT_THIRD_BUY_RESULT("paymentThirdBuyResult", "支付三方买币成功率", "3.108.0", ""),
    KC_MARKET_RESULT("kc_market_expose", "行情曝光", "3.109.0", ""),
    KUMEX_TRADE_PRECHECK_RESULT("kumex_trade_precheck_result", "合约下单成功率(前置验证)", "3.109.0", ""),
    KUMEX_TRADE_API_RESULT("kumex_trade_api_result", "合约下单成功率(接口验证)", "3.109.0", ""),
    SAFE_VALIDATION_V2("safe_verify_check", "新版安全验证组件埋点事件", "3.123.0", ""),
    SAFE_VERIFY_START("safe_verify_start", "安全验证组件跳转开始埋点上报", "4.22.0", ""),
    TRADE_RISK_VERIFY_CHECK("trade_risk_verify_check", "交易业务风控事件上报", "4.21.0", ""),
    ASSET_DEPOSIT_API_RESULT("asset_deposit_api_result", "充币获取成功率", "4.25.0", ""),
    ASSET_WITHDRAW_CHAIN_API_RESULT("asset_withdraw_chain_api_result", "提币链上成功率", "4.25.0", ""),
    ASSET_WITHDRAW_INNER_API_RESULT("asset_withdraw_inner_api_result", "提币内部转账成功率", "4.25.0", ""),
    ASSET_TRANSFER_API_RESULT("asset_transfer_api_result", "划转成功率", "4.25.0", ""),
    KYC_VERIFY_RESULT("kyc_verify_result", "kyc认证成功率", "4.25.0", "");


    @NotNull
    private final String category;

    @NotNull
    private final String desc;

    KunlunBusinessEventEnum(String str, String str2, String str3, String str4) {
        this.category = str;
        this.desc = str2;
    }

    /* synthetic */ KunlunBusinessEventEnum(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
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
