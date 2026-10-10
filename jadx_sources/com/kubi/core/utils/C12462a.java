package com.kubi.core.utils;

import com.kubi.unify.api.IUnifyAccountService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.utils.a */
/* JADX INFO: compiled from: SensorUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"UNIFIED_TRADING_PAGE_ID", "", "CLASSIC_TRADING_PAGE_ID", "TRADING_PAGE_ID", "getTRADING_PAGE_ID", "()Ljava/lang/String;", "ORDER_PAGE_ID", "ORDER_DETAILS_PAGE_ID", "CANDLE_PAGE_ID", "MARKETS_SPOT_PAGE_ID", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12462a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m23402a() {
        return IUnifyAccountService.f53155a.get().mo64979C() ? "B5UnifyTrading" : "B5trading";
    }
}
