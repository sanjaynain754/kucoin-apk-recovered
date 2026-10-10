package com.kubi.futures.trade.order.modify.twap;

import androidx.lifecycle.LiveData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.futures.trade.order.modify.BaseModifyOrderViewModel;
import com.kubi.futures.trade.submit.panel.tradeType.twap.a0;
import java.math.BigDecimal;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.twap.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TwapModifyOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/twap/TwapModifyOrderViewModel;", "Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;", "<init>", "()V", "vmDelegate", "Lcom/kubi/futures/trade/submit/panel/tradeType/twap/TwapViewModel;", "isDurationCheckSucceed", "Landroidx/lifecycle/LiveData;", "Lcom/kubi/futures/trade/submit/panel/tradeType/twap/DurationSettingDialogInputData;", "()Landroidx/lifecycle/LiveData;", "checkAndSettingDuration", "", "contractConfig", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "qtyUnitStrategy", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "curDuration", "", "inputTotalAmount", "Ljava/math/BigDecimal;", "delegationPrice", JPushConstants.Geofence.KEY_INTERVAL, "singleCost", "(Lcom/kubi/futures/trade/config/IFuturesContractConfig;Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/math/BigDecimal;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TwapModifyOrderViewModel extends BaseModifyOrderViewModel {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final a0 f24037d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final LiveData<com.kubi.futures.trade.submit.panel.tradeType.twap.a> f24038e0;

    /* JADX INFO: renamed from: l0 */
    public final void m27439l0(@NotNull InterfaceC38213a contractConfig, @NotNull InterfaceC41049a qtyUnitStrategy, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal delegationPrice, long j11, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contractConfig, "contractConfig");
        Intrinsics.checkNotNullParameter(qtyUnitStrategy, "qtyUnitStrategy");
        Intrinsics.checkNotNullParameter(delegationPrice, "delegationPrice");
        this.f24037d0.p0(contractConfig, qtyUnitStrategy, l11, bigDecimal, delegationPrice, j11, bigDecimal2);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final LiveData<com.kubi.futures.trade.submit.panel.tradeType.twap.a> m27440m0() {
        return this.f24038e0;
    }

    public TwapModifyOrderViewModel() {
        a0 a0Var = new a0();
        this.f24037d0 = a0Var;
        this.f24038e0 = a0Var.C0();
    }
}
