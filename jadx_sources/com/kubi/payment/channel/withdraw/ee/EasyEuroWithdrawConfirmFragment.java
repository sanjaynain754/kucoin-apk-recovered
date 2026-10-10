package com.kubi.payment.channel.withdraw.ee;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.withdraw.common.confirm.CommonWithdrawConfirmFragment;
import com.kubi.payment.channel.withdraw.common.confirm.WithdrawConfirmExtraParams;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p026ay.C4400a;
import p270ft.C37599b2;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: EasyEuroWithdrawConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmFragment;", "Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithdrawConfirmFragment;", "Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentWithdrawConfirmEeBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentWithdrawConfirmEeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initViews", "", "onPreviewOrderReady", "previewOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "launchResultPage", "orderId", "", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEasyEuroWithdrawConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasyEuroWithdrawConfirmFragment.kt\ncom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,79:1\n147#2,16:80\n*S KotlinDebug\n*F\n+ 1 EasyEuroWithdrawConfirmFragment.kt\ncom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawConfirmFragment\n*L\n29#1:80,16\n*E\n"})
public final class EasyEuroWithdrawConfirmFragment extends CommonWithdrawConfirmFragment<EasyEuroWithdrawConfirmVM> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f38393Z = {Reflection.property1(new PropertyReference1Impl(EasyEuroWithdrawConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentWithdrawConfirmEeBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f38394Y = C45681e.m100799e(this, new Function1<EasyEuroWithdrawConfirmFragment, C37599b2>() { // from class: com.kubi.payment.channel.withdraw.ee.EasyEuroWithdrawConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37599b2 invoke(@NotNull EasyEuroWithdrawConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37599b2.m84782a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37599b2, Unit>() { // from class: com.kubi.payment.channel.withdraw.ee.EasyEuroWithdrawConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37599b2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37599b2 c37599b2) {
            invoke(c37599b2);
            return Unit.INSTANCE;
        }
    });

    @Override // com.kubi.payment.channel.withdraw.common.confirm.CommonWithdrawConfirmFragment
    /* JADX INFO: renamed from: E3 */
    public void mo46029E3(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        C4400a c4400aM4038a = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/withdraw/cjAndee/result", false, 2, null)).m4038a("orderId", orderId);
        WithdrawConfirmExtraParams f38385w = getF38385W();
        c4400aM4038a.m4038a("fiatCurrency", C27041f.m66668h(f38385w != null ? f38385w.getFiatCurrency() : null)).m4048k();
    }

    @Override // com.kubi.payment.channel.withdraw.common.confirm.CommonWithdrawConfirmFragment
    /* JADX INFO: renamed from: H3 */
    public void mo46030H3(@NotNull PreviewWithdrawOrder.Response previewOrder) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        C37599b2 c37599b2M46038L3 = m46038L3();
        if (c37599b2M46038L3 == null) {
            return;
        }
        c37599b2M46038L3.f83641b.setText(previewOrder.getAccountName());
        String strM66668h = C27041f.m66668h(previewOrder.getDescription());
        c37599b2M46038L3.f83642c.setText(strM66668h);
        if (strM66668h.length() == 0) {
            BaseTextView tvAccountSubName = c37599b2M46038L3.f83642c;
            Intrinsics.checkNotNullExpressionValue(tvAccountSubName, "tvAccountSubName");
            C27046k.m66700o(tvAccountSubName);
        } else {
            BaseTextView tvAccountSubName2 = c37599b2M46038L3.f83642c;
            Intrinsics.checkNotNullExpressionValue(tvAccountSubName2, "tvAccountSubName");
            C27046k.m66685H(tvAccountSubName2);
        }
        c37599b2M46038L3.f83643d.setText(getStringRes(R$string.payment_price, previewOrder.getAmount(), previewOrder.getFiatCurrency()));
        c37599b2M46038L3.f83645f.setText(C27041f.m66669i(previewOrder.getFeeAmount(), "--"));
        c37599b2M46038L3.f83647h.setText(C27041f.m66669i(previewOrder.getFeeCurrency(), "--"));
        C37599b2 c37599b2M46038L4 = m46038L3();
        if (c37599b2M46038L4 != null && (baseTextView = c37599b2M46038L4.f83649j) != null) {
            baseTextView.setText(C27041f.m66669i(previewOrder.getDeductedAmount(), "--"));
        }
        c37599b2M46038L3.f83651l.setText(C27041f.m66669i(previewOrder.getDeductedCurrency(), "--"));
    }

    /* JADX INFO: renamed from: L3 */
    public final C37599b2 m46038L3() {
        return (C37599b2) this.f38394Y.getValue(this, f38393Z[0]);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_withdraw_confirm_ee;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<EasyEuroWithdrawConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(EasyEuroWithdrawConfirmVM.class);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m46036M3(EasyEuroWithdrawConfirmFragment easyEuroWithdrawConfirmFragment) {
        easyEuroWithdrawConfirmFragment.m46031I3();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public static final Unit m46037N3(EasyEuroWithdrawConfirmFragment easyEuroWithdrawConfirmFragment) throws JSONException {
        String paymentMethodName;
        String paymentMethodCode;
        EasyEuroWithdrawConfirmVM easyEuroWithdrawConfirmVM = (EasyEuroWithdrawConfirmVM) easyEuroWithdrawConfirmFragment.m45647o3();
        Context contextM45646n3 = easyEuroWithdrawConfirmFragment.m45646n3();
        LifecycleOwner viewLifecycleOwner = easyEuroWithdrawConfirmFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        WithdrawConfirmExtraParams f38385w = easyEuroWithdrawConfirmFragment.getF38385W();
        String channelId = null;
        if (f38385w != null) {
            paymentMethodName = f38385w.getPaymentMethodName();
        } else {
            paymentMethodName = null;
        }
        easyEuroWithdrawConfirmVM.m46015D(contextM45646n3, viewLifecycleOwner, paymentMethodName);
        WithdrawConfirmExtraParams f38385w2 = easyEuroWithdrawConfirmFragment.getF38385W();
        if (f38385w2 != null) {
            paymentMethodCode = f38385w2.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(paymentMethodCode));
        WithdrawConfirmExtraParams f38385w3 = easyEuroWithdrawConfirmFragment.getF38385W();
        if (f38385w3 != null) {
            channelId = f38385w3.getChannelId();
        }
        C43852m.m96590b("B7WithdrawConfirm", "button", "1", pairM90091to, TuplesKt.m90091to("channelId", C27041f.m66668h(channelId)));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C37599b2 c37599b2M46038L3 = m46038L3();
        if (c37599b2M46038L3 != null && (baseTextView2 = c37599b2M46038L3.f83650k) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.channel.withdraw.ee.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EasyEuroWithdrawConfirmFragment.m46036M3(this.f38398b);
                }
            }, 1, null);
        }
        C37599b2 c37599b2M46038L4 = m46038L3();
        if (c37599b2M46038L4 != null && (baseTextView = c37599b2M46038L4.f83644e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.channel.withdraw.ee.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EasyEuroWithdrawConfirmFragment.m46037N3(this.f38399b);
                }
            }, 1, null);
        }
    }
}
