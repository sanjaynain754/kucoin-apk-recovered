package fj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.v2.biz.HomeShimmerLayoutV2;
import com.kubi.home.widgets.HomeRecyclerView;
import com.kubi.home.widgets.feed.HomeFeedActionLayout;
import com.kubi.home.widgets.feed.HomeFeedWrapperTabLayout;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: fj.g0 */
/* JADX INFO: compiled from: KucoinFragmentHomeV2Binding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37520g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83298a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HomeFeedWrapperTabLayout f83299b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final HomeRecyclerView f83300c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final HomeFeedActionLayout f83301d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FragmentContainerView f83302e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f83303f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f83304g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HomeShimmerLayoutV2 f83305h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KuCoinRefreshLayout f83306i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f83307j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37520g0 m84500a(@NonNull View view) {
        int i11 = R$id.fake_flutter_tab;
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout = (HomeFeedWrapperTabLayout) ViewBindings.findChildViewById(view, i11);
        if (homeFeedWrapperTabLayout != null) {
            i11 = R$id.homeCardContainer;
            HomeRecyclerView homeRecyclerView = (HomeRecyclerView) ViewBindings.findChildViewById(view, i11);
            if (homeRecyclerView != null) {
                i11 = R$id.home_feed_action_layout;
                HomeFeedActionLayout homeFeedActionLayout = (HomeFeedActionLayout) ViewBindings.findChildViewById(view, i11);
                if (homeFeedActionLayout != null) {
                    i11 = R$id.homeNavigation;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView != null) {
                        i11 = R$id.homeNavigationContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            FrameLayout frameLayout2 = (FrameLayout) view;
                            i11 = R$id.layoutShimmer;
                            HomeShimmerLayoutV2 homeShimmerLayoutV2 = (HomeShimmerLayoutV2) ViewBindings.findChildViewById(view, i11);
                            if (homeShimmerLayoutV2 != null) {
                                i11 = R$id.refreshLayout;
                                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                                if (kuCoinRefreshLayout != null) {
                                    i11 = R$id.refreshLayoutContainer;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        return new C37520g0(frameLayout2, homeFeedWrapperTabLayout, homeRecyclerView, homeFeedActionLayout, fragmentContainerView, frameLayout, frameLayout2, homeShimmerLayoutV2, kuCoinRefreshLayout, linearLayout);
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
    public FrameLayout getRoot() {
        return this.f83298a;
    }

    public C37520g0(@NonNull FrameLayout frameLayout, @NonNull HomeFeedWrapperTabLayout homeFeedWrapperTabLayout, @NonNull HomeRecyclerView homeRecyclerView, @NonNull HomeFeedActionLayout homeFeedActionLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull HomeShimmerLayoutV2 homeShimmerLayoutV2, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull LinearLayout linearLayout) {
        this.f83298a = frameLayout;
        this.f83299b = homeFeedWrapperTabLayout;
        this.f83300c = homeRecyclerView;
        this.f83301d = homeFeedActionLayout;
        this.f83302e = fragmentContainerView;
        this.f83303f = frameLayout2;
        this.f83304g = frameLayout3;
        this.f83305h = homeShimmerLayoutV2;
        this.f83306i = kuCoinRefreshLayout;
        this.f83307j = linearLayout;
    }
}
