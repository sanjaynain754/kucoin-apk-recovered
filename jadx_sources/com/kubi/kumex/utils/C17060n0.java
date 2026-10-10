package com.kubi.kumex.utils;

import com.kubi.broker.BrokerConfig;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.utils.n0 */
/* JADX INFO: compiled from: TrackEventUtil.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\f\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0003¨\u0006\u0014"}, m90084d2 = {"FUTURES_PAGE_ID", "", "getFUTURES_PAGE_ID", "()Ljava/lang/String;", "RISK_LIMIT_PAGE_ID", "getRISK_LIMIT_PAGE_ID", "FUTURES_KLINE_PAGE_ID", "getFUTURES_KLINE_PAGE_ID", "MARKETS_PAGE_ID", "CANDLE_PAGE_ID", "BONUS_PAGE_ID", "AIRDROP_PAGE_ID", "POSITION_TRADE_RESULTS_EVENT", "getPOSITION_TRADE_RESULTS_EVENT", "TRADE_RESULTS_EVENT", "getTRADE_RESULTS_EVENT", "FUTURES_TRADE_RESULT_EVENT", "getFUTURES_TRADE_RESULT_EVENT", "MODIFY_ORDER_EVENT", "getMODIFY_ORDER_EVENT", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17060n0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m36551a() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getFuturesKlinePageId();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m36552b() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getFuturesPageId();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m36553c() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getFuturesTradeResultEvent();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m36554d() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getModifyOrderResult();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m36555e() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getPositionTradeResultsEvent();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m36556f() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getRiskLimitPageId();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m36557g() {
        return BrokerConfig.f19211a.m20201d().mo20242s0().getTradeResultsEvent();
    }
}
