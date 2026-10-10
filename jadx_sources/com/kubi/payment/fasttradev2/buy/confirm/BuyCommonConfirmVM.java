package com.kubi.payment.fasttradev2.buy.confirm;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.FiatCouponDiscountInfo;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: BuyCommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b&\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u00020\u0010J\u0012\u00103\u001a\u0002002\b\b\u0002\u0010\u0014\u001a\u000204H\u0002J\b\u00105\u001a\u000200H\u0002J\b\u00106\u001a\u000200H\u0014J\u0006\u00107\u001a\u000200J\u0018\u00108\u001a\u0002002\b\u00109\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u0010J\u0010\u0010:\u001a\u0002002\b\u00109\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f8F¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\f8F¢\u0006\u0006\u001a\u0004\b+\u0010\u000eR\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u000e¨\u0006<"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "_previewOrderResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "previewOrderResponse", "Landroidx/lifecycle/LiveData;", "getPreviewOrderResponse", "()Landroidx/lifecycle/LiveData;", "_isRefreshing", "", "isRefreshing", "_countDownTime", "", "countDownTime", "getCountDownTime", "countDownTimer", "Landroid/os/CountDownTimer;", "value", "isProtectedPriceMode", "()Z", "needForceRefreshPrice", "getNeedForceRefreshPrice", "_placeOrderError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "get_placeOrderError", "()Landroidx/lifecycle/MutableLiveData;", "placeOrderError", "getPlaceOrderError", "_couponInfoList", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "couponInfoList", "getCouponInfoList", "_couponDiscountInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponDiscountInfo$Response;", "couponDiscountInfo", "getCouponDiscountInfo", "_selectedRewardId", "selectedRewardId", "getSelectedRewardId", "previewOrder", "", "isFirstLoading", "needLoading", "startCountDown", "", "stopCountDown", "onCleared", "loadCouponListInfo", "loadCouponDiscountInfo", "rewardId", "selectedCouponInfo", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyCommonConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyCommonConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
public abstract class BuyCommonConfirmVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final Companion f39063l0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f39064Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public final BuyCommonConfirmExtraParams f39065a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<BuyPreviewOrder.Response> f39066b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Boolean> f39067c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<String> f39068d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public CountDownTimer f39069e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f39070f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f39071g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Exception> f39072h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<FiatCouponListInfo.Response> f39073i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<FiatCouponDiscountInfo.Response> f39074j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final MutableLiveData<String> f39075k0;

    /* JADX INFO: compiled from: BuyCommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$Companion;", "", "<init>", "()V", "BUY_COUNT_DOWN_FINISHED", "", "DEFAULT_COUNT_DOWN_TIME", "", "SECOND", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM$a */
    /* JADX INFO: compiled from: BuyCommonConfirmVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM$startCountDown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC20719a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BuyCommonConfirmVM f39076a;

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f39076a.f39068d0.postValue(String.valueOf(MathKt.roundToInt(millisUntilFinished / 1000.0d)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC20719a(long j11, BuyCommonConfirmVM buyCommonConfirmVM) {
            super(j11, 1000L);
            this.f39076a = buyCommonConfirmVM;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            BuyCommonConfirmVM buyCommonConfirmVM = this.f39076a;
            buyCommonConfirmVM.f39071g0 = buyCommonConfirmVM.getF39070f0();
            this.f39076a.f39068d0.postValue("0");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyCommonConfirmVM(@NotNull IFastRepository repository, @Nullable BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39064Z = repository;
        this.f39065a0 = buyCommonConfirmExtraParams;
        this.f39066b0 = new MutableLiveData<>();
        this.f39067c0 = new MutableLiveData<>();
        this.f39068d0 = new MutableLiveData<>();
        this.f39071g0 = true;
        this.f39072h0 = new MutableLiveData<>();
        this.f39073i0 = new MutableLiveData<>();
        this.f39074j0 = new MutableLiveData<>();
        this.f39075k0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m47519U(BuyCommonConfirmVM buyCommonConfirmVM, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: previewOrder");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        buyCommonConfirmVM.m47541T(z11, z12);
    }

    /* JADX INFO: renamed from: X */
    private final void m47521X() {
        CountDownTimer countDownTimer = this.f39069e0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<String> m47529H() {
        return this.f39068d0;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final LiveData<FiatCouponDiscountInfo.Response> m47530I() {
        MutableLiveData<FiatCouponDiscountInfo.Response> mutableLiveData = this.f39074j0;
        mutableLiveData.setValue(null);
        return mutableLiveData;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final LiveData<FiatCouponListInfo.Response> m47531J() {
        return this.f39073i0;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getF39071g0() {
        return this.f39071g0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LiveData<Exception> m47533L() {
        return this.f39072h0;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final LiveData<BuyPreviewOrder.Response> m47534M() {
        return this.f39066b0;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final LiveData<String> m47535N() {
        return this.f39075k0;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final MutableLiveData<Exception> m47536O() {
        return this.f39072h0;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getF39070f0() {
        return this.f39070f0;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final LiveData<Boolean> m47538Q() {
        return this.f39067c0;
    }

    /* JADX INFO: renamed from: V */
    public final void m47542V(@Nullable String str) {
        if (!this.f39075k0.isInitialized()) {
            this.f39075k0.setValue(str);
        } else {
            if (Intrinsics.areEqual(this.f39075k0.getValue(), str)) {
                return;
            }
            this.f39075k0.setValue(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m47520W(long j11) {
        m47521X();
        CountDownTimerC20719a countDownTimerC20719a = new CountDownTimerC20719a(j11, this);
        this.f39069e0 = countDownTimerC20719a;
        countDownTimerC20719a.start();
    }

    /* JADX INFO: renamed from: R */
    public final void m47539R(@Nullable String str, boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyCommonConfirmVM$loadCouponDiscountInfo$1(z11, this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m47540S() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyCommonConfirmVM$loadCouponListInfo$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m47541T(boolean z11, boolean z12) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyCommonConfirmVM$previewOrder$1(z11, this, z12, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m47521X();
    }
}
