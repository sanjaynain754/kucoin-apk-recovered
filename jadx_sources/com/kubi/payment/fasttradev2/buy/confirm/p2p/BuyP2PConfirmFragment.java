package com.kubi.payment.fasttradev2.buy.confirm.p2p;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.payment.fasttradev2.buy.confirm.p2p.widget.BuyP2PConfirmTermsView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.payment.util.C21457l;
import com.kubi.payment.util.P2PUtils;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import ht.C38301b1;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37623g1;
import p270ft.C37652m0;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BuyP2PConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\fH\u0014J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\n\u00101\u001a\u0004\u0018\u000102H\u0016J\n\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020\u0017H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u00067"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmVM;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmP2pBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmP2pBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "onRefreshing", "isRefreshing", "", "onCountDownTimeUpdated", "countDownTime", "", "isFinished", "refreshExpressUI", "observeData", "onLimitTipReady", "needShowLimit", "placeOrder", "preCheckTerms", "showLimitDialog", "viewModelClass", "Lkotlin/reflect/KClass;", TtmlNode.TAG_LAYOUT, "", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "needCoupon", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyP2PConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyP2PConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,311:1\n147#2,16:312\n*S KotlinDebug\n*F\n+ 1 BuyP2PConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment\n*L\n59#1:312,16\n*E\n"})
public final class BuyP2PConfirmFragment extends BuyCommonConfirmFragment<BuyP2PConfirmVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f39172Y = C45681e.m100799e(this, new Function1<BuyP2PConfirmFragment, C37623g1>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37623g1 invoke(@NotNull BuyP2PConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37623g1.m84827a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37623g1, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37623g1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37623g1 c37623g1) {
            invoke(c37623g1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f39171a0 = {Reflection.property1(new PropertyReference1Impl(BuyP2PConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyConfirmP2pBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f39170Z = new Companion(null);

    /* JADX INFO: compiled from: BuyP2PConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/BuyP2PConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            BaseActivity.INSTANCE.launch(context, BuyP2PConfirmFragment.class, new C27051h().m66721e("data", extraParams).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmFragment$a */
    /* JADX INFO: compiled from: BuyP2PConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20775a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39173b;

        public C20775a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39173b = function;
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
            return this.f39173b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39173b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: L4 */
    public Void m47695L4() {
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: P3 */
    public BuyFluctuationTermsView mo47496P3() {
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: Z3 */
    public boolean mo47502Z3() {
        return false;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: m4 */
    public PaymentConfirmRecurringLayout mo47508m4() {
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: x4 */
    public PaymentTermView mo47510x4() {
        return null;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m47683N4(final BuyP2PConfirmFragment buyP2PConfirmFragment, final Exception exc) {
        P2PUtils p2PUtils = P2PUtils.f40363a;
        if (!p2PUtils.m49820k(exc)) {
            if (exc instanceof ApiException) {
                C38301b1.m86441N(buyP2PConfirmFragment, (ApiException) exc, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BuyP2PConfirmFragment.m47685P4(this.f39186b, exc);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        FragmentManager childFragmentManager = buyP2PConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PUtils.m49818f(exc, childFragmentManager, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyP2PConfirmFragment.m47684O4(this.f39185b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m47685P4(BuyP2PConfirmFragment buyP2PConfirmFragment, Exception exc) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        ApiException apiException = (ApiException) exc;
        sb2.append(apiException.code);
        sb2.append(':');
        sb2.append(apiException.getMessage());
        buyP2PConfirmFragment.m47511y4(false, sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m47686Q4(BuyP2PConfirmFragment buyP2PConfirmFragment, String str) throws JSONException {
        InterfaceC37758j.a.m85164m(C37304a.f82764a, 1L, str, Boolean.TRUE, C43852m.m96602n(C27041f.m66668h(buyP2PConfirmFragment.getF16323V()), "expressPay", null, 4, null), null, null, 48, null);
        BuyCommonConfirmFragment.m47494z4(buyP2PConfirmFragment, true, null, 2, null);
        buyP2PConfirmFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    private final void m47687R4(boolean z11) {
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        TextPaint paint;
        BaseTextView baseTextView3;
        TextPaint paint2;
        ConstraintLayout constraintLayout2;
        if (!z11) {
            C37623g1 c37623g1M47694K4 = m47694K4();
            if (c37623g1M47694K4 == null || (constraintLayout = c37623g1M47694K4.f83907e) == null) {
                return;
            }
            C27046k.m66700o(constraintLayout);
            return;
        }
        C37623g1 c37623g1M47694K5 = m47694K4();
        if (c37623g1M47694K5 != null && (constraintLayout2 = c37623g1M47694K5.f83907e) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37623g1 c37623g1M47694K6 = m47694K4();
        if (c37623g1M47694K6 != null && (baseTextView3 = c37623g1M47694K6.f83916n) != null && (paint2 = baseTextView3.getPaint()) != null) {
            paint2.setFlags(8);
        }
        C37623g1 c37623g1M47694K7 = m47694K4();
        if (c37623g1M47694K7 != null && (baseTextView2 = c37623g1M47694K7.f83916n) != null && (paint = baseTextView2.getPaint()) != null) {
            paint.setAntiAlias(true);
        }
        C37623g1 c37623g1M47694K8 = m47694K4();
        if (c37623g1M47694K8 == null || (baseTextView = c37623g1M47694K8.f83916n) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyP2PConfirmFragment.m47688S4(this.f39182b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m47689U4(final BuyP2PConfirmFragment buyP2PConfirmFragment, final BuyPreviewOrder.Response response) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.slippage_tolerance_dialog_layout, true).m54237f4(new Function2() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BuyP2PConfirmFragment.m47690V4(this.f39188b, response, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = buyP2PConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_fast_buy_p2p_slippage_tolerance_dialog_layout");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m47690V4(BuyP2PConfirmFragment buyP2PConfirmFragment, BuyPreviewOrder.Response response, BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        View view = holder.getView(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        View view2 = holder.getView(R$id.got_it_button);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66681D(new View[]{view, view2}, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyP2PConfirmFragment.m47691W4(dialog);
            }
        });
        ((BaseTextView) holder.getView(R$id.tv_content)).setText(buyP2PConfirmFragment.getStringRes(R$string.payment_slippage_tolerance_content, response.getCryptoCurrency()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m47692Y4(BuyP2PConfirmFragment buyP2PConfirmFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        View view = viewHolder.getView(R$id.tv_content);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        highlightTextHelper.m54120f((TextView) view, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(buyP2PConfirmFragment.getColorRes(R$color.primary))));
    }

    /* JADX INFO: renamed from: K4 */
    public final C37623g1 m47694K4() {
        return (C37623g1) this.f39172Y.getValue(this, f39171a0[0]);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m47696T4(final BuyPreviewOrder.Response response) {
        BuyPreviewOrder.Response.BuyP2PExpressInfo p2pExpressInfo;
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 == null || (p2pExpressInfo = response.getP2pExpressInfo()) == null) {
            return;
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null) {
            TextView textView = (TextView) buyConfirmInfoViewMo47506j4.findViewById(R$id.tvPrice);
            if (textView != null) {
                textView.setText(getStringRes(R$string.payment_confirm_price, p2pExpressInfo.getHedgeMidCurrency()));
            }
            TextView textView2 = (TextView) buyConfirmInfoViewMo47506j4.findViewById(R$id.tvPriceValue);
            if (textView2 != null) {
                textView2.setText(getStringRes(R$string.payment_price, C42180b.m92640e(DowngradeExKt.m66535e(p2pExpressInfo.getP2pPrice(), null, 1, null), null, 0, false, false, false, 0, null, 127, null), response.getFiatCurrency()));
            }
            int iM48247a = PrecisionHelper.f39545a.m48247a(C27041f.m66668h(p2pExpressInfo.getHedgeMidCurrency()));
            TextView textView3 = (TextView) buyConfirmInfoViewMo47506j4.findViewById(R$id.tvReceiveValue);
            if (textView3 != null) {
                textView3.setText(getStringRes(R$string.payment_price, C42180b.m92640e(DowngradeExKt.m66535e(p2pExpressInfo.getHedgeMidAmount(), null, 1, null), null, iM48247a, false, false, false, 0, null, 125, null), C27041f.m66668h(p2pExpressInfo.getHedgeMidCurrency())));
            }
            View viewFindViewById = buyConfirmInfoViewMo47506j4.findViewById(R$id.countDownView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById);
        }
        c37623g1M47694K4.f83924v.setText(getStringRes(R$string.p2pexpress_buycropty_title, p2pExpressInfo.getHedgeMidCurrency()));
        c37623g1M47694K4.f83926x.setText(getStringRes(R$string.payment_auto_exchange, p2pExpressInfo.getHedgeMidCurrency(), response.getCryptoCurrency()));
        c37623g1M47694K4.f83918p.setText(getStringRes(R$string.payment_crypto_price, response.getCryptoCurrency()));
        BaseTextView baseTextView = c37623g1M47694K4.f83917o;
        int i11 = R$string.payment_price;
        baseTextView.setText(getStringRes(i11, p2pExpressInfo.getHedgePrice(), p2pExpressInfo.getHedgeMidCurrency()));
        BaseTextView tvSlippageTolerance = c37623g1M47694K4.f83921s;
        Intrinsics.checkNotNullExpressionValue(tvSlippageTolerance, "tvSlippageTolerance");
        C27046k.m66711z(tvSlippageTolerance, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyP2PConfirmFragment.m47689U4(this.f39183b, response);
            }
        }, 1, null);
        c37623g1M47694K4.f83922t.setText(C27039d.m66642b(DowngradeExKt.m66536f(p2pExpressInfo.getHedgePriceFloat())));
        c37623g1M47694K4.f83919q.setText(getStringRes(i11, response.getCryptoAmount(), response.getCryptoCurrency()));
        LinearLayoutCompat layoutStep1 = c37623g1M47694K4.f83909g;
        Intrinsics.checkNotNullExpressionValue(layoutStep1, "layoutStep1");
        C27046k.m66685H(layoutStep1);
        ConstraintLayout layoutP2PExpress = c37623g1M47694K4.f83908f;
        Intrinsics.checkNotNullExpressionValue(layoutP2PExpress, "layoutP2PExpress");
        C27046k.m66685H(layoutP2PExpress);
        ProgressBar progressBar = c37623g1M47694K4.f83912j;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        C27046k.m66700o(progressBar);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m47697X4() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54150G4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_c2c_advertisement_dialog_title).m54153J4(R$string.payment_c2c_deal_restrict_dialog_title).m54162S4(R$string.i_know, null).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.i
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                BuyP2PConfirmFragment.m47692Y4(this.f39190b, baseViewHolder, dialogFragmentHelper);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54150G4.show(childFragmentManager, "payment_dialog_fast_buy_p2p_limit");
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: g4 */
    public void mo47503g4(@NotNull String countDownTime, boolean z11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        super.mo47503g4(countDownTime, z11);
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 == null || (baseTextView = c37623g1M47694K4.f83915m) == null) {
            return;
        }
        baseTextView.setText(getStringRes(R$string.payment_count_down_time, countDownTime));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: h4 */
    public void mo47504h4(@NotNull BuyPreviewOrder.Response previewOrder) {
        View view;
        C37652m0 c37652m0;
        BaseTextView baseTextView;
        View viewFindViewById;
        ConfirmCountDownView confirmCountDownView;
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        super.mo47504h4(previewOrder);
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null && (confirmCountDownView = (ConfirmCountDownView) buyConfirmInfoViewMo47506j4.findViewById(R$id.countDownView)) != null) {
            C27046k.m66700o(confirmCountDownView);
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j5 = mo47506j4();
        if (buyConfirmInfoViewMo47506j5 != null && (viewFindViewById = buyConfirmInfoViewMo47506j5.findViewById(R$id.layoutCountDown)) != null) {
            C27046k.m66700o(viewFindViewById);
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j6 = mo47506j4();
        if (buyConfirmInfoViewMo47506j6 != null && (baseTextView = (BaseTextView) buyConfirmInfoViewMo47506j6.findViewById(R$id.tvReceive)) != null) {
            baseTextView.setText(getStringRes(R$string.payment_receive_v2, new Object[0]));
        }
        m47696T4(previewOrder);
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 != null && (c37652m0 = c37623g1M47694K4.f83910h) != null) {
            P2PUtils.f40363a.m49821l(c37652m0, previewOrder.getMerchantInfo(), previewOrder.getPrice(), previewOrder.getFiatCurrency());
        }
        C37623g1 c37623g1M47694K5 = m47694K4();
        if (c37623g1M47694K5 == null || (view = c37623g1M47694K5.f83905c) == null) {
            return;
        }
        view.setVisibility(C21457l.m49860h(previewOrder.getMerchantInfo() == null));
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: i4 */
    public void mo47505i4(boolean z11) {
        ProgressBar progressBar;
        BaseTextView baseTextView;
        ProgressBar progressBar2;
        BaseTextView baseTextView2;
        if (z11) {
            C37623g1 c37623g1M47694K4 = m47694K4();
            if (c37623g1M47694K4 != null && (baseTextView2 = c37623g1M47694K4.f83915m) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37623g1 c37623g1M47694K5 = m47694K4();
            if (c37623g1M47694K5 == null || (progressBar2 = c37623g1M47694K5.f83912j) == null) {
                return;
            }
            C27046k.m66685H(progressBar2);
            return;
        }
        C37623g1 c37623g1M47694K6 = m47694K4();
        if (c37623g1M47694K6 != null && (baseTextView = c37623g1M47694K6.f83915m) != null) {
            C27046k.m66685H(baseTextView);
        }
        C37623g1 c37623g1M47694K7 = m47694K4();
        if (c37623g1M47694K7 == null || (progressBar = c37623g1M47694K7.f83912j) == null) {
            return;
        }
        C27046k.m66700o(progressBar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment, com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((BuyP2PConfirmVM) m45647o3()).m47707h0();
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_fast_buy_confirm_p2p;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<BuyP2PConfirmVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(BuyP2PConfirmVM.class);
    }

    public BuyP2PConfirmFragment() {
        setPageId("B7BuyCryP2P");
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m47682M4(BuyP2PConfirmFragment buyP2PConfirmFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        buyP2PConfirmFragment.m47687R4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public static final Unit m47684O4(BuyP2PConfirmFragment buyP2PConfirmFragment) {
        BuyCommonConfirmVM.m47519U((BuyCommonConfirmVM) buyP2PConfirmFragment.m45647o3(), false, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m47688S4(BuyP2PConfirmFragment buyP2PConfirmFragment) {
        buyP2PConfirmFragment.m47697X4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m47691W4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    private final boolean m47693l4() {
        Boolean boolValueOf;
        BuyP2PConfirmTermsView buyP2PConfirmTermsView;
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 != null && (buyP2PConfirmTermsView = c37623g1M47694K4.f83913k) != null) {
            boolValueOf = Boolean.valueOf(buyP2PConfirmTermsView.m47710b());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: O3 */
    public KcPrimaryButton mo47495O3() {
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 != null) {
            return c37623g1M47694K4.f83914l;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: S3 */
    public BuyConfirmHeaderView mo47498S3() {
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 != null) {
            return c37623g1M47694K4.f83906d;
        }
        return null;
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: Y3 */
    public /* bridge */ /* synthetic */ BuyConfirmLivePriceExplainView mo47501Y3() {
        return (BuyConfirmLivePriceExplainView) m47695L4();
    }

    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    @Nullable
    /* JADX INFO: renamed from: j4 */
    public BuyConfirmInfoView mo47506j4() {
        C37623g1 c37623g1M47694K4 = m47694K4();
        if (c37623g1M47694K4 != null) {
            return c37623g1M47694K4.f83911i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment
    /* JADX INFO: renamed from: k4 */
    public void mo47507k4() {
        if (m47693l4()) {
            ((BuyP2PConfirmVM) m45647o3()).m47708i0();
        } else {
            ToastCompat.m66437C(R$string.payment_please_agree_terms);
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
        ((BuyP2PConfirmVM) m45647o3()).m47706g0().observe(getViewLifecycleOwner(), new C20775a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyP2PConfirmFragment.m47682M4(this.f39179b, (Boolean) obj);
            }
        }));
        ((BuyP2PConfirmVM) m45647o3()).m47704e0().observe(getViewLifecycleOwner(), new C20775a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyP2PConfirmFragment.m47683N4(this.f39180b, (Exception) obj);
            }
        }));
        ((BuyP2PConfirmVM) m45647o3()).m47703d0().observe(getViewLifecycleOwner(), new C20775a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyP2PConfirmFragment.m47686Q4(this.f39181b, (String) obj);
            }
        }));
    }
}
