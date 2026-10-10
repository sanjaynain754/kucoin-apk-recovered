package v30;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.e0 */
/* JADX INFO: compiled from: KucoinItemDelegationViewSingleBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45379e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102052a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ProgressBar f102053b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f102054c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeImageView f102055d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102056e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102057f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102058g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f102059h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f102060i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102061j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102062k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f102063l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102064m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f102065n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f102066o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f102067p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f102068q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f102069r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final View f102070s;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45379e0 m100288a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.delegation_progressbar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
        if (progressBar != null) {
            i11 = R$id.fl1;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.ivAmendOrder;
                ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                if (shapeImageView != null) {
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
                                                                            return new C45379e0((ConstraintLayout) view, progressBar, constraintLayout, shapeImageView, baseTextView, baseTextView2, baseTextView3, showHideTextView, showHideTextView2, baseTextView4, baseTextView5, showHideTextView3, baseTextView6, showHideTextView4, baseTextView7, baseTextView8, showHideTextView5, baseTextView9, viewFindChildViewById);
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
        return this.f102052a;
    }

    public C45379e0(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout2, @NonNull ShapeImageView shapeImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView6, @NonNull ShowHideTextView showHideTextView4, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull ShowHideTextView showHideTextView5, @NonNull BaseTextView baseTextView9, @NonNull View view) {
        this.f102052a = constraintLayout;
        this.f102053b = progressBar;
        this.f102054c = constraintLayout2;
        this.f102055d = shapeImageView;
        this.f102056e = baseTextView;
        this.f102057f = baseTextView2;
        this.f102058g = baseTextView3;
        this.f102059h = showHideTextView;
        this.f102060i = showHideTextView2;
        this.f102061j = baseTextView4;
        this.f102062k = baseTextView5;
        this.f102063l = showHideTextView3;
        this.f102064m = baseTextView6;
        this.f102065n = showHideTextView4;
        this.f102066o = baseTextView7;
        this.f102067p = baseTextView8;
        this.f102068q = showHideTextView5;
        this.f102069r = baseTextView9;
        this.f102070s = view;
    }
}
