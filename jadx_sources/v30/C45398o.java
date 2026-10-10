package v30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;

/* JADX INFO: renamed from: v30.o */
/* JADX INFO: compiled from: CoreOrderDetailHeaderLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45398o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102240a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102241b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102242c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FlexboxLayout f102243d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FlexboxLayout f102244e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FlexboxLayout f102245f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RelativeLayout f102246g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RelativeLayout f102247h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102248i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102249j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f102250k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102251l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f102252m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f102253n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f102254o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ShowHideTextView f102255p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f102256q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102257r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f102258s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102259t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final DashTextView f102260u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final AlignTopTextView f102261v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ShowHideTextView f102262w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final ShowHideTextView f102263x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f102264y;

    public C45398o(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull FlexboxLayout flexboxLayout, @NonNull FlexboxLayout flexboxLayout2, @NonNull FlexboxLayout flexboxLayout3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull ShowHideTextView showHideTextView5, @NonNull ShowHideTextView showHideTextView6, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView7, @NonNull BaseTextView baseTextView5, @NonNull DashTextView dashTextView, @NonNull AlignTopTextView alignTopTextView, @NonNull ShowHideTextView showHideTextView8, @NonNull ShowHideTextView showHideTextView9, @NonNull BaseTextView baseTextView6) {
        this.f102240a = linearLayout;
        this.f102241b = view;
        this.f102242c = view2;
        this.f102243d = flexboxLayout;
        this.f102244e = flexboxLayout2;
        this.f102245f = flexboxLayout3;
        this.f102246g = relativeLayout;
        this.f102247h = relativeLayout2;
        this.f102248i = baseTextView;
        this.f102249j = baseTextView2;
        this.f102250k = showHideTextView;
        this.f102251l = baseTextView3;
        this.f102252m = showHideTextView2;
        this.f102253n = showHideTextView3;
        this.f102254o = showHideTextView4;
        this.f102255p = showHideTextView5;
        this.f102256q = showHideTextView6;
        this.f102257r = baseTextView4;
        this.f102258s = showHideTextView7;
        this.f102259t = baseTextView5;
        this.f102260u = dashTextView;
        this.f102261v = alignTopTextView;
        this.f102262w = showHideTextView8;
        this.f102263x = showHideTextView9;
        this.f102264y = baseTextView6;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45398o m100331c(@NonNull LayoutInflater layoutInflater) {
        return m100332d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45398o m100330a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.dividerHeaderSection))) != null) {
            i11 = R$id.fl_amount;
            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
            if (flexboxLayout != null) {
                i11 = R$id.fl_trade_price;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                if (flexboxLayout2 != null) {
                    i11 = R$id.fl_trade_type;
                    FlexboxLayout flexboxLayout3 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                    if (flexboxLayout3 != null) {
                        i11 = R$id.rl_stop_price;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                        if (relativeLayout != null) {
                            i11 = R$id.rlTax;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                            if (relativeLayout2 != null) {
                                i11 = R$id.tv1;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv2;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_amount;
                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView != null) {
                                            i11 = R$id.tv_amount_name;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_avg_price;
                                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView2 != null) {
                                                    i11 = R$id.tv_deal_amount;
                                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (showHideTextView3 != null) {
                                                        i11 = R$id.tv_deal_vol;
                                                        ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView4 != null) {
                                                            i11 = R$id.tv_do_price;
                                                            ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView5 != null) {
                                                                i11 = R$id.tv_fee;
                                                                ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (showHideTextView6 != null) {
                                                                    i11 = R$id.tv_hide;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.tv_price;
                                                                        ShowHideTextView showHideTextView7 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView7 != null) {
                                                                            i11 = R$id.tv_price_name;
                                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView5 != null) {
                                                                                i11 = R$id.tv_status;
                                                                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (dashTextView != null) {
                                                                                    i11 = R$id.tv_symbols;
                                                                                    AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (alignTopTextView != null) {
                                                                                        i11 = R$id.tv_tax;
                                                                                        ShowHideTextView showHideTextView8 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (showHideTextView8 != null) {
                                                                                            i11 = R$id.tv_time;
                                                                                            ShowHideTextView showHideTextView9 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (showHideTextView9 != null) {
                                                                                                i11 = R$id.tv_trade_type;
                                                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView6 != null) {
                                                                                                    return new C45398o((LinearLayout) view, viewFindChildViewById2, viewFindChildViewById, flexboxLayout, flexboxLayout2, flexboxLayout3, relativeLayout, relativeLayout2, baseTextView, baseTextView2, showHideTextView, baseTextView3, showHideTextView2, showHideTextView3, showHideTextView4, showHideTextView5, showHideTextView6, baseTextView4, showHideTextView7, baseTextView5, dashTextView, alignTopTextView, showHideTextView8, showHideTextView9, baseTextView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C45398o m100332d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.core_order_detail_header_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100330a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102240a;
    }
}
