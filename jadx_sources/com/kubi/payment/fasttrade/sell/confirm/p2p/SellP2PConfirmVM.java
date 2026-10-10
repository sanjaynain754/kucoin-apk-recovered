package com.kubi.payment.fasttrade.sell.confirm.p2p;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellP2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u00108F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmVM;", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "_p2pOrderException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p2pOrderException", "getP2pOrderException", "value", "", "needForceRefresh", "getNeedForceRefresh", "()Z", "needCountDown", "placeOrder", "", "url", "validationToken", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellP2PConfirmVM extends SellCommonConfirmVM {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final IFastRepository f38890j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public final SellCommonConfirmExtraParams f38891k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<String> f38892l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final MutableLiveData<Exception> f38893m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f38894n0;

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM
    /* JADX INFO: renamed from: K */
    public boolean mo46961K() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellP2PConfirmVM(@NotNull IFastRepository repository, @Nullable SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        super(repository, sellCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38890j0 = repository;
        this.f38891k0 = sellCommonConfirmExtraParams;
        this.f38892l0 = new MutableLiveData<>();
        this.f38893m0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m47081Z(SellP2PConfirmVM sellP2PConfirmVM, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        sellP2PConfirmVM.m47087Y(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: T, reason: from getter */
    public final SellCommonConfirmExtraParams getF38891k0() {
        return this.f38891k0;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final boolean getF38894n0() {
        return this.f38894n0;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LiveData<String> m47084V() {
        return this.f38892l0;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LiveData<Exception> m47085W() {
        return this.f38893m0;
    }

    @NotNull
    /* JADX INFO: renamed from: X, reason: from getter */
    public final IFastRepository getF38890j0() {
        return this.f38890j0;
    }

    /* JADX INFO: renamed from: Y */
    public final void m47087Y(@NotNull String url, @NotNull String validationToken) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellP2PConfirmVM$placeOrder$1(this, url, validationToken, null), 3, null);
    }
}
