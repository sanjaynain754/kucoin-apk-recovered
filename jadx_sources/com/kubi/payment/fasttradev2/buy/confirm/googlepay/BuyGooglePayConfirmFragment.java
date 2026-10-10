package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.kubi.event.api.C12572a;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37613e1;
import p569qq.C43846g;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: BuyGooglePayConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "paymentDataLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initPaymentDataLauncher", "observeData", "placeOrder", "launchGooglePaySDK", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyGooglePayConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyGooglePayConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,193:1\n147#2,16:194\n44#3,2:210\n44#3,2:212\n*S KotlinDebug\n*F\n+ 1 BuyGooglePayConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmFragment\n*L\n47#1:194,16\n88#1:210,2\n140#1:212,2\n*E\n"})
public final class BuyGooglePayConfirmFragment extends BuyCommonConfirmFragment<BuyGooglePayConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39128Y = C45681e.m100799e(this, new Function1<BuyGooglePayConfirmFragment, C37613e1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37613e1 invoke(@NotNull BuyGooglePayConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37613e1.m84807a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37613e1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmFragment$special$$inlined$viewBindingFragment$1
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
    public ActivityResultLauncher<Task<PaymentData>> f39129Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f39127b0 = {Reflection.property1(new PropertyReference1Impl(BuyGooglePayConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f39126a0 = new Companion(null);

    /* JADX INFO: compiled from: BuyGooglePayConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            BaseActivity.INSTANCE.launch(context, BuyGooglePayConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmFragment$a */
    /* JADX INFO: compiled from: BuyGooglePayConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20751a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39130b;

        public C20751a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39130b = function;
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
            return this.f39130b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39130b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public final C37613e1 m47623F4() {
        return (C37613e1) this.f39128Y.getValue(this, f39127b0[0]);
    }

    /* JADX INFO: renamed from: G4 */
    private final void m47624G4() {
        this.f39129Z = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws JSONException {
                BuyGooglePayConfirmFragment.m47625H4(this.f39138a, (ApiTaskResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m47627J4(BuyGooglePayConfirmFragment buyGooglePayConfirmFragment, Task it) {
        ActivityResultLauncher<Task<PaymentData>> activityResultLauncher;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            if (buyGooglePayConfirmFragment.isAdded() && buyGooglePayConfirmFragment.isResumed() && (activityResultLauncher = buyGooglePayConfirmFragment.f39129Z) != null) {
                activityResultLauncher.launch(it);
            }
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "BuyGooglePayConfirmFragment", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m47624G4();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyGooglePayConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyGooglePayConfirmVM.class);
    }

    public BuyGooglePayConfirmFragment() {
        setPageId("B7BuyCryGooglePay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public static final void m47625H4(BuyGooglePayConfirmFragment buyGooglePayConfirmFragment, ApiTaskResult apiTaskResult) throws JSONException {
        int statusCode = apiTaskResult.getStatus().getStatusCode();
        if (statusCode != 0) {
            if (statusCode != 16) {
                ToastCompat.m66437C(R$string.payment_fast_pay_failed);
                String strM66668h = C27041f.m66668h(buyGooglePayConfirmFragment.getF26355e0());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMessage", String.valueOf(apiTaskResult.getStatus().getStatusMessage()));
                Unit unit = Unit.INSTANCE;
                C43852m.m96593e(strM66668h, "sdkError", "1", jSONObject);
                C44128b.m97261e(buyGooglePayConfirmFragment.getTAG(), "Google Pay SDK error:" + apiTaskResult.getStatus().getStatusMessage());
                C43846g.m96568c(new OtcException(new Throwable("Google Pay error:" + apiTaskResult.getStatus().getStatusMessage()), "BuyGooglePayConfirmFragment", false, null, 8, null), null, 2, null);
                return;
            }
            C44128b.m97266j(buyGooglePayConfirmFragment.getTAG(), "Google Pay SDK canceled");
            C43852m.m96595g(C27041f.m66668h(buyGooglePayConfirmFragment.getF26355e0()), "userCancel", "1", null, 8, null);
            return;
        }
        PaymentData paymentData = (PaymentData) apiTaskResult.getResult();
        if (paymentData != null) {
            ((BuyGooglePayConfirmVM) buyGooglePayConfirmFragment.m45647o3()).m47649q0(paymentData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    private final void m47626I4() {
        Task<PaymentData> taskM47648o0 = ((BuyGooglePayConfirmVM) m45647o3()).m47648o0();
        if (taskM47648o0 != null) {
            taskM47648o0.addOnCompleteListener(new OnCompleteListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    BuyGooglePayConfirmFragment.m47627J4(this.f39139b, task);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m47628K4(BuyGooglePayConfirmFragment buyGooglePayConfirmFragment, String str) {
        C44128b.m97259c(buyGooglePayConfirmFragment.getTAG(), "BuyGooglePayConfirmFragment htmlString:" + str);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(buyGooglePayConfirmFragment), null, null, new BuyGooglePayConfirmFragment$observeData$1$1(buyGooglePayConfirmFragment, str, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m47629L4(BuyGooglePayConfirmFragment buyGooglePayConfirmFragment, String str) throws JSONException {
        C44128b.m97259c(buyGooglePayConfirmFragment.getTAG(), "BuyGooglePayConfirmFragment redirectUrl:" + str);
        PaymentWebActivity.Companion companion = PaymentWebActivity.f37079t;
        Context context = buyGooglePayConfirmFragment.getContext();
        Intrinsics.checkNotNull(str);
        PaymentWebActivity.Companion.openUrl$default(companion, context, str, null, null, false, false, 60, null);
        BuyCommonConfirmFragment.m47494z4(buyGooglePayConfirmFragment, true, null, 2, null);
        if (buyGooglePayConfirmFragment.m47499W3()) {
            C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForRecurring", Boolean.TRUE, 0L, 4, null);
        }
        buyGooglePayConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83837i;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83831c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83832d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public BuyConfirmLivePriceExplainView mo47501Y3() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83834f;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83833e;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        m47626I4();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83835g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((BuyGooglePayConfirmVM) m45647o3()).m47645j0().observe(getViewLifecycleOwner(), new C20751a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyGooglePayConfirmFragment.m47628K4(this.f39136b, (String) obj);
            }
        }));
        ((BuyGooglePayConfirmVM) m45647o3()).m47646l0().observe(getViewLifecycleOwner(), new C20751a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.googlepay.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyGooglePayConfirmFragment.m47629L4(this.f39137b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        C37613e1 c37613e1M47623F4 = m47623F4();
        if (c37613e1M47623F4 != null) {
            return c37613e1M47623F4.f83836h;
        }
        return null;
    }
}
