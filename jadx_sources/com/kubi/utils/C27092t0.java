package com.kubi.utils;

import com.kubi.kumex.api.R$string;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.utils.t0 */
/* JADX INFO: compiled from: StringEx.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0001¨\u0006\u0005"}, m90084d2 = {"formatTrialTag", "", "isAirDropTag", "", "isTradeProTag", "KumexApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C27092t0 {
    /* JADX INFO: renamed from: b */
    public static final boolean m66897b(@Nullable String str) {
        return Intrinsics.areEqual(str, "AIRDROP_POSITION");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m66898c(@Nullable String str) {
        return StringsKt.equals(str, FuturesWelfareTrialItemEntity.PRIZE_TYPE_TRADE_PRO, true);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m66896a(@Nullable String str) {
        if (m66897b(str)) {
            return C27017c.f54310a.m66516f(R$string.kumex_airdrop_label, new Object[0]);
        }
        if (m66898c(str)) {
            return C27017c.f54310a.m66516f(R$string.kumex_trade_pro_trial_title, new Object[0]);
        }
        return C27017c.f54310a.m66516f(R$string.kumex_welfare_trial, new Object[0]);
    }
}
