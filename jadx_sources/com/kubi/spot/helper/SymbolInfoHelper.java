package com.kubi.spot.helper;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.TradeItemBean;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.helper.e0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SymbolInfoHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/spot/helper/SymbolInfoHelper;", "", "<init>", "()V", "isSymbolCanTrade", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "useCache", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolInfoHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SymbolInfoHelper f50575a = new SymbolInfoHelper();

    /* JADX INFO: renamed from: a */
    public final boolean m61804a(@NotNull TradeItemBean tradeItemBean, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        return tradeItemBean.getSymbolInfoEntity().isEnableTrading() || CallAuctionSwitch.f20317a.m21643j(tradeItemBean, z11);
    }
}
