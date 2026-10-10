package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfCheckTextView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;

/* JADX INFO: renamed from: dm.k4 */
/* JADX INFO: compiled from: BkumexSegmentInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36792k4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80406a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80407b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80408c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f80409d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f80410e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80411f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f80412g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcTradeNumAbInputView f80413h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f80414i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f80415j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f80416k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80417l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcTradeNumAbInputView f80418m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KcTradeNumAbInputView f80419n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcTradeNumAbInputView f80420o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final InputPanelOfCheckTextView f80421p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36792k4 m82444a(@NonNull View view) {
        InputPanelOfCheckTextView inputPanelOfCheckTextViewFindChildViewById;
        int i11 = R$id.availableLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.availableValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.avgPriceLabel;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.avgPriceLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.avgPriceValue;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.delegationAmount;
                            KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                            if (kcTradeNumAbInputView != null) {
                                i11 = R$id.distributionCard;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.distributionLabel;
                                    DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView2 != null) {
                                        i11 = R$id.distributionRow;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = R$id.distributionValue;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.orderCount;
                                                KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                                if (kcTradeNumAbInputView2 != null) {
                                                    i11 = R$id.priceMax;
                                                    KcTradeNumAbInputView kcTradeNumAbInputView3 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                                    if (kcTradeNumAbInputView3 != null) {
                                                        i11 = R$id.priceMin;
                                                        KcTradeNumAbInputView kcTradeNumAbInputView4 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                                                        if (kcTradeNumAbInputView4 != null && (inputPanelOfCheckTextViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.reduceToggle))) != null) {
                                                            return new C36792k4(constraintLayout, baseTextView, baseTextView2, dashTextView, linearLayout, baseTextView3, constraintLayout, kcTradeNumAbInputView, linearLayout2, dashTextView2, linearLayout3, baseTextView4, kcTradeNumAbInputView2, kcTradeNumAbInputView3, kcTradeNumAbInputView4, inputPanelOfCheckTextViewFindChildViewById);
                                                        }
                                                    }
                                                }
                                            }
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
        return this.f80406a;
    }

    public C36792k4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView3, @NonNull ConstraintLayout constraintLayout2, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull LinearLayout linearLayout2, @NonNull DashTextView dashTextView2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView4, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView3, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView4, @NonNull InputPanelOfCheckTextView inputPanelOfCheckTextView) {
        this.f80406a = constraintLayout;
        this.f80407b = baseTextView;
        this.f80408c = baseTextView2;
        this.f80409d = dashTextView;
        this.f80410e = linearLayout;
        this.f80411f = baseTextView3;
        this.f80412g = constraintLayout2;
        this.f80413h = kcTradeNumAbInputView;
        this.f80414i = linearLayout2;
        this.f80415j = dashTextView2;
        this.f80416k = linearLayout3;
        this.f80417l = baseTextView4;
        this.f80418m = kcTradeNumAbInputView2;
        this.f80419n = kcTradeNumAbInputView3;
        this.f80420o = kcTradeNumAbInputView4;
        this.f80421p = inputPanelOfCheckTextView;
    }
}
