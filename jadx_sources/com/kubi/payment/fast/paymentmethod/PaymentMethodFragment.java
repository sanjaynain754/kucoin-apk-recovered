package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.trade.welfare.C14439y;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodView;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsLayout;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37703w1;
import p569qq.C43852m;
import p673ut.InterfaceC45309a;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: PaymentMethodFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0013J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0014J\u0016\u0010\"\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J0\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010(H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0015\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020(H\u0000¢\u0006\u0002\b1J\b\u00102\u001a\u00020\u0017H\u0002J\u0018\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u0011H\u0016J\b\u00106\u001a\u00020\u0017H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000208H\u0016J\b\u00109\u001a\u00020:H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "Lcom/kubi/payment/fast/paymentmethod/PaymentMethodVM;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentPaymentMethodBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentPaymentMethodBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "extraParams", "Lcom/kubi/payment/fast/paymentmethod/ExtraParams;", "selectedPaymentMethodView", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView;", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "isOneTimePurchaseMode", "", "needDeposit", "needRefresh", "setRefreshFlag", "", "forceRefresh", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "bindEvent", "initViews", "observeData", "onPaymentMethodsReady", "paymentMethodsList", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "refreshHeaderUI", "cryptoAmount", "", "fiatAmount", "fiatCurrency", "cryptoCurrency", "refreshConfirmUI", "previewOrder", "previewBuyOrder", "trackClickPreviewOrder", "afterPageId", "trackClickPreviewOrder$PaymentLib_googleRelease", "launchFiatRechargePage", "onPaymentMethodSelected", "paymentMethodView", "paymentMethod", "onResume", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodFragment.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,290:1\n147#2,16:291\n76#3,7:307\n*S KotlinDebug\n*F\n+ 1 PaymentMethodFragment.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodFragment\n*L\n37#1:291,16\n86#1:307,7\n*E\n"})
public final class PaymentMethodFragment extends BaseFastFragment<PaymentMethodVM> implements InterfaceC45309a {

    /* JADX INFO: renamed from: X */
    @Nullable
    public ExtraParams f38598X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public PaymentMethodView f38599Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public PaymentMethodList.PaymentMethod f38600Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f38602b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f38603c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f38596e0 = {Reflection.property1(new PropertyReference1Impl(PaymentMethodFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f38595d0 = new Companion(null);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38597W = C45681e.m100799e(this, new Function1<PaymentMethodFragment, C37703w1>() { // from class: com.kubi.payment.fast.paymentmethod.PaymentMethodFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37703w1 invoke(@NotNull PaymentMethodFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37703w1.m84994a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37703w1, Unit>() { // from class: com.kubi.payment.fast.paymentmethod.PaymentMethodFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37703w1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37703w1 c37703w1) {
            invoke(c37703w1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public boolean f38601a0 = true;

    /* JADX INFO: compiled from: PaymentMethodFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.paymentmethod.PaymentMethodFragment$a */
    /* JADX INFO: compiled from: PaymentMethodFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20509a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38604b;

        public C20509a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38604b = function;
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
            return this.f38604b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38604b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m46547I3() {
        m46553P3(true);
        C37304a c37304a = C37304a.f82764a;
        ExtraParams extraParams = this.f38598X;
        InterfaceC37758j.a.m85157f(c37304a, extraParams != null ? extraParams.getFiatCurrency() : null, null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: E3 */
    private final void m46542E3() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.payment.event.PaymentEvent:closePaymentMethodPage".length();
        }
        C12572a.m23692a(this, false, new PaymentMethodFragment$bindEvent$$inlined$bindFlowEvent$default$1("com.kubi.payment.event.PaymentEvent:closePaymentMethodPage", null, this));
    }

    /* JADX INFO: renamed from: F3 */
    public final C37703w1 m46546F3() {
        return (C37703w1) this.f38597W.getValue(this, f38596e0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m46549L3() throws JSONException {
        if (this.f38602b0) {
            m46554Q3("B7FiatDepositMethod");
            m46547I3();
        } else {
            if (this.f38601a0) {
                BuyHelperKt.m46536v(this, m45646n3(), this.f38600Z, this.f38598X);
                return;
            }
            Context contextM45646n3 = m45646n3();
            PaymentMethodList.PaymentMethod paymentMethod = this.f38600Z;
            ExtraParams extraParams = this.f38598X;
            RecurringBuyHelperKt.m46588g(this, contextM45646n3, paymentMethod, extraParams != null ? extraParams.getRecurringFrequency() : null);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m46550M3() throws JSONException {
        ExtraParams extraParams = this.f38598X;
        if (Intrinsics.areEqual(extraParams != null ? extraParams.getTradeType() : null, "BUY")) {
            m46549L3();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX INFO: renamed from: N3 */
    public final void m46551N3() {
        KcPrimaryButton kcPrimaryButton;
        C37703w1 c37703w1M46546F3;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        PaymentMethodList.PaymentMethod paymentMethod = this.f38600Z;
        if (paymentMethod == null || this.f38599Y == null) {
            C37703w1 c37703w1M46546F4 = m46546F3();
            if (c37703w1M46546F4 == null || (kcPrimaryButton = c37703w1M46546F4.f84822h) == null) {
                return;
            }
            kcPrimaryButton.setEnabled(true);
            return;
        }
        if (Intrinsics.areEqual(paymentMethod != null ? paymentMethod.getPaymentType() : null, FastQuoteModel.PAY_BALANCE)) {
            PaymentMethodList.PaymentMethod paymentMethod2 = this.f38600Z;
            if (C27025c.m66566d(paymentMethod2 != null ? paymentMethod2.isBalanceSufficient() : null)) {
                this.f38602b0 = false;
                c37703w1M46546F3 = m46546F3();
                if (c37703w1M46546F3 != null) {
                    kcPrimaryButton2.setText(getStringRes(R$string.payment_preview_order, new Object[0]));
                }
            } else {
                this.f38602b0 = true;
                C37703w1 c37703w1M46546F5 = m46546F3();
                if (c37703w1M46546F5 != null && (kcPrimaryButton4 = c37703w1M46546F5.f84822h) != null) {
                    kcPrimaryButton4.setText(getStringRes(R$string.fiat_charge, new Object[0]));
                }
            }
        } else {
            this.f38602b0 = false;
            c37703w1M46546F3 = m46546F3();
            if (c37703w1M46546F3 != null && (kcPrimaryButton2 = c37703w1M46546F3.f84822h) != null) {
                kcPrimaryButton2.setText(getStringRes(R$string.payment_preview_order, new Object[0]));
            }
        }
        C37703w1 c37703w1M46546F6 = m46546F3();
        if (c37703w1M46546F6 == null || (kcPrimaryButton3 = c37703w1M46546F6.f84822h) == null) {
            return;
        }
        kcPrimaryButton3.setEnabled(true);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m46553P3(boolean z11) {
        this.f38603c0 = z11;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m46554Q3(@NotNull String afterPageId) throws JSONException {
        Intrinsics.checkNotNullParameter(afterPageId, "afterPageId");
        JSONObject jSONObject = new JSONObject();
        PaymentMethodList.PaymentMethod paymentMethod = this.f38600Z;
        jSONObject.put("PaymentMethod", String.valueOf(paymentMethod != null ? paymentMethod.getName() : null));
        PaymentMethodList.PaymentMethod paymentMethod2 = this.f38600Z;
        jSONObject.put("paymentType", String.valueOf(paymentMethod2 != null ? paymentMethod2.getPaymentType() : null));
        jSONObject.put("norm_version", "1");
        jSONObject.put("after_click_element_value", this.f38602b0 ? "Deposit" : "Preview order");
        jSONObject.put("after_page_id", afterPageId);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7PaymentMethod", "submitButton", "1", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p673ut.InterfaceC45309a
    /* JADX INFO: renamed from: m */
    public void mo46555m(@NotNull PaymentMethodView paymentMethodView, @NotNull PaymentMethodList.PaymentMethod paymentMethod) throws JSONException {
        Intrinsics.checkNotNullParameter(paymentMethodView, "paymentMethodView");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        PaymentMethodList.PaymentMethod paymentMethod2 = this.f38600Z;
        if (paymentMethod2 != null) {
            paymentMethod2.setSelected(Boolean.FALSE);
        }
        this.f38600Z = paymentMethod;
        ((PaymentMethodVM) m45647o3()).m46581G(this.f38600Z);
        PaymentMethodView paymentMethodView2 = this.f38599Y;
        if (paymentMethodView2 != null) {
            paymentMethodView2.m46599l();
        }
        this.f38599Y = paymentMethodView;
        PaymentMethodList.PaymentMethod paymentMethod3 = this.f38600Z;
        String cryptoAmount = paymentMethod3 != null ? paymentMethod3.getCryptoAmount() : null;
        PaymentMethodList.PaymentMethod paymentMethod4 = this.f38600Z;
        String fiatAmount = paymentMethod4 != null ? paymentMethod4.getFiatAmount() : null;
        PaymentMethodList.PaymentMethod paymentMethod5 = this.f38600Z;
        String fiatCurrency = paymentMethod5 != null ? paymentMethod5.getFiatCurrency() : null;
        PaymentMethodList.PaymentMethod paymentMethod6 = this.f38600Z;
        m46552O3(cryptoAmount, fiatAmount, fiatCurrency, paymentMethod6 != null ? paymentMethod6.getCryptoCurrency() : null);
        m46551N3();
        String strM66668h = C27041f.m66668h(getPageId());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paymentType", paymentMethod.getPaymentType());
        jSONObject.put("PaymentMethod", paymentMethod.getName());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c(strM66668h, "PaymentMethodList", null, jSONObject, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m46542E3();
        ((PaymentMethodVM) m45647o3()).m46579E(this.f38598X, true);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_payment_method;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<PaymentMethodVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(PaymentMethodVM.class);
    }

    public PaymentMethodFragment() {
        setPageId("B7PaymentMethod");
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m46543G3(PaymentMethodFragment paymentMethodFragment) {
        FragmentActivity activity = paymentMethodFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m46544H3(PaymentMethodFragment paymentMethodFragment) throws JSONException {
        paymentMethodFragment.m46550M3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m46545J3(PaymentMethodFragment paymentMethodFragment, List list) {
        Intrinsics.checkNotNull(list);
        paymentMethodFragment.m46548K3(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m46548K3(List<PaymentMethodList.Response> list) {
        PaymentMethodsLayout paymentMethodsLayout;
        PaymentMethodList.PaymentMethod paymentMethod;
        String cryptoAmount;
        String fiatAmount;
        String fiatCurrency;
        List<PaymentMethodList.PaymentMethod> paymentMethods;
        if (!list.isEmpty()) {
            PaymentMethodList.Response response = (PaymentMethodList.Response) CollectionsKt.firstOrNull((List) list);
            String cryptoCurrency = null;
            if (response != null && (paymentMethods = response.getPaymentMethods()) != null) {
                paymentMethod = (PaymentMethodList.PaymentMethod) CollectionsKt.firstOrNull((List) paymentMethods);
            } else {
                paymentMethod = null;
            }
            if (paymentMethod != null) {
                cryptoAmount = paymentMethod.getCryptoAmount();
            } else {
                cryptoAmount = null;
            }
            if (paymentMethod != null) {
                fiatAmount = paymentMethod.getFiatAmount();
            } else {
                fiatAmount = null;
            }
            if (paymentMethod != null) {
                fiatCurrency = paymentMethod.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            if (paymentMethod != null) {
                cryptoCurrency = paymentMethod.getCryptoCurrency();
            }
            m46552O3(cryptoAmount, fiatAmount, fiatCurrency, cryptoCurrency);
        }
        C37703w1 c37703w1M46546F3 = m46546F3();
        if (c37703w1M46546F3 != null && (paymentMethodsLayout = c37703w1M46546F3.f84820f) != null) {
            paymentMethodsLayout.m46607a(list);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m46552O3(String str, String str2, String str3, String str4) {
        C37703w1 c37703w1M46546F3 = m46546F3();
        if (c37703w1M46546F3 == null) {
            return;
        }
        c37703w1M46546F3.f84821g.setText(getStringRes(R$string.payment_quick_input, str, str4));
        if (Build.VERSION.SDK_INT >= 28) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView tvAmount = c37703w1M46546F3.f84821g;
            Intrinsics.checkNotNullExpressionValue(tvAmount, "tvAmount");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Pair pair = new Pair(textTagEnum, new AbsoluteSizeSpan(14, true));
            com.kubi.payment.fast.buy.p2p.a.a();
            Typeface font = ResourcesCompat.getFont(m45646n3(), R$font.medium);
            if (font == null) {
                font = Typeface.DEFAULT;
            }
            highlightTextHelper.m54120f(tvAmount, pair, new Pair(textTagEnum, C14439y.m28811a(font)));
        } else {
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            BaseTextView tvAmount2 = c37703w1M46546F3.f84821g;
            Intrinsics.checkNotNullExpressionValue(tvAmount2, "tvAmount");
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper2.m54120f(tvAmount2, new Pair(textTagEnum2, new AbsoluteSizeSpan(14, true)), new Pair(textTagEnum2, new TypefaceSpan("monospace")));
        }
        BaseTextView baseTextView = c37703w1M46546F3.f84823i;
        int i11 = R$string.payment_you_will_pay;
        if (str3 == null) {
            ExtraParams extraParams = this.f38598X;
            if (extraParams != null) {
                str3 = extraParams.getFiatCurrency();
            } else {
                str3 = null;
            }
        }
        baseTextView.setText(getStringRes(i11, str2, str3));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Boolean boolValueOf;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38598X = (ExtraParams) RouteExKt.m56274t(arguments, "data");
        }
        ExtraParams extraParams = this.f38598X;
        if (extraParams != null) {
            boolValueOf = Boolean.valueOf(extraParams.isOneTimePurchaseMode());
        } else {
            boolValueOf = null;
        }
        this.f38601a0 = C27025c.m66567e(boolValueOf, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f38603c0) {
            m46553P3(false);
            ((PaymentMethodVM) m45647o3()).m46579E(this.f38598X, false);
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        String cryptoCurrencyIconUrl;
        C37703w1 c37703w1M46546F3 = m46546F3();
        if (c37703w1M46546F3 == null) {
            return;
        }
        ImageView ivBack = c37703w1M46546F3.f84817c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodFragment.m46543G3(this.f38639b);
            }
        }, 1, null);
        ImageView imageView = c37703w1M46546F3.f84818d;
        Context contextM45646n3 = m45646n3();
        ExtraParams extraParams = this.f38598X;
        String cryptoCurrency = null;
        if (extraParams != null) {
            cryptoCurrencyIconUrl = extraParams.getCryptoCurrencyIconUrl();
        } else {
            cryptoCurrencyIconUrl = null;
        }
        C24277v.m58540e(contextM45646n3, cryptoCurrencyIconUrl, imageView);
        ExtraParams extraParams2 = this.f38598X;
        if (extraParams2 != null) {
            cryptoCurrency = extraParams2.getCryptoCurrency();
        }
        c37703w1M46546F3.f84824j.setText(getStringRes(R$string.payment_buy_crypto, C27041f.m66669i(cryptoCurrency, "--")));
        c37703w1M46546F3.f84820f.setPaymentMethodListener(this);
        KcPrimaryButton tvConfirm = c37703w1M46546F3.f84822h;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodFragment.m46544H3(this.f38640b);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((PaymentMethodVM) m45647o3()).m46575A().observe(getViewLifecycleOwner(), new C20509a(new Function1() { // from class: com.kubi.payment.fast.paymentmethod.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentMethodFragment.m46545J3(this.f38641b, (List) obj);
            }
        }));
    }
}
