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
import com.kubi.futures.trade.submit.panel.view.InputPanelTimeInputView;
import com.kubi.futures.trade.submit.panel.view.twap.InputPanelOfTwapAdvanceView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.t4 */
/* JADX INFO: compiled from: BkumexTwapInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36846t4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81075a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InputPanelOfCheckTextView f81076b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81077c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81078d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CouponsPanelView f81079e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTradeNumAbInputView f81080f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81081g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81082h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81083i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final InputPanelOfPercentView f81084j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final InputPanelOfCheckTextView f81085k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81086l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final InputPanelTimeInputView f81087m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TrialPanelView f81088n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final InputPanelOfTwapAdvanceView f81089o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36846t4 m82557a(@NonNull View view) {
        CouponsPanelView couponsPanelViewFindChildViewById;
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        InputPanelTimeInputView inputPanelTimeInputViewFindChildViewById;
        TrialPanelView trialPanelViewFindChildViewById;
        InputPanelOfTwapAdvanceView inputPanelOfTwapAdvanceViewFindChildViewById;
        int i11 = R$id.advanceToggle;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (inputPanelOfCheckTextViewFindChildViewById2 != null) {
            i11 = R$id.availableLabel;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.availableValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null && (couponsPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.coupons))) != null) {
                    i11 = R$id.delegationAmount;
                    KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView != null) {
                        i11 = R$id.fourHoursTv;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.halfHourTv;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.oneHourTv;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null) {
                                    i11 = R$id.tenMinTv;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null && (inputPanelTimeInputViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.totalTimeInputView))) != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null && (inputPanelOfTwapAdvanceViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.twapAdvanceSettingView))) != null) {
                                        return new C36846t4((ConstraintLayout) view, inputPanelOfCheckTextViewFindChildViewById2, baseTextView, baseTextView2, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, baseTextView3, baseTextView4, baseTextView5, inputPanelOfPercentViewFindChildViewById, inputPanelOfCheckTextViewFindChildViewById, baseTextView6, inputPanelTimeInputViewFindChildViewById, trialPanelViewFindChildViewById, inputPanelOfTwapAdvanceViewFindChildViewById);
                                    }
                                }
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
        return this.f81075a;
    }

    public C36846t4(@NonNull ConstraintLayout constraintLayout, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView2, @NonNull BaseTextView baseTextView6, @NonNull InputPanelTimeInputView inputPanelTimeInputView, @NonNull TrialPanelView trialPanelView, @NonNull InputPanelOfTwapAdvanceView inputPanelOfTwapAdvanceView) {
        this.f81075a = constraintLayout;
        this.f81076b = inputPanelOfCheckTextView;
        this.f81077c = baseTextView;
        this.f81078d = baseTextView2;
        this.f81079e = couponsPanelView;
        this.f81080f = kcTradeNumAbInputView;
        this.f81081g = baseTextView3;
        this.f81082h = baseTextView4;
        this.f81083i = baseTextView5;
        this.f81084j = inputPanelOfPercentView;
        this.f81085k = inputPanelOfCheckTextView2;
        this.f81086l = baseTextView6;
        this.f81087m = inputPanelTimeInputView;
        this.f81088n = trialPanelView;
        this.f81089o = inputPanelOfTwapAdvanceView;
    }
}
