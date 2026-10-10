package com.kubi.spot.kline;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.spot.business.callAuction.action.CallAuctionLoadKlineAction;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.kline.h0 */
/* JADX INFO: compiled from: KuCoinKlineFragmentExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"getLoadKlineAction", "Lcom/kubi/spot/kline/ILoadKlineAction;", "Lcom/kubi/spot/kline/KuCoinKlineFragment;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C25418h0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ILoadKlineAction m62107a(@NotNull KuCoinKlineFragment kuCoinKlineFragment) {
        Intrinsics.checkNotNullParameter(kuCoinKlineFragment, "<this>");
        return CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null) ? new CallAuctionLoadKlineAction() : new NormalLoadKlineAuction();
    }
}
