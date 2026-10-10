package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: bv.k */
/* JADX INFO: compiled from: FragmentChildMarketHoldingsBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4676k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4387a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4388b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4389c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f4390d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RankShimmer f4391e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SwipeRefreshRecyclerView f4392f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCoinRefreshLayout f4393g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4394h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4395i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final C4666f0 f4396j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final C4654b0 f4397k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4676k m4664a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.layout_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.layout_holdings_place;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.list_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.rsLoading;
                    RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
                    if (rankShimmer != null) {
                        i11 = R$id.swipe_recycler_layout;
                        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (swipeRefreshRecyclerView != null) {
                            i11 = R$id.take_place_swipeLayout;
                            KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                            if (kuCoinRefreshLayout != null) {
                                i11 = R$id.tv_update;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_update_time;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_sort))) != null) {
                                        C4666f0 c4666f0M4644a = C4666f0.m4644a(viewFindChildViewById);
                                        i11 = R$id.view_take_place_deposit;
                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
                                        if (viewFindChildViewById2 != null) {
                                            return new C4676k((ConstraintLayout) view, linearLayout, linearLayout2, frameLayout, rankShimmer, swipeRefreshRecyclerView, kuCoinRefreshLayout, baseTextView, baseTextView2, c4666f0M4644a, C4654b0.m4620a(viewFindChildViewById2));
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
        return this.f4387a;
    }

    public C4676k(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout, @NonNull RankShimmer rankShimmer, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull C4666f0 c4666f0, @NonNull C4654b0 c4654b0) {
        this.f4387a = constraintLayout;
        this.f4388b = linearLayout;
        this.f4389c = linearLayout2;
        this.f4390d = frameLayout;
        this.f4391e = rankShimmer;
        this.f4392f = swipeRefreshRecyclerView;
        this.f4393g = kuCoinRefreshLayout;
        this.f4394h = baseTextView;
        this.f4395i = baseTextView2;
        this.f4396j = c4666f0;
        this.f4397k = c4654b0;
    }
}
