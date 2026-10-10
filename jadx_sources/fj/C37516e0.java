package fj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.main.shimmer.HomeShimmerLayout;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: fj.e0 */
/* JADX INFO: compiled from: KucoinFragmentHomeBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37516e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83239a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83240b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f83241c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f83242d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f83243e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final HomeShimmerLayout f83244f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f83245g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KuCoinRefreshLayout f83246h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37516e0 m84492a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.home_card_container;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.homeNavigation;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
            if (fragmentContainerView != null) {
                i11 = R$id.ivTopBg;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.layoutContent;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.layoutShimmer;
                        HomeShimmerLayout homeShimmerLayout = (HomeShimmerLayout) ViewBindings.findChildViewById(view, i11);
                        if (homeShimmerLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.navbg))) != null) {
                            i11 = R$id.refreshLayout;
                            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                            if (kuCoinRefreshLayout != null) {
                                return new C37516e0((FrameLayout) view, recyclerView, fragmentContainerView, imageView, frameLayout, homeShimmerLayout, viewFindChildViewById, kuCoinRefreshLayout);
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
    public FrameLayout getRoot() {
        return this.f83239a;
    }

    public C37516e0(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull FragmentContainerView fragmentContainerView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull HomeShimmerLayout homeShimmerLayout, @NonNull View view, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout) {
        this.f83239a = frameLayout;
        this.f83240b = recyclerView;
        this.f83241c = fragmentContainerView;
        this.f83242d = imageView;
        this.f83243e = frameLayout2;
        this.f83244f = homeShimmerLayout;
        this.f83245g = view;
        this.f83246h = kuCoinRefreshLayout;
    }
}
