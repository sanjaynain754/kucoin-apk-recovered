package com.kubi.payment.p2p.order.express;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: P2PExpressVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u0017\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u001dH\u0002J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\b\u0010&\u001a\u00020\u001dH\u0014R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/p2p/order/express/P2PExpressVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/p2p/data/source/IP2PRepository;", "repository", "<init>", "(Lcom/kubi/payment/p2p/data/source/IP2PRepository;)V", "_countDownTime", "Landroidx/lifecycle/MutableLiveData;", "", "countDownTime", "Landroidx/lifecycle/LiveData;", "getCountDownTime", "()Landroidx/lifecycle/LiveData;", "_isRefreshing", "", "isRefreshing", "_showQuoteError", "showQuoteError", "getShowQuoteError", "_needDismiss", "needDismiss", "getNeedDismiss", "_hedge", "Lcom/kubi/payment/p2p/data/entities/P2PExpress$HedgeResponse;", "hedge", "getHedge", "countDownTimer", "Landroid/os/CountDownTimer;", "loadQuote", "", "orderId", "startCountDown", "expireTime", "", "(Ljava/lang/Long;)V", "stopCountDown", "continueHedge", "cancelHedge", "onCleared", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpressVM extends BasePaymentVM<IP2PRepository> {

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f39818g0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IP2PRepository f39819Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f39820a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<Boolean> f39821b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f39822c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f39823d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<P2PExpress.HedgeResponse> f39824e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public CountDownTimer f39825f0;

    /* JADX INFO: compiled from: P2PExpressVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/express/P2PExpressVM$Companion;", "", "<init>", "()V", "COUNT_DOWN_FINISHED", "", "DEFAULT_COUNT_DOWN_TIME", "", "SECOND", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.express.P2PExpressVM$a */
    /* JADX INFO: compiled from: P2PExpressVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/p2p/order/express/P2PExpressVM$startCountDown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC21122a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ P2PExpressVM f39826a;

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f39826a.f39820a0.postValue(String.valueOf(MathKt.roundToInt(millisUntilFinished / 1000.0d)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC21122a(long j11, P2PExpressVM p2PExpressVM) {
            super(j11, 1000L);
            this.f39826a = p2PExpressVM;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f39826a.f39820a0.postValue("0");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PExpressVM(@NotNull IP2PRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39819Z = repository;
        this.f39820a0 = new MutableLiveData<>();
        this.f39821b0 = new MutableLiveData<>();
        this.f39822c0 = new MutableLiveData<>();
        this.f39823d0 = new MutableLiveData<>();
        this.f39824e0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: K */
    private final void m48896K() {
        CountDownTimer countDownTimer = this.f39825f0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m48904B(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PExpressVM$cancelHedge$1(this, orderId, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m48905C(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PExpressVM$continueHedge$1(this, orderId, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final LiveData<String> m48906D() {
        return this.f39820a0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<P2PExpress.HedgeResponse> m48907E() {
        return this.f39824e0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<Boolean> m48908F() {
        return this.f39823d0;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final LiveData<Boolean> m48909G() {
        return this.f39822c0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<Boolean> m48910H() {
        return this.f39821b0;
    }

    /* JADX INFO: renamed from: I */
    public final void m48911I(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new P2PExpressVM$loadQuote$1(this, orderId, null), 3, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m48912J(Long l11) {
        m48896K();
        CountDownTimerC21122a countDownTimerC21122a = new CountDownTimerC21122a(C27039d.m66653m(l11, 15L) * 1000, this);
        this.f39825f0 = countDownTimerC21122a;
        countDownTimerC21122a.start();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m48896K();
    }
}
