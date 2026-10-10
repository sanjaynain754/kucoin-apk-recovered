package com.kubi.payment.fast.sell.balance;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.google.firebase.messaging.Constants;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.common.confirm.balance.BalanceConfirmFragment;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.payment.fast.sell.result.SellResultFragment;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import ht.C38301b1;
import io.reactivex.functions.Consumer;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37636j;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: BalanceSellConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0014J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment;", "Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;", "Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmVM;", "<init>", "()V", "trackData", "Lcom/kubi/payment/track/FastTrackData;", "getTrackData", "()Lcom/kubi/payment/track/FastTrackData;", "trackData$delegate", "Lkotlin/Lazy;", "initViews", "", "placeOrder", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "observeData", "trackOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/network/retrofit/exception/ApiException;", "trackRiskError", "launchResultPage", "orderId", "", "isSell", "", "viewModelClass", "Lkotlin/reflect/KClass;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BalanceSellConfirmFragment extends BalanceConfirmFragment<BalanceSellConfirmVM> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f38668b0 = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f38669a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fast.sell.balance.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BalanceSellConfirmFragment.m46615D4(this.f38676b);
        }
    });

    /* JADX INFO: compiled from: BalanceSellConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/balance/BalanceSellConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @NotNull ConfirmExtraParams extraParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, BalanceSellConfirmFragment.class, new C27051h().m66724h("title", context.getString(R$string.pay_fast_confirm_sell_title)).m66721e("data", extraParams).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.sell.balance.BalanceSellConfirmFragment$a */
    /* JADX INFO: compiled from: BalanceSellConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20521a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38670b;

        public C20521a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38670b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f38670b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38670b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    /* JADX INFO: renamed from: f4 */
    public boolean mo46291f4() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    private final void m46612A4() {
        C38301b1.m86435H(this, ValidationBizEnum.VERIFY_WITHDRAWAL_PASSWORD, null, new Consumer() { // from class: com.kubi.payment.fast.sell.balance.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BalanceSellConfirmFragment.m46613B4(this.f38677b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.fast.sell.balance.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BalanceSellConfirmFragment.m46614C4(this.f38678b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public static final void m46613B4(BalanceSellConfirmFragment balanceSellConfirmFragment, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            ((BalanceSellConfirmVM) balanceSellConfirmFragment.m45647o3()).m46632T();
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m46614C4(BalanceSellConfirmFragment balanceSellConfirmFragment, Throwable th2) {
        if (th2 instanceof ApiException) {
            C38301b1.m86442O(balanceSellConfirmFragment, (ApiException) th2, null, 4, null);
        }
        IPaymentTrack.f40346a.getTrack().mo49802j("CHECK_PWD_ERROR", false, "-10006:CHECK_PWD_ERROR", balanceSellConfirmFragment.m46621w4());
    }

    /* JADX INFO: renamed from: D4 */
    public static final FastTrackData m46615D4(BalanceSellConfirmFragment balanceSellConfirmFragment) {
        ConfirmExtraParams f38536w = balanceSellConfirmFragment.getF38536W();
        FastTrackData fastTrackData = new FastTrackData("sell", f38536w != null ? f38536w.getPaymentType() : null);
        ConfirmExtraParams f38536w2 = balanceSellConfirmFragment.getF38536W();
        fastTrackData.setFiatCurrency(f38536w2 != null ? f38536w2.getFiatCurrency() : null);
        ConfirmExtraParams f38536w3 = balanceSellConfirmFragment.getF38536W();
        fastTrackData.setCryptoCurrency(f38536w3 != null ? f38536w3.getCryptoCurrency() : null);
        return fastTrackData;
    }

    /* JADX INFO: renamed from: w4 */
    private final FastTrackData m46621w4() {
        return (FastTrackData) this.f38669a0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    private final void m46623y4(String str) {
        SellResultFragment.f38700X.startPayStatusSellFragment(m45646n3(), str);
    }

    @Override // com.kubi.payment.fast.common.confirm.balance.BalanceConfirmFragment, com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment, com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    /* JADX INFO: renamed from: O3 */
    public void mo46285O3(@NotNull PreviewOrder.Response previewOrder) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo46285O3(previewOrder);
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null && (baseTextView2 = c37636jM46344n4.f84056j) != null) {
            baseTextView2.setText(C27041f.m66669i(previewOrder.getCryptoAmount(), "--") + ' ' + previewOrder.getCryptoCurrency());
        }
        C37636j c37636jM46344n5 = m46344n4();
        if (c37636jM46344n5 == null || (baseTextView = c37636jM46344n5.f84061o) == null) {
            return;
        }
        baseTextView.setText(new C27096v0().m66907g(C27041f.m66669i(previewOrder.getDepositFiatAmount(), "--"), C27029c.m66603f(this, 16)).append(C33627eb.f69716f).m66905e(previewOrder.getFiatCurrency(), getColorRes(R$color.emphasis40)));
    }

    @Override // com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    /* JADX INFO: renamed from: X3 */
    public void mo46312X3(@NotNull ApiException error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        IPaymentTrack.f40346a.getTrack().mo49802j("PLACE_ORDER", false, error.code + ':' + error.getMessage(), m46621w4());
        C42296a c42296a = C42296a.f93790a;
        String str = error.code + '-' + error.getMessage();
        ConfirmExtraParams f38536w = getF38536W();
        String strM66668h = C27041f.m66668h(f38536w != null ? f38536w.getCryptoCurrency() : null);
        ConfirmExtraParams f38536w2 = getF38536W();
        C42296a.m92834b(c42296a, false, str, strM66668h, C27041f.m66668h(f38536w2 != null ? f38536w2.getFiatCurrency() : null), "pay_fast_sell", "fast_balance", null, null, null, null, null, 1984, null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BalanceSellConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BalanceSellConfirmVM.class);
    }

    public BalanceSellConfirmFragment() {
        setPageId("B7SellCryBalance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public static final Unit m46622x4(BalanceSellConfirmFragment balanceSellConfirmFragment) throws JSONException {
        if (((BalanceSellConfirmVM) balanceSellConfirmFragment.m45647o3()).getF38547h0()) {
            ((BalanceSellConfirmVM) balanceSellConfirmFragment.m45647o3()).m46331K(false);
            balanceSellConfirmFragment.m46345p4(true);
            return Unit.INSTANCE;
        }
        BalanceConfirmFragment.m46339q4(balanceSellConfirmFragment, false, 1, null);
        balanceSellConfirmFragment.m46612A4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m46624z4(BalanceSellConfirmFragment balanceSellConfirmFragment, String str) {
        Intrinsics.checkNotNull(str);
        balanceSellConfirmFragment.m46623y4(str);
        balanceSellConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    /* JADX INFO: renamed from: Y3 */
    public void mo46313Y3() throws JSONException {
        String fiatCurrency;
        super.mo46313Y3();
        String strM66668h = C27041f.m66668h(getF25617V());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("PaymentMethod", "balance");
        ConfirmExtraParams f38536w = getF38536W();
        String cryptoCurrency = null;
        if (f38536w != null) {
            fiatCurrency = f38536w.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        jSONObject.put("fiat", fiatCurrency);
        ConfirmExtraParams f38536w2 = getF38536W();
        if (f38536w2 != null) {
            cryptoCurrency = f38536w2.getCryptoCurrency();
        }
        jSONObject.put("crypto", cryptoCurrency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g(strM66668h, "dialog", null, jSONObject, 4, null);
    }

    @Override // com.kubi.payment.fast.common.confirm.balance.BalanceConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() throws JSONException {
        FrameLayout frameLayout;
        BaseTextView baseTextView;
        FrameLayout frameLayout2;
        BaseTextView baseTextView2;
        super.mo45648p3();
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null && (baseTextView2 = c37636jM46344n4.f84062p) != null) {
            baseTextView2.setText(getString(R$string.payment_estimated_receive_amount));
        }
        C37636j c37636jM46344n5 = m46344n4();
        if (c37636jM46344n5 != null && (frameLayout2 = c37636jM46344n5.f84063q) != null) {
            frameLayout2.setBackground(ContextCompat.getDrawable(m45646n3(), R$drawable.botc_selector_secondary_bg));
        }
        C37636j c37636jM46344n6 = m46344n4();
        if (c37636jM46344n6 != null && (baseTextView = c37636jM46344n6.f84051e) != null) {
            baseTextView.setText(getStringRes(R$string.fast_pay_confirm_sell, new Object[0]));
        }
        C37636j c37636jM46344n7 = m46344n4();
        if (c37636jM46344n7 != null && (frameLayout = c37636jM46344n7.f84063q) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.balance.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BalanceSellConfirmFragment.m46622x4(this.f38675b);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment, com.kubi.payment.fast.common.confirm.CommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BalanceSellConfirmVM) m45647o3()).m46631S().observe(getViewLifecycleOwner(), new C20521a(new Function1() { // from class: com.kubi.payment.fast.sell.balance.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BalanceSellConfirmFragment.m46624z4(this.f38674b, (String) obj);
            }
        }));
    }
}
