package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.a0 */
/* JADX INFO: compiled from: IncludeCoreTradeInputBaseQuoteValueBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45371a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f102000a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f102001b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f102002c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f102003d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f102004e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f102005f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f102006g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f102007h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102008i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102009j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102010k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f102011l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f102012m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102013n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102014o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102015p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f102016q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final DashTextView f102017r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f102018s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102019t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f102020u;

    public C45371a0(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull ConstraintLayout constraintLayout6, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView2, @NonNull DashTextView dashTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull DashTextView dashTextView4, @NonNull DashTextView dashTextView5, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f102000a = view;
        this.f102001b = constraintLayout;
        this.f102002c = constraintLayout2;
        this.f102003d = constraintLayout3;
        this.f102004e = constraintLayout4;
        this.f102005f = constraintLayout5;
        this.f102006g = constraintLayout6;
        this.f102007h = dashTextView;
        this.f102008i = baseTextView;
        this.f102009j = baseTextView2;
        this.f102010k = baseTextView3;
        this.f102011l = dashTextView2;
        this.f102012m = dashTextView3;
        this.f102013n = baseTextView4;
        this.f102014o = baseTextView5;
        this.f102015p = baseTextView6;
        this.f102016q = dashTextView4;
        this.f102017r = dashTextView5;
        this.f102018s = baseTextView7;
        this.f102019t = baseTextView8;
        this.f102020u = baseTextView9;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45371a0 m100273a(@NonNull View view) {
        int i11 = R$id.flAvailableTrade;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.flBase;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.flBaseBorrow;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout3 != null) {
                    i11 = R$id.flQuote;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout4 != null) {
                        i11 = R$id.flQuoteBorrow;
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout5 != null) {
                            i11 = R$id.llUnifiedCoupon;
                            ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout6 != null) {
                                i11 = R$id.tvAvailableTradeLabel;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    i11 = R$id.tvAvailableTradeValue;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_base_amount;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tv_base_borrow_amount;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_base_borrow_unit;
                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView2 != null) {
                                                    i11 = R$id.tv_base_unit;
                                                    DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView3 != null) {
                                                        i11 = R$id.tvBaseUnsupported;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            i11 = R$id.tv_quote_amount;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                i11 = R$id.tv_quote_borrow_amount;
                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView6 != null) {
                                                                    i11 = R$id.tv_quote_borrow_unit;
                                                                    DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (dashTextView4 != null) {
                                                                        i11 = R$id.tv_quote_unit;
                                                                        DashTextView dashTextView5 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (dashTextView5 != null) {
                                                                            i11 = R$id.tvQuoteUnsupported;
                                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView7 != null) {
                                                                                i11 = R$id.tvUnifiedCouponLabel;
                                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView8 != null) {
                                                                                    i11 = R$id.tvUnifiedCouponValue;
                                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView9 != null) {
                                                                                        return new C45371a0(view, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, dashTextView, baseTextView, baseTextView2, baseTextView3, dashTextView2, dashTextView3, baseTextView4, baseTextView5, baseTextView6, dashTextView4, dashTextView5, baseTextView7, baseTextView8, baseTextView9);
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
    public View getRoot() {
        return this.f102000a;
    }
}
