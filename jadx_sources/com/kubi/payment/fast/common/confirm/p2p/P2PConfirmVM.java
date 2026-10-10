package com.kubi.payment.fast.common.confirm.p2p;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/p2p/P2PConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "p2pExtraParams", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;)V", "_orderId", "Landroidx/lifecycle/MutableLiveData;", "", "get_orderId", "()Landroidx/lifecycle/MutableLiveData;", "orderId", "Landroidx/lifecycle/LiveData;", "getOrderId", "()Landroidx/lifecycle/LiveData;", "_isShowLimitTip", "", "isShowLimitTip", "_p2pOrderException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "get_p2pOrderException", "p2pOrderException", "getP2pOrderException", "limitP2PTip", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class P2PConfirmVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public final ConfirmExtraParams f38563Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public final P2PExtraParams f38564a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f38565b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f38566c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Exception> f38567d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PConfirmVM(@NotNull IFastRepository repository, @Nullable ConfirmExtraParams confirmExtraParams, @Nullable P2PExtraParams p2PExtraParams) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38563Z = confirmExtraParams;
        this.f38564a0 = p2PExtraParams;
        this.f38565b0 = new MutableLiveData<>();
        this.f38566c0 = new MutableLiveData<>();
        this.f38567d0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Boolean> m46363A() {
        return this.f38566c0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<String> m46365w() {
        return this.f38565b0;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<Exception> m46366x() {
        return this.f38567d0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final MutableLiveData<String> m46367y() {
        return this.f38565b0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<Exception> m46368z() {
        return this.f38567d0;
    }

    /* JADX INFO: renamed from: B */
    public final void m46364B() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PConfirmVM$limitP2PTip$1(this, null), 3, null);
    }
}
