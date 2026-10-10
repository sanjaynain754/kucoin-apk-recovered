package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;

/* JADX INFO: renamed from: dp.m0 */
/* JADX INFO: compiled from: BmarginIncludeTradeInputDebtBorrowBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36926m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81817a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f81818b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f81819c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f81820d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f81821e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f81822f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f81823g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f81824h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f81825i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FixAutoSizeTextView f81826j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FixAutoSizeTextView f81827k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f81828l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f81829m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81830n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FixAutoSizeTextView f81831o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final FixAutoSizeTextView f81832p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f81833q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final DashTextView f81834r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final FixAutoSizeTextView f81835s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final FixAutoSizeTextView f81836t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final DashTextView f81837u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final DashTextView f81838v;

    public C36926m0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView2, @NonNull DashTextView dashTextView, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView3, @NonNull FixAutoSizeTextView fixAutoSizeTextView4, @NonNull DashTextView dashTextView3, @NonNull DashTextView dashTextView4, @NonNull FixAutoSizeTextView fixAutoSizeTextView5, @NonNull FixAutoSizeTextView fixAutoSizeTextView6, @NonNull DashTextView dashTextView5, @NonNull DashTextView dashTextView6) {
        this.f81817a = linearLayout;
        this.f81818b = linearLayout2;
        this.f81819c = linearLayout3;
        this.f81820d = linearLayout4;
        this.f81821e = linearLayout5;
        this.f81822f = linearLayout6;
        this.f81823g = linearLayout7;
        this.f81824h = linearLayout8;
        this.f81825i = linearLayout9;
        this.f81826j = fixAutoSizeTextView;
        this.f81827k = fixAutoSizeTextView2;
        this.f81828l = dashTextView;
        this.f81829m = dashTextView2;
        this.f81830n = baseTextView;
        this.f81831o = fixAutoSizeTextView3;
        this.f81832p = fixAutoSizeTextView4;
        this.f81833q = dashTextView3;
        this.f81834r = dashTextView4;
        this.f81835s = fixAutoSizeTextView5;
        this.f81836t = fixAutoSizeTextView6;
        this.f81837u = dashTextView5;
        this.f81838v = dashTextView6;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36926m0 m82720a(@NonNull View view) {
        int i11 = R$id.flBorrowBase;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.flBorrowQuote;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.flDebtBase;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout3 != null) {
                    i11 = R$id.flDebtQuote;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout4 != null) {
                        i11 = R$id.flRepayBase;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout5 != null) {
                            i11 = R$id.flRepayQuote;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout6 != null) {
                                LinearLayout linearLayout7 = (LinearLayout) view;
                                i11 = R$id.llCoupons;
                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout8 != null) {
                                    i11 = R$id.tv_borrow_amount_base;
                                    FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                    if (fixAutoSizeTextView != null) {
                                        i11 = R$id.tv_borrow_amount_quote;
                                        FixAutoSizeTextView fixAutoSizeTextView2 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                        if (fixAutoSizeTextView2 != null) {
                                            i11 = R$id.tv_borrow_unit_base;
                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView != null) {
                                                i11 = R$id.tv_borrow_unit_quote;
                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView2 != null) {
                                                    i11 = R$id.tvCoupons;
                                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView != null) {
                                                        i11 = R$id.tv_debt_amount_base;
                                                        FixAutoSizeTextView fixAutoSizeTextView3 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (fixAutoSizeTextView3 != null) {
                                                            i11 = R$id.tv_debt_amount_quote;
                                                            FixAutoSizeTextView fixAutoSizeTextView4 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (fixAutoSizeTextView4 != null) {
                                                                i11 = R$id.tv_debt_unit_base;
                                                                DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (dashTextView3 != null) {
                                                                    i11 = R$id.tv_debt_unit_quote;
                                                                    DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (dashTextView4 != null) {
                                                                        i11 = R$id.tv_repay_amount_base;
                                                                        FixAutoSizeTextView fixAutoSizeTextView5 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (fixAutoSizeTextView5 != null) {
                                                                            i11 = R$id.tv_repay_amount_quote;
                                                                            FixAutoSizeTextView fixAutoSizeTextView6 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (fixAutoSizeTextView6 != null) {
                                                                                i11 = R$id.tv_repay_unit_base;
                                                                                DashTextView dashTextView5 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (dashTextView5 != null) {
                                                                                    i11 = R$id.tv_repay_unit_quote;
                                                                                    DashTextView dashTextView6 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (dashTextView6 != null) {
                                                                                        return new C36926m0(linearLayout7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, fixAutoSizeTextView, fixAutoSizeTextView2, dashTextView, dashTextView2, baseTextView, fixAutoSizeTextView3, fixAutoSizeTextView4, dashTextView3, dashTextView4, fixAutoSizeTextView5, fixAutoSizeTextView6, dashTextView5, dashTextView6);
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
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81817a;
    }
}
