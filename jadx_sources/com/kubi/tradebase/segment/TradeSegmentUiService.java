package com.kubi.tradebase.segment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.tradebase.api.segment.ITradeSegmentUiService;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import j30.InterfaceC40264a;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.segment.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeSegmentUiService.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u008c\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradebase/segment/TradeSegmentUiService;", "Lcom/kubi/tradebase/api/segment/ITradeSegmentUiService;", "<init>", "()V", "showSegmentDistributionInfoDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "showSegmentDistributionDialog", "parent", "Landroidx/fragment/app/Fragment;", "totalQty", "Ljava/math/BigDecimal;", "priceMin", "priceMax", "orderCount", "", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "quoteCurrency", "baseCurrency", "pricePrecision", "qtyPrecision", "minSize", "isFutures", "", "trackPageId", "trackTradeType", "segmentDistributionHost", "Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeSegmentUiService implements ITradeSegmentUiService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.tradebase.api.segment.ITradeSegmentUiService
    /* JADX INFO: renamed from: a */
    public void mo63108a(@NotNull Fragment parent, @NotNull BigDecimal totalQty, @NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, @NotNull SegmentDistributionType distributionType, @NotNull String quoteCurrency, @NotNull String baseCurrency, int i12, int i13, @NotNull BigDecimal minSize, boolean z11, @NotNull String trackPageId, @NotNull String trackTradeType, @Nullable InterfaceC40264a interfaceC40264a, @Nullable String str) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(minSize, "minSize");
        Intrinsics.checkNotNullParameter(trackPageId, "trackPageId");
        Intrinsics.checkNotNullParameter(trackTradeType, "trackTradeType");
        if (interfaceC40264a != null || (parent instanceof InterfaceC40264a)) {
            SegmentDistributionDialog segmentDistributionDialogNewInstance = SegmentDistributionDialog.f51605u0.newInstance(totalQty, priceMin, priceMax, i11, distributionType, quoteCurrency, baseCurrency, i12, i13, minSize, z11, trackPageId, trackTradeType, interfaceC40264a == null ? (InterfaceC40264a) parent : interfaceC40264a);
            FragmentManager childFragmentManager = parent.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            segmentDistributionDialogNewInstance.show(childFragmentManager, str == null ? "SegmentDistributionDialog" : str);
        }
    }

    @Override // com.kubi.tradebase.api.segment.ITradeSegmentUiService
    /* JADX INFO: renamed from: c */
    public void mo63109c(@NotNull FragmentManager childFragmentManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        SegmentDistributionInfoDialog.f51619w0.newInstance().show(childFragmentManager, str);
    }
}
