package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.i0 */
/* JADX INFO: compiled from: TradeCoreItemDelegationViewBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45387i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102137a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FlexboxLayout f102138b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final DashTextView f102139c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f102140d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102141e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102142f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f102143g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f102144h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102145i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102146j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102147k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f102148l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102149m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f102150n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f102151o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102152p;

    public C45387i0(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull ShowHideTextView showHideTextView5, @NonNull BaseTextView baseTextView8) {
        this.f102137a = constraintLayout;
        this.f102138b = flexboxLayout;
        this.f102139c = dashTextView;
        this.f102140d = showHideTextView;
        this.f102141e = baseTextView;
        this.f102142f = baseTextView2;
        this.f102143g = showHideTextView2;
        this.f102144h = showHideTextView3;
        this.f102145i = baseTextView3;
        this.f102146j = baseTextView4;
        this.f102147k = baseTextView5;
        this.f102148l = showHideTextView4;
        this.f102149m = baseTextView6;
        this.f102150n = baseTextView7;
        this.f102151o = showHideTextView5;
        this.f102152p = baseTextView8;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45387i0 m100308a(@NonNull View view) {
        int i11 = R$id.fl_trade_type;
        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
        if (flexboxLayout != null) {
            i11 = R$id.tv_amount_type;
            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
            if (dashTextView != null) {
                i11 = R$id.tv_average_price;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.tv_avg_price_label;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvDealAndTotalAmount;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvDealPercent;
                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView2 != null) {
                                i11 = R$id.tv_delegation_price;
                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView3 != null) {
                                    i11 = R$id.tv_delegation_price_label;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_hide;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_status;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_time;
                                                ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView4 != null) {
                                                    i11 = R$id.tv_trade_pair;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tv_trade_type;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.tv_trigger_price;
                                                            ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView5 != null) {
                                                                i11 = R$id.tv_trigger_price_title;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    return new C45387i0((ConstraintLayout) view, flexboxLayout, dashTextView, showHideTextView, baseTextView, baseTextView2, showHideTextView2, showHideTextView3, baseTextView3, baseTextView4, baseTextView5, showHideTextView4, baseTextView6, baseTextView7, showHideTextView5, baseTextView8);
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
    public ConstraintLayout getRoot() {
        return this.f102137a;
    }
}
