package com.kubi.core.spot.tradeLogic.filter;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p829ze.InterfaceC46768c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: UserTradePwdStatusFilter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/spot/tradeLogic/filter/UserTradePwdStatusFilter;", "Lcom/kubi/core/spot/tradeLogic/ITradeFilter;", "<init>", "()V", "predicate", "", "vm", "Lcom/kubi/core/spot/tradeLogic/ITradeOrderDataProvider;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserTradePwdStatusFilter {
    public boolean predicate(@NotNull InterfaceC46768c vm2) {
        Intrinsics.checkNotNullParameter(vm2, "vm");
        if (!vm2.m103055a()) {
            C44128b.m97266j("TradeFilter", "当前用户未设置交易密码");
        }
        return !vm2.m103055a();
    }
}
