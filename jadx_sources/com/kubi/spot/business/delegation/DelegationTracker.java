package com.kubi.spot.business.delegation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationTracker.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/DelegationTracker;", "", "<init>", "()V", "trackHistoryDelegationJump", "", "isTradePage", "", "trackHistoryDelegationDetailJump", "trackCurrentDelegationJump", "type", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DelegationTracker {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DelegationTracker f50071a = new DelegationTracker();

    /* JADX INFO: renamed from: a */
    public final void m60957a(@Nullable String str) {
        if (StringsKt.equals$default(str, "active", false, 2, null)) {
            C43852m.m96591c("B5orderList", "openOrder", "lineTradePair", null, 8, null);
        } else {
            C43852m.m96591c("B5orderList", "advanceOrder", "lineTradePair", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m60958b() {
        C43852m.m96591c("B5singleOrder", "tradeDetail", "lineTradePair", null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m60959c(boolean z11) {
        if (z11) {
            C43852m.m96591c("B5trading", "tradeOpenOrder", "tradePairName", null, 8, null);
        } else {
            C43852m.m96591c("B5orderList", "orderHis", "lineTradePair", null, 8, null);
        }
    }
}
