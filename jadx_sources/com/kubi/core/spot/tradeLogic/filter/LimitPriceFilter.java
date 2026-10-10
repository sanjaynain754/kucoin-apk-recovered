package com.kubi.core.spot.tradeLogic.filter;

import androidx.annotation.Keep;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.utils.extensions.C27039d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p829ze.InterfaceC46768c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LimitPriceFilter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/spot/tradeLogic/filter/LimitPriceFilter;", "Lcom/kubi/core/spot/tradeLogic/ITradeFilter;", "<init>", "()V", "predicate", "", "vm", "Lcom/kubi/core/spot/tradeLogic/ITradeOrderDataProvider;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LimitPriceFilter {
    public boolean predicate(@NotNull InterfaceC46768c vm2) throws JSONException {
        Intrinsics.checkNotNullParameter(vm2, "vm");
        boolean z11 = C27039d.m66647g(vm2.m103056b()) <= 0.0d;
        if (z11) {
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_TRADINGSTOP_PRICE_RANGE, SpotBusinessTracker.SpotFailReason.TRADINGSTOP_PRICE_RANGE_ILLEGAL);
        }
        return z11;
    }
}
