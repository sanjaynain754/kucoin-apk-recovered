package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.tradeType.CouponsPanelView;
import com.kubi.futures.trade.submit.panel.tradeType.TrialPanelView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfCheckTextView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfMarketTakerStopView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfPercentView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.g4 */
/* JADX INFO: compiled from: BkumexMarketInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36768g4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80146a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80147b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80148c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CouponsPanelView f80149d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f80150e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80151f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final InputPanelOfPercentView f80152g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final InputPanelOfCheckTextView f80153h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final InputPanelOfMarketTakerStopView f80154i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TrialPanelView f80155j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36768g4 m82391a(@NonNull View view) {
        CouponsPanelView couponsPanelViewFindChildViewById;
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        InputPanelOfMarketTakerStopView inputPanelOfMarketTakerStopViewFindChildViewById;
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
                    i11 = R$id.marketPrice;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null && (inputPanelOfMarketTakerStopViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.takerStop))) != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null) {
                        return new C36768g4((ConstraintLayout) view, baseTextView, baseTextView2, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, baseTextView3, inputPanelOfPercentViewFindChildViewById, inputPanelOfCheckTextViewFindChildViewById, inputPanelOfMarketTakerStopViewFindChildViewById, trialPanelViewFindChildViewById);
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
        return this.f80146a;
    }

    public C36768g4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull BaseTextView baseTextView3, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull InputPanelOfMarketTakerStopView inputPanelOfMarketTakerStopView, @NonNull TrialPanelView trialPanelView) {
        this.f80146a = constraintLayout;
        this.f80147b = baseTextView;
        this.f80148c = baseTextView2;
        this.f80149d = couponsPanelView;
        this.f80150e = kcTradeNumAbInputView;
        this.f80151f = baseTextView3;
        this.f80152g = inputPanelOfPercentView;
        this.f80153h = inputPanelOfCheckTextView;
        this.f80154i = inputPanelOfMarketTakerStopView;
        this.f80155j = trialPanelView;
    }
}
