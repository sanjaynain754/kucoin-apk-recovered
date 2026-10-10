package dm;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.futures.view.KycLeadView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.f2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36760f2 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f80018A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final KuCoinRefreshLayout f80019B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final ConstraintLayout f80020C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final LinearLayout f80021D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final FrameLayout f80022E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final BaseTextView f80023F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final ConstraintLayout f80024G;

    /* JADX INFO: renamed from: H */
    @NonNull
    public final FuturesTraderProChallengeView f80025H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public final BaseTextView f80026I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public final ViewStub f80027J;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80028a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f80029b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LottieAnimationView f80030c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppBarLayout f80031d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FlexboxLayout f80032e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f80033f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ViewStub f80034g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HoldingEarnEntryCardView f80035h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f80036i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f80037j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f80038k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f80039l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RelativeLayout f80040m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f80041n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AppCompatImageView f80042o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KycLeadView f80043p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayout f80044q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final LinearLayout f80045r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final LinearLayout f80046s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ShapeTextView f80047t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BGABanner f80048u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final AppCompatImageView f80049v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final RtlViewPager f80050w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final ShapeTextView f80051x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ShapeTextView f80052y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f80053z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36760f2 m82372a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.activityIconLav;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
            if (lottieAnimationView != null) {
                i11 = R$id.appBar;
                AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
                if (appBarLayout != null) {
                    i11 = R$id.flexLayout;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                    if (flexboxLayout != null) {
                        i11 = R$id.futuresHistory;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.guideNoticeViewStub;
                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                            if (viewStub != null) {
                                i11 = R$id.interestNoticeLayout;
                                HoldingEarnEntryCardView holdingEarnEntryCardView = (HoldingEarnEntryCardView) ViewBindings.findChildViewById(view, i11);
                                if (holdingEarnEntryCardView != null) {
                                    i11 = R$id.ivKline;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView2 != null) {
                                        i11 = R$id.ivSymbol;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.klineBottomLine))) != null) {
                                            i11 = R$id.klineContent;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                            if (frameLayout != null) {
                                                i11 = R$id.klineToggle;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                                if (relativeLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.klineTopLine))) != null) {
                                                    i11 = R$id.klineTopToggleIv;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatImageView3 != null) {
                                                        i11 = R$id.kycLeadView;
                                                        KycLeadView kycLeadView = (KycLeadView) ViewBindings.findChildViewById(view, i11);
                                                        if (kycLeadView != null) {
                                                            i11 = R$id.llAppBar;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (linearLayout != null) {
                                                                i11 = R$id.llKline;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayout2 != null) {
                                                                    i11 = R$id.lowLiquidityContainer;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (linearLayout3 != null) {
                                                                        i11 = R$id.lowLiquidityLabel;
                                                                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (shapeTextView != null) {
                                                                            i11 = R$id.m_banner;
                                                                            BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
                                                                            if (bGABanner != null) {
                                                                                i11 = R$id.more;
                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                                                if (appCompatImageView4 != null) {
                                                                                    i11 = R$id.pager;
                                                                                    RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                                                                                    if (rtlViewPager != null) {
                                                                                        i11 = R$id.perpLabel;
                                                                                        ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (shapeTextView2 != null) {
                                                                                            i11 = R$id.preMarketLabel;
                                                                                            ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (shapeTextView3 != null) {
                                                                                                i11 = R$id.priceRate;
                                                                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView != null) {
                                                                                                    i11 = R$id.priceRateLowLiquidity;
                                                                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView2 != null) {
                                                                                                        i11 = R$id.refresh;
                                                                                                        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (kuCoinRefreshLayout != null) {
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                                            i11 = R$id.root_view;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                i11 = R$id.submitContent;
                                                                                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (frameLayout2 != null) {
                                                                                                                    i11 = R$id.symbol;
                                                                                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (baseTextView3 != null) {
                                                                                                                        i11 = R$id.toolBar;
                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                            i11 = R$id.traderProChallengeView;
                                                                                                                            FuturesTraderProChallengeView futuresTraderProChallengeView = (FuturesTraderProChallengeView) ViewBindings.findChildViewById(view, i11);
                                                                                                                            if (futuresTraderProChallengeView != null) {
                                                                                                                                i11 = R$id.tvToggleType;
                                                                                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                if (baseTextView4 != null) {
                                                                                                                                    i11 = R$id.unlockLeverageStub;
                                                                                                                                    ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i11);
                                                                                                                                    if (viewStub2 != null) {
                                                                                                                                        return new C36760f2(constraintLayout, slidingTabLayout, lottieAnimationView, appBarLayout, flexboxLayout, appCompatImageView, viewStub, holdingEarnEntryCardView, appCompatImageView2, imageView, viewFindChildViewById, frameLayout, relativeLayout, viewFindChildViewById2, appCompatImageView3, kycLeadView, linearLayout, linearLayout2, linearLayout3, shapeTextView, bGABanner, appCompatImageView4, rtlViewPager, shapeTextView2, shapeTextView3, baseTextView, baseTextView2, kuCoinRefreshLayout, constraintLayout, linearLayout4, frameLayout2, baseTextView3, constraintLayout2, futuresTraderProChallengeView, baseTextView4, viewStub2);
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
        return this.f80028a;
    }

    public C36760f2(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull AppBarLayout appBarLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ViewStub viewStub, @NonNull HoldingEarnEntryCardView holdingEarnEntryCardView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ImageView imageView, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull View view2, @NonNull AppCompatImageView appCompatImageView3, @NonNull KycLeadView kycLeadView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ShapeTextView shapeTextView, @NonNull BGABanner bGABanner, @NonNull AppCompatImageView appCompatImageView4, @NonNull RtlViewPager rtlViewPager, @NonNull ShapeTextView shapeTextView2, @NonNull ShapeTextView shapeTextView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout4, @NonNull FrameLayout frameLayout2, @NonNull BaseTextView baseTextView3, @NonNull ConstraintLayout constraintLayout3, @NonNull FuturesTraderProChallengeView futuresTraderProChallengeView, @NonNull BaseTextView baseTextView4, @NonNull ViewStub viewStub2) {
        this.f80028a = constraintLayout;
        this.f80029b = slidingTabLayout;
        this.f80030c = lottieAnimationView;
        this.f80031d = appBarLayout;
        this.f80032e = flexboxLayout;
        this.f80033f = appCompatImageView;
        this.f80034g = viewStub;
        this.f80035h = holdingEarnEntryCardView;
        this.f80036i = appCompatImageView2;
        this.f80037j = imageView;
        this.f80038k = view;
        this.f80039l = frameLayout;
        this.f80040m = relativeLayout;
        this.f80041n = view2;
        this.f80042o = appCompatImageView3;
        this.f80043p = kycLeadView;
        this.f80044q = linearLayout;
        this.f80045r = linearLayout2;
        this.f80046s = linearLayout3;
        this.f80047t = shapeTextView;
        this.f80048u = bGABanner;
        this.f80049v = appCompatImageView4;
        this.f80050w = rtlViewPager;
        this.f80051x = shapeTextView2;
        this.f80052y = shapeTextView3;
        this.f80053z = baseTextView;
        this.f80018A = baseTextView2;
        this.f80019B = kuCoinRefreshLayout;
        this.f80020C = constraintLayout2;
        this.f80021D = linearLayout4;
        this.f80022E = frameLayout2;
        this.f80023F = baseTextView3;
        this.f80024G = constraintLayout3;
        this.f80025H = futuresTraderProChallengeView;
        this.f80026I = baseTextView4;
        this.f80027J = viewStub2;
    }
}
