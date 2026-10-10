package j30;

import androidx.lifecycle.LifecycleOwner;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j30.a */
/* JADX INFO: compiled from: SegmentDistributionDialogHost.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J@\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&JL\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122:\u0010\u0013\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u0014H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "", "setDistributionType", "", "type", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "setPreviewForDialog", "priceMin", "Ljava/math/BigDecimal;", "priceMax", "orderCount", "", "totalQty", "distributionType", "pricePrecision", "qtyPrecision", "observeCostForMarginEstimate", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onChanged", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buyValue", "sellValue", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40264a {
    /* JADX INFO: renamed from: W2 */
    void mo23176W2(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, int i11, @NotNull BigDecimal bigDecimal3, @NotNull SegmentDistributionType segmentDistributionType, int i12, int i13);

    /* JADX INFO: renamed from: j */
    void mo23177j(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super BigDecimal, ? super BigDecimal, Unit> function2);

    void setDistributionType(@NotNull SegmentDistributionType type);
}
