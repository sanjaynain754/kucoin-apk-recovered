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
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.sdk.widget.shape.view.ShapeCheckBox;

/* JADX INFO: renamed from: dm.e4 */
/* JADX INFO: compiled from: BkumexLimitInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36756e4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79959a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79960b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79961c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeCheckBox f79962d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AnimateDrawableEndView f79963e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f79964f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CouponsPanelView f79965g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcTradeNumAbInputView f79966h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcTradeNumAbInputView f79967i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final InputPanelOfPercentView f79968j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final InputPanelOfCheckTextView f79969k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final InputPanelOfLimitTakerStopView f79970l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AnimateDrawableEndView f79971m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TrialPanelView f79972n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36756e4 m82363a(@NonNull View view) {
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        InputPanelOfLimitTakerStopView inputPanelOfLimitTakerStopViewFindChildViewById;
        TrialPanelView trialPanelViewFindChildViewById;
        int i11 = R$id.availableLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.availableValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.bboModel;
                ShapeCheckBox shapeCheckBox = (ShapeCheckBox) ViewBindings.findChildViewById(view, i11);
                if (shapeCheckBox != null) {
                    i11 = R$id.bboType;
                    AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                    if (animateDrawableEndView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.coupons;
                        CouponsPanelView couponsPanelViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
                        if (couponsPanelViewFindChildViewById != null) {
                            i11 = R$id.delegationAmount;
                            KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                            if (kcTradeNumAbInputView != null) {
                                i11 = R$id.delegationPrice;
                                KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                if (kcTradeNumAbInputView2 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null && (inputPanelOfLimitTakerStopViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.takerStop))) != null) {
                                    i11 = R$id.timeInForceType;
                                    AnimateDrawableEndView animateDrawableEndView2 = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                    if (animateDrawableEndView2 != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null) {
                                        return new C36756e4(constraintLayout, baseTextView, baseTextView2, shapeCheckBox, animateDrawableEndView, constraintLayout, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, kcTradeNumAbInputView2, inputPanelOfPercentViewFindChildViewById, inputPanelOfCheckTextViewFindChildViewById, inputPanelOfLimitTakerStopViewFindChildViewById, animateDrawableEndView2, trialPanelViewFindChildViewById);
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
        return this.f79959a;
    }

    public C36756e4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShapeCheckBox shapeCheckBox, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull ConstraintLayout constraintLayout2, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull InputPanelOfLimitTakerStopView inputPanelOfLimitTakerStopView, @NonNull AnimateDrawableEndView animateDrawableEndView2, @NonNull TrialPanelView trialPanelView) {
        this.f79959a = constraintLayout;
        this.f79960b = baseTextView;
        this.f79961c = baseTextView2;
        this.f79962d = shapeCheckBox;
        this.f79963e = animateDrawableEndView;
        this.f79964f = constraintLayout2;
        this.f79965g = couponsPanelView;
        this.f79966h = kcTradeNumAbInputView;
        this.f79967i = kcTradeNumAbInputView2;
        this.f79968j = inputPanelOfPercentView;
        this.f79969k = inputPanelOfCheckTextView;
        this.f79970l = inputPanelOfLimitTakerStopView;
        this.f79971m = animateDrawableEndView2;
        this.f79972n = trialPanelView;
    }
}
