package com.kubi.payment.fasttrade.sell.confirm;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: SellCommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u0010J\b\u0010'\u001a\u00020\u0010H\u0014J\u0012\u0010(\u001a\u00020%2\b\b\u0002\u0010\u0014\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0014R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V", "_previewOrderResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "previewOrderResponse", "Landroidx/lifecycle/LiveData;", "getPreviewOrderResponse", "()Landroidx/lifecycle/LiveData;", "_isRefreshing", "", "isRefreshing", "_countDownTime", "", "countDownTime", "getCountDownTime", "countDownTimer", "Landroid/os/CountDownTimer;", "value", "isProtectedPriceMode", "()Z", "needForceRefreshPrice", "getNeedForceRefreshPrice", "_placeOrderError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "get_placeOrderError", "()Landroidx/lifecycle/MutableLiveData;", "placeOrderError", "getPlaceOrderError", "previewOrder", "", "isFirstLoading", "needCountDown", "startCountDown", "", "stopCountDown", "onCleared", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SellCommonConfirmVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f38829i0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38830Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public final SellCommonConfirmExtraParams f38831a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<SellPreviewOrder.Response> f38832b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f38833c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<String> f38834d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public CountDownTimer f38835e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f38836f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f38837g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Exception> f38838h0;

    /* JADX INFO: compiled from: SellCommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM$Companion;", "", "<init>", "()V", "COUNT_DOWN_FINISHED", "", "DEFAULT_COUNT_DOWN_TIME", "", "SECOND", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM$a */
    /* JADX INFO: compiled from: SellCommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM$startCountDown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC20600a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SellCommonConfirmVM f38839a;

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f38839a.f38834d0.postValue(String.valueOf(MathKt.roundToInt(millisUntilFinished / 1000.0d)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC20600a(long j11, SellCommonConfirmVM sellCommonConfirmVM) {
            super(j11, 1000L);
            this.f38839a = sellCommonConfirmVM;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SellCommonConfirmVM sellCommonConfirmVM = this.f38839a;
            sellCommonConfirmVM.f38837g0 = sellCommonConfirmVM.getF38836f0();
            this.f38839a.f38834d0.postValue("0");
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean mo46961K() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellCommonConfirmVM(@NotNull IFastRepository repository, @Nullable SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38830Z = repository;
        this.f38831a0 = sellCommonConfirmExtraParams;
        this.f38832b0 = new MutableLiveData<>();
        this.f38833c0 = new MutableLiveData<>();
        this.f38834d0 = new MutableLiveData<>();
        this.f38837g0 = true;
        this.f38838h0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m46944M(SellCommonConfirmVM sellCommonConfirmVM, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: previewOrder");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        sellCommonConfirmVM.m46962L(z11);
    }

    /* JADX INFO: renamed from: O */
    private final void m46946O() {
        CountDownTimer countDownTimer = this.f38835e0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<String> m46954D() {
        return this.f38834d0;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getF38837g0() {
        return this.f38837g0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<Exception> m46956F() {
        return this.f38838h0;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<SellPreviewOrder.Response> m46957G() {
        return this.f38832b0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final MutableLiveData<Exception> m46958H() {
        return this.f38838h0;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getF38836f0() {
        return this.f38836f0;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final LiveData<Boolean> m46960J() {
        return this.f38833c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m46945N(long j11) {
        m46946O();
        CountDownTimerC20600a countDownTimerC20600a = new CountDownTimerC20600a(j11, this);
        this.f38835e0 = countDownTimerC20600a;
        countDownTimerC20600a.start();
    }

    /* JADX INFO: renamed from: L */
    public final void m46962L(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new SellCommonConfirmVM$previewOrder$1(z11, this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m46946O();
    }
}
