package l60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.view.DashBoardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.h */
/* JADX INFO: compiled from: ViewUnifyAccountRiskRatioBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42113h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f93518a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DashBoardView f93519b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f93520c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeImageView f93521d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f93522e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f93523f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f93524g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f93525h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f93526i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeTextView f93527j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final DashTextView f93528k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f93529l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f93530m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f93531n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f93532o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f93533p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ShowHideTextView f93534q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final DashTextView f93535r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final DashTextView f93536s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f93537t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final View f93538u;

    public C42113h(@NonNull LinearLayout linearLayout, @NonNull DashBoardView dashBoardView, @NonNull FrameLayout frameLayout, @NonNull ShapeImageView shapeImageView, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull ShapeTextView shapeTextView, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView3, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView4, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView, @NonNull DashTextView dashTextView5, @NonNull DashTextView dashTextView6, @NonNull BaseTextView baseTextView5, @NonNull View view) {
        this.f93518a = linearLayout;
        this.f93519b = dashBoardView;
        this.f93520c = frameLayout;
        this.f93521d = shapeImageView;
        this.f93522e = group;
        this.f93523f = appCompatImageView;
        this.f93524g = linearLayout2;
        this.f93525h = dashTextView;
        this.f93526i = baseTextView;
        this.f93527j = shapeTextView;
        this.f93528k = dashTextView2;
        this.f93529l = baseTextView2;
        this.f93530m = dashTextView3;
        this.f93531n = baseTextView3;
        this.f93532o = dashTextView4;
        this.f93533p = baseTextView4;
        this.f93534q = showHideTextView;
        this.f93535r = dashTextView5;
        this.f93536s = dashTextView6;
        this.f93537t = baseTextView5;
        this.f93538u = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42113h m92381a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.dashboard;
        DashBoardView dashBoardView = (DashBoardView) ViewBindings.findChildViewById(view, i11);
        if (dashBoardView != null) {
            i11 = R$id.hideLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.hideView;
                ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                if (shapeImageView != null) {
                    i11 = R$id.hideViewGroup;
                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group != null) {
                        i11 = R$id.ivUsefulMarginCollateralStatus;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.ll1;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.tvAdjustedEquity;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    i11 = R$id.tvAdjustedEquityValue;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvDangerLevel;
                                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                        if (shapeTextView != null) {
                                            i11 = R$id.tvHoldMargin;
                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView2 != null) {
                                                i11 = R$id.tvHoldMarginValue;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvLiability;
                                                    DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView3 != null) {
                                                        i11 = R$id.tvLiabilityValue;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tvMaintMargin;
                                                            DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView4 != null) {
                                                                i11 = R$id.tvMaintMarginValue;
                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView4 != null) {
                                                                    i11 = R$id.tvRatio;
                                                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView != null) {
                                                                        i11 = R$id.tvRiskRatio;
                                                                        DashTextView dashTextView5 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (dashTextView5 != null) {
                                                                            i11 = R$id.tvUsefulMargin;
                                                                            DashTextView dashTextView6 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (dashTextView6 != null) {
                                                                                i11 = R$id.tvUsefulMarginValue;
                                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                                                                    return new C42113h((LinearLayout) view, dashBoardView, frameLayout, shapeImageView, group, appCompatImageView, linearLayout, dashTextView, baseTextView, shapeTextView, dashTextView2, baseTextView2, dashTextView3, baseTextView3, dashTextView4, baseTextView4, showHideTextView, dashTextView5, dashTextView6, baseTextView5, viewFindChildViewById);
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
        return this.f93518a;
    }
}
