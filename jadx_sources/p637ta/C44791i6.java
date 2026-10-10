package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.margin.view.MarginPnlHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.VerticalIconTextBtn;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.LevelIndicatorView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: ta.i6 */
/* JADX INFO: compiled from: ViewUnifiedAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44791i6 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final ShowHideTextView f100166A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final ShowHideTextView f100167B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final MarginPnlHeaderView f100168C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final View f100169D;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100170a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f100171b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f100172c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100173d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f100174e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f100175f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RelativeLayout f100176g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f100177h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f100178i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Barrier f100179j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final Barrier f100180k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f100181l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f100182m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f100183n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f100184o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final VerticalIconTextBtn f100185p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f100186q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ShowHideTextView f100187r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final ShowHideTextView f100188s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final VerticalIconTextBtn f100189t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final LevelIndicatorView f100190u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ShowHideTextView f100191v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ShowHideTextView f100192w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final VerticalIconTextBtn f100193x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final AlertTipsTextView f100194y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final DashTextView f100195z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44791i6 m99100a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.ivAdjustedEqCollateralStatus;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivExpandArrow;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.llAdjustedEqTitle;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.llAdjustedEqu;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.llLiability;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                            if (relativeLayout != null) {
                                i11 = R$id.llRiskRatio;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout3 != null) {
                                    i11 = R$id.llUnrealizedPNL;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout4 != null) {
                                        i11 = R$id.metricsFirstRowBottomBarrier;
                                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                                        if (barrier != null) {
                                            i11 = R$id.metricsSecondRowBottomBarrier;
                                            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
                                            if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.stubView))) != null) {
                                                i11 = R$id.tvAdjustedEq;
                                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView != null) {
                                                    i11 = R$id.tvAdjustedEqValue;
                                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (showHideTextView != null) {
                                                        i11 = R$id.tvAdjustedEqValueLegal;
                                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView2 != null) {
                                                            i11 = R$id.tvDeposit;
                                                            VerticalIconTextBtn verticalIconTextBtn = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                                            if (verticalIconTextBtn != null) {
                                                                i11 = R$id.tvLiability;
                                                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (dashTextView2 != null) {
                                                                    i11 = R$id.tvLiabilityDigitalValue;
                                                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (showHideTextView3 != null) {
                                                                        i11 = R$id.tvLiabilityValue;
                                                                        ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView4 != null) {
                                                                            i11 = R$id.tvRepay;
                                                                            VerticalIconTextBtn verticalIconTextBtn2 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                                                            if (verticalIconTextBtn2 != null) {
                                                                                i11 = R$id.tvRiskRatio;
                                                                                LevelIndicatorView levelIndicatorView = (LevelIndicatorView) ViewBindings.findChildViewById(view, i11);
                                                                                if (levelIndicatorView != null) {
                                                                                    i11 = R$id.tvRiskRatioPercent;
                                                                                    ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (showHideTextView5 != null) {
                                                                                        i11 = R$id.tvRiskRatioValue;
                                                                                        ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (showHideTextView6 != null) {
                                                                                            i11 = R$id.tvTransfer;
                                                                                            VerticalIconTextBtn verticalIconTextBtn3 = (VerticalIconTextBtn) ViewBindings.findChildViewById(view, i11);
                                                                                            if (verticalIconTextBtn3 != null) {
                                                                                                i11 = R$id.tvUnifiedModeTradeTip;
                                                                                                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (alertTipsTextView != null) {
                                                                                                    i11 = R$id.tvUnrealizedPNL;
                                                                                                    DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (dashTextView3 != null) {
                                                                                                        i11 = R$id.tvUnrealizedPNLLegal;
                                                                                                        ShowHideTextView showHideTextView7 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (showHideTextView7 != null) {
                                                                                                            i11 = R$id.tvUnrealizedPNLValue;
                                                                                                            ShowHideTextView showHideTextView8 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (showHideTextView8 != null) {
                                                                                                                i11 = R$id.viewMarginPnl;
                                                                                                                MarginPnlHeaderView marginPnlHeaderView = (MarginPnlHeaderView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (marginPnlHeaderView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_space))) != null) {
                                                                                                                    return new C44791i6((ConstraintLayout) view, accountInfoHeaderView, appCompatImageView, appCompatImageView2, linearLayout, linearLayout2, relativeLayout, linearLayout3, linearLayout4, barrier, barrier2, viewFindChildViewById, dashTextView, showHideTextView, showHideTextView2, verticalIconTextBtn, dashTextView2, showHideTextView3, showHideTextView4, verticalIconTextBtn2, levelIndicatorView, showHideTextView5, showHideTextView6, verticalIconTextBtn3, alertTipsTextView, dashTextView3, showHideTextView7, showHideTextView8, marginPnlHeaderView, viewFindChildViewById2);
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
        return this.f100170a;
    }

    public C44791i6(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull View view, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull VerticalIconTextBtn verticalIconTextBtn, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull ShowHideTextView showHideTextView4, @NonNull VerticalIconTextBtn verticalIconTextBtn2, @NonNull LevelIndicatorView levelIndicatorView, @NonNull ShowHideTextView showHideTextView5, @NonNull ShowHideTextView showHideTextView6, @NonNull VerticalIconTextBtn verticalIconTextBtn3, @NonNull AlertTipsTextView alertTipsTextView, @NonNull DashTextView dashTextView3, @NonNull ShowHideTextView showHideTextView7, @NonNull ShowHideTextView showHideTextView8, @NonNull MarginPnlHeaderView marginPnlHeaderView, @NonNull View view2) {
        this.f100170a = constraintLayout;
        this.f100171b = accountInfoHeaderView;
        this.f100172c = appCompatImageView;
        this.f100173d = appCompatImageView2;
        this.f100174e = linearLayout;
        this.f100175f = linearLayout2;
        this.f100176g = relativeLayout;
        this.f100177h = linearLayout3;
        this.f100178i = linearLayout4;
        this.f100179j = barrier;
        this.f100180k = barrier2;
        this.f100181l = view;
        this.f100182m = dashTextView;
        this.f100183n = showHideTextView;
        this.f100184o = showHideTextView2;
        this.f100185p = verticalIconTextBtn;
        this.f100186q = dashTextView2;
        this.f100187r = showHideTextView3;
        this.f100188s = showHideTextView4;
        this.f100189t = verticalIconTextBtn2;
        this.f100190u = levelIndicatorView;
        this.f100191v = showHideTextView5;
        this.f100192w = showHideTextView6;
        this.f100193x = verticalIconTextBtn3;
        this.f100194y = alertTipsTextView;
        this.f100195z = dashTextView3;
        this.f100166A = showHideTextView7;
        this.f100167B = showHideTextView8;
        this.f100168C = marginPnlHeaderView;
        this.f100169D = view2;
    }
}
