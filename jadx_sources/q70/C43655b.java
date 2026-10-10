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
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.b */
/* JADX INFO: compiled from: FragmentUtaSpotTradeBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43655b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f96342a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f96343b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f96344c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppBarLayout f96345d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f96346e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f96347f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final HoldingEarnEntryCardView f96348g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f96349h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f96350i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f96351j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KuCoinRefreshLayout f96352k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FrameLayout f96353l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FrameLayout f96354m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final SymbolOfflineBannerView f96355n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FrameLayout f96356o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43655b m96070a(@NonNull View view) {
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
                            i11 = R$id.holdingEarnEntryCard;
                            HoldingEarnEntryCardView holdingEarnEntryCardView = (HoldingEarnEntryCardView) ViewBindings.findChildViewById(view, i11);
                            if (holdingEarnEntryCardView != null) {
                                i11 = R$id.importNoticeContainer;
                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout3 != null) {
                                    i11 = R$id.klineNtfContainer;
                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout4 != null) {
                                        i11 = R$id.orderAndFundsContainer;
                                        FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                        if (frameLayout5 != null) {
                                            i11 = R$id.refresh_view;
                                            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                                            if (kuCoinRefreshLayout != null) {
                                                i11 = R$id.spotBannerContainer;
                                                FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                if (frameLayout6 != null) {
                                                    i11 = R$id.symbolBarContainer;
                                                    FrameLayout frameLayout7 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (frameLayout7 != null) {
                                                        i11 = R$id.symbolOfflineBannerView;
                                                        SymbolOfflineBannerView symbolOfflineBannerView = (SymbolOfflineBannerView) ViewBindings.findChildViewById(view, i11);
                                                        if (symbolOfflineBannerView != null) {
                                                            i11 = R$id.tradeSubmitFragmentContainer;
                                                            FrameLayout frameLayout8 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (frameLayout8 != null) {
                                                                return new C43655b((ConstraintLayout) view, slidingTabLayout, appCompatImageView, appBarLayout, frameLayout, frameLayout2, holdingEarnEntryCardView, frameLayout3, frameLayout4, frameLayout5, kuCoinRefreshLayout, frameLayout6, frameLayout7, symbolOfflineBannerView, frameLayout8);
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
        return this.f96342a;
    }

    public C43655b(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull HoldingEarnEntryCardView holdingEarnEntryCardView, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull FrameLayout frameLayout6, @NonNull FrameLayout frameLayout7, @NonNull SymbolOfflineBannerView symbolOfflineBannerView, @NonNull FrameLayout frameLayout8) {
        this.f96342a = constraintLayout;
        this.f96343b = slidingTabLayout;
        this.f96344c = appCompatImageView;
        this.f96345d = appBarLayout;
        this.f96346e = frameLayout;
        this.f96347f = frameLayout2;
        this.f96348g = holdingEarnEntryCardView;
        this.f96349h = frameLayout3;
        this.f96350i = frameLayout4;
        this.f96351j = frameLayout5;
        this.f96352k = kuCoinRefreshLayout;
        this.f96353l = frameLayout6;
        this.f96354m = frameLayout7;
        this.f96355n = symbolOfflineBannerView;
        this.f96356o = frameLayout8;
    }
}
