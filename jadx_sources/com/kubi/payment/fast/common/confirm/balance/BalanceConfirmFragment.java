package com.kubi.payment.fast.common.confirm.balance;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastFeeModel;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment;
import com.kubi.payment.fast.common.confirm.CommonConfirmVM;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.common.helper.FeeHelper;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37636j;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BalanceConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0004J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment;", "VM", "Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;", "Lcom/kubi/payment/fast/common/confirm/AbsFastConfirmFiatFragment;", "<init>", "()V", "vb", "Lcom/kubi/otc/databinding/BotcFragmentFastBalanceConfirmBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcFragmentFastBalanceConfirmBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initViews", "", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "exposePage", "trackConfirmClick", "isRefresh", "", "getConfirmView", "Landroid/widget/FrameLayout;", "getConfirmProgressView", "Landroid/widget/ProgressBar;", "getConfirmTextView", "Lcom/kubi/resources/widget/BaseTextView;", "getCountDownTextView", "isConfirmViewEnable", TtmlNode.TAG_LAYOUT, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBalanceConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BalanceConfirmFragment.kt\ncom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,117:1\n147#2,16:118\n*S KotlinDebug\n*F\n+ 1 BalanceConfirmFragment.kt\ncom/kubi/payment/fast/common/confirm/balance/BalanceConfirmFragment\n*L\n29#1:118,16\n*E\n"})
public abstract class BalanceConfirmFragment<VM extends CommonConfirmVM> extends AbsFastConfirmFiatFragment<VM> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f38551Z = {Reflection.property1(new PropertyReference1Impl(BalanceConfirmFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcFragmentFastBalanceConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f38552Y = C45681e.m100799e(this, new Function1<BalanceConfirmFragment<VM>, C37636j>() { // from class: com.kubi.payment.fast.common.confirm.balance.BalanceConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37636j invoke(@NotNull BalanceConfirmFragment<VM> fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37636j.m84854a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37636j, Unit>() { // from class: com.kubi.payment.fast.common.confirm.balance.BalanceConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37636j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37636j c37636j) {
            invoke(c37636j);
            return Unit.INSTANCE;
        }
    });

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    /* JADX INFO: renamed from: e4 */
    public boolean mo46290e4() {
        return true;
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m46339q4(BalanceConfirmFragment balanceConfirmFragment, boolean z11, int i11, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackConfirmClick");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        balanceConfirmFragment.m46345p4(z11);
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment, com.kubi.payment.fast.common.confirm.CommonConfirmFragment
    /* JADX INFO: renamed from: O3 */
    public void mo46285O3(@NotNull PreviewOrder.Response previewOrder) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String fee;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        ImageView imageView;
        BaseTextView baseTextView6;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo46285O3(previewOrder);
        if (m45647o3().getF38546g0()) {
            C37636j c37636jM46344n4 = m46344n4();
            if (c37636jM46344n4 != null && (baseTextView6 = c37636jM46344n4.f84053g) != null) {
                C27046k.m66700o(baseTextView6);
            }
        } else {
            C37636j c37636jM46344n5 = m46344n4();
            if (c37636jM46344n5 != null && (baseTextView = c37636jM46344n5.f84053g) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        C37636j c37636jM46344n6 = m46344n4();
        if (c37636jM46344n6 != null && (imageView = c37636jM46344n6.f84050d) != null) {
            C20143e.m45237c(imageView, m45646n3(), previewOrder.getIconUrl());
        }
        C37636j c37636jM46344n7 = m46344n4();
        if (c37636jM46344n7 != null && (baseTextView5 = c37636jM46344n7.f84060n) != null) {
            baseTextView5.setText(previewOrder.getCryptoCurrency() + ' ' + getString(R$string.single_price));
        }
        C37636j c37636jM46344n8 = m46344n4();
        if (c37636jM46344n8 != null && (baseTextView4 = c37636jM46344n8.f84057k) != null) {
            baseTextView4.setText(previewOrder.getPaymentMethodName());
        }
        C37636j c37636jM46344n9 = m46344n4();
        String strM89945s = null;
        if (c37636jM46344n9 != null && (baseTextView3 = c37636jM46344n9.f84059m) != null) {
            C27096v0 c27096v0 = new C27096v0();
            String price = previewOrder.getPrice();
            baseTextView3.setText(c27096v0.append(price != null ? C27041f.m66669i(price, "--") : null).append(C33627eb.f69716f).m66905e(previewOrder.getFiatCurrency(), getColorRes(R$color.emphasis40)));
        }
        C37636j c37636jM46344n10 = m46344n4();
        if (c37636jM46344n10 == null || (baseTextView2 = c37636jM46344n10.f84054h) == null) {
            return;
        }
        C27096v0 c27096v1 = new C27096v0();
        FastFeeModel feeResponse = previewOrder.getFeeResponse();
        if (feeResponse != null && (fee = feeResponse.getFee()) != null) {
            strM89945s = C41014a.m89945s(fee, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
        }
        baseTextView2.setText(c27096v1.append(C27041f.m66669i(strM89945s, "0.00")).append(C33627eb.f69716f).m66905e(previewOrder.getFeeCurrency(), getColorRes(R$color.emphasis40)));
    }

    @Nullable
    /* JADX INFO: renamed from: n4 */
    public final C37636j m46344n4() {
        return (C37636j) this.f38552Y.getValue(this, f38551Z[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.botc_fragment_fast_balance_confirm;
    }

    /* JADX INFO: renamed from: i4 */
    private final void m46337i4() throws JSONException {
        String tradeType;
        String str;
        String paymentMethodCode;
        String cryptoCurrency;
        ConfirmExtraParams f38536w = getF38536W();
        String fiatCurrency = null;
        if (f38536w != null) {
            tradeType = f38536w.getTradeType();
        } else {
            tradeType = null;
        }
        if (Intrinsics.areEqual(tradeType, "BUY")) {
            str = "B7BuyCryBalance";
        } else {
            str = "B7SellCryBalance";
        }
        String str2 = str;
        JSONObject jSONObject = new JSONObject();
        ConfirmExtraParams f38536w2 = getF38536W();
        if (f38536w2 != null) {
            paymentMethodCode = f38536w2.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("PaymentMethod", C27041f.m66668h(paymentMethodCode));
        ConfirmExtraParams f38536w3 = getF38536W();
        if (f38536w3 != null) {
            cryptoCurrency = f38536w3.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        jSONObject.put("crypto", C27041f.m66668h(cryptoCurrency));
        ConfirmExtraParams f38536w4 = getF38536W();
        if (f38536w4 != null) {
            fiatCurrency = f38536w4.getFiatCurrency();
        }
        jSONObject.put("fiat", C27041f.m66668h(fiatCurrency));
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g(str2, "button", null, jSONObject, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public static final Unit m46338o4(BalanceConfirmFragment balanceConfirmFragment) {
        PreviewOrder.Response value = ((CommonConfirmVM) balanceConfirmFragment.m45647o3()).m46327G().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        FeeHelper feeHelper = FeeHelper.f38580a;
        FastFeeModel feeResponse = value.getFeeResponse();
        String feeCurrency = value.getFeeCurrency();
        FragmentManager childFragmentManager = balanceConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        feeHelper.m46377b(feeResponse, feeCurrency, childFragmentManager);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    @Nullable
    /* JADX INFO: renamed from: j4, reason: merged with bridge method [inline-methods] */
    public ProgressBar mo46286a4() {
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null) {
            return c37636jM46344n4.f84064r;
        }
        return null;
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    @Nullable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public BaseTextView mo46287b4() {
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null) {
            return c37636jM46344n4.f84051e;
        }
        return null;
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    @Nullable
    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public FrameLayout mo46288c4() {
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null) {
            return c37636jM46344n4.f84063q;
        }
        return null;
    }

    @Override // com.kubi.payment.fast.common.confirm.AbsFastConfirmFiatFragment
    @Nullable
    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public BaseTextView mo46289d4() {
        C37636j c37636jM46344n4 = m46344n4();
        if (c37636jM46344n4 != null) {
            return c37636jM46344n4.f84052f;
        }
        return null;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() throws JSONException {
        BaseTextView baseTextView;
        C37636j c37636jM46344n4 = m46344n4();
        ImageView imageView = null;
        if (c37636jM46344n4 != null) {
            baseTextView = c37636jM46344n4.f84055i;
        } else {
            baseTextView = null;
        }
        C37636j c37636jM46344n5 = m46344n4();
        if (c37636jM46344n5 != null) {
            imageView = c37636jM46344n5.f84049c;
        }
        if (baseTextView != null && imageView != null) {
            C27046k.m66681D(new View[]{baseTextView, imageView}, new Function0() { // from class: com.kubi.payment.fast.common.confirm.balance.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BalanceConfirmFragment.m46338o4(this.f38553b);
                }
            });
        }
        m46337i4();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m46345p4(boolean z11) throws JSONException {
        String tradeType;
        String str;
        String paymentMethodCode;
        String cryptoCurrency;
        String str2;
        ConfirmExtraParams f38536w = getF38536W();
        String fiatCurrency = null;
        if (f38536w != null) {
            tradeType = f38536w.getTradeType();
        } else {
            tradeType = null;
        }
        if (Intrinsics.areEqual(tradeType, "BUY")) {
            str = "B7BuyCryBalance";
        } else {
            str = "B7SellCryBalance";
        }
        String str3 = str;
        JSONObject jSONObject = new JSONObject();
        ConfirmExtraParams f38536w2 = getF38536W();
        if (f38536w2 != null) {
            paymentMethodCode = f38536w2.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("PaymentMethod", C27041f.m66668h(paymentMethodCode));
        ConfirmExtraParams f38536w3 = getF38536W();
        if (f38536w3 != null) {
            cryptoCurrency = f38536w3.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        jSONObject.put("crypto", C27041f.m66668h(cryptoCurrency));
        ConfirmExtraParams f38536w4 = getF38536W();
        if (f38536w4 != null) {
            fiatCurrency = f38536w4.getFiatCurrency();
        }
        jSONObject.put("fiat", C27041f.m66668h(fiatCurrency));
        if (z11) {
            str2 = "refresh";
        } else {
            str2 = "confirm";
        }
        jSONObject.put("type", str2);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c(str3, "button", null, jSONObject, 4, null);
    }
}
