package com.kubi.payment.fast.sell.p2p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastFeeModel;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment;
import com.kubi.payment.fast.common.confirm.p2p.P2PConfirmVMFactory;
import com.kubi.payment.fast.common.confirm.p2p.P2PExtraParams;
import com.kubi.payment.fast.common.helper.FeeHelper;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import f00.C37304a;
import g00.InterfaceC37758j;
import ht.C38301b1;
import io.reactivex.functions.Consumer;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37646l;
import p402kf.C41014a;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
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
import tt.C45070a;
import w00.C45681e;

/* JADX INFO: compiled from: P2PSellConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0014J\u001c\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment;", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PConfirmFragment;", "Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmVM;", "<init>", "()V", "vb", "Lcom/kubi/otc/databinding/BotcFragmentFastP2pConfirmBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcFragmentFastP2pConfirmBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "p2pExtraParams", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "onResume", "preTrade", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/otc/entity/FastQuoteModel;", "onLimitTipReady", "needShow", "", "onPriceError", "trackOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/network/retrofit/exception/ApiException;", "observeData", "trackOrder", "isSuccessful", "reason", "", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", TtmlNode.TAG_LAYOUT, "", "viewModelClass", "Lkotlin/reflect/KClass;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nP2PSellConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PSellConfirmFragment.kt\ncom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,253:1\n147#2,16:254\n*S KotlinDebug\n*F\n+ 1 P2PSellConfirmFragment.kt\ncom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment\n*L\n52#1:254,16\n*E\n"})
public final class P2PSellConfirmFragment extends P2PConfirmFragment<P2PSellConfirmVM> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f38681W = C45681e.m100799e(this, new Function1<P2PSellConfirmFragment, C37646l>() { // from class: com.kubi.payment.fast.sell.p2p.P2PSellConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37646l invoke(@NotNull P2PSellConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37646l.m84875a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37646l, Unit>() { // from class: com.kubi.payment.fast.sell.p2p.P2PSellConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37646l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37646l c37646l) {
            invoke(c37646l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @Nullable
    public P2PExtraParams f38682X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f38680Z = {Reflection.property1(new PropertyReference1Impl(P2PSellConfirmFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcFragmentFastP2pConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f38679Y = new Companion(null);

    /* JADX INFO: compiled from: P2PSellConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/sell/p2p/P2PSellConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PExtraParams;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @NotNull P2PExtraParams extraParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, P2PSellConfirmFragment.class, new C27051h().m66724h("title", context.getString(R$string.pay_fast_confirm_sell_title)).m66721e("data", extraParams).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.sell.p2p.P2PSellConfirmFragment$a */
    /* JADX INFO: compiled from: P2PSellConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20527a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38683b;

        public C20527a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38683b = function;
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
            return this.f38683b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38683b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public static final void m46650j4(P2PSellConfirmFragment p2PSellConfirmFragment, Object obj) {
        p2PSellConfirmFragment.hideLoadingDialog(true);
        ((P2PSellConfirmVM) p2PSellConfirmFragment.m45647o3()).m46671P();
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m46651k4(final P2PSellConfirmFragment p2PSellConfirmFragment, Throwable th2) {
        p2PSellConfirmFragment.hideLoadingDialog(true);
        if (th2 instanceof ApiException) {
            C38301b1.m86441N(p2PSellConfirmFragment, (ApiException) th2, new Function0() { // from class: com.kubi.payment.fast.sell.p2p.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PSellConfirmFragment.m46652l4(this.f38699b);
                }
            });
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        C37646l c37646lM46655Z3 = m46655Z3();
        BaseTextView baseTextView5 = c37646lM46655Z3 != null ? c37646lM46655Z3.f84187j : null;
        C37646l c37646lM46655Z4 = m46655Z3();
        ImageView imageView = c37646lM46655Z4 != null ? c37646lM46655Z4.f84181d : null;
        if (baseTextView5 != null && imageView != null) {
            C27046k.m66681D(new View[]{baseTextView5, imageView}, new Function0() { // from class: com.kubi.payment.fast.sell.p2p.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PSellConfirmFragment.m46643a4(this.f38692b);
                }
            });
        }
        C37646l c37646lM46655Z5 = m46655Z3();
        if (c37646lM46655Z5 != null && (baseTextView4 = c37646lM46655Z5.f84194q) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.p2p.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PSellConfirmFragment.m46644b4(this.f38693b);
                }
            }, 1, null);
        }
        C37646l c37646lM46655Z6 = m46655Z3();
        if (c37646lM46655Z6 != null && (baseTextView3 = c37646lM46655Z6.f84184g) != null) {
            baseTextView3.setBackground(C27017c.m66510d(C27017c.f54310a, R$drawable.botc_selector_secondary_bg, null, 2, null));
        }
        C37646l c37646lM46655Z7 = m46655Z3();
        if (c37646lM46655Z7 != null && (baseTextView2 = c37646lM46655Z7.f84184g) != null) {
            baseTextView2.setText(getStringRes(R$string.fast_pay_confirm_sell, new Object[0]));
        }
        C37646l c37646lM46655Z8 = m46655Z3();
        if (c37646lM46655Z8 == null || (baseTextView = c37646lM46655Z8.f84184g) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.p2p.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PSellConfirmFragment.m46645c4(this.f38694b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m46644b4(P2PSellConfirmFragment p2PSellConfirmFragment) {
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = p2PSellConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48412d(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(p2PSellConfirmFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m46645c4(final P2PSellConfirmFragment p2PSellConfirmFragment) {
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        FragmentManager childFragmentManager = p2PSellConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (!preCheckHelper.m48241l(childFragmentManager)) {
            return Unit.INSTANCE;
        }
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager2 = p2PSellConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        p2PHelper.m48410b(childFragmentManager2, LifecycleOwnerKt.getLifecycleScope(p2PSellConfirmFragment), new Function0() { // from class: com.kubi.payment.fast.sell.p2p.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PSellConfirmFragment.m46646d4(this.f38695b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m46648f4(P2PSellConfirmFragment p2PSellConfirmFragment, String str) throws JSONException {
        InterfaceC37758j.a.m85164m(C37304a.f82764a, 0L, str, Boolean.TRUE, null, null, null, 56, null);
        m46654n4(p2PSellConfirmFragment, true, null, 2, null);
        p2PSellConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m46652l4(P2PSellConfirmFragment p2PSellConfirmFragment) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        P2PExtraParams p2PExtraParams = p2PSellConfirmFragment.f38682X;
        FastTrackData fastTrackData = new FastTrackData(p2PExtraParams != null ? p2PExtraParams.getTradeType() : null, "P2P_EXPRESS");
        P2PExtraParams p2PExtraParams2 = p2PSellConfirmFragment.f38682X;
        fastTrackData.setFiatCurrency(p2PExtraParams2 != null ? p2PExtraParams2.getFiatCurrency() : null);
        P2PExtraParams p2PExtraParams3 = p2PSellConfirmFragment.f38682X;
        fastTrackData.setCryptoCurrency(p2PExtraParams3 != null ? p2PExtraParams3.getCryptoCurrency() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("PLACE_ORDER", false, "-10006:CHECK_PWD_ERROR", fastTrackData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    private final void m46653m4(boolean z11, String str) throws JSONException {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("SELL", "P2P_EXPRESS");
        P2PExtraParams p2PExtraParams = this.f38682X;
        fastTrackData.setFiatCurrency(p2PExtraParams != null ? p2PExtraParams.getFiatCurrency() : null);
        P2PExtraParams p2PExtraParams2 = this.f38682X;
        fastTrackData.setCryptoCurrency(p2PExtraParams2 != null ? p2PExtraParams2.getCryptoCurrency() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("PLACE_ORDER", z11, str, fastTrackData);
        C42296a c42296a = C42296a.f93790a;
        P2PExtraParams p2PExtraParams3 = this.f38682X;
        String strM66668h = C27041f.m66668h(p2PExtraParams3 != null ? p2PExtraParams3.getCryptoCurrency() : null);
        P2PExtraParams p2PExtraParams4 = this.f38682X;
        C42296a.m92834b(c42296a, z11, str, strM66668h, C27041f.m66668h(p2PExtraParams4 != null ? p2PExtraParams4.getFiatCurrency() : null), "pay_fast_sell", "fast_c2c", "c2c_fast", null, null, null, null, 1920, null);
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m46654n4(P2PSellConfirmFragment p2PSellConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        p2PSellConfirmFragment.m46653m4(z11, str);
    }

    @Override // com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment
    /* JADX INFO: renamed from: K3 */
    public void mo46356K3(boolean z11) {
        ConstraintLayout constraintLayout;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        ConstraintLayout constraintLayout2;
        if (!z11) {
            C37646l c37646lM46655Z3 = m46655Z3();
            if (c37646lM46655Z3 == null || (constraintLayout = c37646lM46655Z3.f84197t) == null) {
                return;
            }
            C27046k.m66700o(constraintLayout);
            return;
        }
        C37646l c37646lM46655Z4 = m46655Z3();
        if (c37646lM46655Z4 != null && (constraintLayout2 = c37646lM46655Z4.f84197t) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37646l c37646lM46655Z5 = m46655Z3();
        if (c37646lM46655Z5 != null && (dashTextView2 = c37646lM46655Z5.f84185h) != null) {
            dashTextView2.setDashLineColor(getColorRes(R$color.c_text40));
        }
        C37646l c37646lM46655Z6 = m46655Z3();
        if (c37646lM46655Z6 == null || (dashTextView = c37646lM46655Z6.f84185h) == null) {
            return;
        }
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.payment.fast.sell.p2p.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PSellConfirmFragment.m46649g4(this.f38696b);
            }
        }, 1, null);
    }

    @Override // com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment
    /* JADX INFO: renamed from: O3 */
    public void mo46359O3(@Nullable ApiException apiException) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(apiException != null ? apiException.code : null);
        sb2.append('-');
        sb2.append(apiException != null ? apiException.getMessage() : null);
        m46653m4(false, sb2.toString());
    }

    /* JADX INFO: renamed from: Z3 */
    public final C37646l m46655Z3() {
        return (C37646l) this.f38681W.getValue(this, f38680Z[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m46656h4(FastQuoteModel fastQuoteModel) {
        FastQuoteModel fastQuoteModel2;
        Group group;
        Group group2;
        Group group3;
        BaseTextView baseTextView;
        Group group4;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        String fee;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        ImageView imageView;
        C37646l c37646lM46655Z3 = m46655Z3();
        if (c37646lM46655Z3 != null && (imageView = c37646lM46655Z3.f84182e) != null) {
            C20143e.m45237c(imageView, m45646n3(), fastQuoteModel.getPayIcon());
        }
        C37646l c37646lM46655Z4 = m46655Z3();
        if (c37646lM46655Z4 == null || (baseTextView7 = c37646lM46655Z4.f84189l) == null) {
            fastQuoteModel2 = fastQuoteModel;
        } else {
            fastQuoteModel2 = fastQuoteModel;
            baseTextView7.setText(FastQuoteModel.getPayName$default(fastQuoteModel2, m45646n3(), null, 2, null));
        }
        C37646l c37646lM46655Z5 = m46655Z3();
        if (c37646lM46655Z5 != null && (baseTextView6 = c37646lM46655Z5.f84192o) != null) {
            baseTextView6.setText(fastQuoteModel2.getCryptoCurrency() + ' ' + getString(R$string.single_price));
        }
        C37646l c37646lM46655Z6 = m46655Z3();
        if (c37646lM46655Z6 != null && (baseTextView5 = c37646lM46655Z6.f84191n) != null) {
            C27096v0 c27096v0 = new C27096v0();
            String highPrice = fastQuoteModel2.getHighPrice();
            baseTextView5.setText(c27096v0.append(highPrice != null ? C27041f.m66669i(highPrice, "--") : null).append(C33627eb.f69716f).m66905e(fastQuoteModel2.getFiatCurrency(), getColorRes(R$color.emphasis60)));
        }
        C37646l c37646lM46655Z7 = m46655Z3();
        if (c37646lM46655Z7 != null && (baseTextView4 = c37646lM46655Z7.f84186i) != null) {
            C27096v0 c27096v1 = new C27096v0();
            FastFeeModel feeResponse = fastQuoteModel2.getFeeResponse();
            baseTextView4.setText(c27096v1.append(C27041f.m66669i((feeResponse == null || (fee = feeResponse.getFee()) == null) ? null : C41014a.m89945s(fee, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null), "0.00")).append(C33627eb.f69716f).m66905e(fastQuoteModel2.getFiatCurrency(), getColorRes(R$color.emphasis60)));
        }
        C37646l c37646lM46655Z8 = m46655Z3();
        if (c37646lM46655Z8 != null && (baseTextView3 = c37646lM46655Z8.f84188k) != null) {
            baseTextView3.setText(C27041f.m66669i(fastQuoteModel2.getCryptoAmount(), "--") + ' ' + fastQuoteModel2.getCryptoCurrency());
        }
        C37646l c37646lM46655Z9 = m46655Z3();
        if (c37646lM46655Z9 != null && (baseTextView2 = c37646lM46655Z9.f84195r) != null) {
            baseTextView2.setText(new C27096v0().m66907g(fastQuoteModel2.getSellFiatAmount(), C27029c.m66603f(this, 16)).append(C33627eb.f69716f).m66905e(fastQuoteModel2.getFiatCurrency(), getColorRes(R$color.emphasis60)));
        }
        TaxInfo f38688h0 = ((P2PSellConfirmVM) m45647o3()).getF38688h0();
        if (!C27025c.m66566d(f38688h0 != null ? f38688h0.getHit() : null)) {
            C37646l c37646lM46655Z10 = m46655Z3();
            if (c37646lM46655Z10 != null && (group2 = c37646lM46655Z10.f84180c) != null) {
                C27046k.m66700o(group2);
            }
            C37646l c37646lM46655Z11 = m46655Z3();
            if (c37646lM46655Z11 == null || (group = c37646lM46655Z11.f84179b) == null) {
                return;
            }
            C27046k.m66685H(group);
            return;
        }
        C37646l c37646lM46655Z12 = m46655Z3();
        if (c37646lM46655Z12 != null && (group4 = c37646lM46655Z12.f84179b) != null) {
            C27046k.m66700o(group4);
        }
        C37646l c37646lM46655Z13 = m46655Z3();
        if (c37646lM46655Z13 != null && (baseTextView = c37646lM46655Z13.f84193p) != null) {
            FastFeeModel feeResponse2 = fastQuoteModel2.getFeeResponse();
            baseTextView.setText(C27041f.m66668h(feeResponse2 != null ? feeResponse2.getFeeMsg() : null));
        }
        C37646l c37646lM46655Z14 = m46655Z3();
        if (c37646lM46655Z14 == null || (group3 = c37646lM46655Z14.f84180c) == null) {
            return;
        }
        C27046k.m66685H(group3);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m46657i4() {
        C38301b1.m86435H(this, ValidationBizEnum.OTC_SELL, null, new Consumer() { // from class: com.kubi.payment.fast.sell.p2p.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PSellConfirmFragment.m46650j4(this.f38697b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.fast.sell.p2p.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PSellConfirmFragment.m46651k4(this.f38698b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((P2PSellConfirmVM) m45647o3()).m46672Q();
        ((P2PSellConfirmVM) m45647o3()).m46364B();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.botc_fragment_fast_p2p_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<P2PSellConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(P2PSellConfirmVM.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public static final Unit m46643a4(P2PSellConfirmFragment p2PSellConfirmFragment) {
        FastQuoteModel value = ((P2PSellConfirmVM) p2PSellConfirmFragment.m45647o3()).m46669N().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        FeeHelper feeHelper = FeeHelper.f38580a;
        FastFeeModel feeResponse = value.getFeeResponse();
        String fiatCurrency = value.getFiatCurrency();
        FragmentManager childFragmentManager = p2PSellConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        feeHelper.m46377b(feeResponse, fiatCurrency, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m46646d4(P2PSellConfirmFragment p2PSellConfirmFragment) {
        p2PSellConfirmFragment.m46657i4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m46647e4(P2PSellConfirmFragment p2PSellConfirmFragment, FastQuoteModel fastQuoteModel) {
        Intrinsics.checkNotNull(fastQuoteModel);
        p2PSellConfirmFragment.m46656h4(fastQuoteModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m46649g4(P2PSellConfirmFragment p2PSellConfirmFragment) {
        p2PSellConfirmFragment.m46358M3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fast.common.BaseFastFragment, com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        P2PExtraParams p2PExtraParams;
        Bundle arguments = getArguments();
        if (arguments != null) {
            p2PExtraParams = (P2PExtraParams) RouteExKt.m56274t(arguments, "data");
        } else {
            p2PExtraParams = null;
        }
        this.f38682X = p2PExtraParams;
        return new P2PConfirmVMFactory(C45070a.m99667d(), BaseApplication.INSTANCE.get(), this.f38682X);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment
    /* JADX INFO: renamed from: L3 */
    public void mo46357L3() {
        ((P2PSellConfirmVM) m45647o3()).m46672Q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.f38682X == null) {
            preformBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((P2PSellConfirmVM) m45647o3()).getF38689i0()) {
            ((P2PSellConfirmVM) m45647o3()).m46672Q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((P2PSellConfirmVM) m45647o3()).m46669N().observe(getViewLifecycleOwner(), new C20527a(new Function1() { // from class: com.kubi.payment.fast.sell.p2p.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PSellConfirmFragment.m46647e4(this.f38690b, (FastQuoteModel) obj);
            }
        }));
        ((P2PSellConfirmVM) m45647o3()).m46365w().observe(getViewLifecycleOwner(), new C20527a(new Function1() { // from class: com.kubi.payment.fast.sell.p2p.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PSellConfirmFragment.m46648f4(this.f38691b, (String) obj);
            }
        }));
    }
}
