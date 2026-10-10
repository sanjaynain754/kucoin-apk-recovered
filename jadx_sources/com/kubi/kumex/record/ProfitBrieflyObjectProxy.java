package com.kubi.kumex.record;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/record/ProfitBrieflyObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/record/CommonEmptyObject;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProfitBrieflyObjectProxy extends ViewHolderProxy<ProfitBrieflyObject> {

    @Nullable
    private final ItemCallBack<CommonEmptyObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<CommonEmptyObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitBrieflyObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<CommonEmptyObject> itemCallBack, @Nullable ItemCallBack<CommonEmptyObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$14$lambda$13() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101351s0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$17$lambda$16() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101352t0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6$lambda$5(View view) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_tax, R$string.kumex_profit_details_tax_desc, null, 4, null);
        FragmentManager childFragmentManager = ViewKt.findFragment(view).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "kumex_profit_details_tax_desc");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8(View view) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_pnln_liq_money, R$string.kumex_pnln_liq_des_detail, null, 4, null);
        FragmentManager childFragmentManager = ViewKt.findFragment(view).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "kumex_profit_details_tax_desc");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x019e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0237  */
    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull ProfitBrieflyObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        final View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ((BaseTextView) itemView.findViewById(R$id.profitSymbol)).setText(d11.getF30284h());
        AppCompatTextView appCompatTextView = (AppCompatTextView) itemView.findViewById(R$id.closeTypeTv);
        appCompatTextView.setText(d11.m35296b());
        Intrinsics.checkNotNull(appCompatTextView);
        C27046k.m66684G(appCompatTextView, d11.m35296b().length() > 0);
        if (d11.m35298d() == null) {
            View viewFindViewById = itemView.findViewById(R$id.directionTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66700o(viewFindViewById);
        } else {
            int i11 = R$id.directionTv;
            View viewFindViewById2 = itemView.findViewById(i11);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66685H(viewFindViewById2);
            KcTradeRateView kcTradeRateView = (KcTradeRateView) itemView.findViewById(i11);
            kcTradeRateView.setText(d11.m35298d());
            kcTradeRateView.setTextColor(d11.getF29940e());
        }
        ((BaseTextView) itemView.findViewById(R$id.marginMode)).setText(d11.getF29938c());
        if (d11.m35300f() == null) {
            View viewFindViewById3 = itemView.findViewById(R$id.leverageTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66700o(viewFindViewById3);
        } else {
            BaseTextView baseTextView = (BaseTextView) itemView.findViewById(R$id.leverageTv);
            Intrinsics.checkNotNull(baseTextView);
            C27046k.m66685H(baseTextView);
            baseTextView.setText(d11.m35300f());
        }
        ((BaseTextView) itemView.findViewById(R$id.time)).setText(d11.getF29939d());
        BaseTextView baseTextView2 = (BaseTextView) itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNull(baseTextView2);
        C27046k.m66684G(baseTextView2, d11.getF29936a().isTrialFunds());
        baseTextView2.setText(C27092t0.m66896a(d11.getF29936a().getPrizeType()));
        ((BaseTextView) itemView.findViewById(R$id.closePnlValueTv)).setText(ProfitBrieflyObject.m35791l(d11, d11.getF30287k(), 0, 0, 6, null));
        String strM36540n = null;
        ((BaseTextView) itemView.findViewById(R$id.foundingFeeValueTv)).setText(ProfitBrieflyObject.m35791l(d11, C41014a.m89922G(d11.getF29936a().getFundingFee(), null, 1, null), 0, 0, 6, null));
        ((BaseTextView) itemView.findViewById(R$id.feeValueTv)).setText(ProfitBrieflyObject.m35791l(d11, C41014a.m89922G(d11.getF29936a().getDealComm(), null, 1, null), 0, 0, 6, null));
        if (Intrinsics.areEqual(d11.getF29936a().getMarginMode(), "CROSS") || d11.getF29936a().getWithdrawPnl() == null) {
            View viewFindViewById4 = itemView.findViewById(R$id.profitWithdrawnTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            C27046k.m66700o(viewFindViewById4);
            View viewFindViewById5 = itemView.findViewById(R$id.profitWithdrawnValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            C27046k.m66700o(viewFindViewById5);
        } else {
            BigDecimal withdrawPnl = d11.getF29936a().getWithdrawPnl();
            Intrinsics.checkNotNull(withdrawPnl);
            if (withdrawPnl.compareTo(BigDecimal.ZERO) == 0) {
                View viewFindViewById6 = itemView.findViewById(R$id.profitWithdrawnTv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                C27046k.m66700o(viewFindViewById6);
                View viewFindViewById7 = itemView.findViewById(R$id.profitWithdrawnValueTv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
                C27046k.m66700o(viewFindViewById7);
            } else {
                View viewFindViewById8 = itemView.findViewById(R$id.profitWithdrawnTv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
                C27046k.m66685H(viewFindViewById8);
                BaseTextView baseTextView3 = (BaseTextView) itemView.findViewById(R$id.profitWithdrawnValueTv);
                Intrinsics.checkNotNull(baseTextView3);
                C27046k.m66685H(baseTextView3);
                BigDecimal withdrawPnl2 = d11.getF29936a().getWithdrawPnl();
                Intrinsics.checkNotNull(withdrawPnl2);
                baseTextView3.setText(ProfitBrieflyObject.m35791l(d11, withdrawPnl2, 0, 0, 6, null));
            }
        }
        if (d11.getF29936a().getTax() != null) {
            BigDecimal tax = d11.getF29936a().getTax();
            Intrinsics.checkNotNull(tax);
            if (tax.compareTo(BigDecimal.ZERO) <= 0) {
                View viewFindViewById9 = itemView.findViewById(R$id.taxTv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
                C27046k.m66700o(viewFindViewById9);
                View viewFindViewById10 = itemView.findViewById(R$id.taxValueTv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
                C27046k.m66700o(viewFindViewById10);
            } else {
                DashTextView dashTextView = (DashTextView) itemView.findViewById(R$id.taxTv);
                Intrinsics.checkNotNull(dashTextView);
                C27046k.m66685H(dashTextView);
                dashTextView.setNeedDash(true);
                C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.kumex.record.h0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfitBrieflyObjectProxy.bindView$lambda$6$lambda$5(itemView);
                    }
                }, 1, null);
                BaseTextView baseTextView4 = (BaseTextView) itemView.findViewById(R$id.taxValueTv);
                Intrinsics.checkNotNull(baseTextView4);
                C27046k.m66685H(baseTextView4);
                BigDecimal tax2 = d11.getF29936a().getTax();
                Intrinsics.checkNotNull(tax2);
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                BigDecimal bigDecimalNegate = ONE.negate();
                Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
                BigDecimal bigDecimalMultiply = tax2.multiply(bigDecimalNegate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                baseTextView4.setText(ProfitBrieflyObject.m35791l(d11, bigDecimalMultiply, 0, 0, 6, null));
            }
        } else {
            View viewFindViewById11 = itemView.findViewById(R$id.taxTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            C27046k.m66700o(viewFindViewById11);
            View viewFindViewById12 = itemView.findViewById(R$id.taxValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            C27046k.m66700o(viewFindViewById12);
        }
        if (Intrinsics.areEqual(d11.getF29936a().getCloseType(), "CLOSE") || C41014a.m89919D(C41014a.m89922G(d11.getF29936a().getLiquidAmount(), null, 1, null))) {
            View viewFindViewById13 = itemView.findViewById(R$id.liquidationTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
            C27046k.m66700o(viewFindViewById13);
            View viewFindViewById14 = itemView.findViewById(R$id.liquidationValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
            C27046k.m66700o(viewFindViewById14);
        } else {
            DashTextView dashTextView2 = (DashTextView) itemView.findViewById(R$id.liquidationTv);
            Intrinsics.checkNotNull(dashTextView2);
            C27046k.m66685H(dashTextView2);
            dashTextView2.setNeedDash(true);
            C27046k.m66711z(dashTextView2, 0L, new Function0() { // from class: com.kubi.kumex.record.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfitBrieflyObjectProxy.bindView$lambda$9$lambda$8(itemView);
                }
            }, 1, null);
            BaseTextView baseTextView5 = (BaseTextView) itemView.findViewById(R$id.liquidationValueTv);
            Intrinsics.checkNotNull(baseTextView5);
            C27046k.m66685H(baseTextView5);
            BigDecimal liquidAmount = d11.getF29936a().getLiquidAmount();
            Intrinsics.checkNotNull(liquidAmount);
            BigDecimal ONE2 = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
            BigDecimal bigDecimalNegate2 = ONE2.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            BigDecimal bigDecimalMultiply2 = liquidAmount.multiply(bigDecimalNegate2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            baseTextView5.setText(ProfitBrieflyObject.m35791l(d11, bigDecimalMultiply2, 0, 0, 6, null));
        }
        ((BaseTextView) itemView.findViewById(R$id.realizedPnlValueTv)).setText(d11.getF30285i());
        if (d11.getF30286j() == null) {
            View viewFindViewById15 = itemView.findViewById(R$id.realizedPnlRateTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
            C27046k.m66700o(viewFindViewById15);
            View viewFindViewById16 = itemView.findViewById(R$id.realizedPnlRateValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
            C27046k.m66700o(viewFindViewById16);
        } else {
            View viewFindViewById17 = itemView.findViewById(R$id.realizedPnlRateTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
            C27046k.m66685H(viewFindViewById17);
            BaseTextView baseTextView6 = (BaseTextView) itemView.findViewById(R$id.realizedPnlRateValueTv);
            Intrinsics.checkNotNull(baseTextView6);
            C27046k.m66685H(baseTextView6);
            baseTextView6.setText(d11.getF30286j());
        }
        if (d11.getF29936a().getCloseType() == null || Intrinsics.areEqual(d11.getF29936a().getCloseType(), "CLOSE")) {
            View viewFindViewById18 = itemView.findViewById(R$id.liquidationDetailsCl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
            C27046k.m66700o(viewFindViewById18);
            return;
        }
        if (!Intrinsics.areEqual(d11.getF29936a().getMarginMode(), "CROSS")) {
            if (d11.m35298d() == null || d11.getF29936a().getLiquidPrice() == null) {
                View viewFindViewById19 = itemView.findViewById(R$id.liquidationDetailsCl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
                C27046k.m66700o(viewFindViewById19);
                return;
            }
            View viewFindViewById20 = itemView.findViewById(R$id.liquidationDetailsCl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
            C27046k.m66685H(viewFindViewById20);
            BaseTextView baseTextView7 = (BaseTextView) itemView.findViewById(R$id.liquidationDescTv);
            Context context = itemView.getContext();
            int i12 = R$string.kumex_isolated_pnl_liq_des_detail;
            C27096v0 f30284h = d11.getF30284h();
            BigDecimal liquidPrice = d11.getF29936a().getLiquidPrice();
            Intrinsics.checkNotNull(liquidPrice);
            baseTextView7.setText(context.getString(i12, f30284h, C17054k0.m36540n(liquidPrice, d11.getF29937b(), d11.getF29936a().isBuy() ? "buy" : "sell", false, false, 12, null), d11.getF30284h(), String.valueOf(d11.m35298d())));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(baseTextView7);
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(baseTextView7, new Pair(textTagEnum, new StyleSpan(1)), new Pair(textTagEnum, new ForegroundColorSpan(ContextCompat.getColor(itemView.getContext(), R$color.c_text))));
            BaseTextView baseTextView8 = (BaseTextView) itemView.findViewById(R$id.viewMoreTv);
            baseTextView8.setText(new C27096v0().m66908h(itemView.getContext().getString(R$string.view_more)));
            Intrinsics.checkNotNull(baseTextView8);
            C27046k.m66711z(baseTextView8, 0L, new Function0() { // from class: com.kubi.kumex.record.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfitBrieflyObjectProxy.bindView$lambda$17$lambda$16();
                }
            }, 1, null);
            return;
        }
        if (d11.getF29936a().getLeverage() == null || d11.m35298d() == null || d11.getF29936a().getLiquidPrice() == null) {
            View viewFindViewById21 = itemView.findViewById(R$id.liquidationDetailsCl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
            C27046k.m66700o(viewFindViewById21);
            return;
        }
        View viewFindViewById22 = itemView.findViewById(R$id.liquidationDetailsCl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        C27046k.m66685H(viewFindViewById22);
        BaseTextView baseTextView9 = (BaseTextView) itemView.findViewById(R$id.liquidationDescTv);
        Context context2 = itemView.getContext();
        int i13 = R$string.kumex_cross_pnl_liq_des_detail;
        C27096v0 f30284h2 = d11.getF30284h();
        BigDecimal liquidPrice2 = d11.getF29936a().getLiquidPrice();
        if (liquidPrice2 != null) {
            strM36540n = C17054k0.m36540n(liquidPrice2, d11.getF29937b(), d11.getF29936a().isBuy() ? "buy" : "sell", false, false, 12, null);
        }
        String strM92647l = C42180b.m92647l(strM36540n);
        C27096v0 f30284h3 = d11.getF30284h();
        String strValueOf = String.valueOf(d11.m35298d());
        BigDecimal leverage = d11.getF29936a().getLeverage();
        Intrinsics.checkNotNull(leverage);
        baseTextView9.setText(context2.getString(i13, f30284h2, strM92647l, f30284h3, strValueOf, C42180b.m92640e(leverage, RoundingMode.HALF_UP, 2, true, true, false, 0, null, 112, null)));
        int color = ContextCompat.getColor(itemView.getContext(), R$color.c_text);
        HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView9);
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum2, new StyleSpan(1));
        Pair pair2 = new Pair(textTagEnum2, new ForegroundColorSpan(color));
        HighlightTextHelper.TextTagEnum textTagEnum3 = HighlightTextHelper.TextTagEnum.SPAN1;
        highlightTextHelper2.m54120f(baseTextView9, pair, pair2, new Pair(textTagEnum3, new StyleSpan(1)), new Pair(textTagEnum3, new ForegroundColorSpan(color)));
        BaseTextView baseTextView10 = (BaseTextView) itemView.findViewById(R$id.viewMoreTv);
        baseTextView10.setText(new C27096v0().m66908h(itemView.getContext().getString(R$string.view_more)));
        Intrinsics.checkNotNull(baseTextView10);
        C27046k.m66711z(baseTextView10, 0L, new Function0() { // from class: com.kubi.kumex.record.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitBrieflyObjectProxy.bindView$lambda$14$lambda$13();
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<CommonEmptyObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<CommonEmptyObject> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_profit_detail_brief, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
