package com.kubi.payment.channel.paymentmethod.withdraw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.base.BaseChannelFragment;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.precheck.IPreCheckInterceptor;
import com.kubi.payment.channel.precheck.KycPreCheckInterceptor;
import com.kubi.payment.channel.precheck.PreCheckInterceptorChain;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.channel.precheck.VersionPreCheckInterceptor;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import i10.Menu;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37604c2;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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

/* JADX INFO: compiled from: WithdrawPaymentMethodFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020!H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodFragment;", "Lcom/kubi/payment/channel/base/BaseChannelFragment;", "Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentWithdrawPaymentMethodBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentWithdrawPaymentMethodBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "", "withdrawPaymentMethodAdapter", "Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "onItemClick", ViewProps.POSITION, "", "observeData", "onResume", "retry", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "onBackPressed", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawPaymentMethodFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawPaymentMethodFragment.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,193:1\n147#2,16:194\n*S KotlinDebug\n*F\n+ 1 WithdrawPaymentMethodFragment.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodFragment\n*L\n40#1:194,16\n*E\n"})
public final class WithdrawPaymentMethodFragment extends BaseChannelFragment<WithdrawPaymentMethodVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38358W = C45681e.m100799e(this, new Function1<WithdrawPaymentMethodFragment, C37604c2>() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.WithdrawPaymentMethodFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37604c2 invoke(@NotNull WithdrawPaymentMethodFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37604c2.m84791a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37604c2, Unit>() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.WithdrawPaymentMethodFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37604c2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37604c2 c37604c2) {
            invoke(c37604c2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f38359X;

    /* JADX INFO: renamed from: Y */
    public WithdrawPaymentMethodAdapter f38360Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f38357a0 = {Reflection.property1(new PropertyReference1Impl(WithdrawPaymentMethodFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentWithdrawPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f38356Z = new Companion(null);

    /* JADX INFO: compiled from: WithdrawPaymentMethodFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPaymentMethodFragment$Companion;", "", "<init>", "()V", "KEY_FIAT", "", "KEY_BACK_HOME", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.withdraw.WithdrawPaymentMethodFragment$a */
    /* JADX INFO: compiled from: WithdrawPaymentMethodFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20376a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38361b;

        public C20376a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38361b = function;
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
            return this.f38361b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38361b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m45960H3(WithdrawPaymentMethodFragment withdrawPaymentMethodFragment, View view) {
        InterfaceC37758j.a.m85156e(C37304a.f82764a, 1L, withdrawPaymentMethodFragment.f38359X, null, null, null, 28, null);
        C43852m.m96591c(C27041f.m66668h(withdrawPaymentMethodFragment.getF34288V()), "history", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: I3 */
    public static final void m45961I3(WithdrawPaymentMethodFragment withdrawPaymentMethodFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        withdrawPaymentMethodFragment.m45965M3(i11, view);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m45963K3(WithdrawPaymentMethodFragment withdrawPaymentMethodFragment, List list) {
        WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter = withdrawPaymentMethodFragment.f38360Y;
        if (withdrawPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawPaymentMethodAdapter");
            withdrawPaymentMethodAdapter = null;
        }
        withdrawPaymentMethodAdapter.submitList(list);
        if (list.isEmpty()) {
            BaseFragment.showEmptyView$default(withdrawPaymentMethodFragment, R$string.fiat_withdraw_no_data_tip, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            withdrawPaymentMethodFragment.showContentView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m45964L3(WithdrawPaymentMethodFragment withdrawPaymentMethodFragment, PaymentMethod paymentMethod) {
        WithdrawHelper withdrawHelper = WithdrawHelper.f38368a;
        Context contextM45646n3 = withdrawPaymentMethodFragment.m45646n3();
        String str = withdrawPaymentMethodFragment.f38359X;
        Intrinsics.checkNotNull(paymentMethod);
        withdrawHelper.m45993h(contextM45646n3, str, paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    private final void m45965M3(int i11, View view) {
        WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter = this.f38360Y;
        WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter2 = null;
        if (withdrawPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawPaymentMethodAdapter");
            withdrawPaymentMethodAdapter = null;
        }
        PaymentMethod item = withdrawPaymentMethodAdapter.getItem(i11);
        if (item != null && C27025c.m66566d(Boolean.valueOf(item.isEnabled()))) {
            WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter3 = this.f38360Y;
            if (withdrawPaymentMethodAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("withdrawPaymentMethodAdapter");
            } else {
                withdrawPaymentMethodAdapter2 = withdrawPaymentMethodAdapter3;
            }
            if (i11 >= withdrawPaymentMethodAdapter2.getItems().size() || i11 < 0 || C27014a1.m66501a(view)) {
                return;
            }
            WithdrawPaymentMethodVM withdrawPaymentMethodVM = (WithdrawPaymentMethodVM) m45647o3();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            withdrawPaymentMethodVM.m45982I(new PreCheckRequest(childFragmentManager, item.getPaymentMethodCode(), item.getChannelId(), this.f38359X, "WITHDRAW"), item);
            C43852m.m96590b(C27041f.m66668h(getF34288V()), "PaymentMethod", "1", TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(item.getPaymentMethodCode())), TuplesKt.m90091to("channelId", C27041f.m66668h(item.getChannelId())), TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(this.f38359X)));
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final C37604c2 m45966G3() {
        return (C37604c2) this.f38358W.getValue(this, f38357a0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44128b.m97265i("onViewCreated");
        ((WithdrawPaymentMethodVM) m45647o3()).m45983J(new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new WithdrawPreCheckInterceptor(), new VersionPreCheckInterceptor(), new KycPreCheckInterceptor()})));
        ((WithdrawPaymentMethodVM) m45647o3()).m45981H();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_withdraw_payment_method;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<WithdrawPaymentMethodVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(WithdrawPaymentMethodVM.class);
    }

    public WithdrawPaymentMethodFragment() {
        setPageId("B7FiatWithdraw");
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m45962J3(WithdrawPaymentMethodFragment withdrawPaymentMethodFragment, UserInfo.KycInfoResponse kycInfoResponse) {
        if (!C27025c.m66566d(kycInfoResponse.isVerified())) {
            Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/kyc", false, 2, null)).m4048k();
        }
        if (C27025c.m66566d(kycInfoResponse.isExpired())) {
            PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
            FragmentManager childFragmentManager = withdrawPaymentMethodFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            PreCheckHelper.m48231q(preCheckHelper, childFragmentManager, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        Bundle arguments = getArguments();
        if (arguments != null && RouteExKt.m56260m(arguments, "backHome") == 1) {
            InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C44128b.m97265i("onCreate");
        String strM56284y = null;
        C43841b.m96557d("B7channel_withdraw", "page_load_start", null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fiat");
        }
        this.f38359X = C27041f.m66668h(strM56284y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((WithdrawPaymentMethodVM) m45647o3()).m45980G(this.f38359X);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        C37604c2 c37604c2M45966G3 = m45966G3();
        if (c37604c2M45966G3 == null) {
            return;
        }
        getTitleBar().setTitle(getString(R$string.fiat_withdraw_title, this.f38359X));
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_history_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawPaymentMethodFragment.m45960H3(this.f38370b, view);
            }
        }, 0, 377, null));
        WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter = new WithdrawPaymentMethodAdapter();
        this.f38360Y = withdrawPaymentMethodAdapter;
        withdrawPaymentMethodAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.e
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                WithdrawPaymentMethodFragment.m45961I3(this.f38371a, baseQuickAdapter, view, i11);
            }
        });
        RecyclerView recyclerView = c37604c2M45966G3.f83754b;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m45646n3());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        WithdrawPaymentMethodAdapter withdrawPaymentMethodAdapter2 = this.f38360Y;
        if (withdrawPaymentMethodAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withdrawPaymentMethodAdapter");
            withdrawPaymentMethodAdapter2 = null;
        }
        recyclerView.setAdapter(withdrawPaymentMethodAdapter2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((WithdrawPaymentMethodVM) m45647o3()).m45977D().observe(getViewLifecycleOwner(), new C20376a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawPaymentMethodFragment.m45962J3(this.f38372b, (UserInfo.KycInfoResponse) obj);
            }
        }));
        ((WithdrawPaymentMethodVM) m45647o3()).m45979F().observe(getViewLifecycleOwner(), new C20376a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawPaymentMethodFragment.m45963K3(this.f38373b, (List) obj);
            }
        }));
        ((WithdrawPaymentMethodVM) m45647o3()).m45978E().observe(getViewLifecycleOwner(), new C20376a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.withdraw.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawPaymentMethodFragment.m45964L3(this.f38374b, (PaymentMethod) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: w3 */
    public void mo45651w3() {
        super.mo45651w3();
        ((WithdrawPaymentMethodVM) m45647o3()).m45980G(this.f38359X);
    }
}
