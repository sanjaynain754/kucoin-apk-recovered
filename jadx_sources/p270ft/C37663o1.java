package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmHeaderView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellLivePriceExplainView;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.o1 */
/* JADX INFO: compiled from: PaymentFragmentFastSellConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37663o1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84356a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SellConfirmHeaderView f84357b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SellConfirmInfoView f84358c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C37652m0 f84359d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SellLivePriceExplainView f84360e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PaymentTermView f84361f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f84362g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37663o1 m84910a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.headerView;
        SellConfirmHeaderView sellConfirmHeaderView = (SellConfirmHeaderView) ViewBindings.findChildViewById(view, i11);
        if (sellConfirmHeaderView != null) {
            i11 = R$id.infoView;
            SellConfirmInfoView sellConfirmInfoView = (SellConfirmInfoView) ViewBindings.findChildViewById(view, i11);
            if (sellConfirmInfoView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.merchant_info_card_layout))) != null) {
                C37652m0 c37652m0M84887a = C37652m0.m84887a(viewFindChildViewById);
                i11 = R$id.priceExplainView;
                SellLivePriceExplainView sellLivePriceExplainView = (SellLivePriceExplainView) ViewBindings.findChildViewById(view, i11);
                if (sellLivePriceExplainView != null) {
                    i11 = R$id.termsView;
                    PaymentTermView paymentTermView = (PaymentTermView) ViewBindings.findChildViewById(view, i11);
                    if (paymentTermView != null) {
                        i11 = R$id.tvConfirm;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            return new C37663o1((ConstraintLayout) view, sellConfirmHeaderView, sellConfirmInfoView, c37652m0M84887a, sellLivePriceExplainView, paymentTermView, kcPrimaryButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84356a;
    }

    public C37663o1(@NonNull ConstraintLayout constraintLayout, @NonNull SellConfirmHeaderView sellConfirmHeaderView, @NonNull SellConfirmInfoView sellConfirmInfoView, @NonNull C37652m0 c37652m0, @NonNull SellLivePriceExplainView sellLivePriceExplainView, @NonNull PaymentTermView paymentTermView, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f84356a = constraintLayout;
        this.f84357b = sellConfirmHeaderView;
        this.f84358c = sellConfirmInfoView;
        this.f84359d = c37652m0;
        this.f84360e = sellLivePriceExplainView;
        this.f84361f = paymentTermView;
        this.f84362g = kcPrimaryButton;
    }
}
