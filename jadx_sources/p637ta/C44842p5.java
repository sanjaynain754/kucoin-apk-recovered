package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.lite.LiteAccountDetailHeaderView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.p5 */
/* JADX INFO: compiled from: LayoutLiteBaseAccountDetailBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44842p5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100630a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f100631b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoordinatorLayout f100632c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LiteAccountDetailHeaderView f100633d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100634e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f100635f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f100636g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final CoinAvatarView f100637h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f100638i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayoutCompat f100639j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final SwipeRefreshRecyclerView f100640k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RecyclerView f100641l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcPrimaryButton f100642m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KcPrimaryButton f100643n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcPrimaryButton f100644o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f100645p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44842p5 m99210a(@NonNull View view) {
        int i11 = R$id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
        if (appBarLayout != null) {
            i11 = R$id.coordinator;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
            if (coordinatorLayout != null) {
                i11 = R$id.headerView;
                LiteAccountDetailHeaderView liteAccountDetailHeaderView = (LiteAccountDetailHeaderView) ViewBindings.findChildViewById(view, i11);
                if (liteAccountDetailHeaderView != null) {
                    i11 = R$id.headerViewContainer;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.ivBack;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.ivFilter;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.ivIcon;
                                CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                                if (coinAvatarView != null) {
                                    i11 = R$id.ivKline;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView3 != null) {
                                        i11 = R$id.llBottom;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayoutCompat2 != null) {
                                            i11 = R$id.m_swipe_recycler_view;
                                            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                                            if (swipeRefreshRecyclerView != null) {
                                                i11 = R$id.recyclerViewInfo;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                if (recyclerView != null) {
                                                    i11 = R$id.tvCenter;
                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcPrimaryButton != null) {
                                                        i11 = R$id.tvLeft;
                                                        KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                        if (kcPrimaryButton2 != null) {
                                                            i11 = R$id.tvRight;
                                                            KcPrimaryButton kcPrimaryButton3 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                            if (kcPrimaryButton3 != null) {
                                                                i11 = R$id.tvTitle;
                                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView != null) {
                                                                    return new C44842p5((LinearLayout) view, appBarLayout, coordinatorLayout, liteAccountDetailHeaderView, linearLayoutCompat, imageView, imageView2, coinAvatarView, imageView3, linearLayoutCompat2, swipeRefreshRecyclerView, recyclerView, kcPrimaryButton, kcPrimaryButton2, kcPrimaryButton3, baseTextView);
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
        return this.f100630a;
    }

    public C44842p5(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LiteAccountDetailHeaderView liteAccountDetailHeaderView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull CoinAvatarView coinAvatarView, @NonNull ImageView imageView3, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull KcPrimaryButton kcPrimaryButton3, @NonNull BaseTextView baseTextView) {
        this.f100630a = linearLayout;
        this.f100631b = appBarLayout;
        this.f100632c = coordinatorLayout;
        this.f100633d = liteAccountDetailHeaderView;
        this.f100634e = linearLayoutCompat;
        this.f100635f = imageView;
        this.f100636g = imageView2;
        this.f100637h = coinAvatarView;
        this.f100638i = imageView3;
        this.f100639j = linearLayoutCompat2;
        this.f100640k = swipeRefreshRecyclerView;
        this.f100641l = recyclerView;
        this.f100642m = kcPrimaryButton;
        this.f100643n = kcPrimaryButton2;
        this.f100644o = kcPrimaryButton3;
        this.f100645p = baseTextView;
    }
}
