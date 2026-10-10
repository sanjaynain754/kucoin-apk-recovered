package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.tradeType.CouponsPanelView;
import com.kubi.futures.trade.submit.panel.tradeType.TrialPanelView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfCheckTextView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfPercentView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.o4 */
/* JADX INFO: compiled from: BkumexTriggerMarketInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36816o4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80737a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80738b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80739c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CouponsPanelView f80740d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f80741e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTradeNumAbInputView f80742f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final InputPanelOfPercentView f80743g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final InputPanelOfCheckTextView f80744h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TrialPanelView f80745i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcTradeNumAbInputView f80746j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36816o4 m82493a(@NonNull View view) {
        CouponsPanelView couponsPanelViewFindChildViewById;
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        TrialPanelView trialPanelViewFindChildViewById;
        int i11 = R$id.availableLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.availableValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null && (couponsPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.coupons))) != null) {
                i11 = R$id.delegatePrice;
                KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                if (kcTradeNumAbInputView != null) {
                    i11 = R$id.delegationAmount;
                    KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView2 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null) {
                        i11 = R$id.triggerPrice;
                        KcTradeNumAbInputView kcTradeNumAbInputView3 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                        if (kcTradeNumAbInputView3 != null) {
                            return new C36816o4((ConstraintLayout) view, baseTextView, baseTextView2, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, kcTradeNumAbInputView2, inputPanelOfPercentViewFindChildViewById, inputPanelOfCheckTextViewFindChildViewById, trialPanelViewFindChildViewById, kcTradeNumAbInputView3);
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
        return this.f80737a;
    }

    public C36816o4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull TrialPanelView trialPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView3) {
        this.f80737a = constraintLayout;
        this.f80738b = baseTextView;
        this.f80739c = baseTextView2;
        this.f80740d = couponsPanelView;
        this.f80741e = kcTradeNumAbInputView;
        this.f80742f = kcTradeNumAbInputView2;
        this.f80743g = inputPanelOfPercentView;
        this.f80744h = inputPanelOfCheckTextView;
        this.f80745i = trialPanelView;
        this.f80746j = kcTradeNumAbInputView3;
    }
}
