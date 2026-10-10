package com.kubi.payment.fasttrade.sell.confirm.balance;

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

/* JADX INFO: compiled from: SellBalanceConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/balance/SellBalanceConfirmVM;", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "placeOrder", "", "url", "validationToken", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SellBalanceConfirmVM extends SellCommonConfirmVM {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final IFastRepository f38850j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public final SellCommonConfirmExtraParams f38851k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final MutableLiveData<String> f38852l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellBalanceConfirmVM(@NotNull IFastRepository repository, @Nullable SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        super(repository, sellCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38850j0 = repository;
        this.f38851k0 = sellCommonConfirmExtraParams;
        this.f38852l0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final LiveData<String> m47026S() {
        return this.f38852l0;
    }

    @NotNull
    /* JADX INFO: renamed from: T, reason: from getter */
    public final IFastRepository getF38850j0() {
        return this.f38850j0;
    }

    /* JADX INFO: renamed from: U */
    public final void m47028U(@NotNull String url, @NotNull String validationToken) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellBalanceConfirmVM$placeOrder$1(this, validationToken, url, null), 3, null);
    }
}
