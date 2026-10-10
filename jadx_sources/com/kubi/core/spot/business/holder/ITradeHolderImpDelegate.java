package com.kubi.core.spot.business.holder;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.g0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeHolderImpDelegate.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/ITradeHolderImpDelegate;", "", "setIsBuyHolder", "", "isBuyHolder", "", "onSymbolChanged", "onLegalCurrencyChanged", "notifyHolderAsset", "onClickPriceCallBack", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "onBboDataGet", "onPanelBecameVisible", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "refreshButtonStatus", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "isMaintenance", "reset", "onOrderModeCheck", "mode", "", "onCouponsDataGet", "getView", "Landroid/widget/LinearLayout;", "isSupportBorrow", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeHolderImpDelegate {
    /* JADX INFO: renamed from: c */
    void mo22959c(@NotNull SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m23273a(ITradeHolderImpDelegate iTradeHolderImpDelegate, SymbolInfoEntity symbolInfoEntity, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshButtonStatus");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        iTradeHolderImpDelegate.mo22959c(symbolInfoEntity, z11, z12);
    }

    /* JADX INFO: renamed from: b */
    default void mo23037b(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
    }
}
