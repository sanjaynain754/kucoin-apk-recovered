package com.kubi.payment.fasttradev2.buy.confirm.p2p;

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

/* JADX INFO: compiled from: BuyP2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmVM;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "_isShowLimitTip", "Landroidx/lifecycle/MutableLiveData;", "", "isShowLimitTip", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_orderId", "", "orderId", "getOrderId", "_p2pOrderException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p2pOrderException", "getP2pOrderException", "loadLimitTip", "", "placeOrder", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BuyP2PConfirmVM extends BuyCommonConfirmVM {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final IFastRepository f39174m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public final BuyCommonConfirmExtraParams f39175n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final MutableLiveData<Boolean> f39176o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<String> f39177p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final MutableLiveData<Exception> f39178q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmVM(@NotNull IFastRepository repository, @Nullable BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        super(repository, buyCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39174m0 = repository;
        this.f39175n0 = buyCommonConfirmExtraParams;
        this.f39176o0 = new MutableLiveData<>();
        this.f39177p0 = new MutableLiveData<>();
        this.f39178q0 = new MutableLiveData<>();
    }

    @Nullable
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final BuyCommonConfirmExtraParams getF39175n0() {
        return this.f39175n0;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LiveData<String> m47703d0() {
        return this.f39177p0;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final LiveData<Exception> m47704e0() {
        return this.f39178q0;
    }

    @NotNull
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final IFastRepository getF39174m0() {
        return this.f39174m0;
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LiveData<Boolean> m47706g0() {
        return this.f39176o0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m47707h0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyP2PConfirmVM$loadLimitTip$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m47708i0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyP2PConfirmVM$placeOrder$1(this, null), 3, null);
    }
}
