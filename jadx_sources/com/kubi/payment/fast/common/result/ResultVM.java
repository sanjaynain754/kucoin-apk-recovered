package com.kubi.payment.fast.common.result;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.fast.data.entities.BalanceOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p477nt.C42874g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResultVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u0010H\u0007J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fast/common/result/ResultVM;", "Lcom/kubi/payment/base/BaseViewModel;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "ioDispatchers", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_orderDetail", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/BalanceOrder$OrderDetail;", "orderDetail", "Landroidx/lifecycle/LiveData;", "getOrderDetail", "()Landroidx/lifecycle/LiveData;", "_showNetworkError", "", "showNetworkError", "getShowNetworkError", "_countdown", "", "countdown", "getCountdown", "_progress", "", "progress", "getProgress", "needCountdown", "countdownFinished", "isLoadingOrderDetail", "setIsLoadingOrderDetail", "", "loadBalanceOrderDetail", "orderId", "showLoading", "startCountdown", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ResultVM extends C42874g {

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f38581g0 = new Companion(null);

    /* JADX INFO: renamed from: X */
    @NotNull
    public final IFastRepository f38582X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AbstractC41697j0 f38583Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<BalanceOrder.OrderDetail> f38584Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Boolean> f38585a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f38586b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Integer> f38587c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f38588d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f38589e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f38590f0;

    /* JADX INFO: compiled from: ResultVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/fast/common/result/ResultVM$Companion;", "", "<init>", "()V", "COUNTDOWN_TIME", "", "MAX_PROGRESS", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ResultVM(@NotNull IFastRepository repository, @NotNull AbstractC41697j0 ioDispatchers) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ioDispatchers, "ioDispatchers");
        this.f38582X = repository;
        this.f38583Y = ioDispatchers;
        this.f38584Z = new MutableLiveData<>();
        this.f38585a0 = new MutableLiveData<>();
        this.f38586b0 = new MutableLiveData<>();
        this.f38587c0 = new MutableLiveData<>();
        this.f38588d0 = true;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m46382J(ResultVM resultVM, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        resultVM.m46396I(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<String> m46392E() {
        return this.f38586b0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<BalanceOrder.OrderDetail> m46393F() {
        return this.f38584Z;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<Integer> m46394G() {
        return this.f38587c0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<Boolean> m46395H() {
        return this.f38585a0;
    }

    /* JADX INFO: renamed from: I */
    public final void m46396I(@NotNull String orderId, boolean z11) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (this.f38590f0) {
            return;
        }
        if (z11) {
            m94034o().setValue(Boolean.TRUE);
        }
        this.f38590f0 = true;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ResultVM$loadBalanceOrderDetail$1(this, orderId, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m46397K() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new ResultVM$startCountdown$1(this, null), 3, null);
    }
}
