package com.kubi.payment.channel.paymentmethod.recharge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.channel.base.BaseChannelFragment;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.precheck.IPreCheckInterceptor;
import com.kubi.payment.channel.precheck.KycPreCheckInterceptor;
import com.kubi.payment.channel.precheck.PreCheckInterceptorChain;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.channel.precheck.VersionPreCheckInterceptor;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.payment.util.C21457l;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import i10.Menu;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37711y1;
import p569qq.C43841b;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: RechargePaymentMethodFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodFragment;", "Lcom/kubi/payment/channel/base/BaseChannelFragment;", "Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentRechargePaymentMethodBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentRechargePaymentMethodBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fiatCurrency", "", "rechargePaymentMethodAdapter", "Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodAdapter;", "guidePaymentMethodAdapter", "Lcom/kubi/payment/channel/paymentmethod/recharge/GuidePaymentMethodAdapter;", "recommendPaymentMethodTitleAdapter", "Lcom/kubi/payment/channel/paymentmethod/recharge/TitlePaymentAdapter;", "otherPaymentMethodTitleAdapter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "onItemClick", ViewProps.POSITION, "", "onGuidePaymentItemClick", "observeData", "onResume", "retry", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "onBackPressed", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRechargePaymentMethodFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargePaymentMethodFragment.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,291:1\n147#2,16:292\n17#3,2:308\n76#4,7:310\n*S KotlinDebug\n*F\n+ 1 RechargePaymentMethodFragment.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodFragment\n*L\n53#1:292,16\n78#1:308,2\n87#1:310,7\n*E\n"})
public final class RechargePaymentMethodFragment extends BaseChannelFragment<RechargePaymentMethodVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38298W = C45681e.m100799e(this, new Function1<RechargePaymentMethodFragment, C37711y1>() { // from class: com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37711y1 invoke(@NotNull RechargePaymentMethodFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37711y1.m85008a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37711y1, Unit>() { // from class: com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37711y1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37711y1 c37711y1) {
            invoke(c37711y1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f38299X;

    /* JADX INFO: renamed from: Y */
    public RechargePaymentMethodAdapter f38300Y;

    /* JADX INFO: renamed from: Z */
    public GuidePaymentMethodAdapter f38301Z;

    /* JADX INFO: renamed from: a0 */
    public TitlePaymentAdapter f38302a0;

    /* JADX INFO: renamed from: b0 */
    public TitlePaymentAdapter f38303b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f38297d0 = {Reflection.property1(new PropertyReference1Impl(RechargePaymentMethodFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentRechargePaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f38296c0 = new Companion(null);

    /* JADX INFO: compiled from: RechargePaymentMethodFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodFragment$Companion;", "", "<init>", "()V", "KEY_FIAT", "", "KEY_BACK_HOME", "PAGE_ID", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodFragment$a */
    /* JADX INFO: compiled from: RechargePaymentMethodFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20345a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38304b;

        public C20345a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38304b = function;
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
            return this.f38304b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38304b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44128b.m97265i("onViewCreated");
        if (C12573b.f21598a.m23696a()) {
            "PAYMENT_EVENT_SELECT_FIAT_CURRENCY".length();
        }
        C12572a.m23692a(this, false, new C20346xe7679650("PAYMENT_EVENT_SELECT_FIAT_CURRENCY", null, this));
        ((RechargePaymentMethodVM) m45647o3()).m45900Q(new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new VersionPreCheckInterceptor(), new KycPreCheckInterceptor()})));
        ((RechargePaymentMethodVM) m45647o3()).m45897N();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        C37711y1 c37711y1M45874Q3 = m45874Q3();
        if (c37711y1M45874Q3 == null) {
            return;
        }
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_history_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RechargePaymentMethodFragment.m45863R3(this.f38351b, view);
            }
        }, 0, 377, null));
        RechargePaymentMethodAdapter rechargePaymentMethodAdapter = new RechargePaymentMethodAdapter();
        this.f38300Y = rechargePaymentMethodAdapter;
        rechargePaymentMethodAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.m
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RechargePaymentMethodFragment.m45864S3(this.f38352a, baseQuickAdapter, view, i11);
            }
        });
        GuidePaymentMethodAdapter guidePaymentMethodAdapter = new GuidePaymentMethodAdapter();
        this.f38301Z = guidePaymentMethodAdapter;
        guidePaymentMethodAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.n
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RechargePaymentMethodFragment.m45865T3(this.f38353a, baseQuickAdapter, view, i11);
            }
        });
        this.f38302a0 = new TitlePaymentAdapter();
        this.f38303b0 = new TitlePaymentAdapter();
        RecyclerView recyclerView = c37711y1M45874Q3.f84930d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m45646n3());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        TitlePaymentAdapter titlePaymentAdapter = this.f38302a0;
        GuidePaymentMethodAdapter guidePaymentMethodAdapter2 = null;
        if (titlePaymentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recommendPaymentMethodTitleAdapter");
            titlePaymentAdapter = null;
        }
        RechargePaymentMethodAdapter rechargePaymentMethodAdapter2 = this.f38300Y;
        if (rechargePaymentMethodAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rechargePaymentMethodAdapter");
            rechargePaymentMethodAdapter2 = null;
        }
        TitlePaymentAdapter titlePaymentAdapter2 = this.f38303b0;
        if (titlePaymentAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherPaymentMethodTitleAdapter");
            titlePaymentAdapter2 = null;
        }
        GuidePaymentMethodAdapter guidePaymentMethodAdapter3 = this.f38301Z;
        if (guidePaymentMethodAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guidePaymentMethodAdapter");
        } else {
            guidePaymentMethodAdapter2 = guidePaymentMethodAdapter3;
        }
        recyclerView.setAdapter(new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{titlePaymentAdapter, rechargePaymentMethodAdapter2, titlePaymentAdapter2, guidePaymentMethodAdapter2}));
        c37711y1M45874Q3.f84931e.setText(getStringRes(R$string.legal_account_deposit_currency, this.f38299X));
        c37711y1M45874Q3.f84932f.setText(this.f38299X);
        Layer layer = c37711y1M45874Q3.f84929c;
        Intrinsics.checkNotNullExpressionValue(layer, "layer");
        C27046k.m66711z(layer, 0L, new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RechargePaymentMethodFragment.m45866U3(this.f38354b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m45863R3(RechargePaymentMethodFragment rechargePaymentMethodFragment, View view) {
        InterfaceC37758j.a.m85156e(C37304a.f82764a, 0L, rechargePaymentMethodFragment.f38299X, null, null, null, 28, null);
        C43852m.m96591c("B7FiatDepositMethod", "history", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m45864S3(RechargePaymentMethodFragment rechargePaymentMethodFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        rechargePaymentMethodFragment.m45876d4(i11, view);
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m45865T3(RechargePaymentMethodFragment rechargePaymentMethodFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        rechargePaymentMethodFragment.m45875c4(i11, view);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m45866U3(RechargePaymentMethodFragment rechargePaymentMethodFragment) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/selectFiatCurrency", false, 2, null)).m4038a("fiatCurrency", C27041f.m66668h(rechargePaymentMethodFragment.f38299X)).m4048k();
        C43852m.m96592d("B7FiatDepositMethod", "SwitchCurrency", null, new Pair[]{TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(rechargePaymentMethodFragment.f38299X))}, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m45868W3(RechargePaymentMethodFragment rechargePaymentMethodFragment, PaymentMethod paymentMethod) {
        RechargeHelper rechargeHelper = RechargeHelper.f38317a;
        Context contextM45646n3 = rechargePaymentMethodFragment.m45646n3();
        String str = rechargePaymentMethodFragment.f38299X;
        Intrinsics.checkNotNull(paymentMethod);
        rechargeHelper.m45911e(contextM45646n3, str, paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m45871Z3(final RechargePaymentMethodFragment rechargePaymentMethodFragment, KcPrimaryButton showByCondition) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(showByCondition, "$this$showByCondition");
        C37711y1 c37711y1M45874Q3 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q3 != null && (kcPrimaryButton = c37711y1M45874Q3.f84933g) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.channel.paymentmethod.recharge.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RechargePaymentMethodFragment.m45872a4(this.f38320b);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m45872a4(RechargePaymentMethodFragment rechargePaymentMethodFragment) {
        InterfaceC37758j.a.m85155d(C37304a.f82764a, null, rechargePaymentMethodFragment.f38299X, null, null, null, null, 61, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public final C37711y1 m45874Q3() {
        return (C37711y1) this.f38298W.getValue(this, f38297d0[0]);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m45875c4(int i11, View view) {
        GuidePaymentMethodAdapter guidePaymentMethodAdapter = this.f38301Z;
        if (guidePaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guidePaymentMethodAdapter");
            guidePaymentMethodAdapter = null;
        }
        GuidePayment.PaymentMethod item = guidePaymentMethodAdapter.getItem(i11);
        if (item == null || C27014a1.m66501a(view)) {
            return;
        }
        String appRedirectUrl = item.getAppRedirectUrl();
        if (appRedirectUrl != null && appRedirectUrl.length() != 0) {
            Router.f46192a.m56184f(item.getAppRedirectUrl()).m4048k();
        }
        C43852m.m96590b("B7FiatDepositMethod", "PaymentMethod", "1", TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(item.getPaymentMethod())), TuplesKt.m90091to("channelId", C27041f.m66668h(item.getPaymentMethod())), TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(this.f38299X)), TuplesKt.m90091to("norm_version", "1"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public final void m45876d4(int i11, View view) {
        RechargePaymentMethodAdapter rechargePaymentMethodAdapter = this.f38300Y;
        RechargePaymentMethodAdapter rechargePaymentMethodAdapter2 = null;
        if (rechargePaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rechargePaymentMethodAdapter");
            rechargePaymentMethodAdapter = null;
        }
        PaymentMethod item = rechargePaymentMethodAdapter.getItem(i11);
        if (item != null && C27025c.m66566d(Boolean.valueOf(item.isEnabled()))) {
            RechargePaymentMethodAdapter rechargePaymentMethodAdapter3 = this.f38300Y;
            if (rechargePaymentMethodAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rechargePaymentMethodAdapter");
            } else {
                rechargePaymentMethodAdapter2 = rechargePaymentMethodAdapter3;
            }
            if (i11 >= rechargePaymentMethodAdapter2.getItems().size() || i11 < 0 || C27014a1.m66501a(view)) {
                return;
            }
            RechargePaymentMethodVM rechargePaymentMethodVM = (RechargePaymentMethodVM) m45647o3();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rechargePaymentMethodVM.m45898O(new PreCheckRequest(childFragmentManager, item.getPaymentMethodCode(), item.getChannelId(), this.f38299X, FastQuoteModel.PAY_RECHARGE), item);
            C43852m.m96590b("B7FiatDepositMethod", "PaymentMethod", "1", TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(item.getPaymentMethodCode())), TuplesKt.m90091to("channelId", C27041f.m66668h(item.getChannelId())), TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(this.f38299X)), TuplesKt.m90091to("norm_version", "1"));
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_recharge_payment_method;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<RechargePaymentMethodVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(RechargePaymentMethodVM.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static final /* synthetic */ RechargePaymentMethodVM m45861O3(RechargePaymentMethodFragment rechargePaymentMethodFragment) {
        return (RechargePaymentMethodVM) rechargePaymentMethodFragment.m45647o3();
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m45867V3(RechargePaymentMethodFragment rechargePaymentMethodFragment, List list, List list2, Pair pair) {
        Layer layer;
        RecyclerView recyclerView;
        List list3 = (List) pair.component1();
        List list4 = (List) pair.component2();
        C37711y1 c37711y1M45874Q3 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q3 != null && (recyclerView = c37711y1M45874Q3.f84930d) != null) {
            ViewExtKt.m66594y(recyclerView);
        }
        C37711y1 c37711y1M45874Q4 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q4 != null && (layer = c37711y1M45874Q4.f84935i) != null) {
            ViewExtKt.m66577h(layer);
        }
        TitlePaymentAdapter titlePaymentAdapter = rechargePaymentMethodFragment.f38302a0;
        GuidePaymentMethodAdapter guidePaymentMethodAdapter = null;
        if (titlePaymentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recommendPaymentMethodTitleAdapter");
            titlePaymentAdapter = null;
        }
        if (list3.isEmpty()) {
            list = CollectionsKt.emptyList();
        }
        titlePaymentAdapter.submitList(list);
        RechargePaymentMethodAdapter rechargePaymentMethodAdapter = rechargePaymentMethodFragment.f38300Y;
        if (rechargePaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rechargePaymentMethodAdapter");
            rechargePaymentMethodAdapter = null;
        }
        rechargePaymentMethodAdapter.submitList(list3);
        TitlePaymentAdapter titlePaymentAdapter2 = rechargePaymentMethodFragment.f38303b0;
        if (titlePaymentAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherPaymentMethodTitleAdapter");
            titlePaymentAdapter2 = null;
        }
        if (list4.isEmpty()) {
            list2 = CollectionsKt.emptyList();
        }
        titlePaymentAdapter2.submitList(list2);
        GuidePaymentMethodAdapter guidePaymentMethodAdapter2 = rechargePaymentMethodFragment.f38301Z;
        if (guidePaymentMethodAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guidePaymentMethodAdapter");
        } else {
            guidePaymentMethodAdapter = guidePaymentMethodAdapter2;
        }
        guidePaymentMethodAdapter.submitList(list4);
        if (list3.isEmpty() && list4.isEmpty()) {
            BaseFragment.showEmptyView$default(rechargePaymentMethodFragment, R$string.payment_channel_payment_methods_unavailable, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            rechargePaymentMethodFragment.showContentView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m45869X3(RechargePaymentMethodFragment rechargePaymentMethodFragment, String str) {
        ImageView imageView;
        C37711y1 c37711y1M45874Q3 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q3 != null && (imageView = c37711y1M45874Q3.f84928b) != null) {
            C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(rechargePaymentMethodFragment.m45646n3()).mo6634v(str);
            int i11 = R$mipmap.kucoin_icon_default_icon;
            c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m102188U0().m6594E0(imageView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m45870Y3(final RechargePaymentMethodFragment rechargePaymentMethodFragment, Object obj) {
        KcPrimaryButton kcPrimaryButton;
        Layer layer;
        RecyclerView recyclerView;
        rechargePaymentMethodFragment.showContentView();
        C37711y1 c37711y1M45874Q3 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q3 != null && (recyclerView = c37711y1M45874Q3.f84930d) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
        C37711y1 c37711y1M45874Q4 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q4 != null && (layer = c37711y1M45874Q4.f84935i) != null) {
            ViewExtKt.m66594y(layer);
        }
        C37711y1 c37711y1M45874Q5 = rechargePaymentMethodFragment.m45874Q3();
        if (c37711y1M45874Q5 != null && (kcPrimaryButton = c37711y1M45874Q5.f84933g) != null) {
            C21457l.m49859g(kcPrimaryButton, C24129b.m58030b(SiteVisibleConfigKey.FastTrade), null, new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RechargePaymentMethodFragment.m45871Z3(this.f38355b, (KcPrimaryButton) obj2);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m45873b4(RechargePaymentMethodFragment rechargePaymentMethodFragment, UserInfo.KycInfoResponse kycInfoResponse) {
        if (!C27025c.m66566d(kycInfoResponse.isVerified())) {
            Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/kyc", false, 2, null)).m4048k();
        }
        if (C27025c.m66566d(kycInfoResponse.isExpired())) {
            PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
            FragmentManager childFragmentManager = rechargePaymentMethodFragment.getChildFragmentManager();
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
        String strMo45622b;
        super.onCreate(savedInstanceState);
        C44128b.m97265i("onCreate");
        String strM56284y = null;
        C43841b.m96557d("B7channel_deposit", "page_load_start", null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fiat");
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        this.f38299X = strM66668h;
        if (strM66668h == null || strM66668h.length() == 0) {
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45622b = ((IPaymentSiteService) objM56186h).mo45622b()) == null) {
                strMo45622b = IPaymentSiteService.Companion.EUR;
            }
            this.f38299X = strMo45622b;
        }
        C43852m.m96596h("B7FiatDepositMethod", "page", null, new Pair[]{TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(this.f38299X))}, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((RechargePaymentMethodVM) m45647o3()).m45896M(this.f38299X);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((RechargePaymentMethodVM) m45647o3()).m45892I().observe(getViewLifecycleOwner(), new C20345a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RechargePaymentMethodFragment.m45873b4(this.f38319b, (UserInfo.KycInfoResponse) obj);
            }
        }));
        final List listListOf = CollectionsKt.listOf(getString(R$string.payment_recharge_methods_recommend));
        final List listListOf2 = CollectionsKt.listOf(getString(R$string.payment_recharge_methods_others));
        ((RechargePaymentMethodVM) m45647o3()).m45895L().observe(getViewLifecycleOwner(), new C20345a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RechargePaymentMethodFragment.m45867V3(this.f38321b, listListOf, listListOf2, (Pair) obj);
            }
        }));
        ((RechargePaymentMethodVM) m45647o3()).m45894K().observe(getViewLifecycleOwner(), new C20345a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RechargePaymentMethodFragment.m45868W3(this.f38324b, (PaymentMethod) obj);
            }
        }));
        ((RechargePaymentMethodVM) m45647o3()).m45891H().observe(getViewLifecycleOwner(), new C20345a(new Function1() { // from class: com.kubi.payment.channel.paymentmethod.recharge.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RechargePaymentMethodFragment.m45869X3(this.f38349b, (String) obj);
            }
        }));
        ((RechargePaymentMethodVM) m45647o3()).m45890G().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.payment.channel.paymentmethod.recharge.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RechargePaymentMethodFragment.m45870Y3(this.f38350b, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: w3 */
    public void mo45651w3() {
        super.mo45651w3();
        ((RechargePaymentMethodVM) m45647o3()).m45896M(this.f38299X);
    }
}
