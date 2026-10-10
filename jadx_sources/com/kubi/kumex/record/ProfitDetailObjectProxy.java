package com.kubi.kumex.record;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import fm.C37567b;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitDetailObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/record/ProfitDetailObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/record/CommonEmptyObject;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProfitDetailObjectProxy extends ViewHolderProxy<ProfitDetailObject> {

    @Nullable
    private final ItemCallBack<CommonEmptyObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<CommonEmptyObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitDetailObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<CommonEmptyObject> itemCallBack, @Nullable ItemCallBack<CommonEmptyObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull ProfitDetailObject d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (d11.m35809l()) {
            View viewFindViewById = itemView.findViewById(R$id.lineView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66700o(viewFindViewById);
        } else {
            View viewFindViewById2 = itemView.findViewById(R$id.lineView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66685H(viewFindViewById2);
        }
        BaseTextView baseTextView = (BaseTextView) itemView.findViewById(R$id.closeTypeTv);
        String strM35804g = d11.m35804g();
        if (strM35804g == null) {
            strM35804g = d11.m35805h();
        }
        baseTextView.setText(strM35804g);
        ((BaseTextView) itemView.findViewById(R$id.settleTimeTv)).setText(d11.getF30318e());
        BaseTextView baseTextView2 = (BaseTextView) itemView.findViewById(R$id.dealAmountLabel);
        if (d11.m35800c() == null) {
            Intrinsics.checkNotNull(baseTextView2);
            C27046k.m66700o(baseTextView2);
            View viewFindViewById3 = itemView.findViewById(R$id.dealAmountValue);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66700o(viewFindViewById3);
        } else {
            Intrinsics.checkNotNull(baseTextView2);
            C27046k.m66685H(baseTextView2);
            ShowHideTextView showHideTextView = (ShowHideTextView) itemView.findViewById(R$id.dealAmountValue);
            Intrinsics.checkNotNull(showHideTextView);
            C27046k.m66685H(showHideTextView);
            showHideTextView.setText(d11.m35800c());
        }
        if (Intrinsics.areEqual(d11.getDetail().getType(), "LIQUIDATION")) {
            baseTextView2.setText(itemView.getContext().getString(R$string.kumex_pnln_liq_amount));
        } else {
            baseTextView2.setText(itemView.getContext().getString(R$string.deal_amount));
        }
        if (!d11.getF30321h() || d11.getDetail().getLiquidAmount() == null) {
            View viewFindViewById4 = itemView.findViewById(R$id.liquidationPriceLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            C27046k.m66700o(viewFindViewById4);
            View viewFindViewById5 = itemView.findViewById(R$id.liquidationValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            C27046k.m66700o(viewFindViewById5);
        } else {
            View viewFindViewById6 = itemView.findViewById(R$id.liquidationPriceLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            C27046k.m66685H(viewFindViewById6);
            ShowHideTextView showHideTextView2 = (ShowHideTextView) itemView.findViewById(R$id.liquidationValueTv);
            Intrinsics.checkNotNull(showHideTextView2);
            C27046k.m66685H(showHideTextView2);
            BigDecimal liquidAmount = d11.getDetail().getLiquidAmount();
            Intrinsics.checkNotNull(liquidAmount);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalNegate = ONE.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            BigDecimal bigDecimalMultiply = liquidAmount.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            showHideTextView2.setText(d11.m35806i(bigDecimalMultiply));
        }
        BaseTextView baseTextView3 = (BaseTextView) itemView.findViewById(R$id.dealPriceLabel);
        int i11 = R$id.dealPriceValue;
        ShowHideTextView showHideTextView3 = (ShowHideTextView) itemView.findViewById(i11);
        if (d11.getDetail().getPrice() == null) {
            Intrinsics.checkNotNull(baseTextView3);
            C27046k.m66700o(baseTextView3);
            View viewFindViewById7 = itemView.findViewById(i11);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            C27046k.m66700o(viewFindViewById7);
        } else {
            Intrinsics.checkNotNull(baseTextView3);
            C27046k.m66685H(baseTextView3);
            Intrinsics.checkNotNull(showHideTextView3);
            C27046k.m66685H(showHideTextView3);
            if (Intrinsics.areEqual(d11.getDetail().getType(), "LIQUIDATION")) {
                baseTextView3.setText(itemView.getContext().getString(R$string.force_close_price));
                BigDecimal price = d11.getDetail().getPrice();
                Intrinsics.checkNotNull(price);
                showHideTextView3.setText(C17054k0.m36540n(price, d11.getF30317d(), d11.getRecord().isBuy() ? "buy" : "sell", false, false, 12, null));
            } else {
                baseTextView3.setText(itemView.getContext().getString(R$string.deal_price));
                BigDecimal price2 = d11.getDetail().getPrice();
                Intrinsics.checkNotNull(price2);
                ContractEntity f30317d = d11.getF30317d();
                showHideTextView3.setText(C42180b.m92640e(price2, null, C27039d.m66650j(f30317d != null ? Integer.valueOf(C37567b.m84618h(f30317d)) : null), true, true, false, 0, null, 113, null));
            }
        }
        if (d11.getF30319f() || d11.getF30320g().compareTo(BigDecimal.ZERO) != 0) {
            View viewFindViewById8 = itemView.findViewById(R$id.pnlLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            C27046k.m66685H(viewFindViewById8);
            ShowHideTextView showHideTextView4 = (ShowHideTextView) itemView.findViewById(R$id.pnlValueTv);
            Intrinsics.checkNotNull(showHideTextView4);
            C27046k.m66685H(showHideTextView4);
            showHideTextView4.setText(d11.m35806i(d11.getF30320g()));
        } else {
            View viewFindViewById9 = itemView.findViewById(R$id.pnlLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            C27046k.m66700o(viewFindViewById9);
            View viewFindViewById10 = itemView.findViewById(R$id.pnlValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            C27046k.m66700o(viewFindViewById10);
        }
        if (d11.getDetail().getDealComm() == null) {
            View viewFindViewById11 = itemView.findViewById(R$id.feesLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            C27046k.m66700o(viewFindViewById11);
            View viewFindViewById12 = itemView.findViewById(R$id.feesValue);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            C27046k.m66700o(viewFindViewById12);
        } else {
            View viewFindViewById13 = itemView.findViewById(R$id.feesLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
            C27046k.m66685H(viewFindViewById13);
            ShowHideTextView showHideTextView5 = (ShowHideTextView) itemView.findViewById(R$id.feesValue);
            Intrinsics.checkNotNull(showHideTextView5);
            C27046k.m66685H(showHideTextView5);
            BigDecimal dealComm = d11.getDetail().getDealComm();
            Intrinsics.checkNotNull(dealComm);
            BigDecimal ONE2 = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
            BigDecimal bigDecimalNegate2 = ONE2.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            BigDecimal bigDecimalMultiply2 = dealComm.multiply(bigDecimalNegate2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            showHideTextView5.setText(d11.m35806i(bigDecimalMultiply2));
        }
        if (C41014a.m89922G(d11.getRecord().getTax(), null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
            View viewFindViewById14 = itemView.findViewById(R$id.taxLabelTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
            C27046k.m66700o(viewFindViewById14);
            View viewFindViewById15 = itemView.findViewById(R$id.taxValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
            C27046k.m66700o(viewFindViewById15);
            return;
        }
        View viewFindViewById16 = itemView.findViewById(R$id.taxLabelTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        C27046k.m66685H(viewFindViewById16);
        ShowHideTextView showHideTextView6 = (ShowHideTextView) itemView.findViewById(R$id.taxValueTv);
        Intrinsics.checkNotNull(showHideTextView6);
        C27046k.m66685H(showHideTextView6);
        BigDecimal bigDecimalM89922G = C41014a.m89922G(d11.getDetail().getTax(), null, 1, null);
        BigDecimal ONE3 = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE3, "ONE");
        BigDecimal bigDecimalNegate3 = ONE3.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate3, "negate(...)");
        BigDecimal bigDecimalMultiply3 = bigDecimalM89922G.multiply(bigDecimalNegate3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        showHideTextView6.setText(d11.m35806i(bigDecimalMultiply3));
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
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_profit_detail_record, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
