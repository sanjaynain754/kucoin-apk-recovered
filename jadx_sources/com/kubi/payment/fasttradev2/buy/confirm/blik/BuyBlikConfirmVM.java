package com.kubi.payment.fasttradev2.buy.confirm.blik;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyBlikConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmVM;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "placeOrder", "", "blikCode", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyBlikConfirmVM extends BuyCommonConfirmVM {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final IFastRepository f39115m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public final BuyCommonConfirmExtraParams f39116n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final MutableLiveData<String> f39117o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBlikConfirmVM(@NotNull IFastRepository repository, @Nullable BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        super(repository, buyCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39115m0 = repository;
        this.f39116n0 = buyCommonConfirmExtraParams;
        this.f39117o0 = new MutableLiveData<>();
    }

    @Nullable
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final BuyCommonConfirmExtraParams getF39116n0() {
        return this.f39116n0;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final LiveData<String> m47615c0() {
        return this.f39117o0;
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final IFastRepository getF39115m0() {
        return this.f39115m0;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m47617e0(@NotNull String blikCode) {
        Intrinsics.checkNotNullParameter(blikCode, "blikCode");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyBlikConfirmVM$placeOrder$1(this, blikCode, null), 3, null);
    }
}
