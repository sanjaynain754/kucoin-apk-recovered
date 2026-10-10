package pe;

import android.content.Context;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.ToastCompat;
import gf.C37890n;
import j30.C40266c;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pe.h */
/* JADX INFO: compiled from: SpotSegmentTradeInputIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JV\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/SpotSegmentTradeInputIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/input/ISegmentTradeInputIntercept;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "checkInterceptFailed", "", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "priceMin", "Ljava/math/BigDecimal;", "priceMax", "orderCount", "", "totalQty", "avgPrice", "segmentDistributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "hasMinQtyError", "onMinQtyError", "Lkotlin/Function0;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43452h implements InterfaceC43447c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f95981a;

    @Override // pe.InterfaceC43447c
    /* JADX INFO: renamed from: a */
    public boolean mo95655a(@NotNull ITradeHolderDependDelegate parentBehavior, @NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, @NotNull BigDecimal totalQty, @NotNull BigDecimal avgPrice, @NotNull SegmentDistributionType segmentDistributionType, boolean z11, @NotNull Function0<Unit> onMinQtyError) throws JSONException {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        Intrinsics.checkNotNullParameter(avgPrice, "avgPrice");
        Intrinsics.checkNotNullParameter(segmentDistributionType, "segmentDistributionType");
        Intrinsics.checkNotNullParameter(onMinQtyError, "onMinQtyError");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (priceMin.compareTo(bigDecimal) <= 0) {
            ToastCompat.m66437C(R$string.kumex_segment_input_mini_price);
            return true;
        }
        if (priceMax.compareTo(bigDecimal) <= 0) {
            ToastCompat.m66437C(R$string.kumex_segment_input_max_price);
            return true;
        }
        if (priceMax.compareTo(priceMin) <= 0) {
            ToastCompat.m66437C(R$string.kumex_segment_input_price_verification);
            return true;
        }
        if (i11 <= 0) {
            ToastCompat.m66437C(R$string.kumex_segment_input_order_num);
            return true;
        }
        if (i11 < 2 || i11 > 20) {
            return true;
        }
        if (totalQty.compareTo(bigDecimal) <= 0) {
            ToastCompat.m66437C(R$string.otc_ad_supply_amount_hint);
            return true;
        }
        SymbolInfoEntity symbolInfoEntityMo22365N = parentBehavior.mo22365N();
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(symbolInfoEntityMo22365N.getBaseMinSize()));
        C40266c c40266c = C40266c.f89505a;
        BigDecimal bigDecimalMax = c40266c.m88651i(i11, segmentDistributionType, bigDecimal2, symbolInfoEntityMo22365N.getBaseIncrementPrecision()).max(c40266c.m88652j(i11, segmentDistributionType, new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(symbolInfoEntityMo22365N.getQuoteCurrency()))), priceMin, symbolInfoEntityMo22365N.getBaseIncrementPrecision())).max(bigDecimal2);
        if (totalQty.compareTo(bigDecimalMax) >= 0) {
            if (!z11) {
                return false;
            }
            onMinQtyError.invoke();
            return true;
        }
        Context context = this.f95981a;
        int i12 = R$string.futures_min_quantity_for_make_order;
        Intrinsics.checkNotNull(bigDecimalMax);
        ToastCompat.m66441G(context.getString(i12, C42180b.m92640e(bigDecimalMax, null, symbolInfoEntityMo22365N.getBaseIncrementPrecision(), false, false, false, 0, null, 125, null), symbolInfoEntityMo22365N.getBaseCurrencyName()), new Object[0]);
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_NUM_RANGE, SpotBusinessTracker.SpotFailReason.NUM_RANGE_ILLEGAL);
        return true;
    }

    public C43452h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95981a = context;
    }
}
