package com.kubi.payment.fasttrade.sell.confirm.p2p;

import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM;
import com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmHeaderView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellLivePriceExplainView;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.util.P2PUtils;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import f00.C37304a;
import g00.InterfaceC37758j;
import ht.C38301b1;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37652m0;
import p270ft.C37663o1;
import p569qq.C43846g;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SellP2PConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmFragment;", "Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmVM;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "initViews", "", "onResume", "observeData", "placeOrder", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "showTaxConfirmDialog", "taxInfo", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "preTrade", "oldPlaceOrder", "headerView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmHeaderView;", "confirmInfoView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView;", "livePriceView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellLivePriceExplainView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellP2PConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellP2PConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,276:1\n147#2,16:277\n35#3,4:293\n39#3:299\n44#4,2:297\n44#5,2:300\n*S KotlinDebug\n*F\n+ 1 SellP2PConfirmFragment.kt\ncom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment\n*L\n61#1:277,16\n75#1:293,4\n75#1:299\n75#1:297,2\n205#1:300,2\n*E\n"})
public final class SellP2PConfirmFragment extends SellConfirmFragment<SellP2PConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f38887Y = C45681e.m100799e(this, new Function1<SellP2PConfirmFragment, C37663o1>() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37663o1 invoke(@NotNull SellP2PConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37663o1.m84910a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37663o1, Unit>() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37663o1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37663o1 c37663o1) {
            invoke(c37663o1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f38888Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f38886b0 = {Reflection.property1(new PropertyReference1Impl(SellP2PConfirmFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastSellConfirmBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f38885a0 = new Companion(null);

    /* JADX INFO: compiled from: SellP2PConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/p2p/SellP2PConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, SellCommonConfirmExtraParams sellCommonConfirmExtraParams, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            companion.launch(context, sellCommonConfirmExtraParams, str);
        }

        public final void launch(@NotNull Context context, @NotNull SellCommonConfirmExtraParams extraParams, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            BaseActivity.INSTANCE.launch(context, SellP2PConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmFragment$a */
    /* JADX INFO: compiled from: SellP2PConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20637a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38889b;

        public C20637a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38889b = function;
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
            return this.f38889b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38889b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20638b extends TypeToken<Boolean> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public static final void m47063P4(SellP2PConfirmFragment sellP2PConfirmFragment, Object obj) {
        sellP2PConfirmFragment.hideLoadingDialog(true);
        SellP2PConfirmVM.m47081Z((SellP2PConfirmVM) sellP2PConfirmFragment.m45647o3(), "v1/otc/order/sell", null, 2, null);
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m47064Q4(final SellP2PConfirmFragment sellP2PConfirmFragment, final Throwable th2) {
        sellP2PConfirmFragment.hideLoadingDialog(true);
        if (th2 instanceof ApiException) {
            C38301b1.m86441N(sellP2PConfirmFragment, (ApiException) th2, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellP2PConfirmFragment.m47065R4(this.f38896b, th2);
                }
            });
        }
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: X3 */
    public SellLivePriceExplainView mo47003X3() {
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    private final boolean m47056I4() {
        return ((Boolean) this.f38888Z.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: J4 */
    private final C37663o1 m47057J4() {
        return (C37663o1) this.f38887Y.getValue(this, f38886b0[0]);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m47058K4(final SellP2PConfirmFragment sellP2PConfirmFragment, final Exception exc) {
        P2PUtils p2PUtils = P2PUtils.f40363a;
        if (!p2PUtils.m49820k(exc)) {
            if (exc instanceof ApiException) {
                C38301b1.m86441N(sellP2PConfirmFragment, (ApiException) exc, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SellP2PConfirmFragment.m47060M4(this.f38901b, exc);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        FragmentManager childFragmentManager = sellP2PConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PUtils.m49818f(exc, childFragmentManager, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellP2PConfirmFragment.m47059L4(this.f38900b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m47060M4(SellP2PConfirmFragment sellP2PConfirmFragment, Exception exc) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        ApiException apiException = (ApiException) exc;
        sb2.append(apiException.code);
        sb2.append(':');
        sb2.append(apiException.getMessage());
        sellP2PConfirmFragment.m47009u4(false, sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m47061N4(SellP2PConfirmFragment sellP2PConfirmFragment, String str) throws JSONException {
        InterfaceC37758j.a.m85164m(C37304a.f82764a, 0L, str, Boolean.TRUE, null, null, null, 56, null);
        SellConfirmFragment.m46997v4(sellP2PConfirmFragment, true, null, 2, null);
        sellP2PConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    private final void m47062O4() {
        C38301b1.m86435H(this, ValidationBizEnum.OTC_SELL, null, new Consumer() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SellP2PConfirmFragment.m47063P4(this.f38908b, obj);
            }
        }, new Consumer() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SellP2PConfirmFragment.m47064Q4(this.f38895b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m47065R4(SellP2PConfirmFragment sellP2PConfirmFragment, Throwable th2) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        ApiException apiException = (ApiException) th2;
        sb2.append(apiException.code);
        sb2.append(':');
        sb2.append(apiException.getMessage());
        sellP2PConfirmFragment.m47009u4(false, sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public static final Unit m47067T4(SellP2PConfirmFragment sellP2PConfirmFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            ((SellP2PConfirmVM) sellP2PConfirmFragment.m45647o3()).m47087Y("v3/otc/order/sell", str2);
        } else if (i11 == 78858) {
            sellP2PConfirmFragment.m47062O4();
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map), "payment_p2p_create", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public static final boolean m47068U4() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20638b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_express_sell", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: W4 */
    public static final void m47069W4(final SellPreviewOrder.Response.TaxInfo taxInfo, BaseViewHolder viewHolder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        TextView textView = (TextView) viewHolder.getView(R$id.text_view);
        textView.setText(C27017c.f54310a.m66516f(R$string.payment_sell_high_tax_content, C27039d.m66642b(DowngradeExKt.m66535e(taxInfo != null ? taxInfo.getTaxRate() : null, null, 1, null))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(textView, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new C27018c0(R$color.c_text, new View.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellP2PConfirmFragment.m47070X4(taxInfo, dialog, view);
            }
        })));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m47070X4(SellPreviewOrder.Response.TaxInfo taxInfo, DialogFragmentHelper dialogFragmentHelper, View view) {
        Router.f46192a.m56184f(C27041f.m66669i(taxInfo != null ? taxInfo.getAppTradeProductUrl() : null, "kumex/trade")).m4048k();
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m47076V4(final SellPreviewOrder.Response.TaxInfo taxInfo) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54157N4(true).m54167X4(R$string.payment_high_tax_title).m54148E4(R$layout.payment_text_view, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.i
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                SellP2PConfirmFragment.m47069W4(taxInfo, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.payment_contiune, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) throws JSONException {
                SellP2PConfirmFragment.m47071Y4(this.f38905b, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_cancel, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54159P4.show(childFragmentManager, "payment_fast_sell_p2p_tax_specified_dialog");
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    /* JADX INFO: renamed from: d4 */
    public void mo47005d4(@NotNull SellPreviewOrder.Response previewOrder) {
        C37652m0 c37652m0;
        ConfirmCountDownView confirmCountDownView;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo47005d4(previewOrder);
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null && (confirmCountDownView = (ConfirmCountDownView) sellConfirmInfoViewMo46998P3.findViewById(R$id.countDownView)) != null) {
            C27046k.m66700o(confirmCountDownView);
        }
        C37663o1 c37663o1M47057J4 = m47057J4();
        if (c37663o1M47057J4 != null && (c37652m0 = c37663o1M47057J4.f84359d) != null) {
            P2PUtils.f40363a.m49821l(c37652m0, previewOrder.getMerchantInfo(), previewOrder.getPrice(), previewOrder.getFiatCurrency());
        }
        SellConfirmInfoView sellConfirmInfoViewMo46998P4 = mo46998P3();
        if (sellConfirmInfoViewMo46998P4 != null) {
            sellConfirmInfoViewMo46998P4.m47094f(previewOrder.getMerchantInfo() == null);
        }
        SellConfirmInfoView sellConfirmInfoViewMo46998P5 = mo46998P3();
        if (sellConfirmInfoViewMo46998P5 != null) {
            C27046k.m66692g(sellConfirmInfoViewMo46998P5, previewOrder.getMerchantInfo() == null ? C27040e.m66658b(24) : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    /* JADX INFO: renamed from: e4 */
    public void mo47006e4() throws JSONException {
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (preCheckHelper.m48241l(childFragmentManager)) {
            SellPreviewOrder.Response value = ((SellP2PConfirmVM) m45647o3()).m46957G().getValue();
            SellPreviewOrder.Response.TaxInfo taxInfo = value != null ? value.getTaxInfo() : null;
            if (C27025c.m66566d(taxInfo != null ? taxInfo.getNeedConfirm() : null)) {
                m47076V4(taxInfo);
            } else {
                m47066S4();
            }
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_sell_confirm;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<SellP2PConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(SellP2PConfirmVM.class);
    }

    public SellP2PConfirmFragment() {
        setPageId("B7SellCryP2P");
        this.f38888Z = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SellP2PConfirmFragment.m47068U4());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public static final Unit m47059L4(SellP2PConfirmFragment sellP2PConfirmFragment) {
        SellCommonConfirmVM.m46944M((SellCommonConfirmVM) sellP2PConfirmFragment.m45647o3(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    private final void m47066S4() throws JSONException {
        String adId;
        String fiatAmount;
        String cryptoAmount;
        String price;
        String fiatCurrency;
        String cryptoCurrency;
        String payTypeCode;
        if (m47056I4()) {
            SellPreviewOrder.Response value = ((SellP2PConfirmVM) m45647o3()).m46957G().getValue();
            ISafeService iSafeService = ISafeService.f46324a.get();
            Context contextM45646n3 = m45646n3();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            JSONObject jSONObject = new JSONObject();
            SellCommonConfirmExtraParams f38841w = getF38841W();
            String p2pBusinessType = null;
            if (f38841w != null) {
                adId = f38841w.getAdId();
            } else {
                adId = null;
            }
            jSONObject.put("adId", adId);
            if (value != null) {
                fiatAmount = value.getFiatAmount();
            } else {
                fiatAmount = null;
            }
            jSONObject.put("legalCurrencyAmount", fiatAmount);
            if (value != null) {
                cryptoAmount = value.getCryptoAmount();
            } else {
                cryptoAmount = null;
            }
            jSONObject.put("currencyAmount", cryptoAmount);
            if (value != null) {
                price = value.getPrice();
            } else {
                price = null;
            }
            jSONObject.put("orderPrice", price);
            if (value != null) {
                fiatCurrency = value.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            jSONObject.put("legalCurrency", fiatCurrency);
            if (value != null) {
                cryptoCurrency = value.getCryptoCurrency();
            } else {
                cryptoCurrency = null;
            }
            jSONObject.put("cryptoCurrency", cryptoCurrency);
            SellCommonConfirmExtraParams f38841w2 = getF38841W();
            if (f38841w2 != null) {
                payTypeCode = f38841w2.getPayTypeCode();
            } else {
                payTypeCode = null;
            }
            jSONObject.put("payTypeCode", payTypeCode);
            SellCommonConfirmExtraParams f38841w3 = getF38841W();
            if (f38841w3 != null) {
                p2pBusinessType = f38841w3.getP2pBusinessType();
            }
            jSONObject.put("businessType", p2pBusinessType);
            Unit unit = Unit.INSTANCE;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ISafeService.m56306a(iSafeService, contextM45646n3, viewLifecycleOwner, "RV_P2P_TRADE_CREATE", string, 0, true, new Function7() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.h
                @Override // p852kotlin.jvm.functions.Function7
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    return SellP2PConfirmFragment.m47067T4(this.f38903b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
                }
            }, 16, null);
            return;
        }
        m47062O4();
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m47071Y4(SellP2PConfirmFragment sellP2PConfirmFragment, DialogInterface dialogInterface, int i11) throws JSONException {
        sellP2PConfirmFragment.m47066S4();
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public SellConfirmInfoView mo46998P3() {
        C37663o1 c37663o1M47057J4 = m47057J4();
        if (c37663o1M47057J4 != null) {
            return c37663o1M47057J4.f84358c;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: Q3 */
    public KcPrimaryButton mo46999Q3() {
        C37663o1 c37663o1M47057J4 = m47057J4();
        if (c37663o1M47057J4 != null) {
            return c37663o1M47057J4.f84362g;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: T3 */
    public SellConfirmHeaderView mo47002T3() {
        C37663o1 c37663o1M47057J4 = m47057J4();
        if (c37663o1M47057J4 != null) {
            return c37663o1M47057J4.f84357b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((SellP2PConfirmVM) m45647o3()).getF38894n0()) {
            SellCommonConfirmVM.m46944M((SellCommonConfirmVM) m45647o3(), false, 1, null);
        }
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        BaseTextView baseTextView;
        View viewFindViewById;
        super.mo45648p3();
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null && (viewFindViewById = sellConfirmInfoViewMo46998P3.findViewById(R$id.layoutCountDown)) != null) {
            C27046k.m66700o(viewFindViewById);
        }
        SellConfirmInfoView sellConfirmInfoViewMo46998P4 = mo46998P3();
        if (sellConfirmInfoViewMo46998P4 != null && (baseTextView = (BaseTextView) sellConfirmInfoViewMo46998P4.findViewById(R$id.tvReceive)) != null) {
            baseTextView.setText(getStringRes(R$string.payment_receive_v2, new Object[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment, com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        ((SellP2PConfirmVM) m45647o3()).m47085W().observe(getViewLifecycleOwner(), new C20637a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellP2PConfirmFragment.m47058K4(this.f38898b, (Exception) obj);
            }
        }));
        ((SellP2PConfirmVM) m45647o3()).m47084V().observe(getViewLifecycleOwner(), new C20637a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.p2p.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellP2PConfirmFragment.m47061N4(this.f38899b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: t4 */
    public PaymentTermView mo47008t4() {
        C37663o1 c37663o1M47057J4 = m47057J4();
        if (c37663o1M47057J4 != null) {
            return c37663o1M47057J4.f84361f;
        }
        return null;
    }
}
