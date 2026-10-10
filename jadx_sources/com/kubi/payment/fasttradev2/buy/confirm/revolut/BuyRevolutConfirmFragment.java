package com.kubi.payment.fasttradev2.buy.confirm.revolut;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.fast.buy.popularpay.revolut.g;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.PlaceOrder;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import ha0.InterfaceC38153a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37613e1;
import p569qq.C43846g;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: BuyRevolutConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "orderId", "", "initViews", "", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "initRevolut", "placeOrder", "observeData", "pay", "orderToken", "onResume", "launchResultPage", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModelClass", "Lkotlin/reflect/KClass;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyRevolutConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,167:1\n147#2,16:168\n48#3,2:184\n48#3,2:186\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment\n*L\n33#1:168,16\n67#1:184,2\n87#1:186,2\n*E\n"})
public final class BuyRevolutConfirmFragment extends BuyCommonConfirmFragment<BuyRevolutConfirmVM> {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f39199a0 = {Reflection.property1(new PropertyReference1Impl(BuyRevolutConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39200Y = C45681e.m100799e(this, new Function1<BuyRevolutConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.revolut.BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyRevolutConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.revolut.BuyRevolutConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37613e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37613e1 c37613e1) {
            invoke(c37613e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f39201Z;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.revolut.BuyRevolutConfirmFragment$a */
    /* JADX INFO: compiled from: BuyRevolutConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1", "Lcom/revolut/revolutpay/api/OrderResultCallback;", "onOrderCompleted", "", "onOrderFailed", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBuyRevolutConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,167:1\n44#2,2:168\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1\n*L\n108#1:168,2\n*E\n"})
    public static final class C20788a implements InterfaceC38153a {
        @Override // ha0.InterfaceC38153a
        /* JADX INFO: renamed from: a */
        public void mo47720a(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C44128b.m97261e("BuyRevolutConfirmFragment", "onOrderFailed " + throwable);
            C43846g.m96568c(new OtcException(throwable, "BuyRevolutConfirmFragment", false, null, 8, null), null, 2, null);
        }

        @Override // ha0.InterfaceC38153a
        /* JADX INFO: renamed from: b */
        public void mo47721b() {
            C44128b.m97266j("BuyRevolutConfirmFragment", "onOrderCompleted");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.revolut.BuyRevolutConfirmFragment$b */
    /* JADX INFO: compiled from: BuyRevolutConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20789b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39202b;

        public C20789b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39202b = function;
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
            return this.f39202b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39202b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        this.f39201Z = null;
        ((BuyRevolutConfirmVM) m45647o3()).m47728e0();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    private final C37613e1 m47715B4() {
        return (C37613e1) this.f39200Y.getValue(this, f39199a0[0]);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m47717F4(String str) {
        g gVar = g.a;
        Context contextM45646n3 = m45646n3();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        gVar.b(contextM45646n3, str, lifecycle, new C20788a());
    }

    /* JADX INFO: renamed from: D4 */
    public final void m47719D4() {
        m47500X3(C27041f.m66668h(this.f39201Z));
        this.f39201Z = null;
        preformBackPressed();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: h4 */
    public void mo47504h4(@NotNull BuyPreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo47504h4(previewOrder);
        m47718C4(previewOrder);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyRevolutConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyRevolutConfirmVM.class);
    }

    public BuyRevolutConfirmFragment() {
        setPageId("B7BuyCryRevolut");
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m47716E4(BuyRevolutConfirmFragment buyRevolutConfirmFragment, PlaceOrder.PlaceOrderResponse placeOrderResponse) throws JSONException {
        buyRevolutConfirmFragment.f39201Z = placeOrderResponse.getOrderId();
        String orderToken = placeOrderResponse.getOrderToken();
        if (orderToken != null && orderToken.length() != 0) {
            buyRevolutConfirmFragment.m47717F4(orderToken);
        } else {
            C43846g.m96568c(new OtcMessage("orderToken is null or empty", "BuyRevolutConfirmFragment", false, 4, null), null, 2, null);
        }
        BuyCommonConfirmFragment.m47494z4(buyRevolutConfirmFragment, true, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public final void m47718C4(BuyPreviewOrder.Response response) {
        String merchantPublicKey;
        BuyPreviewOrder.Response.BuyRevolutInfo revolutInfo = response.getRevolutInfo();
        if (revolutInfo != null) {
            merchantPublicKey = revolutInfo.getMerchantPublicKey();
        } else {
            merchantPublicKey = null;
        }
        String strM66668h = C27041f.m66668h(merchantPublicKey);
        if (strM66668h.length() > 0) {
            g.a.a(strM66668h);
        } else {
            C43846g.m96568c(new OtcMessage("the merchantPublicKey is empty", "RevolutConfirmVM", false, 4, null), null, 2, null);
        }
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83833e;
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String str = this.f39201Z;
        if (str != null && str.length() != 0) {
            m47719D4();
        }
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        super.mo45648p3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyRevolutConfirmVM) m45647o3()).m47726c0().observe(getViewLifecycleOwner(), new C20789b(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.revolut.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyRevolutConfirmFragment.m47716E4(this.f39207b, (PlaceOrder.PlaceOrderResponse) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47715B4 = m47715B4();
        if (c37613e1M47715B4 != null) {
            return c37613e1M47715B4.f83836h;
        }
        return null;
    }
}
