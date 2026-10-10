package q70;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.a */
/* JADX INFO: compiled from: FragmentUtaMarginTradeBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43654a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f96327a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f96328b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f96329c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppBarLayout f96330d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f96331e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f96332f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f96333g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f96334h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f96335i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f96336j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KuCoinRefreshLayout f96337k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f96338l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FrameLayout f96339m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final SymbolOfflineBannerView f96340n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FrameLayout f96341o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43654a m96068a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.allDelegation;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
                if (appBarLayout != null) {
                    i11 = R$id.callAuctionContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.complianceInfoContainer;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout2 != null) {
                            i11 = R$id.importNoticeContainer;
                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                            if (frameLayout3 != null) {
                                i11 = R$id.klineNtfContainer;
                                FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout4 != null) {
                                    i11 = R$id.marginInfoContainer;
                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout5 != null) {
                                        i11 = R$id.orderAndFundsContainer;
                                        FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                        if (frameLayout6 != null) {
                                            i11 = R$id.refresh_view;
                                            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                                            if (kuCoinRefreshLayout != null) {
                                                i11 = R$id.spotBannerContainer;
                                                FrameLayout frameLayout7 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout7 != null) {
                                                    i11 = R$id.symbolBarContainer;
                                                    FrameLayout frameLayout8 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (frameLayout8 != null) {
                                                        i11 = R$id.symbolOfflineBannerView;
                                                        SymbolOfflineBannerView symbolOfflineBannerView = (SymbolOfflineBannerView) ViewBindings.findChildViewById(view, i11);
                                                        if (symbolOfflineBannerView != null) {
                                                            i11 = R$id.tradeSubmitFragmentContainer;
                                                            FrameLayout frameLayout9 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (frameLayout9 != null) {
                                                                return new C43654a((ConstraintLayout) view, slidingTabLayout, appCompatImageView, appBarLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, kuCoinRefreshLayout, frameLayout7, frameLayout8, symbolOfflineBannerView, frameLayout9);
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
        return this.f96327a;
    }

    public C43654a(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull FrameLayout frameLayout7, @NonNull FrameLayout frameLayout8, @NonNull SymbolOfflineBannerView symbolOfflineBannerView, @NonNull FrameLayout frameLayout9) {
        this.f96327a = constraintLayout;
        this.f96328b = slidingTabLayout;
        this.f96329c = appCompatImageView;
        this.f96330d = appBarLayout;
        this.f96331e = frameLayout;
        this.f96332f = frameLayout2;
        this.f96333g = frameLayout3;
        this.f96334h = frameLayout4;
        this.f96335i = frameLayout5;
        this.f96336j = frameLayout6;
        this.f96337k = kuCoinRefreshLayout;
        this.f96338l = frameLayout7;
        this.f96339m = frameLayout8;
        this.f96340n = symbolOfflineBannerView;
        this.f96341o = frameLayout9;
    }
}
