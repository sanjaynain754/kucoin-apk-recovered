package com.kubi.payment.fasttradev2.buy.confirm.blik;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.buy.popularpay.zen.ZenBlikCodeInputDialog;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37613e1;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: BuyBlikConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "placeOrder", "", "showFraudDialog", "observeData", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyBlikConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBlikConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,124:1\n147#2,16:125\n*S KotlinDebug\n*F\n+ 1 BuyBlikConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmFragment\n*L\n33#1:125,16\n*E\n"})
public final class BuyBlikConfirmFragment extends BuyCommonConfirmFragment<BuyBlikConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39113Y = C45681e.m100799e(this, new Function1<BuyBlikConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.blik.BuyBlikConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyBlikConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.blik.BuyBlikConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37613e1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37613e1 c37613e1) {
            invoke(c37613e1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f39112a0 = {Reflection.property1(new PropertyReference1Impl(BuyBlikConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f39111Z = new Companion(null);

    /* JADX INFO: compiled from: BuyBlikConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/blik/BuyBlikConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            companion.launch(context, buyCommonConfirmExtraParams, str);
        }

        public final void launch(@NotNull Context context, @NotNull BuyCommonConfirmExtraParams extraParams, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, BuyBlikConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.blik.BuyBlikConfirmFragment$a */
    /* JADX INFO: compiled from: BuyBlikConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20742a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39114b;

        public C20742a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39114b = function;
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
            return this.f39114b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39114b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        return null;
    }

    /* JADX INFO: renamed from: D4 */
    private final C37613e1 m47606D4() {
        return (C37613e1) this.f39113Y.getValue(this, f39112a0[0]);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m47608F4() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54151H4(false).m54161R4(1).m54167X4(R$string.payment_fraud_alert_title).m54153J4(R$string.payment_zen_fraud_alert_message).m54162S4(R$string.payment_contiune, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.blik.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyBlikConfirmFragment.m47609G4(this.f39119b, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_cancel, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54159P4.show(childFragmentManager, "payment_fast_buy_blik_fraud");
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m47609G4(final BuyBlikConfirmFragment buyBlikConfirmFragment, DialogInterface dialogInterface, int i11) {
        ZenBlikCodeInputDialog.Companion companion = ZenBlikCodeInputDialog.r0;
        FragmentManager childFragmentManager = buyBlikConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, C43852m.m96602n(C27041f.m66668h(buyBlikConfirmFragment.getF18762X()), "confirmButton", null, 4, null), new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.blik.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBlikConfirmFragment.m47610H4(this.f39120b, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public static final Unit m47610H4(BuyBlikConfirmFragment buyBlikConfirmFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((BuyBlikConfirmVM) buyBlikConfirmFragment.m45647o3()).m47617e0(it);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyBlikConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyBlikConfirmVM.class);
    }

    public BuyBlikConfirmFragment() {
        setPageId("B7BuyZenConfirm");
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m47607E4(BuyBlikConfirmFragment buyBlikConfirmFragment, String str) throws JSONException {
        Intrinsics.checkNotNull(str);
        buyBlikConfirmFragment.m47500X3(str);
        BuyCommonConfirmFragment.m47494z4(buyBlikConfirmFragment, true, null, 2, null);
        buyBlikConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83833e;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        m47608F4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyBlikConfirmVM) m45647o3()).m47615c0().observe(getViewLifecycleOwner(), new C20742a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.blik.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyBlikConfirmFragment.m47607E4(this.f39118b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47606D4 = m47606D4();
        if (c37613e1M47606D4 != null) {
            return c37613e1M47606D4.f83836h;
        }
        return null;
    }
}
