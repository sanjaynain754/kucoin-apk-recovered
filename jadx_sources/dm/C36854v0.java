package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.v0 */
/* JADX INFO: compiled from: BkumexDialogPositionReverseBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36854v0 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final DashTextView f81167A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f81168B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final KcTradeRateView f81169C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final BaseTextView f81170D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final NestedScrollView f81171E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final KcTradeRateView f81172F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final Space f81173G;

    /* JADX INFO: renamed from: H */
    @NonNull
    public final BaseTextView f81174H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public final BaseTextView f81175I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public final BaseTextView f81176J;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81177a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlignTopCheckBox f81178b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f81179c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f81180d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f81181e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FlexboxLayout f81182f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81183g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81184h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81185i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81186j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81187k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcTradeRateView f81188l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81189m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final AnimateDrawableEndView f81190n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcPrimaryButton f81191o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final FlexboxLayout f81192p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final FrameLayout f81193q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final View f81194r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81195s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81196t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81197u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f81198v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final FlexboxLayout f81199w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f81200x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f81201y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f81202z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36854v0 m82573a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.cbAgain;
        AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
        if (alignTopCheckBox != null) {
            i11 = R$id.cl_close;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.cl_open;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout2 != null) {
                    i11 = R$id.close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.closeFlow;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                        if (flexboxLayout != null) {
                            i11 = R$id.closeLeverage;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.closePriceLabel;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.closePriceValue;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.closeQtyLabel;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.closeQtyValue;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.closeSide;
                                                KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                if (kcTradeRateView != null) {
                                                    i11 = R$id.closeTitle;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.collapse;
                                                        AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                                        if (animateDrawableEndView != null) {
                                                            i11 = R$id.confirm;
                                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                            if (kcPrimaryButton != null) {
                                                                i11 = R$id.flow;
                                                                FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (flexboxLayout2 != null) {
                                                                    i11 = R$id.frame;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                                                        i11 = R$id.marginMode;
                                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView7 != null) {
                                                                            i11 = R$id.mark;
                                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView8 != null) {
                                                                                i11 = R$id.marketPriceLabel;
                                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView9 != null) {
                                                                                    i11 = R$id.marketPriceValue;
                                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView10 != null) {
                                                                                        i11 = R$id.openFlow;
                                                                                        FlexboxLayout flexboxLayout3 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                                                        if (flexboxLayout3 != null) {
                                                                                            i11 = R$id.openLeverage;
                                                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView11 != null) {
                                                                                                i11 = R$id.openPriceLabel;
                                                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView12 != null) {
                                                                                                    i11 = R$id.openPriceValue;
                                                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView13 != null) {
                                                                                                        i11 = R$id.openQtyLabel;
                                                                                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (dashTextView != null) {
                                                                                                            i11 = R$id.openQtyValue;
                                                                                                            BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView14 != null) {
                                                                                                                i11 = R$id.openSide;
                                                                                                                KcTradeRateView kcTradeRateView2 = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (kcTradeRateView2 != null) {
                                                                                                                    i11 = R$id.openTitle;
                                                                                                                    BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (baseTextView15 != null) {
                                                                                                                        i11 = R$id.scrollView;
                                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                                                                                                        if (nestedScrollView != null) {
                                                                                                                            i11 = R$id.sideTag;
                                                                                                                            KcTradeRateView kcTradeRateView3 = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                                                                            if (kcTradeRateView3 != null) {
                                                                                                                                i11 = R$id.space;
                                                                                                                                Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                                                                                                                if (space != null) {
                                                                                                                                    i11 = R$id.symbol;
                                                                                                                                    BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                    if (baseTextView16 != null) {
                                                                                                                                        i11 = R$id.tips;
                                                                                                                                        BaseTextView baseTextView17 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                        if (baseTextView17 != null) {
                                                                                                                                            i11 = R$id.title;
                                                                                                                                            BaseTextView baseTextView18 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                            if (baseTextView18 != null) {
                                                                                                                                                return new C36854v0((ConstraintLayout) view, alignTopCheckBox, constraintLayout, constraintLayout2, appCompatImageView, flexboxLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, kcTradeRateView, baseTextView6, animateDrawableEndView, kcPrimaryButton, flexboxLayout2, frameLayout, viewFindChildViewById, baseTextView7, baseTextView8, baseTextView9, baseTextView10, flexboxLayout3, baseTextView11, baseTextView12, baseTextView13, dashTextView, baseTextView14, kcTradeRateView2, baseTextView15, nestedScrollView, kcTradeRateView3, space, baseTextView16, baseTextView17, baseTextView18);
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
        return this.f81177a;
    }

    public C36854v0(@NonNull ConstraintLayout constraintLayout, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull AppCompatImageView appCompatImageView, @NonNull FlexboxLayout flexboxLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView6, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull FlexboxLayout flexboxLayout2, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull FlexboxLayout flexboxLayout3, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView14, @NonNull KcTradeRateView kcTradeRateView2, @NonNull BaseTextView baseTextView15, @NonNull NestedScrollView nestedScrollView, @NonNull KcTradeRateView kcTradeRateView3, @NonNull Space space, @NonNull BaseTextView baseTextView16, @NonNull BaseTextView baseTextView17, @NonNull BaseTextView baseTextView18) {
        this.f81177a = constraintLayout;
        this.f81178b = alignTopCheckBox;
        this.f81179c = constraintLayout2;
        this.f81180d = constraintLayout3;
        this.f81181e = appCompatImageView;
        this.f81182f = flexboxLayout;
        this.f81183g = baseTextView;
        this.f81184h = baseTextView2;
        this.f81185i = baseTextView3;
        this.f81186j = baseTextView4;
        this.f81187k = baseTextView5;
        this.f81188l = kcTradeRateView;
        this.f81189m = baseTextView6;
        this.f81190n = animateDrawableEndView;
        this.f81191o = kcPrimaryButton;
        this.f81192p = flexboxLayout2;
        this.f81193q = frameLayout;
        this.f81194r = view;
        this.f81195s = baseTextView7;
        this.f81196t = baseTextView8;
        this.f81197u = baseTextView9;
        this.f81198v = baseTextView10;
        this.f81199w = flexboxLayout3;
        this.f81200x = baseTextView11;
        this.f81201y = baseTextView12;
        this.f81202z = baseTextView13;
        this.f81167A = dashTextView;
        this.f81168B = baseTextView14;
        this.f81169C = kcTradeRateView2;
        this.f81170D = baseTextView15;
        this.f81171E = nestedScrollView;
        this.f81172F = kcTradeRateView3;
        this.f81173G = space;
        this.f81174H = baseTextView16;
        this.f81175I = baseTextView17;
        this.f81176J = baseTextView18;
    }
}
