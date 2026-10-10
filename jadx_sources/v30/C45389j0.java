package v30;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.j0 */
/* JADX INFO: compiled from: TradeCoreItemDelegationViewSingleListBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45389j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102156a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ProgressBar f102157b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f102158c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FlexboxLayout f102159d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102160e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102161f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102162g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f102163h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f102164i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102165j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102166k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f102167l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102168m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f102169n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102170o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102171p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f102172q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102173r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final View f102174s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45389j0 m100312a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.delegation_progressbar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
        if (progressBar != null) {
            i11 = R$id.fl1;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.fl_trade_type;
                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                if (flexboxLayout != null) {
                    i11 = R$id.tv_amount_type;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_cancel_delegation;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvDealAndTotalAmount;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvDealPercent;
                                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView != null) {
                                    i11 = R$id.tv_delegation_price;
                                    ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView2 != null) {
                                        i11 = R$id.tv_delegation_price_label;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_hide;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_limit_price;
                                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView3 != null) {
                                                    i11 = R$id.tv_limit_price_label;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tv_time;
                                                        ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView4 != null) {
                                                            i11 = R$id.tv_trade_pair;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.tv_trade_type;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.tv_trigger_price;
                                                                    ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView5 != null) {
                                                                        i11 = R$id.tv_trigger_price_label;
                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView9 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_dash))) != null) {
                                                                            return new C45389j0((ConstraintLayout) view, progressBar, constraintLayout, flexboxLayout, baseTextView, baseTextView2, baseTextView3, showHideTextView, showHideTextView2, baseTextView4, baseTextView5, showHideTextView3, baseTextView6, showHideTextView4, baseTextView7, baseTextView8, showHideTextView5, baseTextView9, viewFindChildViewById);
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
    public ConstraintLayout getRoot() {
        return this.f102156a;
    }

    public C45389j0(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull FlexboxLayout flexboxLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView6, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull ShowHideTextView showHideTextView5, @NonNull BaseTextView baseTextView9, @NonNull View view) {
        this.f102156a = constraintLayout;
        this.f102157b = progressBar;
        this.f102158c = constraintLayout2;
        this.f102159d = flexboxLayout;
        this.f102160e = baseTextView;
        this.f102161f = baseTextView2;
        this.f102162g = baseTextView3;
        this.f102163h = showHideTextView;
        this.f102164i = showHideTextView2;
        this.f102165j = baseTextView4;
        this.f102166k = baseTextView5;
        this.f102167l = showHideTextView3;
        this.f102168m = baseTextView6;
        this.f102169n = showHideTextView4;
        this.f102170o = baseTextView7;
        this.f102171p = baseTextView8;
        this.f102172q = showHideTextView5;
        this.f102173r = baseTextView9;
        this.f102174s = view;
    }
}
