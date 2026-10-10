package com.kubi.payment.fast.common.confirm;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: CommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b'\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u0010J\u0012\u0010'\u001a\u00020%2\b\b\u0002\u0010\u0014\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0014R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V", "_previewOrderResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "previewOrderResponse", "Landroidx/lifecycle/LiveData;", "getPreviewOrderResponse", "()Landroidx/lifecycle/LiveData;", "_isRefreshing", "", "isRefreshing", "_countDownTime", "", "countDownTime", "getCountDownTime", "_orderError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "get_orderError", "()Landroidx/lifecycle/MutableLiveData;", "orderError", "getOrderError", "countDownTimer", "Landroid/os/CountDownTimer;", "value", "isProtectedPriceMode", "()Z", "needForceRefreshPrice", "getNeedForceRefreshPrice", "previewOrder", "", "isFirstLoading", "startCountDown", "", "stopCountDown", "onCleared", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CommonConfirmVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f38538i0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38539Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public final ConfirmExtraParams f38540a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<PreviewOrder.Response> f38541b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f38542c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<String> f38543d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Exception> f38544e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public CountDownTimer f38545f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f38546g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f38547h0;

    /* JADX INFO: compiled from: CommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM$Companion;", "", "<init>", "()V", "COUNT_DOWN_FINISHED", "", "DEFAULT_COUNT_DOWN_TIME", "", "PROTECT_PRICE_MODE", "SECOND", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.CommonConfirmVM$a */
    /* JADX INFO: compiled from: CommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fast/common/confirm/CommonConfirmVM$startCountDown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC20475a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonConfirmVM f38548a;

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f38548a.f38543d0.postValue(String.valueOf(MathKt.roundToInt(millisUntilFinished / 1000.0d)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC20475a(long j11, CommonConfirmVM commonConfirmVM) {
            super(j11, 1000L);
            this.f38548a = commonConfirmVM;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CommonConfirmVM commonConfirmVM = this.f38548a;
            commonConfirmVM.f38547h0 = commonConfirmVM.getF38546g0();
            this.f38548a.f38543d0.postValue("0");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonConfirmVM(@NotNull IFastRepository repository, @Nullable ConfirmExtraParams confirmExtraParams) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38539Z = repository;
        this.f38540a0 = confirmExtraParams;
        this.f38541b0 = new MutableLiveData<>();
        this.f38542c0 = new MutableLiveData<>();
        this.f38543d0 = new MutableLiveData<>();
        this.f38544e0 = new MutableLiveData<>();
        this.f38547h0 = true;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<String> m46324D() {
        return this.f38543d0;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getF38547h0() {
        return this.f38547h0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<Exception> m46326F() {
        return this.f38544e0;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<PreviewOrder.Response> m46327G() {
        return this.f38541b0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final MutableLiveData<Exception> m46328H() {
        return this.f38544e0;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getF38546g0() {
        return this.f38546g0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final LiveData<Boolean> m46330J() {
        return this.f38542c0;
    }

    /* JADX INFO: renamed from: M */
    public final void m46333M() {
        CountDownTimer countDownTimer = this.f38545f0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m46331K(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CommonConfirmVM$previewOrder$1(z11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m46332L(long j11) {
        m46333M();
        CountDownTimerC20475a countDownTimerC20475a = new CountDownTimerC20475a(j11, this);
        this.f38545f0 = countDownTimerC20475a;
        countDownTimerC20475a.start();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m46333M();
    }
}
