package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.overview.AssetDynamicsCardView;
import com.kubi.assets.overview.AssetV2OverviewHeaderView;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetEmptyView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.widget.shape.view.ShapeImageView;

/* JADX INFO: renamed from: ta.p3 */
/* JADX INFO: compiled from: FragmentAssetOverviewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44840p3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100598a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f100599b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppBarLayout f100600c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoordinatorLayout f100601d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100602e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AssetDynamicsCardView f100603f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f100604g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Space f100605h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeImageView f100606i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f100607j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ImageView f100608k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayoutCompat f100609l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayoutCompat f100610m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayoutCompat f100611n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final LinearLayoutCompat f100612o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final FrameLayout f100613p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final View f100614q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AssetV2OverviewHeaderView f100615r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KuCoinRefreshLayout f100616s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final NestedScrollView f100617t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final SlidingTabLayout f100618u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f100619v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f100620w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f100621x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final AssetEmptyView f100622y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final CustomViewPager f100623z;

    public C44840p3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AssetDynamicsCardView assetDynamicsCardView, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull ShapeImageView shapeImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull AssetV2OverviewHeaderView assetV2OverviewHeaderView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull NestedScrollView nestedScrollView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view2, @NonNull AssetEmptyView assetEmptyView, @NonNull CustomViewPager customViewPager) {
        this.f100598a = kuCoinRefreshLayout;
        this.f100599b = accountInfoHeaderView;
        this.f100600c = appBarLayout;
        this.f100601d = coordinatorLayout;
        this.f100602e = linearLayoutCompat;
        this.f100603f = assetDynamicsCardView;
        this.f100604g = recyclerView;
        this.f100605h = space;
        this.f100606i = shapeImageView;
        this.f100607j = imageView;
        this.f100608k = imageView2;
        this.f100609l = linearLayoutCompat2;
        this.f100610m = linearLayoutCompat3;
        this.f100611n = linearLayoutCompat4;
        this.f100612o = linearLayoutCompat5;
        this.f100613p = frameLayout;
        this.f100614q = view;
        this.f100615r = assetV2OverviewHeaderView;
        this.f100616s = kuCoinRefreshLayout2;
        this.f100617t = nestedScrollView;
        this.f100618u = slidingTabLayout;
        this.f100619v = baseTextView;
        this.f100620w = baseTextView2;
        this.f100621x = view2;
        this.f100622y = assetEmptyView;
        this.f100623z = customViewPager;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44840p3 m99206a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
            if (appBarLayout != null) {
                i11 = R$id.clAssets;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                if (coordinatorLayout != null) {
                    i11 = R$id.cl_no_assets;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.dynamicsCardView;
                        AssetDynamicsCardView assetDynamicsCardView = (AssetDynamicsCardView) ViewBindings.findChildViewById(view, i11);
                        if (assetDynamicsCardView != null) {
                            i11 = R$id.dynamicsRecyclerview;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.headerBottomSpace;
                                Space space = (Space) ViewBindings.findChildViewById(view, i11);
                                if (space != null) {
                                    i11 = R$id.ivAccountSetting;
                                    ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                                    if (shapeImageView != null) {
                                        i11 = R$id.ivIndicator;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView != null) {
                                            i11 = R$id.ivInfo;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView2 != null) {
                                                i11 = R$id.ll_buy_fiat;
                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayoutCompat2 != null) {
                                                    i11 = R$id.ll_buy_p2p;
                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat3 != null) {
                                                        i11 = R$id.llDepositCrypto;
                                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayoutCompat4 != null) {
                                                            i11 = R$id.ll_deposit_fiat;
                                                            LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                            if (linearLayoutCompat5 != null) {
                                                                i11 = R$id.loadLayout;
                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadView))) != null) {
                                                                    i11 = R$id.overviewHeaderView;
                                                                    AssetV2OverviewHeaderView assetV2OverviewHeaderView = (AssetV2OverviewHeaderView) ViewBindings.findChildViewById(view, i11);
                                                                    if (assetV2OverviewHeaderView != null) {
                                                                        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                                                        i11 = R$id.scrollView;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                                                        if (nestedScrollView != null) {
                                                                            i11 = R$id.tabLayout;
                                                                            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                                                                            if (slidingTabLayout != null) {
                                                                                i11 = R$id.tvHaveAssetTitle;
                                                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView != null) {
                                                                                    i11 = R$id.tvNoAssetTitle;
                                                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.v_divider_one))) != null) {
                                                                                        i11 = R$id.viewEmpty;
                                                                                        AssetEmptyView assetEmptyView = (AssetEmptyView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (assetEmptyView != null) {
                                                                                            i11 = R$id.viewPager;
                                                                                            CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
                                                                                            if (customViewPager != null) {
                                                                                                return new C44840p3(kuCoinRefreshLayout, accountInfoHeaderView, appBarLayout, coordinatorLayout, linearLayoutCompat, assetDynamicsCardView, recyclerView, space, shapeImageView, imageView, imageView2, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, frameLayout, viewFindChildViewById, assetV2OverviewHeaderView, kuCoinRefreshLayout, nestedScrollView, slidingTabLayout, baseTextView, baseTextView2, viewFindChildViewById2, assetEmptyView, customViewPager);
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
    public KuCoinRefreshLayout getRoot() {
        return this.f100598a;
    }
}
