package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.tradeType.CouponsPanelView;
import com.kubi.futures.trade.submit.panel.tradeType.TrialPanelView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfCheckTextView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfLimitTakerStopView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfPercentView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.w3 */
/* JADX INFO: compiled from: BkumexHiddenInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36863w3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81282a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81283b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81284c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CouponsPanelView f81285d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f81286e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTradeNumAbInputView f81287f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final InputPanelOfPercentView f81288g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final InputPanelOfCheckTextView f81289h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcTradeNumAbInputView f81290i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81291j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final InputPanelOfLimitTakerStopView f81292k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TrialPanelView f81293l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36863w3 m82591a(@NonNull View view) {
        CouponsPanelView couponsPanelViewFindChildViewById;
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        InputPanelOfLimitTakerStopView inputPanelOfLimitTakerStopViewFindChildViewById;
        TrialPanelView trialPanelViewFindChildViewById;
        int i11 = R$id.availableLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.availableValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null && (couponsPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.coupons))) != null) {
                i11 = R$id.delegationAmount;
                KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                if (kcTradeNumAbInputView != null) {
                    i11 = R$id.delegationPrice;
                    KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView2 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null) {
                        i11 = R$id.showAmount;
                        KcTradeNumAbInputView kcTradeNumAbInputView3 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                        if (kcTradeNumAbInputView3 != null) {
                            i11 = R$id.showLabel;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null && (inputPanelOfLimitTakerStopViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.takerStop))) != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null) {
                                return new C36863w3((ConstraintLayout) view, baseTextView, baseTextView2, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, kcTradeNumAbInputView2, inputPanelOfPercentViewFindChildViewById, inputPanelOfCheckTextViewFindChildViewById, kcTradeNumAbInputView3, baseTextView3, inputPanelOfLimitTakerStopViewFindChildViewById, trialPanelViewFindChildViewById);
                            }
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
        return this.f81282a;
    }

    public C36863w3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView3, @NonNull BaseTextView baseTextView3, @NonNull InputPanelOfLimitTakerStopView inputPanelOfLimitTakerStopView, @NonNull TrialPanelView trialPanelView) {
        this.f81282a = constraintLayout;
        this.f81283b = baseTextView;
        this.f81284c = baseTextView2;
        this.f81285d = couponsPanelView;
        this.f81286e = kcTradeNumAbInputView;
        this.f81287f = kcTradeNumAbInputView2;
        this.f81288g = inputPanelOfPercentView;
        this.f81289h = inputPanelOfCheckTextView;
        this.f81290i = kcTradeNumAbInputView3;
        this.f81291j = baseTextView3;
        this.f81292k = inputPanelOfLimitTakerStopView;
        this.f81293l = trialPanelView;
    }
}
