package dm;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.tradeType.CouponsPanelView;
import com.kubi.futures.trade.submit.panel.tradeType.TrialPanelView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfCheckTextView;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfTsoAdvanceView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.p4 */
/* JADX INFO: compiled from: BkumexTsoInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36822p4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80810a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InputPanelOfTsoAdvanceView f80811b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80812c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80813d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioGroup f80814e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CouponsPanelView f80815f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTradeNumAbInputView f80816g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcTradeNumAbInputView f80817h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f80818i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f80819j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RadioButton f80820k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final InputPanelOfCheckTextView f80821l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TrialPanelView f80822m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36822p4 m82506a(@NonNull View view) {
        CouponsPanelView couponsPanelViewFindChildViewById;
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        TrialPanelView trialPanelViewFindChildViewById;
        int i11 = R$id.advanceView;
        InputPanelOfTsoAdvanceView inputPanelOfTsoAdvanceViewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (inputPanelOfTsoAdvanceViewFindChildViewById != null) {
            i11 = R$id.availableLabel;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.availableValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.callback_range_percent;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                    if (radioGroup != null && (couponsPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.coupons))) != null) {
                        i11 = R$id.delegationAmount;
                        KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                        if (kcTradeNumAbInputView != null) {
                            i11 = R$id.et_callback_range;
                            KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                            if (kcTradeNumAbInputView2 != null) {
                                i11 = R$id.percentCallLayout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null) {
                                    i11 = R$id.rb_1;
                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton != null) {
                                        i11 = R$id.rb_5;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton2 != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null && (trialPanelViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.trial))) != null) {
                                            return new C36822p4((ConstraintLayout) view, inputPanelOfTsoAdvanceViewFindChildViewById, baseTextView, baseTextView2, radioGroup, couponsPanelViewFindChildViewById, kcTradeNumAbInputView, kcTradeNumAbInputView2, constraintLayout, radioButton, radioButton2, inputPanelOfCheckTextViewFindChildViewById, trialPanelViewFindChildViewById);
                                        }
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
        return this.f80810a;
    }

    public C36822p4(@NonNull ConstraintLayout constraintLayout, @NonNull InputPanelOfTsoAdvanceView inputPanelOfTsoAdvanceView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull RadioGroup radioGroup, @NonNull CouponsPanelView couponsPanelView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull ConstraintLayout constraintLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView, @NonNull TrialPanelView trialPanelView) {
        this.f80810a = constraintLayout;
        this.f80811b = inputPanelOfTsoAdvanceView;
        this.f80812c = baseTextView;
        this.f80813d = baseTextView2;
        this.f80814e = radioGroup;
        this.f80815f = couponsPanelView;
        this.f80816g = kcTradeNumAbInputView;
        this.f80817h = kcTradeNumAbInputView2;
        this.f80818i = constraintLayout2;
        this.f80819j = radioButton;
        this.f80820k = radioButton2;
        this.f80821l = inputPanelOfCheckTextView;
        this.f80822m = trialPanelView;
    }
}
