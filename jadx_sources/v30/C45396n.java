package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.n */
/* JADX INFO: compiled from: CoreItemDelegationDetailBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45396n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102214a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f102215b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f102216c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f102217d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f102218e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShowHideTextView f102219f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102220g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f102221h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102222i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102223j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f102224k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102225l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f102226m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102227n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f102228o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102229p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f102230q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102231r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f102232s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102233t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f102234u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f102235v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f102236w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45396n m100326a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.ll_counterparty;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout2 != null) {
            i11 = R$id.ll_role;
            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout3 != null) {
                i11 = R$id.llTax;
                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout4 != null) {
                    i11 = R$id.tv_amount;
                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView != null) {
                        i11 = R$id.tv_amount_name;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_counterparty;
                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView2 != null) {
                                i11 = R$id.tv_counterparty_name;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_currency;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_deal_amount;
                                        ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView3 != null) {
                                            i11 = R$id.tv_deal_amount_name;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tv_fee;
                                                ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView4 != null) {
                                                    i11 = R$id.tv_fee_name;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_price;
                                                        ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView5 != null) {
                                                            i11 = R$id.tv_price_name;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.tv_role;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.tv_role_name;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        i11 = R$id.tv_tax;
                                                                        ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView6 != null) {
                                                                            i11 = R$id.tv_tax_currency;
                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView9 != null) {
                                                                                i11 = R$id.tv_tax_name;
                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView10 != null) {
                                                                                    i11 = R$id.tv_time;
                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView11 != null) {
                                                                                        i11 = R$id.tvTimeTag;
                                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView12 != null) {
                                                                                            return new C45396n(linearLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, showHideTextView, baseTextView, showHideTextView2, baseTextView2, baseTextView3, showHideTextView3, baseTextView4, showHideTextView4, baseTextView5, showHideTextView5, baseTextView6, baseTextView7, baseTextView8, showHideTextView6, baseTextView9, baseTextView10, baseTextView11, baseTextView12);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102214a;
    }

    public C45396n(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull ShowHideTextView showHideTextView6, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f102214a = linearLayout;
        this.f102215b = linearLayout2;
        this.f102216c = linearLayout3;
        this.f102217d = linearLayout4;
        this.f102218e = linearLayout5;
        this.f102219f = showHideTextView;
        this.f102220g = baseTextView;
        this.f102221h = showHideTextView2;
        this.f102222i = baseTextView2;
        this.f102223j = baseTextView3;
        this.f102224k = showHideTextView3;
        this.f102225l = baseTextView4;
        this.f102226m = showHideTextView4;
        this.f102227n = baseTextView5;
        this.f102228o = showHideTextView5;
        this.f102229p = baseTextView6;
        this.f102230q = baseTextView7;
        this.f102231r = baseTextView8;
        this.f102232s = showHideTextView6;
        this.f102233t = baseTextView9;
        this.f102234u = baseTextView10;
        this.f102235v = baseTextView11;
        this.f102236w = baseTextView12;
    }
}
