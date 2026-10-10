package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.alpha.AlphaHeaderView;
import com.kubi.assets.alpha.AlphaRecommendView;
import com.kubi.assets.view.AssetSearchView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: ta.l0 */
/* JADX INFO: compiled from: AssetFragmentAlphaBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44809l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f100334a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlphaRecommendView f100335b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppBarLayout f100336c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f100337d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final DashTextView f100338e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CoordinatorLayout f100339f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Group f100340g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AlphaHeaderView f100341h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f100342i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f100343j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final NestedScrollView f100344k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RecyclerView f100345l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AssetSearchView f100346m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final KuCoinRefreshLayout f100347n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f100348o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f100349p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44809l0 m99138a(@NonNull View view) {
        int i11 = R$id.alphaRecommendView;
        AlphaRecommendView alphaRecommendView = (AlphaRecommendView) ViewBindings.findChildViewById(view, i11);
        if (alphaRecommendView != null) {
            i11 = R$id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i11);
            if (appBarLayout != null) {
                i11 = R$id.cbHideSmall;
                KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox != null) {
                    i11 = R$id.cbHideSmallText;
                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                    if (dashTextView != null) {
                        i11 = R$id.coordinator;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i11);
                        if (coordinatorLayout != null) {
                            i11 = R$id.groupInfo;
                            Group group = (Group) ViewBindings.findChildViewById(view, i11);
                            if (group != null) {
                                i11 = R$id.headerView;
                                AlphaHeaderView alphaHeaderView = (AlphaHeaderView) ViewBindings.findChildViewById(view, i11);
                                if (alphaHeaderView != null) {
                                    i11 = R$id.ivAll;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView != null) {
                                        i11 = R$id.ivArrow;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView2 != null) {
                                            i11 = R$id.nestedScrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                            if (nestedScrollView != null) {
                                                i11 = R$id.recyclerView;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                if (recyclerView != null) {
                                                    i11 = R$id.searchView;
                                                    AssetSearchView assetSearchView = (AssetSearchView) ViewBindings.findChildViewById(view, i11);
                                                    if (assetSearchView != null) {
                                                        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
                                                        i11 = R$id.tvAll;
                                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView != null) {
                                                            i11 = R$id.tvAsset;
                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView2 != null) {
                                                                return new C44809l0(kuCoinRefreshLayout, alphaRecommendView, appBarLayout, kuCheckBox, dashTextView, coordinatorLayout, group, alphaHeaderView, imageView, imageView2, nestedScrollView, recyclerView, assetSearchView, kuCoinRefreshLayout, baseTextView, baseTextView2);
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
        return this.f100334a;
    }

    public C44809l0(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AlphaRecommendView alphaRecommendView, @NonNull AppBarLayout appBarLayout, @NonNull KuCheckBox kuCheckBox, @NonNull DashTextView dashTextView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull Group group, @NonNull AlphaHeaderView alphaHeaderView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull AssetSearchView assetSearchView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100334a = kuCoinRefreshLayout;
        this.f100335b = alphaRecommendView;
        this.f100336c = appBarLayout;
        this.f100337d = kuCheckBox;
        this.f100338e = dashTextView;
        this.f100339f = coordinatorLayout;
        this.f100340g = group;
        this.f100341h = alphaHeaderView;
        this.f100342i = imageView;
        this.f100343j = imageView2;
        this.f100344k = nestedScrollView;
        this.f100345l = recyclerView;
        this.f100346m = assetSearchView;
        this.f100347n = kuCoinRefreshLayout2;
        this.f100348o = baseTextView;
        this.f100349p = baseTextView2;
    }
}
