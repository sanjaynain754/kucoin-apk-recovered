package com.kubi.futures.trade.order.modify;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.logic.calculator.Calculator;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17071w;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseViewModel;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37567b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.u0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TakerStopViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bJF\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0006J>\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bJF\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0006R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/TakerStopViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "takerRate", "Landroidx/lifecycle/MutableLiveData;", "", "getTakerRate", "()Landroidx/lifecycle/MutableLiveData;", "takerPrice", "getTakerPrice", "stopRate", "getStopRate", "stopPrice", "getStopPrice", "triggerTypeIndex", "Lkotlin/Pair;", "", "", "getTriggerTypeIndex", "calculateTakerRateByTakerPrice", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "delegationPrice", "Ljava/math/BigDecimal;", "isBuy", "leverage", "calculateTakerPriceByTakerRate", "takerType", "calculateStopRateByStopPrice", "calculateStopPriceByStopRate", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TakerStopViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<String> f24041X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<String> f24042Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<String> f24043Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f24044a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Pair<Integer, Boolean>> f24045b0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: p */
    public final void m27441p(@NotNull LifecycleOwner owner, @Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable String str, boolean z11, @Nullable BigDecimal bigDecimal2, @NotNull String takerType) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(takerType, "takerType");
        if (contractEntity == null || str == null || StringsKt.isBlank(str) || bigDecimal2 == null) {
            this.f24044a0.setValue(null);
        } else if (C41014a.m89917B(bigDecimal)) {
            C17058m0.m36548c(owner, R$string.bkumex_stop_profit_loss_hint);
        } else {
            this.f24044a0.setValue(Calculator.a.isolated().k(C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse())), com.kubi.kumex.logic.calculator.a.b(C27039d.m66656p(C17071w.m36622d(str)), new BigDecimal(-100), 0, (RoundingMode) null, 6, (Object) null), Intrinsics.areEqual(takerType, "TP") ? C37567b.m84618h(contractEntity) : C37567b.m84612b(contractEntity), C41014a.m89921F(contractEntity.getMaintainMargin(), OtcAd.KYC_NOT_PASS), C27039d.m66656p(bigDecimal), bigDecimal2, z11 ? "buy" : "sell", C41014a.m89921F(contractEntity.getMaxPrice(), "1000000"), C41014a.m89921F(Intrinsics.areEqual(takerType, "TP") ? contractEntity.getTickSize() : contractEntity.getIndexPriceTickSize(), "0.01")));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m27442q(@NotNull LifecycleOwner owner, @Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable String str, boolean z11, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (str == null || str.length() == 0 || contractEntity == null || bigDecimal2 == null) {
            this.f24043Z.setValue(null);
        } else if (C41014a.m89917B(bigDecimal)) {
            C17058m0.m36548c(owner, R$string.bkumex_stop_profit_loss_hint);
        } else {
            this.f24043Z.setValue(Calculator.a.isolated().j(contractEntity.isInverse(), C27039d.m66656p(bigDecimal), C27039d.m66656p(C17071w.m36622d(str)), bigDecimal2, z11 ? "buy" : "sell", C41014a.m89921F(contractEntity.getMaintainMargin(), OtcAd.KYC_NOT_PASS)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m27443r(@NotNull LifecycleOwner owner, @Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable String str, boolean z11, @Nullable BigDecimal bigDecimal2, @NotNull String takerType) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(takerType, "takerType");
        if (contractEntity == null || str == null || str.length() == 0 || bigDecimal2 == null) {
            this.f24042Y.setValue(null);
        } else if (C41014a.m89917B(bigDecimal)) {
            C17058m0.m36548c(owner, R$string.bkumex_stop_profit_loss_hint);
        } else {
            this.f24042Y.setValue(Calculator.a.isolated().m(C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse())), C27039d.m66656p(contractEntity.getMultiplier()), com.kubi.kumex.logic.calculator.a.b(C27039d.m66656p(C17071w.m36622d(str)), new BigDecimal(100), 0, (RoundingMode) null, 6, (Object) null), Intrinsics.areEqual(takerType, "TP") ? C37567b.m84618h(contractEntity) : C37567b.m84612b(contractEntity), C41014a.m89921F(contractEntity.getMaintainMargin(), OtcAd.KYC_NOT_PASS), C27039d.m66656p(bigDecimal), bigDecimal2, z11 ? "buy" : "sell", C41014a.m89921F(contractEntity.getMaxPrice(), "1000000"), C41014a.m89921F(Intrinsics.areEqual(takerType, "TP") ? contractEntity.getTickSize() : contractEntity.getIndexPriceTickSize(), "0.01")));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m27444s(@NotNull LifecycleOwner owner, @Nullable ContractEntity contractEntity, @Nullable BigDecimal bigDecimal, @Nullable String str, boolean z11, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (str == null || str.length() == 0 || contractEntity == null || bigDecimal2 == null) {
            this.f24041X.setValue(null);
        } else if (C41014a.m89917B(bigDecimal)) {
            C17058m0.m36548c(owner, R$string.bkumex_stop_profit_loss_hint);
        } else {
            this.f24041X.setValue(Calculator.a.isolated().l(contractEntity.isInverse(), C27039d.m66656p(contractEntity.getMultiplier()), C27039d.m66656p(bigDecimal), C27039d.m66656p(StringsKt.toBigDecimalOrNull(str)), bigDecimal2, z11 ? "buy" : "sell"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<String> m27445t() {
        return this.f24044a0;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<String> m27446u() {
        return this.f24043Z;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<String> m27447v() {
        return this.f24042Y;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<String> m27448w() {
        return this.f24041X;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final MutableLiveData<Pair<Integer, Boolean>> m27449x() {
        return this.f24045b0;
    }
}
