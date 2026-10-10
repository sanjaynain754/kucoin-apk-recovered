package com.kubi.tradebase.api.segment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.router.core.Router;
import j30.InterfaceC40264a;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ITradeSegmentUiService.kt */
/* JADX INFO: loaded from: classes48.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0096\u0001\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/api/segment/ITradeSegmentUiService;", "", "showSegmentDistributionInfoDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "showSegmentDistributionDialog", "parent", "Landroidx/fragment/app/Fragment;", "totalQty", "Ljava/math/BigDecimal;", "priceMin", "priceMax", "orderCount", "", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "quoteCurrency", "baseCurrency", "pricePrecision", "qtyPrecision", "minSize", "isFutures", "", "trackPageId", "trackTradeType", "segmentDistributionHost", "Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "Companion", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeSegmentUiService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51506a = Companion.f51507a;

    /* JADX INFO: compiled from: ITradeSegmentUiService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradebase/api/segment/ITradeSegmentUiService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/tradebase/api/segment/ITradeSegmentUiService;", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51507a = new Companion();

        @NotNull
        public final ITradeSegmentUiService get() {
            return (ITradeSegmentUiService) Router.f46192a.m56192n(ITradeSegmentUiService.class);
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m63107b(ITradeSegmentUiService iTradeSegmentUiService, Fragment fragment, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, SegmentDistributionType segmentDistributionType, String str, String str2, int i12, int i13, BigDecimal bigDecimal4, boolean z11, String str3, String str4, InterfaceC40264a interfaceC40264a, String str5, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSegmentDistributionDialog");
        }
        iTradeSegmentUiService.mo63108a(fragment, bigDecimal, bigDecimal2, bigDecimal3, i11, segmentDistributionType, str, str2, i12, i13, bigDecimal4, (i14 & 2048) != 0 ? true : z11, (i14 & 4096) != 0 ? "" : str3, (i14 & 8192) != 0 ? "" : str4, (i14 & 16384) != 0 ? null : interfaceC40264a, (i14 & 32768) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: a */
    void mo63108a(@NotNull Fragment fragment, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, int i11, @NotNull SegmentDistributionType segmentDistributionType, @NotNull String str, @NotNull String str2, int i12, int i13, @NotNull BigDecimal bigDecimal4, boolean z11, @NotNull String str3, @NotNull String str4, @Nullable InterfaceC40264a interfaceC40264a, @Nullable String str5);

    /* JADX INFO: renamed from: c */
    void mo63109c(@NotNull FragmentManager fragmentManager, @Nullable String str);
}
