package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.margin.R$id;
import com.kubi.margin.view.MarginBannerTipView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: dp.x */
/* JADX INFO: compiled from: BmarginFragmentMarginTradeBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36947x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f82028a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f82029b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f82030c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppBarLayout f82031d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f82032e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f82033f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final HoldingEarnEntryCardView f82034g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f82035h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BGABanner f82036i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final CustomViewPager f82037j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final MarginBannerTipView f82038k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KuCoinRefreshLayout f82039l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final SymbolBarLayout f82040m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final SymbolOfflineBannerView f82041n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f82042o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f82043p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36947x m82763a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.allDelegation;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
                if (appBarLayout != null) {
                    i11 = R$id.fl_banner;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.fl_trade_container;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout2 != null) {
                            i11 = R$id.holdingEarnEntryCard;
                            HoldingEarnEntryCardView holdingEarnEntryCardView = (HoldingEarnEntryCardView) ViewBindings.findChildViewById(view, i11);
                            if (holdingEarnEntryCardView != null) {
                                i11 = R$id.klineContent;
                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout3 != null) {
                                    i11 = R$id.m_banner;
                                    BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
                                    if (bGABanner != null) {
                                        i11 = R$id.m_view_pager;
                                        CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                        if (customViewPager != null) {
                                            i11 = R$id.marginNoticeView;
                                            MarginBannerTipView marginBannerTipView = (MarginBannerTipView) ViewBindings.findChildViewById(view, i11);
                                            if (marginBannerTipView != null) {
                                                i11 = R$id.refresh_view;
                                                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                                                if (kuCoinRefreshLayout != null) {
                                                    i11 = R$id.symbolBarLayout;
                                                    SymbolBarLayout symbolBarLayout = (SymbolBarLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (symbolBarLayout != null) {
                                                        i11 = R$id.symbolOfflineBannerView;
                                                        SymbolOfflineBannerView symbolOfflineBannerView = (SymbolOfflineBannerView) ViewBindings.findChildViewById(view, i11);
                                                        if (symbolOfflineBannerView != null) {
                                                            i11 = R$id.tvRiskDisclaimer;
                                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView != null) {
                                                                i11 = R$id.tvTradeTip;
                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView2 != null) {
                                                                    return new C36947x((ConstraintLayout) view, slidingTabLayout, appCompatImageView, appBarLayout, frameLayout, frameLayout2, holdingEarnEntryCardView, frameLayout3, bGABanner, customViewPager, marginBannerTipView, kuCoinRefreshLayout, symbolBarLayout, symbolOfflineBannerView, baseTextView, baseTextView2);
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
        return this.f82028a;
    }

    public C36947x(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull HoldingEarnEntryCardView holdingEarnEntryCardView, @NonNull FrameLayout frameLayout3, @NonNull BGABanner bGABanner, @NonNull CustomViewPager customViewPager, @NonNull MarginBannerTipView marginBannerTipView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull SymbolBarLayout symbolBarLayout, @NonNull SymbolOfflineBannerView symbolOfflineBannerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f82028a = constraintLayout;
        this.f82029b = slidingTabLayout;
        this.f82030c = appCompatImageView;
        this.f82031d = appBarLayout;
        this.f82032e = frameLayout;
        this.f82033f = frameLayout2;
        this.f82034g = holdingEarnEntryCardView;
        this.f82035h = frameLayout3;
        this.f82036i = bGABanner;
        this.f82037j = customViewPager;
        this.f82038k = marginBannerTipView;
        this.f82039l = kuCoinRefreshLayout;
        this.f82040m = symbolBarLayout;
        this.f82041n = symbolOfflineBannerView;
        this.f82042o = baseTextView;
        this.f82043p = baseTextView2;
    }
}
