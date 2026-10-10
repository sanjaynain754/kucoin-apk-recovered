package com.kubi.core.biz.order.record.history;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.history.c */
/* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"valueOfTradeAccountMode", "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12036c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DelegationTradeAccount m22245a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "classic")) {
            return DelegationTradeAccount.a.f20619a;
        }
        return Intrinsics.areEqual(str, "unified") ? DelegationTradeAccount.b.f20621a : DelegationTradeAccount.a.f20619a;
    }
}
